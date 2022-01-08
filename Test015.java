/*==============================================
■■■자바의 개요 및 특징 ■■■

//퀴즈
// 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
//이 삼각형의 넓이를 구하는 프로그램을 구현하라.


// 실행 예)
// ■삼각형의 넓이 구하기■
// - 삼각형의 밑변 입력 : 3
// - 삼각형의 높이 입력 : 5

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : xxx
// 계속하려면 아무 키나......


//문제 인식 및 분석
//삼각형의 넓이 = 밑변 * 높이 / 2
//사용자로부터 데이터를 입력받아 처리 - BufferedReader 활용
=============================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// import java.io.*; 모든 설계도 다 가져와 해서. 근데 권장 ㄴㄴ

public class Test015
{
	public static void main(String[] args) throws IOException //★br.readLine() 때문에
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

	int length, height; //밑변, 높이
	double area; //넓이 넓이는 실수있음
	
	System.out.println("■삼각형의 넓이 구하기■");
	System.out.print(" - 삼각형의 밑변 입력 : ");
	
		
	length = Integer.parseInt(br.readLine());
	
	System.out.print(" - 삼각형의 높이 입력 : ");
	height = Integer.parseInt(br.readLine());
	

	//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	//area = length * height / 2 //이건 정수가 나옴. 실수 기반으로 연산해야함.

	//area = double(length * height /2); // 이건 걍 8.000000이런식
	//8.0000
	//7.5
	
	area = (double)length * height /2; //하나만 실수로 바꿔.
	//area = (double)length * height /2.0; //이게 깐지


	// 그니가 ~ 정수랑 실수랑 나눗셈 연산하면 실수로 계산한다고 
	// + , - , * , % 은 어떻게 될까? → MyStudy1.java
	
	//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	//System.out.print(); // 컴파일에러 발생
	System.out.printf("\n >> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n",length,height,area);

	}
}

/*
실행 결과
■삼각형의 넓이 구하기■
 - 삼각형의 밑변 입력 : 3
 - 삼각형의 높이 입력 : 5

 >> 밑변이 3, 높이가 5인 삼각형의 넓이 : 7.50
계속하려면 아무 키나 누르십시오 . . .
*/