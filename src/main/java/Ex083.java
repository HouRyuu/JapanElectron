/**
 * プログラム名 :Ex083
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex083 {

    public static void main(String[] args) {
        Truck5 t1 = new Truck5("アトラス", 1800, 3500);
        SportsCar s1 = new SportsCar("フェアレディZ", 2200, 175);
        print(t1);
        print(s1);
    }

    static void print(Car5 car) {
        car.printData();
    }
}

class Car5 {
    private String name;
    private long mileage;

    public Car5(String name, long mileage) {
        this.name = name;
        this.mileage = mileage;
    }

    public void printData() {
        System.out.printf("名前：%s\t走行距離：%d\t", name, mileage);
    }
}

class Truck5 extends Car5 {
    private int loadage;

    public Truck5(String name, long mileage, int loadage) {
        super(name, mileage);
        this.loadage = loadage;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.printf("積載量:%d\n", loadage);
    }
}

class SportsCar extends Car5 {
    private int maxSpeed;

    public SportsCar(String name, long mileage, int maxSpeed) {
        super(name, mileage);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.printf("最高速度:%d\n", maxSpeed);
    }
}
