/**
 * プログラム名 :Ex078
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex078 {

    public static void main(String[] args) {
        Truck2[] trucks = new Truck2[]{
                new Truck2("アトラス", 1800, 3500),
                new Truck2("エルフ", 2500, 5000),
                new Truck2("キャリィ", 3600, 2800)
        };
        for (Truck2 truck : trucks) {
            System.out.println("名前：" + truck.getName() + (truck.getName().length() < 4 ? "\t" : "") + "\t走行距離："
                    + truck.getMileage() + "\t積載量：" + truck.getLoadage());
        }
    }
}

class Car4 {
    private String name;
    private long mileage;

    public Car4(String name, long mileage) {
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

class Truck2 extends Car4 {
    private int loadage;

    public Truck2(String name, long mileage, int loadage) {
        super(name, mileage);
        this.loadage = loadage;
    }

    public int getLoadage() {
        return loadage;
    }

}
