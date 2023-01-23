/**
 * プログラム名 :Ex099
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex099 {
    public static void main(String[] args) {
        Figure2 s1 = new Circle2();
        Figure2 s2 = new Triangle2();
        Figure2 s3 = new Square2();
        s1.draw();
        s2.draw();
        s3.draw();
    }
}

class Figure2 {
    public void draw() {
        if (this instanceof Circle2) {
            System.out.println("○");
        } else if (this instanceof Triangle2) {
            System.out.println("△");
        } else if (this instanceof Square2) {
            System.out.println("□");
        } else {
            System.out.println("該当図形なし");
        }
    }
}

class Circle2 extends Figure2 {
}

class Triangle2 extends Figure2 {
}

class Square2 extends Figure2 {
}


