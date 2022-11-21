
/**
 * プログラム名 :Ex052
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex052 {

    public static void main(String[] args) {
        Person3 p1 = new Person3("Ishida", 'M', 170.5, 60.0);
        p1.printData();
        Person3 p2 = new Person3("Tanaka", 'F');
        p2.printData();
        Person3 p3 = new Person3();
        p3.printData();
    }
}

class Person3 {
    private String name;
    private char gender;
    private double height;
    private double weight;

    public Person3() {
        this.name = "名無しのごんべい";
        this.gender = '?';
        this.height = 0.0;
        this.weight = 0.0;
    }

    public Person3(String name, char gender, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public Person3(String name, char gender) {
        this.name = name;
        this.gender = gender;
        this.height = 0.0;
        this.weight = 0.0;
    }

    void printData() {
        System.out.println(this.name + "(" + this.gender + ")：" + this.height + "cm, " + this.weight + "kg");
    }

}
