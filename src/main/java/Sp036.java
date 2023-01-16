import java.util.Scanner;

/**
 * プログラム名 :Sp036
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Sp036 {
    public static void main(String[] args) {
        Book1 bk1 = new Book1(1111, "坊っちゃん");
        Book1 bk2 = new Book1(2222, "吾輩は猫である");
        Book1 bk3 = new Book1(3333, "銀翼のイカロス");
        Book1 bk4 = new Book1(4444, "坊っちゃん");
        Book1 bk5 = new Book1(5555, "坊っちゃん");
        Book1 bk6 = new Book1(6666, "ノーサイド・ゲーム");
        Book1 bk7 = new Book1(7777, "Java プログラミングI");
        Student5 st = new Student5("電子太郎");
        st.addBook(bk1);
        st.addBook(bk2);
        st.addBook(bk3);
        st.addBook(bk4);
        st.delBook(bk2); // 返却
        Teacher tc = new Teacher("情報次郎");
        tc.addBook(bk1);
        tc.addBook(bk4);
        tc.addBook(bk5);
        tc.addBook(bk6);
        tc.addBook(bk7);
        st.showRentalList();
        tc.showRentalList();
        System.out.println(st.getName() + "に" + st.count + "冊貸出中");
        System.out.println(tc.getName() + "に" + tc.count + "冊貸出中");
        System.out.println("合計" + User.total + "冊貸出中");
    }

}

class Book1 {
    private int code;
    private String title;
    private boolean borrowed;
// 以下にコードを追加

    public Book1(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return code + "-" + title;
    }
}

class User {
    private String name;
    Book1[] rentalList; // 貸出リスト
    int count = 0;
    static int total = 0;

    User(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    // 貸出リストに本を追加する
    void addBook(Book1 bk) {
        boolean flag = !bk.isBorrowed() && count < rentalList.length;
        for (Book1 book1 : rentalList) {
            if (book1 != null && book1.getTitle().equals(bk.getTitle())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            bk.setBorrowed(true);
            this.rentalList[count++] = bk;
            total++;
            System.out.println(name + "に「" + bk.getCode() + ":" + bk.getTitle() + "」を貸出しました。");
        } else {
            System.out.println(name + "に「" + bk.getCode() + ":" + bk.getTitle() + "」を貸出できません。");
        }
// メソッドの内容を追加
    }

    // 貸出リストから本を削除する
    void delBook(Book1 bk) {
        bk.setBorrowed(false);
// メソッドの内容を追加
        for (int i = 0; i < rentalList.length; i++) {
            if (rentalList[i] != null && rentalList[i].getCode() == bk.getCode()) {
                rentalList[i] = null;
                count--;
                total--;
                System.out.println(name + "は「" + bk.getCode() + ":" + bk.getTitle() + "」を返却しました。");
                for (int j = i; j < rentalList.length - 1; j++) {
                    rentalList[j] = rentalList[j + 1];
                }
                break;
            }
        }
    }

    // 貸出リストを表示する
    void showRentalList() {
        System.out.println(name + "の貸出リスト : " + getRentalList());
    }

    // 貸出リストを取得する
    String getRentalList() {
// メソッドの内容を追加
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (rentalList[i] == null) {
                continue;
            }
            result.append(rentalList[i]);
            if (i < count - 1) {
                result.append(",");
            }
        }
        return result.toString();
    }
}

class Student5 extends User {
    Student5(String name) {
// コンストラクタの内容を追加
        super(name);
        rentalList = new Book1[3];
    }
}

class Teacher extends User {
    Teacher(String name) {
// コンストラクタの内容を追加
        super(name);
        rentalList = new Book1[5];
    }
}