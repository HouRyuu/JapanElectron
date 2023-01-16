/**
 * プログラム名 :Ex090
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex090 {

    public static void main(String[] args) {
        Cat1 c1 = new Cat1("ミーニャ");
        Breeder br1 = new Breeder(c1);
        br1.callCat();
    }

}

class Cat1 {
    private String name;

    public Cat1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Breeder {
    private Cat1 cat;

    public Breeder(Cat1 cat) {
        this.cat = cat;
    }

    public void callCat() {
        System.out.println(cat.getName() + "、こっちだよ。");
    }
}
