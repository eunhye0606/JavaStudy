/*==============================================
■■■연산자(Operator)■■■
//비트 단위 연산자
=============================================*/

public class Test027
{ 
	public static void main(String[] args)
	{
		int x =128; //00000000 00000000 00000000 10000000

		System.out.printf("x << 3 : %d%n", x<<3); //00000000 00000000 00000100 00000000
		System.out.printf("x * 8 : %d%n", x*8);   //2 * 2의 3승

		System.out.printf("x >> 3 : %d%n", x>>3);//00000000 00000000 00000000 00010000 //MSB가 0 , >>이건 부호 안바뀜
		System.out.printf("x / 8 : %d%n", x/8); //오른쪽이동은 나누기 2의 3승

		System.out.printf("x << 24 : %d%n", x<<24);
		// x << 24 : -2147483648
		// 10000000 00000000 00000000 0000000
		//int의 최솟값. 절댓값 최대.
		//이거 이해하기 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		

		System.out.printf("x << 25 : %d%n", x<<25);
		System.out.printf("x << 31 : %d%n", x<<31);
		System.out.printf("x << 32 : %d%n", x<<32);
/*
x << 25 : 0
x << 31 : 0
x << 32 : 128
원래자리 가기 전까지는 발현 안돼.
*/


/*
x << 3 : 1024
x * 8 : 1024
x >> 3 : 16
x / 8 : 16
계속하려면 아무 키나 누르십시오 . . .

*/
	}
}

/*


*/