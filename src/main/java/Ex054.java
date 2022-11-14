/**
 * プログラム名 :Ex054
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex054 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("青木一郎");
        s1.setId("20JY0101");
        System.out.println("氏名:" + s1.getName() + "\t学籍番号:" + s1.getId());
        Student s2 = new Student();
        s2.setName("高山裕子");
        s2.setId("19JY0230");
        System.out.println("氏名:" + s2.getName() + "\t学籍番号:" + s2.getId());
        Student s3 = new Student();
        s3.setName("山本加奈");
        s3.setId("18JY0115");
        System.out.println("氏名:" + s3.getName() + "\t学籍番号:" + s3.getId());
    }
}

class Student {
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
