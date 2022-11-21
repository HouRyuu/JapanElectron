
/**
 * プログラム名 :Ex062
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex062 {

    public static void main(String[] args) {
        PlasticBottle1[] pbs = new PlasticBottle1[]{
                new PlasticBottle1(500, 400),
                new PlasticBottle1(1000, 800),
                new PlasticBottle1(350, 100),
                new PlasticBottle1(350, 350),
                new PlasticBottle1(1000, 0),
        };
        for (PlasticBottle1 pb : pbs) {
            pb.show();
        }
    }
}

class PlasticBottle1 {
    private int size;
    private int nokori;

    PlasticBottle1() {
        size = 500;
        nokori = 500;
    }

    PlasticBottle1(int ml) {
        size = ml;
        nokori = 0;
    }

    PlasticBottle1(int ml, int remain) {
        size = ml;
        nokori = remain;
    }

    void show() {
        System.out.println("サイズは" + size + "ml、残りは" + nokori + "mlです");
    }
}
