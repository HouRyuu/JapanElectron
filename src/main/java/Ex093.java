/**
 * プログラム名 :Ex093
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex093 {
    public static void main(String[] args) {
        Jockey[] jockeys = new Jockey[]{
                new Jockey("武 豊", 49, "キタサンブラック"),
                new Jockey("三浦 皇成", 29, "プレミアムボックス"),
        };
        for (Jockey jockey : jockeys) {
            jockey.profileDisplay();
            System.out.println();
        }
    }
}

class Jockey {
    private String name;
    private int age;
    private String mainHorse;

    public Jockey(String name, int age, String mainHorse) {
        this.name = name;
        this.age = age;
        this.mainHorse = mainHorse;
    }

    public void profileDisplay() {
        System.out.println("氏名:" + this.name);
        System.out.println("年齢:" + this.age);
        System.out.println("主な騎乗馬:" + this.mainHorse);
    }
}