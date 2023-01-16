/**
 * プログラム名 :Ex094
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex094 {
    public static void main(String[] args) {
        Jockey1[] jockeys = new Jockey1[]{
                new Jockey1("武 豊", 49, new RaceHorse("キタサンブラック", "20勝12敗", 1876843000)),
                new Jockey1("三浦 皇成", 29, new RaceHorse("プレミアムボックス", "34勝8敗", 243956000)),
        };
        for (Jockey1 jockey : jockeys) {
            jockey.profileDisplay();
            System.out.println();
        }
    }
}

class Jockey1 {
    private String name;
    private int age;
    private RaceHorse mainHorse;

    public Jockey1(String name, int age, RaceHorse mainHorse) {
        this.name = name;
        this.age = age;
        this.mainHorse = mainHorse;
    }

    public RaceHorse getMainHorse() {
        return mainHorse;
    }

    public void profileDisplay() {
        System.out.println("氏名:" + this.name);
        System.out.println("年齢:" + this.age);
        mainHorse.raceHorseDisplay();
    }

}

class RaceHorse {
    private String name;
    private String results;
    private int prize;

    public RaceHorse(String name, String results, int prize) {
        this.name = name;
        this.results = results;
        this.prize = prize;
    }

    public void raceHorseDisplay() {
        System.out.println("主な騎乗馬:" + this.name);
        System.out.println("生涯成績:" + this.results);
        System.out.println("獲得賞金:" + this.prize);
    }
}
