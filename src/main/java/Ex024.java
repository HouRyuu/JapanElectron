import java.util.Arrays;

/**
 * プログラム名 :Ex024
 * 引数 1 :なし
 * 概要 :平均値を求める
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex024 {
    public static void main(String[] args) {
        int[] data  = {1, 2, 3, 4, 5};
        double sum = 0.0, ave;
        for (int num :data){
            sum += num;
        }
        ave = sum / data.length;
        System.out.println(Arrays.toString(data)+ "の平均値は" + ave);
    }
}