
/**
 * プログラム名 :Ex045
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex045 {

    public static void main(String[] args) {
        Food f1 = new Food("たいやき", 100);
        f1.printPrice();
        f1.printPrice(3);
    }
}

class Food {
    String foodName;
    int price;

    Food() {

    }

    Food(String foodName, int price) {
        this.foodName = foodName;
        this.price = price;
    }

    void printPrice() {
        printPrice(1);
    }

    void printPrice(int num) {
        System.out.println(this.foodName + "は" + num + "個" + (this.price * num) + "円です。");
    }
}
