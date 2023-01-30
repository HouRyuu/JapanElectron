import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * プログラム名 :Ex115
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex115 {
    public static void main(String[] args) {
        ArrayList<Coco2> list = new ArrayList<>();
        list.add(new Coco2("ロコモコカレー"));
        list.add(new Coco2("レッドカレー"));
        System.out.println("*並び替え前*");
        list.forEach(coco1 -> coco1.printCurry());

        System.out.println("*並び替え後*");
        Collections.sort(list, Comparator.comparing(Coco2::getName));
        list.forEach(coco1 -> coco1.printCurry());
    }
}

class Coco2 {
    private String name;

    public Coco2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void printCurry() {
        System.out.println(name);
    }

}


