/**
 * プログラム名 :Sp021
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Sp021 {
    public static void main(String[] args) {
        printWeightAverage("クラスA", 35.6, 54.7);
        printWeightAverage("クラスB", 44.2, 35.6, 60.8, 54.7);
        printWeightAverage("クラスC", 44.2, 35.6, 60.8, 54.7, 99.9, 32.4);
    }

    private static void printWeightAverage(String clazz, double... weights) {
        if (weights == null) {
            weights = new double[]{};
        }
        int count = weights.length;
        double sum = 0.0;
        for (double weight : weights) {
            sum += weight;
        }
        System.out.println(clazz + "（人数：" + count + "）平均体重：" + (sum / count));
    }


}