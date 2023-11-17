package com.example.ifproblem;

// Scannerクラスのインポート
import java.util.Scanner;

public class Ifproblem8 {
	public static void main(String[] args) {
		// Scannerのインスタンス化
		// ここでScannerオブジェクトを作成し、標準入力をソースとしている。
		Scanner scanner = new Scanner(System.in);
		System.out.print("パスワードを入力してください:");
		//パスワードの読み取り　入力したパスワードを読み取り、それをpasswordという文字列変数に格納
		String password = scanner.nextLine();
		
		// isValidPasswordメソッドを呼び出し、パスワードが基準を満たしているかをチェック
		if (isValidPassword(password)) {
			System.out.println("パスワードは有効です");
		} else {
			System.out.println("無効なパスワードです");
		}
	}
	
	// パスワードの文字列を受け取り、それが有効かどうかを判断する
	public static boolean isValidPassword(String password) {
		//　パスワードの長さチェック
		if (password.length() < 8) {
			return false;
		}
		
		//これらのブール変数は、パスワードが少なくとも1つの数字、大文字、小文字を含むかどうかを追跡する
		boolean hasDigit = false;
		boolean hasUpper = false;
		boolean hasLower = false;
		
		// パスワードないの各文字をループで確認し、それが数字、大文字、また小文字かどうかをチェックする
		// 該当する場合、対応するブール変数をtrueに設定する
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (Character.isDigit(ch)) {
				hasDigit = true;
			} else if (Character.isUpperCase(ch)) {
				hasUpper = true;
			} else if (Character.isLowerCase(ch)) {
				hasLower = true;
			}
		}
		// ループの後、全てがtrueであれば、パスワードが有効であるとしてtrueを返す。
		//　そうでなければfalseを返す。
		return hasDigit && hasUpper && hasLower;
	}
}
