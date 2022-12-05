/**
 * プログラム名 :Ex080
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex080 {

    public static void main(String[] args) {
        CurrySet1[] currySets = new CurrySet1[]{
                new CurrySet1(200, "コーラ"),
                new CurrySet1(300, "ラッシー")
        };
        for (CurrySet1 currySet : currySets) {
            currySet.showGram();
            currySet.showDrink();
        }
    }
}

class Curry2 {
    private int gram;

    public Curry2(int gram) {
        this.gram = gram;
    }

    public void showGram() {
        System.out.println("カレー:" + this.gram + "g");
    }
}

class CurrySet1 extends Curry2 {
    private String drink;

    public CurrySet1(int gram, String drink) {
        super(gram);
        this.drink = drink;
    }

    public void showDrink() {
        System.out.println("ドリンク:" + this.drink);
    }
}
