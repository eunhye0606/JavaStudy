/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/

// �ݺ���(do ~ while ��) �ǽ�

/*
�� ����
	��do ~ while������ ��while������ ����������
	Ư���� ������ �ݺ� �����ϴ� �ݺ����̴�.
	�ٸ� ��while������ �ٸ� ����
	���ǽĿ� ���� �˻縦 �ݺ����� ������ ���Ŀ� �Ѵٴ� ���̴�.
	�̿� ���� �������� ���� �ݵ�� �� ���� �����ϰ� �Ǵ� Ư¡�� ���´�.

�� ���� �� ����
  
	do 
	{
		���๮;
	}
	while(���ǽ�);

// do ~ while ���� Ȱ�� ��
// ���� ���... ����ڷκ��� Ư�� ������ ������ �Էµ� �� ����
// �Է¹��� ���� ��ü�� �ݺ��ؼ� �����ؾ� �ϴ� ��Ȳ�̶� �����Ѵ�.

//��, �ּ� �� ���� ������� �Է°��� �޾ƿ��� ó���� �����ؾ�
//�ݺ��� �߰��� �������� ������ ���θ� ������ �� �ִ� ��Ȳ�̴�.

*/
import java.util.Scanner;
import java.io.IOException;

public class Test057
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int num;
		do
		{
			System.out.print("100 �̻��� ������ �Է��ϼ��� : ");		//while�������� ���ǽĿ� ��� �޴��� ����.
			num = sc.nextInt();
		}
		while (num < 100);

		System.out.println(num + "����ڰ� �Է��� ���� 100�̻��̴�.");
		
	}
}

/*

*/



/*public class Test057
{
	public static void main(String[] args)
	{
		//�� while �ݺ����� ���� �����ߴ� �������
		//   do ~ while ���� ���ؼ��� ������ �� �ִ�.

		int n = 0;
		
		do
		{
			n++; //n =1 ,n=3, n=5 , n=7, n= 9 n =11
			System.out.println("n=" + ++n);
									// n = 2, n=4,n=6 , n= 8,n=10,n=12
		}
		while (n<=10); //n =12 �� false


	}
}
*/

/*
n=2
n=4
n=6
n=8
n=10
n=12
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*public class Test057
{
	public static void main(String[] args)
	{
		//�� while �ݺ����� ���� �����ߴ� �������
		//   do ~ while ���� ���ؼ��� ������ �� �ִ�.

		int n = 0;
		
		do
		{
			n++;
			System.out.println("n=" + n);
			
		}
		while (n<10);


	}
}
*/

/*
n=1
n=2
n=3
n=4
n=5
n=6
n=7
n=8
n=9
n=10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*public class Test057
{
	public static void main(String[] args)
	{
		//�� while �ݺ����� ���� �����ߴ� �������
		//   do ~ while ���� ���ؼ��� ������ �� �ִ�.

		int n = 1;
		
		do
		{
			n++;
			System.out.println("n=" + n);
			
		}
		while (n<=10);


	}
}
*/

/*
n=2
n=3
n=4
n=5
n=6
n=7
n=8
n=9
n=10
n=11
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*public class Test057
{
	public static void main(String[] args)
	{
		//�� while �ݺ����� ���� �����ߴ� �������
		//   do ~ while ���� ���ؼ��� ������ �� �ִ�.

		int n = 1;
		
		do
		{
			System.out.println("n=" + n);
			n++;
		}
		while (n<=10);


	}
}
*/
/*
n=1		//�ϴ� ����ϰ�
n=2		// while ���Ǻ��ؼ� ���
n=3		// while ���Ǻ��ؼ� ���
n=4		// while ���Ǻ��ؼ� ���
n=5		// while ���Ǻ��ؼ� ���
n=6		// while ���Ǻ��ؼ� ���
n=7		// while ���Ǻ��ؼ� ���
n=8		// while ���Ǻ��ؼ� ���
n=9		// while ���Ǻ��ؼ� ���
n=10	// while ���Ǻ��ؼ� ���


n�� 10���� ��. 10�� ����ϰ� n++ �ؼ� 11�� ���� ���� ����.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/