/**
 * プログラム名 :Ex075
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex075 {

    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        magazine.setTitle("Software Design");
        magazine.setPublisher("技術評論社");
        magazine.setPrice(1342);
        magazine.setYear(2020);
        magazine.setMonth(12);
        Magazine magazine1 = new Magazine();
        magazine1.setTitle("日経ソフトウェア");
        magazine1.setPublisher("日経BP社");
        magazine1.setPrice(1580);
        magazine1.setYear(2021);
        magazine1.setMonth(1);
        System.out.println("書名：" + magazine.getTitle() + "\t" + magazine.getYear() + "年"
                + magazine.getMonth() + "月号\t\t" + magazine.getPublisher() + "\t価格" + magazine.getPrice() + "円");
        System.out.println("書名：" + magazine1.getTitle() + "\t\t" + magazine1.getYear() + "年"
                + magazine1.getMonth() + "月号\t\t" + magazine1.getPublisher() + "\t\t価格" + magazine1.getPrice() + "円");

    }
}

class Book {
    private String title;
    private String publisher;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Magazine extends Book {
    private int year;
    private int month;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
