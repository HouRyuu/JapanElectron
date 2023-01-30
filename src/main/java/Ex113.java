import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * プログラム名 :Ex113
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex113 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("数字入力：");
        while (scan.hasNext()) {
            System.out.print("数字入力：");
            num = scan.nextInt();
            list.add(num);
        }

        Collections.sort(list);
        printArray(list);
        printArrayTotal(list);
    }

    static void printArray(ArrayList<Integer> list) {
        System.out.print("数字リスト：");
        list.forEach(num -> System.out.print(num + " "));
        System.out.println();
    }

    static void printArrayTotal(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("合計：" + sum);
    }
}


