/*==============================================
�����ڹ��� ���� �� Ư¡ ����

// �ڹ��� �⺻ ����� : java.util.Scanner

//�� java.util.Scanner
//	 �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//   ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//   �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
//   �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.
=============================================*/
import java.util.Scanner;


public class Test019
{
	public static void main(String[] args)
	{
		//BufferedReaderó�� �ν��Ͻ� ����.
		//Scanner Ŭ���� ����� �ν��Ͻ� ����

		Scanner sc = new Scanner(System.in);
		//Scanner �ȿ� �뿪��(Like new InputStreamReader)
		//new InputStreamReader ��� ��.
		//IOException ��� ��
		//�̹� ���� ���� ����.


		//��ɡ� ���ɡ�
		String name;

		int kor, eng, mat;

		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		//BufferedReader readLine();
		//�� ���� �� ����
		//���ڿ� ���.

		//kor = Interger.parseInt(sc.next());
		//�� �� ����
		
		//next(); --> ���ڿ��� 
		//nextInt(); --> ������ ��� �� ���� sc����
		//�ں����� ����ȯ���� ��ĥ �ʿ� ����.

		
		
		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();


		System.out.println(">>�̸� : " + name);
		System.out.println(">>���� : " + (kor + eng + mat));
	}
}

/*
�̸��� �Է��ϼ��� : ȫ����
���� ���� �Է� : 20
���� ���� �Է� : 40
���� ���� �Է� : 100
>>�̸� : ȫ����
>>���� : 160
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/