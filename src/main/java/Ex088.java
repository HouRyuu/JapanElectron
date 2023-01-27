/**
 * プログラム名 :Ex088
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex088 {

    public static void main(String[] args) {
        AbShain shain1 = new Sales();
        shain1.name = "田中";
        shain1.work();
        AbShain shain2 = new Engineer();
        shain2.name = "吉田";
        shain2.work();
    }

}

abstract class AbShain {
    public String name;

    abstract void work();
}

class Sales extends AbShain {
    @Override
    void work() {
        System.out.println(this.name + " 仕事とってきます！");
    }
}

class Engineer extends AbShain {
    @Override
    void work() {
        System.out.println(this.name + " プログラム作ります！");
    }
}



