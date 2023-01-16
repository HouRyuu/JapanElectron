/**
 * プログラム名 :Ex091
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex091 {

    public static void main(String[] args) {
        Cat2[] cats = {
                new Cat2("ミーニャ"),
                new Cat2("タマ"),
                new Cat2("ジジ"),
                new Cat2("トロ"),
        };
        Breeder1 breeder = new Breeder1(cats);
        breeder.callCat();
    }

}

class Cat2 {
    private String name;

    public Cat2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Breeder1 {
    private Cat2[] cats;

    public Breeder1(Cat2[] cats) {
        this.cats = cats;
    }

    public void callCat() {
        for (Cat2 cat : cats) {
            System.out.println(cat.getName() + "、こっちだよ。");
        }
    }
}
