/**
 * プログラム名 :Ex098
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex098 {
    public static void main(String[] args) {
        Figure1 s1 = new Circle1();
        Figure1 s2 = new Triangle1();
        Figure1 s3 = new Square1();
        s1.draw();
        s2.draw();
        s3.draw();
    }
}

class Figure1 {
    static int circle = 1; // 円
    static int triangle = 2; // 三角
    static int square = 3; // 四角
    private int type;

    Figure1(int type) {
        this.type = type;
    }

    int getType() {
        return type;
    }

    void draw() {
        switch (type) {
            case 1:
            System.out.println("○");
            break;
            case 2:
            System.out.println("△");
            break;
            case 3:
            System.out.println("□");
            break;
            default:
            System.out.println("該当図形なし");
        }
    }
}

class Circle1 extends Figure1 {
    Circle1() {
        super(Figure1.circle);
    }
}
class Triangle1 extends Figure1 {
    Triangle1() {
        super(Figure1.triangle);
    }
}
class Square1 extends Figure1 {
    Square1() {
        super(Figure1.square);
    }
}

