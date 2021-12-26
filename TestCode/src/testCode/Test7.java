package testCode;

import java.util.Scanner;

public class Test7{
	public static void main(String[] args) {
		startGame();
	}
	
	//게임 스타트 부분
	public static void startGame() {
		int[][] initField = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,0}};
		int[][] field = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,0}};
		System.out.println("\r\n"); //줄바꿈
		int[][] startGame = changeField(field, 300);
		showGame(startGame);
		
		while(true) {
			if(check(startGame, initField)) {
				goodGame();
				break;
			}
			else {
				Scanner sc = new Scanner(System.in);
				KeyInput(startGame, sc.next().charAt(0));
				showGame(startGame);
			}
		}
	}
	
	//승리 조건 체크
	public static boolean check(int[][] a, int[][] b) {
		boolean flag = true;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] != b[i][j]) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	//키 입력
	public static void KeyInput(int[][] p, char s) {
		if(s == (char)38) {
			moveUp(p);
		}
		else if(s == (char)40) {
			moveDown(p);
		}
		else if(s == (char)37) {
			moveLeft(p);
		}
		else if(s == (char)39) {
			moveRight(p);
		}
		else {
			System.out.println("방향키를 입력하세요");
		}
	}
	public static void goodGame() {
		System.out.println("승리하셨습니다. 게임을 종료합니다.");
	}
	
	//게임스타트
	public static void showGame(int[][] p) {
		for(int i = 0; i < p.length; i++) {
			System.out.println("\r\n\r\n\r\n");
			for(int j = 0; j < p[i].length; j++) {
				if(p[i][j] == 0) {
					System.out.print("\t   ");
				}
				else {
					System.out.print("\t" + p[i][j]);
				}
			}
		}
		System.out.println("\r\n");
		System.out.println("\r\n");
	}
	
	//위랑 위치 변경
	public static void moveUp(int[][] p) {
		int row = getSwap_y(p, 0); //y축
		int col = getSwap_x(p, 0); //x축
		
		if(row == p.length - 1) {
			
		}
		else {//위쪽과 위치 변경
			p[row][col] = p[row + 1][col];
			p[row + 1][col] = 0;
		}
	}
	
	//아래랑 위치 변경
	public static void moveDown(int[][] p) {
		int row = getSwap_y(p, 0); //y축
		int col = getSwap_x(p, 0); //x축
		
		if(row == 0) {
			
		}
		else {//위쪽과 위치 변경
			p[row][col] = p[row - 1][col];
			p[row - 1][col] = 0;
		}
	}
	
	//왼쪽으로 이동
	public static void moveLeft(int[][] p) {
		int row = getSwap_y(p, 0); //x축
		int col = getSwap_x(p, 0); //y축
		
		if(col == p[0].length - 1) {
			
		}
		else {//위쪽과 위치 변경
			p[row][col] = p[row][col + 1];
			p[row][col + 1] = 0;
		}
	}
	//오른쪽 이동
	public static void moveRight(int[][] p) {
		int row = getSwap_y(p, 0); //x축
		int col = getSwap_x(p, 0); //y축
		
		if(col == 0) {
			
		}
		else {//위쪽과 위치 변경
			p[row][col] = p[row][col - 1];
			p[row][col - 1] = 0;
		}
	}
	//위치 변경
	public static int[] getSwap_xy(int[][] p, int swap) {
		int[] pos = new int[2];
		for(int i = 0; i < p.length; i++) {
			for(int j = 0; j < p[i].length; j++) {
				if(p[i][j] == swap) {
					pos[0] = i;
					pos[1] = j;
				}
			}
		}
		return pos;
	}
	public static int getSwap_x(int[][] p, int swap) {
		return getSwap_xy(p, swap)[1];
	}
	public static int getSwap_y(int[][] p, int swap) {
		return getSwap_xy(p, swap)[0];
	}
	
	//위치 변경
	public static int[][] changeField(int[][] p, int n){
		for (int i=0; i<n; i++) {
			int pp = ((int) (10*(Math.random()))) % 4;
			if (pp == 0) {
				moveUp(p);		
			} 
			else if (pp == 1) {
				moveDown(p);
			} 
			else if (pp == 2) {
				moveLeft(p);
			} 
			else if (pp == 3) {
				moveRight(p);
			}			
		}
		return p;
	}
}
