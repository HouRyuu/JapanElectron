import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * プログラム名 :Ex114
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex114 {
    public static void main(String[] args) {
        ArrayList<Coco1> list = new ArrayList<>();
        list.add(new Coco1("ロコモコカレー"));
        list.add(new Coco1("レッドカレー"));
        list.forEach(coco1 -> coco1.printCurry());
    }
}

class Coco1 {
    private String name;

    public Coco1(String name) {
        this.name = name;
    }

    void printCurry() {
        System.out.println(name);
    }
}


