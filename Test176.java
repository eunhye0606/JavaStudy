/*===================================
���� �ڹ��� �⺻ �����(I/O) ����
====================================*/

//Reader �ǽ�
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test176
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		//System.in       : �ڹ� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ
		//InputSteamReader: ����Ʈ ��� ��Ʈ���� �� ���� ��� ��Ʈ������
		//	                ��ȯ�� �ִ� ���� ����(���� ��Ʈ��, ������)
		//Reader          : ���� ��� ��Ʈ�� ��ü
 		Reader rd = new InputStreamReader(System.in);

		System.out.println("\t���ڿ� �Է�(����:Ctrl+z)");

		while( (data = rd.read()) != -1)	//System.in.read() : ����Ʈ��� ����.
											//Reader.read()    : ���ڱ�� ����.
		{
			ch = (char)data;

			//System.out.print("�Է��� ���� \n: " + ch);	//print() : ���ڱ�� ����.
			//System.out.print(ch);
			/*
			       ���ڿ� �Է�(����:Ctrl+z)
			�ȳ��ϼ���
			�ȳ��ϼ���
			*/
			System.out.write(ch);
			/*
			        ���ڿ� �Է�(����:Ctrl+z)
			�ȳ��ϼ���
			HUX8?


			*/
		}
	}
}