/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// switch 문 실습

/*
○ 다중 선택문이라 하며. switch 문 다음의 수식 값에
   따라 실행 순서를 여러 방향으로 분기할 때 사용하는
   문장이다.

○ 형식 및 구조
   switch(수식)
   {
	   case 상수1 : 문장1; [break;]		break 멈추고 (빠져나간다.)
	   									continue (뒷부분 무시하고) 계속해라
	   case 상수2 : 문장2; [break;]
	       :              :
	   [default : 문장n+1; [break;]]		//[]는 생략가능!
	}										//if문에 else랑 비슷
											//반드시 디폴트 ㄴㄴ
											//처리영역에서는 가능
											// 출력에서 에러날수는 있음.

	switch 문의 『수식』과 case의 『상수』는
	byte, short, int, long 형이어야 한다.
	//정수형태의 프리미티브형식만

	case 문 뒤에 『break;』가 없는 형태인 경우
	다음 case 문의 문장을 계속해서(이어서) 수행하게 된다. → (기본모델)
	『break;』가 존재할 경우
	해당 지점에서 수행을 멈춘 후 switch 문을 빠져나간다. → (일반모델)

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
public class Test043
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name; //--이름
		int kor, eng, mat, sum; //--국어,영어,수학,총점
		//double avg; //--평균 byte, short, int, long 형이어야 한다.(switch)
		int avg;
		char level; //--등급


		System.out.print("이름 입력 : ");
		name = br.readLine();

		System.out.print("국어 점수 입력 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 입력 : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 입력 : ");
		mat = Integer.parseInt(br.readLine());

		sum = kor + eng + mat; //--총점
		//avg = sum / 3.0;
		avg = sum / 3; //--평균
		level = 'F';

		switch (avg/10)
		{
			case 10: case 9: level = 'A' ; break;
			case 8: level = 'B' ; break;
			case 7 : level = 'C' ; break;
			case 6: level = 'D' ; break;
			//default : level = 'F'; break;
		}



/*		switch (avg/10)
		{
			case 10: level = 'A' ; break;
			case 9 : level = 'A' ; break;
			case 8: level = 'B' ; break;
			case 7 : level = 'C' ; break;
			case 6: level = 'D' ; break;
			default : level = 'F'; break;
		}
*/
/*		switch (avg/10)
		100/10 = 10
		99 /10 = 9
		89 /10 = 8

		{
			case 10: level = 'A' ; break;
			case 9 : level = 'A' ; break;
			case 8: level = 'B' ; break;
			case 7 : level = 'C' ; break;
			case 6: level = 'D' ; break;
			case 5 : level = 'F' ; break;
			case 4: level = 'F' ; break;
			case 3 : level = 'F' ; break;
			case 2: level = 'F' ; break;
			case 1 : level = 'F' ; break;
			case 0: level = 'F' ; break;
		}
*/
		
		//case안에 정수형 프리미티브만 들어가는데 
		//뭐가 들어가야하지?
/*		switch (avg)
		{
		case 100:level = 'A'; 
		case 90:level = 'A'; 
		case 89:level = 'B'; 
		case 80:level = 'B'; 
		case 79:level = 'C';
		case 70:level = 'C'; 
		case 69:level = 'D'; 
		case 60:level = 'D'; 
		default : level = 'F';
		}
*/
		System.out.printf(">>이름은 %s, 총점은 %d, 평균은 %d, 등급은 %c입니다.",name,sum,avg,level);


	}

}