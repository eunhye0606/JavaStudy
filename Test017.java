/*==============================================
�����ڹ� �⺻ ���α׷��֡���

// �ڹ��� �⺻ ����� : System.in.read()
//readLine()�� BufferedReader���� ���.

/*
System.in.read() �޼ҵ�� �� ���ڸ� �����´�.
readLine() ó�� ���ڿ���⿭�� �ִ°� �������� �� ����.
�� , �Է¹��� �ϳ��� ���ڸ� ���� �״�� �������� ���� �ƴ϶�
ASCII Code ������ ��ȯ�Ѵ�.


// ���� ��)
// �� ���� �Է� : A
// �� �ڸ� ���� �Է� : 8

// �Է��� ���� : A
// �Է��� ���� : 8
// ����Ϸ��� �ƹ� Ű�� ............

*/
import java.io.IOException;


public class Test017
{
	public static void main(String[] args) throws IOException
	{
		/*char ch;

		// ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� �ϳ� �Է� : ");
		ch = (char)System.in.read();	// A
										// 65
		//��� ���
		System.out.println(ch);
*/
/*		char ch;
		int n;

		System.out.print("�� ���� �Է� : ");
		ch = System.in.read();

		System.out.print("�� �ڸ� ���� �Է� : ");	
		n = System.in.read();	
		//BufferedReader�� �ִ� readLine()�� ���ڿ��� ����� �Է� ���� �޾ƿ�.
		//�ٰ� : Test016�� name = br.readLine(); �̰� �����. 
		//System.in.read();���� ���� ������ StringŸ���̶� int�� ��ȯ ����
		//String, Integer.paseInt(), char �ȵ�
		//int�� ��. �� �ٵ� �úη� ����ϸ� 4�� �ƴ϶� 52�� ����. 
		//����? 4�� ���ڿ��ΰ�? �ٵ� �׷��� String�̶� char�� ������


		System.out.printf("\n �Է��� ���� : %s\n\n �Է��� ���� : %d\n",ch, n);
		//(1). System.out.printf("\n �Է��� ���� : %d\n"); 
		//	   �̶� printf()�� ��µ� �ڿ� %d�� �� ���� ���༭ 
		//     ����Ÿ�ӿ������� �߻�.
		//	    "" �ȿ� ���ڿ� �ְ� �װ� ����ϴϱ� ���������δ� ������ ����.
		//	    �׷��� ����������� %d�� ���� ã�µ� ��� ��Ÿ�ӿ��� �߻�.

*/
		

		//�ֿ� ���� ����
		char ch;	//-- �Է¹��� ���ڸ� ���� ����
		int n;

		//���� �� ó��
		//�ȳ� �޼��� ���
		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();	//System.in.read();�� �ƽ�Ű�����ڵ�� ������. ���������ȯ ��

		//�Է� ��⿭�� �����ִ� \r�� \n�� ��ŵ(�ǳʶٱ�)

		//System.in.skip(2);
		//� �� �Ű�����
		//�� ���� ���а� �ǳʶ�.


		System.out.print("�� �ڸ� ���� �Է� : ");
		n = System.in.read();
		n -= 48;

		//Ȥ�� char�� �߰��ؼ� int�� �������ȯ�ϰ� �ű⿡ ���

		//��� ���
		System.out.println();
		System.out.println("�Է��� ���� : " + ch);
		System.out.println("�Է��� ���� : " + n);
	}
}

/*
���� �߻� 

�� ���� �Է� : A
�� �ڸ� ���� �Է� :			�� �ι�° ���� �����ϰ� �Ѿ �� System.in.skip(); 
�Է��� ���� : A
�Է��� ���� : 13			�� �����ε� 13�� ������ ����ִٰ�? -48�ϸ��. 
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/