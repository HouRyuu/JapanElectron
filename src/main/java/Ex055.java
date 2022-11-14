/**
 * プログラム名 :Ex055
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex055 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setName("青木一郎");
        s1.setId("20JY0101");
        printStudent(s1);
        Student1 s2 = new Student1();
        s2.setName("高山裕子");
        s2.setId("19JY0230");
        printStudent(s2);
        Student1 s3 = new Student1();
        s3.setName("山本加奈");
        s3.setId("18JY0115");
        printStudent(s3);
    }

    static void printStudent(Student1 s) {
        System.out.println("氏名:" + s.getName() + "\t学籍番号:" + s.getId());
    }
}

class Student1 {
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
}
