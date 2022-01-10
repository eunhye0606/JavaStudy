import java.io.IOException;

public class Test032_2
{
	public static void main(String[] args) throws IOException
	{
	

	System.out.print("한 문자 입력 : ");

	int temp;
	char t;
	String str;

	temp = System.in.read();
	t = (char)t;

	str = temp >= 65 && temp <= 90 ? "대문자" : "대문자아님"
	//    t >= 'A' && t <= 'Z' ? "대문자" : "대문자아님"
	//    이거도 가능.


	
	
	System.out.println("입력받은 값 확인 : " + temp);

	}
}