/**
 * プログラム名 :Ex058
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex058 {
    public static void main(String[] args) {
        Student4 s1 = new Student4("青木一郎", 101);
        printStudent(s1);
        Student4 s2 = new Student4("高山裕子", "19JY0230");
        printStudent(s2);
        Student4 s3 = new Student4("山本加奈", "18JY0115");
        printStudent(s3);
    }

    static void printStudent(Student4 s) {
        System.out.println("氏名:" + s.getName() + "\t学籍番号:" + s.getId());
    }
}

class Student4 {
    private String name;
    private String id;

    Student4(String name, String id) {
        this.name = name;
        this.id = id;
    }

    Student4(String name, int id) {
        this(name, String.format("20JY%04d", id));
    }

    void setName(String n) {
        name = n;
    }

    String getName() {
        return this.name;
    }

    void setId(String i) {
        id = i;
    }

    String getId() {
        return this.id;
    }
}
