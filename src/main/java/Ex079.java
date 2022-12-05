/**
 * プログラム名 :Ex079
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex079 {

    public static void main(String[] args) {
        CurrySet currySet = new CurrySet();
        currySet.setGram(200);
        currySet.setDrink("コーラ");
        currySet.showGram();
        currySet.showDrink();
    }
}

class Curry1 {
    private int gram;

    public void setGram(int gram) {
        this.gram = gram;
    }

    public void showGram() {
        System.out.println("カレー:" + this.gram + "g");
    }
}

class CurrySet extends Curry1 {
    private String drink;

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void showDrink() {
        System.out.println("ドリンク:" + this.drink);
    }
}
