/**
 * プログラム名 :Ex059
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex059 {
    public static void main(String[] args) {
        Robot4 first = new Robot4("EVA-01");
        first.showName();
        Robot4.showCount();
        Robot4 second = new Robot4("AV98");
        second.showName();
        Robot4.showCount();
    }
}

class Robot4 {
    private String name;
    private static int count;

    public Robot4(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("ロボット：" + this.name);
    }

    static void showCount() {
        System.out.println("ロボットの製造台数：" + count);
    }
}
