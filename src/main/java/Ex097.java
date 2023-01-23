/**
 * プログラム名 :Ex097
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex097 {
    public static void main(String[] args) {
        Figure s1 = new Figure(Figure.circle);
        Figure s2 = new Figure(Figure.triangle);
        Figure s3 = new Figure(Figure.square);
        s1.draw();
        s2.draw();
        s3.draw();
    }
}

class Figure {
    static int circle = 1; // 円
    static int triangle = 2; // 三角
    static int square = 3; // 四角
    private int type;

    Figure(int type) {
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

