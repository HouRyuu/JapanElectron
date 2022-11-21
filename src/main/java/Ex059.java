/**
 * プログラム名 :Ex059
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex059 {
    public static void main(String[] args) {
        Robot4 first = new Robot4("EVA-01", 1);
        first.showName();
        first.showCount();
        Robot4 second = new Robot4("AV98", 2);
        second.showName();
        second.showCount();
    }
}

class Robot4 {
    private String name;
    private int count;

    public Robot4() {
    }

    public Robot4(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    void showName() {
        System.out.println("ロボット：" + this.name);
    }

    void showCount() {
        System.out.println("ロボットの製造台数：" + this.count);
    }
}
