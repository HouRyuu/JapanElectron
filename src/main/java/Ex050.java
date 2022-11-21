
/**
 * プログラム名 :Ex050
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex050 {

    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setData("Ishida", 'M', 170.5, 60.0);
        p1.printData();
        Person1 p2 = new Person1();
        p2.setData("Tanaka", 'F');
        p2.printData();
        Person1 p3 = new Person1();
        p3.setData();
        p3.printData();
    }
}

class Person1 {
    private String name;
    private char gender;
    private double height;
    private double weight;

    public Person1() {
    }

    public void setData(String name, char gender, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public void setData(String name, char gender) {
        setData(name, gender, 0.0, 0.0);
    }

    public void setData() {
        setData("名無しのごんべい", '?');
    }

    void printData() {
        System.out.println(this.name + "(" + this.gender + ")：" + this.height + "cm, " + this.weight + "kg");
    }

}
