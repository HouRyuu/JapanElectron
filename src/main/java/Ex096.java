/**
 * プログラム名 :Ex096
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex096 {
    public static void main(String[] args) {
        final Book2 BOOK = new Book2("大家さんと僕", "矢部　太郎", 1000);
        final Pc PC = new Pc("HP", "Let's Note", "intel core i9", 89800);
        final Shampoo SHAMPOO = new Shampoo("不明", "TSUBAKI", 100, 1300);
        printGoods(BOOK);
        printGoods(PC);
        printGoods(SHAMPOO);

    }

    static void printGoods(Goods goods) {
        System.out.println("名前：" + goods.getName() + "\t価格：" + goods.getPrice() + "円");
    }
}

interface Goods {

    String getName();

    int getPrice();

}

class Book2 implements Goods {

    private String title;
    private String author;
    private int price;

    public Book2(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String getName() {
        return this.title;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Pc implements Goods {

    private String maker;
    private String name;
    private String cpu;
    private int price;

    public Pc(String maker, String name, String cpu, int price) {
        this.maker = maker;
        this.name = name;
        this.cpu = cpu;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public String getCpu() {
        return cpu;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Shampoo implements Goods {
    private String maker;
    private String name;
    private int quantity;
    private int price;

    public Shampoo(String maker, String name, int quantity, int price) {
        this.maker = maker;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

