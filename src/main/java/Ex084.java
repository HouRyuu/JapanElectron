/**
 * プログラム名 :Ex084
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex084 {

    public static void main(String[] args) {
        Car6[] cars = {
                new Truck6("アトラス", 1800, 3500),
                new Truck6("エルフ", 2500, 5000),
                new SportsCar1("RX-8", 70000, 180),
                new SportsCar1("MR-S", 55000, 185),
                new SportsCar1("フェアレディZ", 2200, 175)
        };
        for (Car6 car : cars) {
            print(car);
        }
    }

    static void print(Car6 car) {
        car.printData();
    }
}

class Car6 {
    private String name;
    private long mileage;

    public Car6(String name, long mileage) {
        this.name = name;
        this.mileage = mileage;
    }

    public void printData() {
        System.out.printf("名前：%s\t走行距離：%d\t", name, mileage);
    }
}

class Truck6 extends Car6 {
    private int loadage;

    public Truck6(String name, long mileage, int loadage) {
        super(name, mileage);
        this.loadage = loadage;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.printf("積載量:%d\n", loadage);
    }
}

class SportsCar1 extends Car6 {
    private int maxSpeed;

    public SportsCar1(String name, long mileage, int maxSpeed) {
        super(name, mileage);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.printf("最高速度:%d\n", maxSpeed);
    }
}
