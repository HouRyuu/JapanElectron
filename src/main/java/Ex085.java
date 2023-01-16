/**
 * プログラム名 :Ex085
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex085 {

    public static void main(String[] args) {
        Car7[] cars = {
                new Truck7("アトラス", 1800, 3500),
                new Truck7("エルフ", 2500, 5000),
                new SportsCar2("RX-8", 70000, 180),
                new SportsCar2("MR-S", 55000, 185),
                new SportsCar2("フェアレディZ", 2200, 175)
        };
        for (Car7 car : cars) {
            if (car instanceof SportsCar2) {
                print(car);
            }
        }
    }

    static void print(Car7 car) {
        car.printData();
    }
}

class Car7 {
    private String name;
    private long mileage;

    public Car7(String name, long mileage) {
        this.name = name;
        this.mileage = mileage;
    }

    public void printData() {
        System.out.printf("名前：%s\t走行距離：%d\t", name, mileage);
    }
}

class Truck7 extends Car7 {
    private int loadage;

    public Truck7(String name, long mileage, int loadage) {
        super(name, mileage);
        this.loadage = loadage;
    }

    public void printData() {
        super.printData();
        System.out.printf("積載量:%d\n", loadage);
    }
}

class SportsCar2 extends Car7 {
    private int maxSpeed;

    public SportsCar2(String name, long mileage, int maxSpeed) {
        super(name, mileage);
        this.maxSpeed = maxSpeed;
    }

    public void printData() {
        super.printData();
        System.out.printf("最高速度:%d\n", maxSpeed);
    }
}
