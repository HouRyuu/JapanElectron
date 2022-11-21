import java.util.Scanner;

/**
 * プログラム名 :Ex064
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex064 {

    public static void main(String[] args) {
        final int NUM_COUNT = 2;
        int[] nums = new int[NUM_COUNT];
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= NUM_COUNT; i++) {
            System.out.print(i + "つめの数aを入力：");
            nums[i - 1] = scan.nextInt();
        }
        showResult(nums[0], nums[1]);
    }

    static void showResult(int a, int b) {
        System.out.println("max:" + Math.max(a, b));
        System.out.println("min:" + Math.min(a, b));
        System.out.println("a^b:" + (Math.pow(a, b)));
    }
}