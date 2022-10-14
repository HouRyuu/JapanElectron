package com.electron.assignment;

/**
 * プログラム名 :Ex004
 * 引数 1 :なし
 * 概要 :割合
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex004 {
    public static void main(String[] args) {
        // 宣言
        int student     = 48;
        int goodStudent = 3;
        //　割合を計算
        double rate     = (double) goodStudent / student * 100;
        // 結果をプリント
        System.out.println("クラス人数" + student + "人の中で出席率が100%の学生"
                + goodStudent + "人は全体の" + rate + "%です！");
    }
}