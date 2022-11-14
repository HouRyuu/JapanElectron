
/**
 * プログラム名 :Ex048
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex048 {

    public static void main(String[] args) {
        Robot3 robot = new Robot3(60.0, 18.0, "ガンダム");
        robot.showSpec();
        Robot3 robot1 = new Robot3(0.23, 1.8, "ASIMO");
        robot1.showSpec();
        Robot3 robot2 = new Robot3(1.0, 1.5, "ロボコン");
        robot2.showSpec();
    }
}

class Robot3 {
    double weight;
    double height;
    String name;

    Robot3() {

    }

    Robot3(double weight, double height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    void showSpec() {
        System.out.println(this.name + "(" + this.weight + "ton, " + this.height + "m)");
    }
}
