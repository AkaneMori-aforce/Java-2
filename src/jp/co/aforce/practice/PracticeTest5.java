package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest5 {
	public static void main(String[] args) {
		//練習問題２
		ArrayList<String> animals = new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
		
		//練習問題３
		String favAnimal = "フクロウ";
		if(animals.contains(favAnimal)) {
			System.out.println(favAnimal + "はリストに含まれています");
		} else {
			System.out.println(favAnimal + "はリストに含まれていません");
		}
		
		//練習問題４
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		
		switch(month) {
		case 1:
			System.out.println("冬物セール");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("春物を売る");
			break;
		case 5:
			System.out.println("春物セール");
			break;
		case 6:
		case 7:
			System.out.println("夏物を売る");
			break;
		case 8:
			System.out.println("夏物セール");
			break;
		case 9:
			System.out.println("秋物を売る");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("冬物を売る");
			break;
		default:
			System.out.println("不正な月です");
		}
	}
}
