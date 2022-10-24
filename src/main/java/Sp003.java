import java.util.Scanner;

/**
 * プログラム名 :Sp003
 * 引数 1 :なし
 * 概要 :料金を表示
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Sp003 {
    public static void main(String[] args) {
        int[][] priceList = new int[][]{
                {100, 100},
                {200, 190},
                {400, 370},
                {600, 550},
                {1000, 900},
                {2000, 1700}
        };
        System.out.print("荷物の重さを入力してください:");
        int weight = new Scanner(System.in).nextInt();

        int searchResult = binarySearch(priceList, weight);
        if (searchResult >= 0) {
            System.out.println("料金は" + priceList[searchResult][1] + "円です。");
        }
    }

    static int binarySearch(int[][] priceList, int weight) {
        int low = 0, high = priceList.length - 1, mid = 0;
        while (low <= high) {
            mid = (low + high) >>> 1;
            int midVal = priceList[mid][0];
            if (midVal < weight)
                low = mid + 1;
            else if (midVal > weight)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

}