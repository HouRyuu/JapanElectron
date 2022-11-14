
/**
 * プログラム名 :Ex039
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex040 {

    public static void main(String[] args) {
        OtherSquare sq = new OtherSquare();
        sq.width = 7;
        sq.height = 3;
        System.out.println("横幅は" + sq.getWidth() + "，高さは" + sq.getHeight() + "，面積は" + sq.getArea() + "です。");
    }
}

class OtherSquare {
    int width;
    int height;

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    int getArea() {
        return width * height;
    }
}
