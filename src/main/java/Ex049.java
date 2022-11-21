
/**
 * プログラム名 :Ex049
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex049 {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setData("Ishida", 'M', 170.5, 60.0);
        p1.printData();
        Person p2 = new Person();
        p2.setData("Tanaka", 'F');
        p2.printData();
        Person p3 = new Person();
        p3.setData();
        p3.printData();
    }
}

class Person {
    private String name;
    private char gender;
    private double height;
    private double weight;

    public Person() {
    }

    public void setData(String name, char gender, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public void setData(String name, char gender) {
        this.name = name;
        this.gender = gender;
        this.height = 0.0;
        this.weight = 0.0;
    }

    public void setData() {
        this.name = "名無しのごんべい";
        this.gender = '?';
        this.height = 0.0;
        this.weight = 0.0;
    }

    void printData() {
        System.out.println(this.name + "(" + this.gender + ")：" + this.height + "cm, " + this.weight + "kg");
    }

}
