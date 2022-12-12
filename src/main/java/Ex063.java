import java.util.Random;

/**
 * プログラム名 :Ex063
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex063 {

    public static void main(String[] args) {
        final int PLASTIC_BOTTLE_NUM = 50;
        PlasticBottle2[] pbs = new PlasticBottle2[PLASTIC_BOTTLE_NUM];
        Random random = new Random();
        for (int i = 0; i < PLASTIC_BOTTLE_NUM; i++) {
            pbs[i] = new PlasticBottle2(500, random.nextInt(501));
        }
        for (PlasticBottle2 pb : pbs) {
            if (pb.getNokori() >= 400) {
                pb.show();
            }
        }
    }
}

class PlasticBottle2 {
    private int size;
    private int nokori;

    PlasticBottle2() {
        size = 500;
        nokori = 500;
    }

    PlasticBottle2(int ml) {
        size = ml;
        nokori = 0;
    }

    PlasticBottle2(int ml, int remain) {
        size = ml;
        nokori = remain;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNokori() {
        return nokori;
    }

    public void setNokori(int nokori) {
        this.nokori = nokori;
    }

    void show() {
        System.out.println("サイズは" + size + "ml、残りは" + nokori + "mlです");
    }
}
