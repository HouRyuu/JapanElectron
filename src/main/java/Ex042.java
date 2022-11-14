
/**
 * プログラム名 :Ex042
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex042 {

    public static void main(String[] args) {
        Car3 toyota = new Car3();
        toyota.run('西', 50);
        toyota.print();
        System.out.println();
        toyota.turn('北');
        toyota.print();
        System.out.println();
        toyota.stop();
        toyota.print();
        System.out.println();
        toyota.run('東', 100);
        toyota.print();
        System.out.println();
        toyota.stop();
        toyota.print();
        System.out.println();
    }
}

class Car {
    int gasoline = 50;
    char direction;
    int speed;

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
    }
}
