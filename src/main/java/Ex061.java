/**
 * プログラム名 :Ex061
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex061 {
    public static void main(String[] args) {
        //CookインスタンスをコンストラクタでCookの名前、量の倍率を指定し生成
        Cook cook1 = new Cook("Aさん", 1.0);
        Cook cook2 = new Cook("大盛Bさん", 1.5);
        Cook cook3 = new Cook("特盛Cさん", 2.0);
        //CookクラスのgetCurryメソッドでカレーインスタンス生成
        //カレーはデフォルトの200gに量の倍率を掛けた量になる
        Curry c1 = cook1.getCurry();
        Curry c2 = cook2.getCurry();
        Curry c3 = cook3.getCurry();
        c1.showCurry();
        c2.showCurry();
        c3.showCurry();
        //これまでに作ったカレーの量
        Curry.showTotalGram();
    }
}

class Cook {
    private String name;
    private double curryMultiply;

    public Cook() {
    }

    public Cook(String name, double curryMultiply) {
        this.name = name;
        this.curryMultiply = curryMultiply;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurryMultiply() {
        return curryMultiply;
    }

    public void setCurryMultiply(double curryMultiply) {
        this.curryMultiply = curryMultiply;
    }

    public Curry getCurry() {
        return new Curry(this, this.curryMultiply);
    }
}

class Curry {

    private static double totalWeight = 0.0;

    private Cook cook;
    private double curryWeight;

    public Curry() {
        this.curryWeight = 200.0;
    }

    public Curry(Cook cook, double curryMultiply) {
        this.cook = cook;
        this.curryWeight = 200.0 * curryMultiply;
        totalWeight += this.curryWeight;
    }

    public double getCurryWeight() {
        return curryWeight;
    }

    public void setCurryWeight(double curryWeight) {
        this.curryWeight = curryWeight;
    }

    public void showCurry() {
        System.out.println(cook.getName() + "が作った" + this.curryWeight + "gのカレーです。");
    }

    static void showTotalGram() {
        System.out.println("これまでにカレーを" + totalWeight + "作りました。");
    }
}
