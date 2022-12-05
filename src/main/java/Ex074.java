/**
 * プログラム名 :Ex074
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex074 {

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.setName("アトラス");
        truck.setMileage(1800);
        truck.setLoadage(3500);
        Truck truck1 = new Truck();
        truck1.setName("エルフ");
        truck1.setMileage(2500);
        truck1.setLoadage(5000);
        System.out.println("名前：" + truck.getName() + "\t走行距離：" + truck.getMileage()
                + "\t積載量：" + truck.getLoadage());
        System.out.println("名前：" + truck1.getName() + "\t\t走行距離：" + truck1.getMileage()
                + "\t積載量：" + truck1.getLoadage());
    }
}

class Car1 {
    private String name;
    private long mileage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }
}

class Truck extends Car1 {
    private int loadage;

    public int getLoadage() {
        return loadage;
    }

    public void setLoadage(int loadage) {
        this.loadage = loadage;
    }
}
