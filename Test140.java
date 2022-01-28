/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/
//===================================================================================================
//StringBuffer 클래스

/*
○ StringBuffer 클래스는
   문자열을 처리하는 클래스로 String 클래스와의 차이점은
   String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
   StringBuffer 클래스는 문자열을 사용할 때
   내부 문자열을 실행 단계에서 변경할 수 있다.


   즉, StringBuffer 객체는 가변적인 길이를 가지므로
   객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
   실행 시점에 버퍼의 크기를 바꿀 수 있는 기능을 제공한다.

   또한 JDK 1.5 이후부터는
   문자열을 처리하는 StringBuilder 라는 클래스도 제공한다.
   → String과 StringBuffer보다 역사가 짧음.
   StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만
   가장 큰 차이점은 muti-thread unsafe 라는 점이다.
                    ------------------
					다중 처리가 안전하지 않다.
   즉, Syncronization 이 없기 때문에
   StringBuffer 보다 빠르며 동시성(동기화)문제가 없다면
   StringBuilder 를 사용하는 것이 성능을 향상시킬 수 있다.

   기능이 많다고 성능이 좋은게 아님.
   다중 처리 가능한건 StringBudffer 기능이 많음.
   StringBudiler 성능이 좋음
   하나에 기능에 만능이면 성능이 좋다는 거임.
*/
//===================================================================================================
public class Test140
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);		//String객체일 때는 ==연산자가 주소를 비교해서 false가 뜨고(크기비교아님) → new로 각각 다른 메모리
		System.out.println(sb1.equals(sb2)); //String객체일 대는 equals()로 문자열의값을 비교해서 true가 뜰텐데
											//Object equalse()는 ==처럼 주소를 비교해서
											//그래서 String은 저거 오버라이딩해서 문자열의 값을 비교했다.
											//여기는 둘다 false뜨네
											//왤까???????????????????
											//여기서는 오버라이딩안해서 false뜬거임. Object꺼 그대로 썼어!!!
		//--==>>false
		//		false




		System.out.println(sb1);
		//--==>>korea
		System.out.println(sb1.toString());
		//toString() Object가 가지고 있다. ●
		//Object : 클래스명@해쉬코드 ●
		//StiringBuffer : 문자열의 값을 반환 ● 그래서 String이 됨!

		System.out.println(sb1.toString());
		//				   ---------------
		//                      문자열.
		//          
		//오버라이딩해도 반환자료형을 재정의하는 경우는 거의없다.


		//toString()은 문자열 반환. ● 다시 확인
		

		System.out.println(sb1.toString().equals(sb2.toString()));
		//                 --------------
		//                   문자열객체String
		//                                       --------------
		//                                        문자열객체String
		//--==>>true


		//String.equals() → static메소드이구나.
		//equals() → Object에서 봤어.
		// 아하 ~ String의 equals()는 오버라이딩했구나..

		// ==랑 object의 equals()는 객체의 주소를 비교한다! ●●●

		System.out.println("=====================================");

		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer 기본 생성자 호출(인스턴스 생성 과정)
		//   기본적으로 생성되는 버퍼의 크기는 『16』

		System.out.println("버퍼 크기 : " + sb3.capacity());//♥함수♥
		//--==>>버퍼 크기 : 16

		System.out.println(sb3);
		//--==>>無 값없지 비어있음.

		String name = "홍길동";
		name += "이순신";
		name +="강감찬";
		System.out.println(name); //String으로 하면 ㅈㄴ 비효율적임 계~속 메모리 다시 할당하고 원래 메모리안에있던거 갑이지 줌. 가비지 먹이임.
		//--==>>홍길동이순신강감찬

		sb3.append("seoul"); //-- sb3 += "seoul"; ♥함수♥
		sb3.append("korea"); //-- sb3 += "korea";
		sb3.append("우리나라");//--sb3 += "우리나라";
		sb3.append("대한민국");//--sb3 += "대한민국";

		System.out.println(sb3);//-- 반환 : StringBuffer타입♥
		//--==>>seoulkorea우리나라대한민국
		System.out.println(sb3.toString()); //--반환 : String타입♥
		//--==>>seoulkorea우리나라대한민국

		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>>버퍼 크기 : 34
		//내용물이 추가 되었는데 버퍼크기가 커졌다!♥

		//////////////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());//♥함수♥ String
		//--==>>JAVA AND ORACLE

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());//♥함수♥ String
		//--==>>java and oracle


		//그렇다면 StringBuffer에서는??
		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		//--==없구나! 이 메소드들이 없구나!
		// String메소드는 StringBuffer든 StringBuild든 변환해서 쓰면 된다!♥

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase()); //→ sb3이 바뀜. 
		//--==>>SEOULKOREA우리나라대한민국

		//System.out.println(sb3.toString().toLowerCase());
		//--==>>seoulkorea우리나라대한민국


		//sb3는 변한게 아님. sb3는 그대로 StringBuffer타입인데 그걸 toString()하고 toLowerCase()해서 출력해라!!
		//sb3는 seoulkorea우리나라대한민국

		//○ 대상 문자열(sb3) 중 seoul 앞에
		//   "한국" 이라는 문자열 추가
		//   → "한국seoulkorea우리나라대한민국"

		//sb3.insert(0,"한국");♥함수♥♥함수♥♥함수♥♥함수♥♥함수♥StringBuffer함수임 ~  String에는 없다잉
		System.out.println("seoul앞에 『한국』 추가 : " + sb3.insert(0,"한국"));
		//--==>>seoul앞에 『한국』 추가 : 한국seoulkorea우리나라대한민국


		//대상 문자열(sb3) 중 korea 문자열 뒤에
		//"사랑"이라는 문자열 추가
		// 단, 대상 문자열의 인덱스를 눈으로 직접 확인하지 않고...

		String xxx=sb3.toString();
		System.out.println(xxx.indexOf("korea"));
		//--==>>7
		System.out.println("xxx의 마지막 인덱스는 몇번이냐 : " + xxx.lastIndexOf("a"));
		//--==>>xxx의 마지막 인덱스는 몇번이냐 : 11

		//sb3.insert(11,"사랑");
		System.out.println("sb3뒤에 사랑을 붙혀보자 : " + sb3.insert(12,"사랑"));
		//--==>>sb3뒤에 사랑을 붙혀보자 : 한국seoulkorea사랑우리나라대한민국
		// 문제 풀이 순서는 이렇게 했습니다.
		// 1. StringBuffer를 String으로 바꿔 변수에 저장한다.
		// 2. 그 변수에서 korea가 몇번부터 몇번 인덱스인지 확인한다. 왜냐하면 StringBuffer의 insert는 시작 인덱스번호를 구해야함.
		//    - 그래서 korea시작점은사실 알필요가 없었고
		//    - 뒤에가 한글이니까 뒤에서부터 인덱스 확인해서 a가 나오는 인덱스 번호확인하고 --> 이지랄을 왜했냐면 난 String에만 그 indexOf있는줄
		//      알고 ㅅㅂ 굳이굳이 toString해서 찾은건데 그럴필요 없음 ㅋ 
		//    거기 부터 사랑을 넣는다 . ㄱ ㄱ

		//-- 아 ㅅㅂ 내가 한거 때매 sb3에 insert로 사랑이 이미 추가돼서 원본바뀜 ㅋㅋ★ㅋㅋ★ㅋㅋ★ㅋㅋ★ㅋㅋ★ㅋㅋ★ㅋㅋ★ㅋㅋ★
		//i

		

		//--인덱스 번호는 "우"보다 한칸 앞자리겠지 0부터 시작하니까!!!!!!!!!
		//System.out.println("수민이 방법으로 한줄로 끝내보자 : " + sb3.insert(sb3.indexOf("우"),"까악까악꺄ㅏ앙"));
		//--==>> 이렇게 복잡하게 하지마 수민이는 indexOf("우")넣음. 대박대박대박
		//--==>>수민이 방법으로 한줄로 끝내보자 : 한국seoulkorea사랑까악까악꺄ㅏ앙우리나라대한민국


		// return 자료형만 보고는 객체의 값이 바뀌는걸 장담할 수 없지만.
		// void인 경우 바뀌는 경우가 많음.

		// 방법③ korea의 인덱스 + korea.length

		System.out.println(sb3);
		//-- 한국seoulkorea사랑우리나라대한민국



		// ○ 대상 문자열(sb3) 에서 
		//    『우리나라』 문자열 삭제.

		//sb3.delete(14,18);
		//-- 뒤에 매개변수-1까지. 삭제.
		//System.out.println(sb3);
		//--==>>한국seoulkorea사랑대한민국
		//System.out.println(sb3.delete(14,18));
		//System.out.println(sb3.indexOf("우리나라"));



		System.out.println(sb3.delete(sb3.indexOf("우리나라"),sb3.indexOf("우리나라")+"우리나라".length()));
		//--==>>한국seoulkorea사랑대한민국
		//System.out.println(sb3.delete(sb3.indexOf("우리나라")),"우리나라");
		//-->> insert처럼 할라했는데 이건 안돼. delete는 매개변수를 int,int로 취함.

		/*
		 method AbstractStringBuilder.delete(int,int) is not applicable
		 (actual and formal argument lists differ in length)
		 method StringBuffer.delete(int,int) is not applicable
         (actual and formal argument lists differ in length)
		 대박인 사실. StringBuilder는 추상클래스인듯? 추상아닌데? 뭐냐?????????????★★★★★★★★★★★★★★★★★★
		 글고 StringBuilder 랑 StringBuffer나 delete(int,int)임!!
		*/
		



		//○ 대상 문자열(sb3)에서
		//   『korea』이후 문자열 삭제(korea 포함)
		//sb3.delete(7,18);
		//System.out.println(sb3.delete(7,18));
		//--==>>한국seoul

		System.out.println(sb3.delete(sb3.indexOf("korea"),sb3.length()));
		//--==>>한국seoul
		System.out.println("버퍼 크기 : " +sb3.capacity());
		//--==>>버퍼 크기 : 34
		// 늘어난 버퍼크기가 그대로네????????
		// 버퍼는 늘어나지만 줄지는 않는다~



		//문자열(sb3)의 길이 확인
		System.out.println("sb3의 길이 :  " +sb3.length());
		//--==>>sb3의 길이 :  7
		// StringBuffer에도 length라는 메소드가 있구나 확인 가능.

		//버퍼 크기 조절
		// → 현재 문자열을 담아둘 수 있는 버퍼의 크기로...
		sb3.trimToSize(); //--사이즈까지 손톱깎기 토독토독

		//버퍼 크기 조절 이후 버퍼 크기 확인
		System.out.println("버퍼크기 조절후 확인 : " + sb3.capacity());
		//--==>>버퍼크기 조절후 확인 : 7
		//-- 버퍼크기 16이라메 ????************************************************



		








		



	}
}