package SaoriQuest;

import java.util.Scanner;

public class Util {

	// 入力するためのスキャナクラス
	public static Scanner scan = new Scanner(System.in);


	public static void showMessage(String message, boolean wait){
		System.out.println(message);
		if(wait){


			scan.nextLine();
		}
	}

	public static String nextLine(){
		return scan.nextLine();
	}


	public static int nextInt(){
		return scan.nextInt();
	}
}