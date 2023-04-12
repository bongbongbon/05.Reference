package pack03_array2;

import java.util.Scanner;

public class Ex04_Mbti {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] mbtiResult = new int[4];
		String[][] mbtiWord = {
				{"I" , "E"},{"N" , "S"} , {"F", "T"} , {"J", "P"}
		};
		System.out.println("나는 동물이랑도 낯을 가린다. 1.o , 2.x");
		mbtiResult[0] = Integer.parseInt(sc.nextLine());
		System.out.println("나는 외계인이 있다고 믿는다. 1.o , 2.x");
		mbtiResult[1] = Integer.parseInt(sc.nextLine());
		System.out.println("나는 7번방의 선물을 보고 울었다. 1.o , 2.x");
		mbtiResult[2] = Integer.parseInt(sc.nextLine());
		System.out.println("나는 계획했던 약속같은게 없어지면 스트레스받는다. 1.o , 2.x");
		mbtiResult[3] = Integer.parseInt(sc.nextLine());
		
		String result = "";
		for (int i = 0; i < mbtiResult.length; i++) {
			result+=mbtiWord[i][mbtiResult[i]-1];			
		}

		System.out.println("나는 " + result + "입니다.");
	}
}
