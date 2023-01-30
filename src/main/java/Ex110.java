import java.util.ArrayList;

/**
 * プログラム名 :Ex110
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex110 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ポチ");
        list.add("サク");
        list.add("ジョン");
        list.add("りっぷ");
        list.add("ライム");
        printList(list);

        list.remove("ジョン");
        printList(list);

        list.add(0, "ぴっち");
        printList(list);

        list.set(list.indexOf("ポチ"), "ちよこ");
        printList(list);
    }

    static void printList(ArrayList<String> list) {
        System.out.printf("<要素の数：%d>\t", list.size());
        for (String s : list) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}


