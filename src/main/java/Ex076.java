/**
 * プログラム名 :Ex076
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex076 {

    public static void main(String[] args) {
        C cc = new C(); //クラス C のインスタンス生成
    }
}

class A {
    A() {
        System.out.println("コンストラクタ1");
    }
}

class B extends A {
    B() {
        System.out.println("コンストラクタ2");
    }
}

class C extends B {
    C() {
        System.out.println("コンストラクタ3");
    }
}