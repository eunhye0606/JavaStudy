/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/

// switch �� �ǽ�

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ó�� ����� ����ϴ� ���α׷��� �����϶�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 3
// �� ��° ���� �Է� : 17
// ������ �Է� [+ - * /] : -

// >> 3 - 17 = -14
// ��� ..............
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test045

{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1, n2, nOp;
		int a,b,c,d; //��Ģ���� ���
		char cOp;

		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());
	
		System.out.print("������ �Է� [ + - * / ] : ");
		nOp = System.in.read();
		cOp = (char)nOp;

		// + 43
		// - 45
		// * 42
		// / 47

		//op = (char)System.in.read();

		a = n1 + n2;
		b = n1 - n2;
		c = n1 * n2;
		d = n1 / n2;

		switch (nOp)
		{
				// result = a + b; �̷��� �ϴ°� �� ����.
		case 43: System.out.printf("%d %c %d = %d",n1,cOp,n2,a); break;
		case 45: System.out.printf("%d %c %d = %d",n1,cOp,n2,b); break;
		case 42: System.out.printf("%d %c %d = %d",n1,cOp,n2,c); break;
		case 47: System.out.printf("%d %c %d = %d",n1,cOp,n2,d); break;
		default : return;
		//1.���� ��ȯ
		//2.�޼ҵ� ���� �� �ܵ����� ���� ��, �� main()�� �̰� ǰ�� ������
											//  main()�� ���Ḧ �ǹ�!.
											//  �� ���α׷� ����.

		//default: System.out.println("������ �߸� ����.");
		
		
		}
		System.out.println();
	}
}


/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� [ + - * / ] : ");
		op = (char)System.in.read();

		switch (op)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;

		default : return;
		
		}
		System.out.printf("\n>>%d %c %d = %d\n", a, result, b);
	}

}*/ 
// �̹������� ���ľȿ� char �Ұ�. ��ť��Ʈ ã��


/*

ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 8
������ �Է� [ + - * / ] : /
5 / 8 = 0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 3
�� ��° ���� �Է� : 5
������ �Է� [ + - * / ] : *
3 * 5 = 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/