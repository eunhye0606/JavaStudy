import java.io.IOException;

public class Test032_2
{
	public static void main(String[] args) throws IOException
	{
	

	System.out.print("�� ���� �Է� : ");

	int temp;
	char t;
	String str;

	temp = System.in.read();
	t = (char)t;

	str = temp >= 65 && temp <= 90 ? "�빮��" : "�빮�ھƴ�"
	//    t >= 'A' && t <= 'Z' ? "�빮��" : "�빮�ھƴ�"
	//    �̰ŵ� ����.


	
	
	System.out.println("�Է¹��� �� Ȯ�� : " + temp);

	}
}