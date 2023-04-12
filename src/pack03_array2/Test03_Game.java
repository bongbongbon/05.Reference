package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class Test03_Game {
	public static void main(String[] args) {
		System.out.println("숫자 맞추기 게임이 시작되었습니다.");
		System.out.println("난이도를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int str = Integer.parseInt(sc.nextLine());
		int ran =new Random().nextInt(str);
		System.out.println("난이도 : " + str);
		System.out.println(ran);
		int sum = 0;
		for(;;) {
		int[] array = new int[str+1];
		System.out.println("숫자를 입력하세요. ");
		int num = Integer.parseInt(sc.nextLine());
		sum++;
		array[str] = num;
		if(ran == array[str]) {
			System.out.println("정답");
			System.out.println("시도한 횟수 : " + sum);
			break;
		}else if (ran > array[str]){
			System.out.println("오답. 더 큼");
		}else {
			System.out.println("오답. 더 작음");
		}
		}
		
	}
}
