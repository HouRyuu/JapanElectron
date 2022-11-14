
/**
 * プログラム名 :Ex044
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex044 {

    public static void main(String[] args) {
        Rocket rocket = new Rocket();
        System.out.println("総重量は" + rocket.calcTotal() + "kgです。");
        rocket = new Rocket(3, 7, 1);
        System.out.println("総重量は" + rocket.calcTotal() + "kgです。");
        rocket = new Rocket(3, 7, 1, 9, 2, 4);
        System.out.println("総重量は" + rocket.calcTotal() + "kgです。");
    }
}

class Rocket {
    int parts1;
    int parts2;
    int parts3;
    int parts4;
    int parts5;
    int parts6;

    Rocket() {
        this.parts1 = 0;
        this.parts2 = 0;
        this.parts3 = 0;
        this.parts4 = 0;
        this.parts5 = 0;
        this.parts6 = 0;
    }

    Rocket(int parts1, int parts2, int parts3) {
        this.parts1 = parts1;
        this.parts2 = parts2;
        this.parts3 = parts3;
        this.parts4 = 0;
        this.parts5 = 0;
        this.parts6 = 0;
    }

    Rocket(int parts1, int parts2, int parts3, int parts4, int parts5, int parts6) {
        this.parts1 = parts1;
        this.parts2 = parts2;
        this.parts3 = parts3;
        this.parts4 = parts4;
        this.parts5 = parts5;
        this.parts6 = parts6;
    }

    int calcTotal() {
        return parts1 + parts2 + parts3 + parts4 + parts5 + parts6;
    }
}
