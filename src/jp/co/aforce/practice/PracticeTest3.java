package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest3 {
	public static void main(String[] args) {
		//練習問題１
		String[] item = {"シャープペンシル", "ボールペン", "リングノート", "クリップ", "消しゴム"};
		
		//練習問題２
		System.out.println(item[1]);
		
		//練習問題３
		ArrayList<String> employee = new ArrayList<>();
		employee.add("山田太郎");
		employee.add("鈴木花子");
		employee.add("佐藤二郎");
		employee.add("山田太郎");
		employee.add("高橋三郎");
		
		//練習問題５
		System.out.println(employee.get(2));
	}
}
