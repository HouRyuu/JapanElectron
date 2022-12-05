/**
 * プログラム名 :Ex077
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex077 {

    public static void main(String[] args) {
        Truck1 truck = new Truck1("アトラス", 1800, 3500);
        Truck1 truck1 = new Truck1("エルフ", 2500, 5000);
        System.out.println("名前：" + truck.getName() + "\t走行距離：" + truck.getMileage()
                + "\t積載量：" + truck.getLoadage());
        System.out.println("名前：" + truck1.getName() + "\t\t走行距離：" + truck1.getMileage()
                + "\t積載量：" + truck1.getLoadage());
    }
}

class Car2 {
    private String name;
    private long mileage;

    public Car2(String name, long mileage) {
        this.name = name;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public long getMileage() {
        return mileage;
    }

}

class Truck1 extends Car2 {
    private int loadage;

    public Truck1(String name, long mileage, int loadage) {
        super(name, mileage);
        this.loadage = loadage;
    }

    public int getLoadage() {
        return loadage;
    }

}
