
/**
 * プログラム名 :Ex046
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex046 {

    public static void main(String[] args) {
        Robot robot = new Robot(60, 18, "ガンダム");
        robot.showName();
        robot.showWeight();
        robot.showHeight();
    }
}

class Robot {
    int weight;
    int height;
    String name;

    Robot() {

    }

    Robot(int ton, int meter, String title) {
        this.weight = ton;
        this.height = meter;
        this.name = title;
    }

    void showWeight() {
        System.out.println("重さは" + weight + "tonです");
    }

    void showHeight() {
        System.out.println("身長は" + height + "mです");
    }

    void showName() {
        System.out.println("名前は" + name + "です");
    }
}
