import java.util.Scanner;

/**
 * プログラム名 :Sp023
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Sp023 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Kuji[] kujis = Kuji.generateKuji(Kuji.KUJI_COUNT);
        KujiPlayer kujiPlayer = new KujiPlayer(Kuji.HIT_COUNT, Kuji.KUJI_COUNT);
        while (kujiPlayer.getHitCount() > 0 && kujiPlayer.getSelectCount() > 0) {
            System.out.println("何か入力するとくじを引きます。");
            scan.next();
            kujiPlayer.hitKuji(kujis);
        }
    }

}

class Kuji {
    static final int KUJI_COUNT = 10;
    static final int HIT_COUNT = 3;
    private boolean hit;

    public boolean isHit() {
        return hit;
    }

    static Kuji[] generateKuji(int count) {
        Kuji[] kujis = new Kuji[count];
        int hitCount = 0;
        for (int i = 0; i < kujis.length; i++) {
            kujis[i] = new Kuji();
            if (hitCount < HIT_COUNT) {
                kujis[i].hit = (int) (Math.random() * 2) == 1;
                if (kujis[i].hit) {
                    hitCount++;
                }
            }
        }
        return kujis;
    }

}

class KujiPlayer {
    Kuji[] kujis = new Kuji[Kuji.KUJI_COUNT];
    int hitCount;
    int selectCount;
    StringBuilder hitIndexStr = new StringBuilder();

    public KujiPlayer(int hitCount, int selectCount) {
        this.hitCount = hitCount;
        this.selectCount = selectCount;
    }

    public int getHitCount() {
        return hitCount;
    }

    public int getSelectCount() {
        return selectCount;
    }

    void hitKuji(Kuji[] kujis) {
        int hitIndex;
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("■ ");
        }
        while (true) {
            hitIndex = (int) (Math.random() * 10);
            if (hitIndexStr.indexOf(hitIndex + "") < 0) {
                this.kujis[hitIndex] = kujis[hitIndex];
                hitIndexStr.append(hitIndex);
                this.selectCount--;
                if (kujis[hitIndex].isHit()) {
                    hitCount--;
                    System.out.println("=>大当たり！");
                } else {
                    System.out.println("=>残念！");
                }
                break;
            }
        }
        // System.out.println(selectCount + " " + hitCount + " " + hitIndexStr);
    }

}