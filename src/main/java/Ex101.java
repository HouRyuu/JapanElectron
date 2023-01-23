/**
 * プログラム名 :Ex101
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex101 {
    public static void main(String[] args) {
        Figure4 s1 = new Circle4();
        Figure4 s2 = new Triangle4();
        Figure4 s3 = new Square4();
        s1.draw();
        s2.draw();
        s3.draw();
    }
}

interface Figure4 {
    void draw();
}

class Circle4 implements Figure4 {
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Triangle4 implements Figure4 {
    @Override
    public void draw() {
        System.out.println("△");
    }
}

class Square4 implements Figure4 {
    @Override
    public void draw() {
        System.out.println("□");
    }
}


