package com.electron.assignment;

/**
 * プログラム名 :Ex003
 * 引数 1 :なし
 * 概要 :演算子
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex003 {
    public static void main(String[] args) {
        // 宣言
        int i1      = 23;
        int i2      = 4;
        //　演算
        int sum     = i1 + i2;
        int dist    = i1 - i2;
        int times   = i1 * i2;
        int div     = i1 / i2;
        int mod1    = i1 - i1 / i2 * i2;
        int mod2    = i1 % i2;
        // 結果をプリント
        System.out.println(i1 + " + " + i2 + " = " + sum);
        System.out.println(i1 + " - " + i2 + " = " + dist);
        System.out.println(i1 + " * " + i2 + " = " + times);
        System.out.println(i1 + " / " + i2 + " = " + div);
        System.out.println(i1 + " / " + i2 + " の余りは" + mod1 + "です(余りの演算子不使用)");
        System.out.println(i1 + " / " + i2 + " の余りは " + mod2 + " です(余りの演算子使用)");
    }
}