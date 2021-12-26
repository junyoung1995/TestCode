package testCode;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("�������� Puzzle World�� ���� ���� ȯ���մϴ�.");
		gameStart();
	}

	public static void gameStart() {
		int[][] initPuzzle = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0} };
		int[][] puzzle = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0} };
		//showPuzzle(puzzle);
		System.out.println("\r\n");
		int[][] startPuzzle = randomChangePosition(puzzle, 300);
		showPuzzle(startPuzzle);		
		
		while(true) {
			if (arrayCheck(startPuzzle, initPuzzle)) {				
				gameOver();
				break;
			} else {
				Scanner arrowInput = new Scanner(System.in);
				KeyInput(startPuzzle, arrowInput.nextInt());				
				showPuzzle(startPuzzle);
				//arrowInput.close();
			}
		}		
	}
	
	public static boolean arrayCheck(int[][] a, int[][] b) {
		boolean flag = true;
		for(int i=0; i<a.length; i++) {			
			for(int j=0; j<a[i].length; j++) {
				if (a[i][j] != b[i][j]) {					
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void KeyInput(int[][] p, int n) {		
		if (n == 8) {
			moveUp(p);
		} else if (n == 2) {
			moveDown(p);
		} else if (n == 4) {
			moveLeft(p);
		} else if (n == 6) {			
			moveRight(p);			
		} else {
			System.out.println("����Ű�� �����ּ���.");
		}
	}
	
	public static void gameOver() {
		System.out.println("�¸��Ͽ����ϴ�. �����ϼ̽��ϴ�.");		
	}
	
	public static void showPuzzle(int[][] p) {
		for(int i=0; i<p.length; i++) {
			System.out.println("\r\n\r\n\r\n");
			for(int j=0; j<p[i].length; j++) {
				if (p[i][j] == 0) {
					System.out.print("\t    ");
				} else {
					System.out.print("\t"+p[i][j]);	
				}
								
			}
		}
		System.out.println("\r\n");
		System.out.println("\r\n");
	}
	
	public static void moveUp(int[][] p) {
		
		int r = getPos_��(p, 0);
		int c = getPos_ȣ(p, 0);
		
		if (r == p.length-1) {
			//System.out.println("\r\n\r\n���� �̵� �Ұ�");			
		} else {
			p[r][c] = p[r+1][c];
			p[r+1][c] = 0;
			//showPuzzle(p);
		}		
	}
	
	public static void moveDown(int[][] p) {
		
		int r = getPos_��(p, 0);
		int c = getPos_ȣ(p, 0);
		
		if (r == 0) {
			//System.out.println("\r\n\r\n�Ʒ��� �̵� �Ұ�");			
		} else {
			p[r][c] = p[r-1][c];
			p[r-1][c] = 0;
			//showPuzzle(p);
		}		
	}
	
	public static void moveLeft(int[][] p) {
		
		int r = getPos_��(p, 0);
		int c = getPos_ȣ(p, 0);
		
		if (c == p[0].length-1) {
			//System.out.println("\r\n\r\n���� �̵� �Ұ�");			
		} else {
			p[r][c] = p[r][c+1];
			p[r][c+1] = 0;
			//showPuzzle(p);
		}		
	}
	
	public static void moveRight(int[][] p) {
		
		int r = getPos_��(p, 0);
		int c = getPos_ȣ(p, 0);
		
		if (c == 0) {
			//System.out.println("\r\n\r\n������ �̵� �Ұ�");			
		} else {
			p[r][c] = p[r][c-1];
			p[r][c-1] = 0;
			//showPuzzle(p);
		}		
	}
	
	public static int[] getPos_��ȣ(int[][] puz, int cont) {
		int[] position = new int[2];
		for(int i=0; i<puz.length; i++) {			
			for(int j=0; j<puz[i].length; j++) {
				if (puz[i][j] == cont) {
					position[0] = i;
					position[1] = j;
				}
								
			}
		}
		return position;
	}
	
	public static int getPos_��(int[][] puz, int cont) {		
		return getPos_��ȣ(puz, cont)[0];
	}
	
	public static int getPos_ȣ(int[][] puz, int cont) {
		return getPos_��ȣ(puz, cont)[1];
	}
	
	public static int[][] randomChangePosition(int[][] p, int n) {
		for (int i=0; i<n; i++) {
			int pp = ((int) (10*(Math.random()))) % 4;
			if (pp == 0) {
				moveUp(p);		
			} else if (pp == 1) {
				moveDown(p);
			} else if (pp == 2) {
				moveLeft(p);
			} else if (pp == 3) {
				moveRight(p);
			}			
		}
		return p;
	}
	
}

