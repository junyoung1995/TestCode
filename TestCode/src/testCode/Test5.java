package testCode;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {

	public static int[] Arrangement() {
		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < num.length; i++) {
			System.out.print("숫자" + i + ": ");
			num[i] = sc.nextInt();
		}
		return num;
	}
	
	public static int[] result(int[] number) {
		for(int i = 0; i < number.length; i++) {
			for(int j = i + 1; j < number.length; j++) {
				if(number[i] > number[j]) {//i번째가 j번째보다 크면 위치 변경?
					int array = number[i];
					number[i] = number[j];
					number[j] = array;
				}
			}
		}
		System.out.print("입력된 숫자: ");
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i] + ",");
		}
		return number;
	}
	public static void main(String[] args) {
		int inputNumber[] = Arrangement();
		System.out.println(result(inputNumber));
	}
}
