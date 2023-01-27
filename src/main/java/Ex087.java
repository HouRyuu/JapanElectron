/**
 * プログラム名 :Ex087
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex087 {

    public static void main(String[] args) {
        Police[] polices = {
                new PoliceMan("杉下右京"),
                new PoliceDog("ハリー")
        };
        System.out.println("捜査開始命令！");
        for (Police police : polices) {
            police.investigate();
        }
    }

}

abstract class Police {
    private String name;

    public Police(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void investigate();
}

class PoliceDog extends Police{
    public PoliceDog(String name) {
        super(name);
    }

    @Override
    void investigate() {
        System.out.println(this.getName()+"はにおいをたどる");
    }
}

class PoliceMan extends Police{
    public PoliceMan(String name) {
        super(name);
    }

    @Override
    void investigate() {
        System.out.println(this.getName()+"は聞き込みをする");
    }
}

