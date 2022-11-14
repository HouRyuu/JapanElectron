
/**
 * プログラム名 :Ex043
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex043 {

    public static void main(String[] args) {
        Car3 car3 = new Car3();
        car3.print();

        car3.run('西', 50);
        car3.print();

        car3.turn('北');
        car3.print();

        car3.run('南', 60);
        car3.print();

        car3.stop();
        car3.print();
    }
}

class Car3 {
    int gasoline;
    char direction;
    int speed;

    Car3() {
        System.out.println("Constructor");
        direction = '北';
        speed = 0;
        gasoline = 50;
    }

    void run(char dir, int spd) {
        System.out.println("run(char dir, int spd) method");
        direction = dir;
        speed = spd;
        gasoline--;
    }

    void turn(char dir) {
        System.out.println("turn(char dir) method");
        direction = dir;
        gasoline--;
    }

    void stop() {
        System.out.println("stop() method");
        speed = 0;
    }

    void print() {
        System.out.println("ガソリン\t:" + gasoline + " Liter");
        System.out.println("方向\t:" + direction);
        System.out.println("スピード\t:" + speed + "km/h");
        System.out.println();
    }
}
