package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest6 {
	public static void main(String[] args) {
		//練習問題１
		Random random = new Random();
		int fortune = random.nextInt(5);
		
		System.out.println("fortune=" + fortune);
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}
		
		//練習問題２
		for(int i = 1; i <= 100; i++) {
			if(i == 7) {
				System.out.print(i);
			}
			else if(i % 7 == 0 && i != 7) {
				System.out.print("," + i);
			}
		}
		System.out.println();
		
		//練習問題３
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j != 1) {
					System.out.print(" ");
					if(i*j < 10) {
						System.out.print(" ");
					}
				}
				System.out.print(i*j);
			}
			System.out.println();
		}
	}
}
