/**
 * プログラム名 :Ex102
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex102 {
    public static void main(String[] args) {
        final Book3 BOOK = new Book3("大家さんと僕", "矢部　太郎", 1000);
        final Pc1 PC = new Pc1("HP", "Let's Note", "intel core i9", 89800);
        final Shampoo1 SHAMPOO = new Shampoo1("不明", "TSUBAKI", 100, 1300);
        ShoppingBag shoppingBag = new ShoppingBag();
        shoppingBag.add(BOOK);
        shoppingBag.add(PC);
        shoppingBag.add(SHAMPOO);
        shoppingBag.printList();
        System.out.println("合計：" + shoppingBag.getSumPrice());
    }
}

interface Goods1 {

    String getName();

    int getPrice();

}

class Book3 implements Goods1 {

    private String title;
    private String author;
    private int price;

    public Book3(String title, String author, int price) {
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

class Pc1 implements Goods1 {

    private String maker;
    private String name;
    private String cpu;
    private int price;

    public Pc1(String maker, String name, String cpu, int price) {
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

class Shampoo1 implements Goods1 {
    private String maker;
    private String name;
    private int quantity;
    private int price;

    public Shampoo1(String maker, String name, int quantity, int price) {
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

class ShoppingBag {
    private final Goods1[] goodsAry = new Goods1[20];
    private int goodsCount;

    void add(Goods1 goods) {
        goodsAry[goodsCount++] = goods;
    }

    int getSumPrice() {
        int sumPrice = 0;
        for (int i = 0; i < goodsCount; i++) {
            sumPrice += goodsAry[i].getPrice();
        }
        return sumPrice;
    }

    void printList() {
        for (int i = 0; i < goodsCount; i++) {
            System.out.println("名前：" + goodsAry[i].getName() + "\t価格：" + goodsAry[i].getPrice() + "円");
        }
    }
}

