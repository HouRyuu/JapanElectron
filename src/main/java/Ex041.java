
/**
 * プログラム名 :Ex041
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex041 {

    public static void main(String[] args) {
        PlasticBottle pb = new PlasticBottle();
        pb.show();
        new PlasticBottle(100).show();
        new PlasticBottle(350, 200).show();

    }
}

class PlasticBottle {
    int size;
    int nokori;

    PlasticBottle() {
        size = 500;
        nokori = 500;
    }

    PlasticBottle(int ml) {
        size = ml;
        nokori = 0;
    }

    PlasticBottle(int ml, int remain) {
        size = ml;
        nokori = remain;
    }

    void show() {
        System.out.println("サイズは" + size + "ml、残りは" + nokori + "mlです");
    }
}
