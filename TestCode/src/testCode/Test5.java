package testCode;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {

	public static int[] Arrangement() {
		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < num.length; i++) {
			System.out.print("����" + i + ": ");
			num[i] = sc.nextInt();
		}
		return num;
	}
	
	public static int[] result(int[] number) {
		for(int i = 0; i < number.length; i++) {
			for(int j = i + 1; j < number.length; j++) {
				if(number[i] > number[j]) {//i��°�� j��°���� ũ�� ��ġ ����?
					int array = number[i];
					number[i] = number[j];
					number[j] = array;
				}
			}
		}
		System.out.print("�Էµ� ����: ");
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
