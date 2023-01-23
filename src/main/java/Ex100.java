/**
 * プログラム名 :Ex100
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex100 {
    public static void main(String[] args) {
        Figure3 s1 = new Circle3();
        Figure3 s2 = new Triangle3();
        Figure3 s3 = new Square3();
        s1.draw();
        s2.draw();
        s3.draw();
    }
}

abstract class Figure3 {
    abstract void draw();
}

class Circle3 extends Figure3 {
    @Override
    void draw() {
        System.out.println("○");
    }
}

class Triangle3 extends Figure3 {
    @Override
    void draw() {
        System.out.println("△");
    }
}

class Square3 extends Figure3 {
    @Override
    void draw() {
        System.out.println("□");
    }
}


