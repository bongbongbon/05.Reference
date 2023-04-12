package pack02_array;

public class Test01_Arraysum {
	public static void main(String[] args) {
		//10개의 크기를 가진 String 형 배열 sArr이 있다.
		//sArr내부에는 문자열 1부터 각각의 인덱스에는 10까지가 할당이 되어있다.
		//sArr내부에 들어있는 문자열을 숫자로 바꿔서 누적합을 구하고
		//1.배열준비 10개의 공간에는 전부 초기값 null
		String[] sArr = {"1" , "2" , "3", "4","5", "6", "7", "8", "9", "10"};
		int sum = 0 ;
		for(int  i = 0; i<10; i++) {
			int num = Integer.parseInt(sArr[i]);
			sum += num;
		}
		System.out.println(sum);
		//2. 값할당
		for(int k = 0; k < 10 ; k++) {
			sArr[k] = k + 1 + " ";
		}
		int result = 0;
		for(int k = 0 ; k <10 ; k++) {
			result += Integer.parseInt(sArr[k]);
		}
		System.out.println(result);
	}
}
