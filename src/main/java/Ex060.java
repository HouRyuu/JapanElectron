/**
 * プログラム名 :Ex060
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex060 {
    public static void main(String[] args) {
        Robot5 first = new Robot5("EVA-01", 1);
        showRobot(first);
        Robot5 second = new Robot5("AV98", 2);
        showRobot(second);
    }

    static void showRobot(Robot5 robot) {
        robot.showName();
        robot.showCount();
    }
}

class Robot5 {
    private String name;
    private int count;

    public Robot5() {
    }

    public Robot5(String name, int count) {
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
