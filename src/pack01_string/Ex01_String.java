package pack01_string;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		//String : 기본형 변수x ,참조형 변수
		//참조형 변수는 스택이라는 메모리 공간에 힙 영역의 주소만 저장하고 실제 값은
		//힙 영역에 있는 형태. ( 기본형 변수는 힙 영역 사용 x )
		String strVar1 ="KSB"; //메모리주소 1
		String strVar2 ="KSB"; //메모리주소 1
		// 두개를 비교했을 때 결과가 true 가 나올까 false가 나올까?
		//1. 답 :true
		if(strVar1 == strVar2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// new <= 힙 영역에 공간을 만들다. ( 무시 : 인스턴스 과정 )
		String strVar3 = new String("KSB");
		String strVar4 = new String("KSB");
		
		Scanner sc =new Scanner(System.in);
		String strVar5 = sc.nextLine(); //이니셜을 대문자로 입력하기.
		if(strVar1 == strVar5) {
			System.out.println("strVar1 == strVar5");
		}else if(strVar3 == strVar5){
			System.out.println("strVar3 == strVar5");
		}else {
			System.out.println("strVar1 , strVar3 , strVar5");
		}
		
		if(strVar3 == strVar4) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
