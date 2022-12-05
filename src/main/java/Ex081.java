/**
 * プログラム名 :Ex081
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex081 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat(),
                new Dog()
        };
        for (Animal animal : animals) {
            animal.hello();
        }
    }
}

class Animal {
    void hello() {

    }
}

class Cat extends Animal {
    @Override
    public void hello() {
        System.out.println("ニャー");
    }
}

class Dog extends Animal {
    @Override
    public void hello() {
        System.out.println("ワン");
    }
}