package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		//練習問題１
		final double TAX = 1.1;
		System.out.println(TAX);
		
		//練習問題２
		int x = 480;
		double price = x * TAX;
		System.out.println(price);
		
		//練習問題３
		String name = "Akane";
		System.out.println(name);
		
		//練習問題４
		String sentence1 = "この商品の値段は";
		String sentence2 = "円です";
		System.out.println(sentence1 + (int)price + sentence2);
	}
}
