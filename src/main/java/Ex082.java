/**
 * プログラム名 :Ex082
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex082 {

    public static void main(String[] args) {
        Curry3 curry = new Curry3();
        curry.setGram(200);
        curry.showMenu();

        CurrySet2 c2 = new CurrySet2();
        c2.setGram(300);
        c2.setDrink("コーラ");
        c2.showMenu();
    }
}

class Curry3 {
    private int gram;

    public void setGram(int gram) {
        this.gram = gram;
    }

    public void showMenu() {
        System.out.println("カレー:" + this.gram + "g");
    }
}

class CurrySet2 extends Curry3 {
    private String drink;

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void showMenu() {
        super.showMenu();
        System.out.println("ドリンク:" + this.drink);
    }
}
