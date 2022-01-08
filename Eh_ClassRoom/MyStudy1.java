public class MyStudy1
{
	public static void main(String[] args)
	{
		int a,x;
		double b;
		
		a = 5;
		x = 3;
		b = 3.7;
	
		//전부 실수연산
		System.out.println("정수 + 실수 : " + (a + b));
		System.out.println("정수 - 실수 : " + (a - b));
		System.out.println("정수 * 실수 : " + (a * b));
		System.out.println("정수 / 실수 : " + (a / b));
		System.out.println("정수 % 실수 : " + (a % b));

		//나누기(몫,나머지)로만 반환
		System.out.println("정수 + 정수 : " + (a + x));
		System.out.println("정수 - 정수 : " + (a - x));
		System.out.println("정수 * 정수 : " + (a * x));
		System.out.println("정수 / 정수 : " + (a / x));  //몫 반환
		System.out.println("정수 % 정수 : " + (a % x));  //나머지 반환
	}
}