package pack02_array;

public class Ex02_Array {
	public static void main(String[] args) {
		// 1. 10의 크기를 가진 int형 배열을 만들고 값을 10~100까지 할당하고 출력해보기
		
		int[] numArray = new int[10];
//		numArray[0] = 10; 
//		numArray[1] = 20; 
//		numArray[2] = 30; 
//		numArray[3] = 40; 
//		numArray[4] = 50; 
//		numArray[5] = 60; 
//		numArray[6] = 70; 
//		numArray[7] = 80; 
//		numArray[8] = 90; 
//		numArray[9] = 100; 
		int sum = 0;
		double avg = 0;
		for(int i =0; i<10 ; i++) {
			numArray[i]=(i+1)*10;
			sum +=numArray[i];
			avg = sum/10;
			System.out.println( numArray[i]);
		}
		//현재 배열에는 10~100까지의 수가 담아져있음.
		// =>배열의 누적합을 구해보기
		System.out.println("누적합 = " + sum);
		System.out.println("평균 =" + avg);
	}
}
