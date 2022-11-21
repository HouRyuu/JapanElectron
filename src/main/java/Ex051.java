
/**
 * プログラム名 :Ex051
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex051 {

    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.setData("Ishida", 'M', 170.5, 60.0);
        printData(p1);
        Person2 p2 = new Person2();
        p2.setData("Tanaka", 'F');
        printData(p2);
        Person2 p3 = new Person2();
        p3.setData();
        printData(p3);
    }

    static void printData(Person2 person) {
        System.out.println(person.getName() + "(" + person.getGender() + ")：" + person.getHeight() + "cm, " + person.getWeight() + "kg");
    }
}

class Person2 {
    private String name;
    private char gender;
    private double height;
    private double weight;

    public Person2() {
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

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
