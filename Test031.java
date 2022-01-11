/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

//if ~else 

//사용자로부터 임의의 문자를 하나 입력받아
//대문자이면 소문자로 소문자이면 대문자로
//알파벳이 아닌 기타문자이면 입력오류 처리하는 프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// >> A → a
//계속하려면 아무 키나 누르세요....


// 한 문자 입력 : b
// >> b → B
//계속하려면 아무 키나 누르세요....

// 한 문자 입력 : 7
// >> 입력 오류 ~!!!
//계속하려면 아무 키나 누르세요....
=============================================*/
import java.io.IOException;


public class Test031
{
	public static void main(String[] args) throws IOException
	{

	System.out.print("한 문자 입력 : ");	//사용자 입력받기

	int nWord;	//사용자 입력변수
	boolean bigW, smallW;	//대소문자라면? 변수
	char result; //아스키코드에 대응 되는 문자 변수
	char newWord; //처음 사용자 값 저장 변수
	
	
	nWord = System.in.read();  //아스키코드로 읽음 
	newWord = (char)nWord; //얜 아스키코드 대응 문자

	//System.out.println(nWord);

	//아스키코드 대문자 A : 65		B:66	65~90
	//			 소문자 a : 97		b:98	97~122
	//
	// 대문자 → 소문자 : 대문자 + 32
	// 소문자 → 대문자 : 소문자 - 32
 	//result = (char)(nWord >= 65 && nWord <= 90)? nWord:((nWord >= 97 && nWord <= 122)? nWord : (char)nWord));	//대문자
	//→boolean 을 char로 형변환 할라해서 컴파일에러 뜸 불리안은 형변환 ㄴㄴ 
	


	bigW = nWord >= 65 && nWord <= 90;  //대문자
	smallW = nWord >= 97 && nWord <= 122; //소문자

	//result = (char)((bigW)? nWord:((smallW)? nWord : (char)nWord));

//	result = bigW ? (char)(nWord+= 32) : (smallW ? (char)(nWord -= 32) : (char)(nWord));
	result = (char)(bigW ? (nWord+= 32) : (smallW ? (nWord -= 32) : (nWord)));
    //             ______  ___________  
	//            대문자t   소문자코드
	//                                   ____________________________________
	//                                        아니면 여기

	//                                  ________    ____________
	//                                  소문자       대문자코드
	//                                                             ________
	//                                                             문자값코드
	//      _____
	//     전체가 int니까 char로 바꿔서 문자값으로 명시적형변환
//________
//얘는 char

	//nWord = (char)nWord;




	//result = '1';
	//smallW = (int)(nWord >= 97 && nWord <= 122);	//소문자
	//ch = (char)nWord; //알파벳아닐때

	//result = nWord != (char)(bigW || smallW) ?  ch : (char)(nWord == bigW ? bigW : smallW);

	System.out.printf("%c → %c\n",newWord,result);  

	/*
	한 문자 입력 : a
97 → a
계속하려면 아무 키나 누르십시오 . . .
	*/

	/*
	한 문자 입력 : 1
49 → 1
계속하려면 아무 키나 누르십시오 . . .
	*/






	



	









/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String strUser; //사용자 응답 담는 변수	
    String result; // 문자열 + 10
	String realResult;
	System.out.print(" 한 문자 입력 : ");

	strUser = br.readLine();
	
	
	result = strUser + 10;//_____10


	//문자열 중에 알파벳을 어떻게 거르지?
	//String → char, int로 변환 불가.
	//어떻게 시발 알파벳을 뺀 ?


	

	realResult = result != "10" ? "알파벳나와라 ! " : result;
	System.out.println(realResult);
*/
	
	
	//System.out.print(" 한 문자 입력 : ");
	//System.in.read();

	
    

	//String != char

	//System.out.println(strUser+10); //문자일때 출력
	

	//nUser = strUser;
	//문자열 → int타입으로 변환후 범위내에 속하면 증감연산 수행.
	// 이후, int타입을 다시 문자로 변환후 반환.

	




/*	int word; //사용자가 입력한 문자 담는 변수
	int bigWord, smallWord; //대문자,소문자 담는 변수

	String strResult; //결과 담는 변수

	System.out.print("한 문자 입력 : ");

	//word = br.readLine();

	//ch == 대문자 ? 대문자 : 소문자
	//------------------------------

	//((ch = Integer.paselInt(br.readLine()))) >= 98 &&  ((ch = Integer.paselInt(br.readLine())) <=122) // 대문자
	//((ch = Integer.paselInt(br.readLine()))) >= 65 &&  ((ch = Integer.paselInt(br.readLine())) <=90)  // 소문자

	bigWord = ((word = Integer.paselInt(br.readLine()))) >= 98 &&  ((word = Integer.paselInt(br.readLine())) <=122);
	smallWord = ((word = Integer.paselInt(br.readLine()))) >= 65 &&  ((word = Integer.paselInt(br.readLine())) <=90);

	bigWord +=32;
	smallWord -=32;

*/

/*   String s; 
   char a = 'A';
   int b;

   b = a; //A → 65


   System.out.print("한 문자 입력 : ");

   s = br.readLine();
   System.out.println(s);
   System.out.println(a);
   System.out.println(b);

	//System.out.printf("%s → %s\n",word,strResult);

*/	

	





	}
}
/*
한 문자 입력 : a
a → A
계속하려면 아무 키나 누르십시오 . . .


한 문자 입력 : A
A → a
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : 7
7 → 7
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : ?
? → ?
계속하려면 아무 키나 누르십시오 . . .


건태 덕분에 풀었다 복습도 했다. .. 시발.. 존나어렵다

*/