/**
 * プログラム名 :Ex086
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex086 {

    public static void main(String[] args) {
        Car9 car = new Car9("アトラス", "ババババ");
        Truck9 truck = new Truck9("エルフ", "ドドドド");
        System.out.print(car.getName()+":");
        car.startEngine();
        System.out.println();
        System.out.print(car.getName()+":");
        truck.startEngine();
    }

}

class Car9 {
    private String name;
    private String engineSound;

    public Car9(String name, String engineSound) {
        this.name = name;
        this.engineSound = engineSound;
    }

    public String getName() {
        return name;
    }

    public String getEngineSound() {
        return engineSound;
    }

    public void startEngine() {
        for (int i = 0; i < 6; i++) {
            System.out.print(getEngineSound() + " ");
        }
    }
}

class Truck9 extends Car9 {
    public Truck9(String name, String engineSound) {
        super(name, engineSound);
    }

    public void startEngine() {
        for (int i = 0; i < 6; i++) {
            System.out.print(getEngineSound().substring(0, getEngineSound().length() / 2) + " ");
        }
    }
}