/**
 * プログラム名 :Ex095
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex095 {
    public static void main(String[] args) {

    }
}

class Animal1 {
    private int legs; // 脚の本数
    private String food; // 好きな食物

    public Animal1(int legs, String food) {
        this.legs = legs;
        this.food = food;
    }

    public int getLegs() {
        return legs;
    }

    public String getFood() {
        return food;
    }

    public String getKind() {
        return "動物";
    }

    public void eat() {
        System.out.println(getKind() + "は、好物の" + this.getFood() + "を食べます");
    }

    public void walk() {
        System.out.println(getKind() + "は、" + this.getLegs() + "本脚で散歩します");
    }

    public String toString() {
        return getKind() + "は、" + this.getLegs() + "本脚です";
    }
}

class Cat3 extends Animal1 {
    public Cat3() {
        super(4, "ネズミ");
    }

    public String getKind() {
        return "ネコ";
    }
}

class Bird extends Animal1 {
    public Bird() {
        super(2, "コクモツ");
    }

    public String getKind() {
        return "トリ";
    }
}

class Breeder2 {
    private static final int MAX_ANIMALS = 3;
    private String name;
    private Animal[] animals;
    private int animalNum;

    public Breeder2(String name) {
        this.name = name;
        animals = new Animal[MAX_ANIMALS];
        animalNum = 0;
    }
}