/**
 * プログラム名 :Ex092
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex092 {
    public static void main(String[] args) {
        Truck8 truck = new Truck8("Hino1", 1000, 4);
        truck.run(120);
        System.out.println(truck.getName() + "(" + truck.getLoadage() + "t):"
                + truck.getMileage() + "km");

    }
}

class Car8 {
    private String name; //名称
    private long mileage; //走行距離

    Car8(String name, long mileage) {
        this.name = name;
        this.mileage = mileage;
    }

    String getName() {
        return name;
    }

    long getMileage() {
        return mileage;
    }

    void run(int distance) {
        System.out.println(name + "走行:" + distance + "km");
        mileage += distance;
    }
}

class Truck8 {
    private Car8 car;
    private int loadage;

    Truck8(String name, long mileage, int loadage) {
        this.car = new Car8(name, mileage);
        this.loadage = loadage;
    }

    String getName() {
        return car.getName();

    }
    long getMileage() {
        return car.getMileage();
    }
    void run(int distance) {
        car.run(distance);
    }
    int getLoadage() {
        return this.loadage;
    }
}