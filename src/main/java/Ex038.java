import java.util.Scanner;

/**
 * プログラム名 :Ex037
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("購入個数を入力してください");
        int count = scan.nextInt();
        System.out.println("価格を入力してください");
        int price = scan.nextInt();
        System.out.println("定価" + price + "円の商品を" + count + "個購入する場合"
                + getTotalPrice(count, price) + "円です");
    }

    private static int getTotalPrice(int count, int price) {
        return count * getPrice(count, price);
    }

    private static int getPrice(int count, int price) {
        if (count >= 500) {
            return price *= 0.8;
        }
        return price;
    }
}