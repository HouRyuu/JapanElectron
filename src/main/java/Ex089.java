/**
 * プログラム名 :Ex089
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex089 {

    public static void main(String[] args) {
        AbShape s1 = new Rect(10.0, 5.0); //横 10.0 縦 5.0
        s1.setName("長方形");
        s1.setXY(100, 200);
        AbShape s2 = new Circle(3.0); //半径 3.0
        s2.setName("円");
        s2.setXY(150, 50);
        AbShape s[] = new AbShape[2];
        s[0] = s1;
        s[1] = s2;
        for (AbShape ab : s) {
            System.out.println("名前:" + ab.name);
            System.out.println("座標:(x, y) = (" + ab.x + "," + ab.y + ")");
            System.out.println("面積:" + ab.getArea());
            System.out.println();
        }
    }

}

abstract class AbShape {
    String name;
    public int x;
    public int y;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rect extends AbShape {
    private double width;
    private double height;

    public Rect(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends AbShape {
    private double r;

    public Circle(double r) {
        super();
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * r * 3.14;
    }
}
