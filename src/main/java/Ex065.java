/**
 * プログラム名 :Ex065
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex065 {

    public static void main(String[] args) {
        Ball basketball = new Ball("バスケットボール", 12.25);
        basketball.showSize();
        Ball soccerBall = new Ball("サッカーボール", 11.0);
        soccerBall.showSize();
        Ball halo = new Ball("ハロ", 20.0);
        halo.showSize();
    }
}

class Ball {
    private String name;
    private double r;

    public Ball(String name, double r) {
        this.name = name;
        this.r = r;
    }

    void showSize() {
        System.out.println(this.name);
        System.out.println("断面積(最大)：" + (r * r * Math.PI));
        System.out.println("外周(最大)：" + (2 * r * Math.PI));
    }
}