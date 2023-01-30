import java.util.ArrayList;

/**
 * プログラム名 :Ex116
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex116 {
    public static void main(String[] args) {
        final Book4 BOOK = new Book4("大家さんと僕", "矢部　太郎", 1000);
        final Pc2 PC = new Pc2("HP", "Let's Note", "intel core i9", 89800);
        final Shampoo2 SHAMPOO = new Shampoo2("不明", "TSUBAKI", 100, 1300);
        ShoppingBag1 shoppingBag = new ShoppingBag1();
        shoppingBag.add(BOOK);
        shoppingBag.add(PC);
        shoppingBag.add(SHAMPOO);
        shoppingBag.printList();
        System.out.println("合計：" + shoppingBag.getSumPrice());
    }
}

interface Goods2 {

    String getName();

    int getPrice();

}

class Book4 implements Goods2 {

    private String title;
    private String author;
    private int price;

    public Book4(String title, String author, int price) {
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

class Pc2 implements Goods2 {

    private String maker;
    private String name;
    private String cpu;
    private int price;

    public Pc2(String maker, String name, String cpu, int price) {
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

class Shampoo2 implements Goods2 {
    private String maker;
    private String name;
    private int quantity;
    private int price;

    public Shampoo2(String maker, String name, int quantity, int price) {
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

class ShoppingBag1 {
    private final ArrayList<Goods2> goodsList = new ArrayList<>();
    private int goodsCount;

    void add(Goods2 goods) {
        goodsList.add(goods);
    }

    int getSumPrice() {
        int sumPrice = 0;
        for (Goods2 goods : goodsList) {
            sumPrice += goods.getPrice();
        }
        return sumPrice;
    }

    void printList() {
        for (Goods2 goods : goodsList) {
            System.out.println("名前：" + goods.getName() + "\t価格：" + goods.getPrice() + "円");
        }
    }
}

