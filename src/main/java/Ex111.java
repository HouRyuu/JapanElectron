import java.util.ArrayList;

/**
 * プログラム名 :Ex111
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex111 {
    public static void main(String[] args) {
        ArrayList<Panda> list = new ArrayList<>();
        list.add(new Panda("ランラン", 5));
        list.add(new Panda("カンカン", 3));
        list.add(new Panda("トントン", 2));
        printArray(list);
    }

    static void printArray(ArrayList<Panda> list) {
        list.forEach(panda ->
                System.out.println(panda.getName() + "の年齢は" + panda.getAge() + "歳です。"));
    }
}

class Panda {
    private String name;
    private int age;

    public Panda(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


