import java.util.Scanner;

/**
 * プログラム名 :Sp005
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Sp012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] lengthWidth = new int[2];
        double high;
        System.out.print("numAを入力してください>");
        lengthWidth[0] = scan.nextInt();
        System.out.print("numBを入力してください>");
        lengthWidth[1] = scan.nextInt();
        System.out.print("numCを入力してください>");
        high = scan.nextDouble();
        System.out.println("直方体の体積は" + calcVolume(lengthWidth, high) + "です");
    }

    private static int calcVolume(int[] lengthWidth, double high) {
        return (int) (lengthWidth[0] * lengthWidth[1] * high);
    }


}