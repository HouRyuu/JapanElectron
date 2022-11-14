
/**
 * プログラム名 :Ex053
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex053 {

    public static void main(String[] args) {
        Person4 p1 = new Person4("Ishida", 'M', 170.5, 60.0);
        p1.printData();
        Person4 p2 = new Person4("Tanaka", 'F');
        p2.printData();
        Person4 p3 = new Person4();
        p3.printData();
    }
}

class Person4 {
    String name;
    char gender;
    double height;
    double weight;

    public Person4() {
        this("名無しのごんべい", '?');
    }

    public Person4(String name, char gender, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public Person4(String name, char gender) {
        this(name, gender, 0.0, 0.0);
    }

    void printData() {
        System.out.println(this.name + "(" + this.gender + ")：" + this.height + "cm, " + this.weight + "kg");
    }

}
