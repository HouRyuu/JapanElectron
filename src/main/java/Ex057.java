/**
 * プログラム名 :Ex057
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex057 {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        s1.setDetails("青木一郎", 101);
        printStudent(s1);
        Student3 s2 = new Student3();
        s2.setDetails("高山裕子", "19JY0230");
        printStudent(s2);
        Student3 s3 = new Student3();
        s3.setDetails("山本加奈", "18JY0115");
        printStudent(s3);
    }

    static void printStudent(Student3 s) {
        System.out.println("氏名:" + s.getName() + "\t学籍番号:" + s.getId());
    }
}

class Student3 {
    private String name;
    private String id;

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

    void setDetails(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setDetails(String name, int id) {
        setDetails(name, String.format("20JY%04d", id));
    }
}
