/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/
// if ��
//if ~ else �� �ǽ�

//1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//   �б� ������ ���ϱ� ���� ����ϴ� �������
//   if��, if~else��, ���ǿ�����, ����if��(if�� ��ø),
//   switch ���� �ִ�.

//2. if���� if ������ ������ ���� ���,
//   Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����ض�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

// ���� �� )
// ù ��° ���� �Է� : 
// �� ��° ���� �Է� : 
// ������ �Է� [+ - * /] : +

// >> 10 + 3 = 13
// ����Ϸ��� �ƹ� Ű�� ��������...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{

	public static void main(String[] args) throws IOException
	{
	/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1, n2;
		char oper; //������


		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� [+ - * /] : ");
		//oper = br.readLine();
		oper = (char)System.in.read();
		//������ ���Ϲ��ڶ� String�� �ȵ��� readLine(); �Ұ�.



		if (oper == '+')
		{
			System.out.printf(">>%d + %d = %d",n1,n2,n1+n2);
		}
		else if (oper == '-')
		{
			System.out.printf(">>%d = %d = %d",n1,n2,n1-n2);
		}
		else if (oper == '*')
		{
			System.out.printf(">>%d * %d = %d",n1,n2,n1*n2);
		}
		else if (oper == '/')
		{
			System.out.printf(">>%d / %d = %d",n1,n2,n1/n2);
		}
		else 
			System.out.println("�� �� ����."); //�� �̰� �־�� ������ ���� ���� ������ �˼����� ����.
	System.out.println();	
*/
    int a, b, result = 0;
	char op;

	System.out.print("ù ��° ���� �Է� : " );
	a = Integer.parseInt(br.readLine());
	System.out.print("�� ��° ���� �Է� : " );
	b = Integer.parseInt(br.readLine());
	System.out.print("������ �Է� [+ - * /] : ");
	op = (char)System.in.read();

	if (op == '+')
	{
		result = a + b;
	}
	else if (op == '-')
	{
		result = a - b;
	}
	else if (op == '*')
	{
		result = a * b;
	}
	else if (op == '/')
	{
		result = a / b;
	}
	System.out.printf("\n >> %d %c %d = %d%n", a,op,b,result);





/*	String str;
	char ch = 'A';
	//str = ch;
	str = "a";
	System.out.print(str);*/
	//char�� String�� �����°�
	//String�ȿ� ���Ϲ��ڴ� ""���·� ����

// ���Ϲ��ڴ� ���ڿ��� ���Ծȵ�. ������
/*	String str = "�ȳ�";
	boolean b;
	b = str == "�ȳ�";
	// String�� == ����.
*/
	}
}

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 20
������ �Է� [+ - * /] : +
10 + 20 = 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2
������ �Է� [+ - * /] : -
10 = 2 = 8
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2
������ �Է� [+ - * /] : *
10 * 2 = 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2
������ �Է� [+ - * /] : /
10 / 2 = 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2
������ �Է� [+ - * /] : =
�� �� ����.

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/