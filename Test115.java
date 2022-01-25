 /*===============================================
	  ���� Ŭ���� ��� ����
================================================*/
// ���(Inheritance)

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����):  20 15
// ������ �Է�(+ - * /): -
// >> 20 - 15 = 5.00
// ����Ϸ���.....

//==============================================================
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Aclass
{
	protected int x,y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(" >> %d %c %d = %.2f%n", x, op, y, result);
	}
}

class Bclass extends Aclass
{
	/*
	protected int x,y;
	protected char op;

	void write(double result) //-- ���� �������������� default�� 
	                               ���پȵǴµ� ���� ��Ű�� ���̶�
								   ���ٰ����Ѱ�!
	{
		System.out.printf(" >> %d %c %d = %.2f%n", x, op, y, result);
	}
	*/
	Bclass()
	{
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �� ���� �Է�(���� ����) : "); //" 20 15"
		String temp = br. readLine(); 

		


		// �� ���ڿ�.split("������")	//-- ������ �� �������� ���
		//    ���ڿ�.split("\\s")	//-- ������ �� �������� ���
		//    ex)     "10 20 30 40 50".split("\\s");
		//    ��ȯ �� {"10","20","30","40","50"}
		//    ��Ҹ� ���ڿ��� ���ϴ� �迭

		//    ex) "010-1234-1234".split("-");
		//    ��ȯ �� {"010","1234","1234"}
		//    ��Ҹ� ���ڿ��� ���ϴ� �迭

		String[] strArr = temp.split("\\s");

		if (strArr.length != 2)
			return false;
			//-- false �� ��ȯ�ϸ� input() �޼ҵ� ����
			//   �� ������ ������ ���
			//   �Ʒ� �����ؾ� �� �ڵ尡 �����ִ���
			//   ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.
		

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);
		
		
		System.out.print("������ �Է�(+ - * /): ");
		op = (char)System.in.read(); //--�ƽ�Ű�ڵ�
		
		/*
		if (op != '+' && op != '-' && op != '*' && op != '/')
			return false;
		*/
		if (op == '+' || op == '-' || op == '*' || op == '/')
			return false;
		

		//�� ���� if ���ǹ� �� ���� �ƴϸ�
		// true�� ��ȯ�Ѵ�! else�� ���� �Ⱦ�
		// return�ϸ鼭 input()�� ���� ������ ������!
		return true;

	} // close input()

	double calc()
	{

		double result = 0;
		//-- default ���� ���ִ°ɷε� �ذ� ����

		switch(op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = (double)x / y; break;
		}
	}

} //-- ���� �Ḻ̌���!


//main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test115
{
	public static void main(String[] args) throws IOException
	{
		//Bclass �ν��Ͻ� ����
		Bclass ob = new Bclass();

		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();

		ob.write(result);

		
		
	}
}



//==============================================================
/*
import java.util.Scanner;
import java.io.IOException;

//�θ� Ŭ���� 
class Aclass
{
	protected int x,y;
	protected char op;
	
	//�θ� Ŭ���� ������
	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(" >> %d %c %d = %.2f%n", x, op, y, result);
	}
}

//Aclass �� ��ӹ޴� Ŭ������ ����

//�ڽ� Ŭ����
class Bclass extends Aclass
{
	//�ڽ� Ŭ���� ������
	Bclass()
	{
	}

	//����ڿ��� �Է� �޴� �޼ҵ�
	boolean input() throws IOException
	{   		
		// Scanner ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		int sum = 0 ; // -- �Է¹��� ���� ���� ������.
		boolean user = true ; // ���� ���� ������ true;
		//boolean userOp = false; // -- ����� ������ ����

		//int [] arr = new int [1];
		

		//userOp = (op == '+') || (op == '-') || (op == '*') || (op == '/');

		//����ڿ��� �Է¹ޱ�
		System.out.print("������ �� ���� �Է�(���� ����):  ");
		x = sc.nextLine();
		y = sc.ne
		System.out.println(x);*/
		

		
		/**

			System.out.print("������ �� ���� �Է�(���� ����):  ");
			x = sc.nextInt();
			y = sc.nextInt();

			int n = sc.nextInt();

			if (n > 0 && n <= 0)
			{
				user = false;
			}

			*/

		/*
		for (int i = 0;i<arr.length ;i++ )
		{
			System.out.print("������ �� ���� �Է�(���� ����):  ");
			arr[i] = sc.nextInt();
		}
		*/
			
	
/*		
			System.out.print("������ �Է�(+ - * /): ");
			super.op = (char)System.in.read(); //--�ƽ�Ű�ڵ�
		
		if ((op != '+' && op != '-' && op != '*' && op != '/'));
			user = false;*/
		
		/**
			sum = 0; //-- �ʱ�ȭ
			System.out.print("������ �� ���� �Է�(���� ����):  ");
			super.x = sc.nextInt();
			sum++;
			System.out.println("ù��° sum " + sum);
			super.y = sc.nextInt();
			sum++;
			System.out.println("�ι�° sum " + sum);

			System.out.print("������ �Է�(+ - * /): ");
			super.op = (char)System.in.read(); //--�ƽ�Ű�ڵ�
			System.out.println("����ڰ� �Է��� �����ڴ� : " + op);
		**/
	
		/*
		do
		{
			System.out.print("������ �Է�(+ - * /): ");
			super.op = (char)System.in.read(); //--�ƽ�Ű�ڵ�
			System.out.println("����ڰ� �Է��� �����ڴ� : " + op);


		}
		while (!userOp);
		*/
		/*
		if (sum == 2)
		{
			user = true;
			
		}
		*/
		/*
		return user; //-- ����ڰ� �Է� �� �ߴ�!
	}




	double calc()
	{

		double r = 0; // -- �����.
		switch (op)
		{
		case '+': r = x + y; break;
		case '-': r = x - y; break;
		case '*': r = x * y; break;
		case '/': r = (double)x / y; break;
		}
		return r;
	}
}


//main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test115
{
	public static void main(String[] args) throws IOException
	{
		//Bclass �ν��Ͻ� ����
		Bclass ob = new Bclass();

		//ob.input(); // �̰� ���� ���ſ���



		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();

		ob.write(result);
		
	}
}
*/