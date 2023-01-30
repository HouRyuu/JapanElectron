import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * プログラム名 :Ex112
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex112 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("名前入力：");
        while (scan.hasNext()) {
            System.out.print("名前入力：");
            name = scan.next();
            // 重複判定
            if (list.contains(name)) {
                System.out.println("**********" + name + "はすでに存在します**********");
                System.out.print("名前入力：");
            } else {
                list.add(name);
            }
        }
        System.out.print("入力した名前(入力順)：");
        list.forEach(s -> System.out.print(s + "　"));
        System.out.println();

        System.out.print("入力した名前(ソート)：");
        Collections.sort(list);
        list.forEach(s -> System.out.print(s + "　"));
        System.out.println();

    }
}


