
/**
 * プログラム名 :Ex047
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex047 {

    public static void main(String[] args) {
        Robot2 robot = new Robot2(60, 18, "ガンダム");
        robot.showName();
        robot.showWeight();
        robot.showHeight();
    }
}

class Robot2 {
    int weight;
    int height;
    String name;

    Robot2() {

    }

    Robot2(int weight, int height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
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
