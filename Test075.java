/*=====================================
���� Ŭ������ �ν��Ͻ� ����
======================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է� (���� ����) : 10 5
// ������ ������ �Է� ( + - * /) : +
// >> 10 + 5 = 15
// ����Ϸ��� ....
import java.util.Scanner;
import java.io.IOException;


class Calculate
{
	//�ֿ亯�� ���� �� �ʱ�ȭ
	int nUser1, nUser2; //-- ����� �Է� ���� �ΰ�
	int nCh; //-- ����� �Է� ������ �ƽ�Ű�ڵ尪.
	char ch;

	//�Է¹ޱ�
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է� (���� ����) : ");
		nUser1 = sc.nextInt();
		nUser2 = sc.nextInt();
		System.out.print("������ ������ �Է� ( + - * /) :");
		nCh = System.in.read();
		ch = (char)nCh;
	}

	//�����ϱ�
	int cal()
	{
		int result = 0;
		// �̰� �ʱ�ȭ ���ϸ� �ڹٰ� ������ �� 
		// �줊..
		
		// + 43
		// - 45
		// * 42
		// / 47

		switch (nCh)
		{
		case 43: result = nUser1 + nUser2; break;
		case 45: result = nUser1 - nUser2; break;
		case 42: result = nUser1 * nUser2; break;
		case 47: result = nUser1 / nUser2; break;
		// -- default�� ����ϴ°�?
		//default : System.out.print("������ �߸� �Է�");
		//default : result = -99999999; 
		//�̰� ���� ���.
		}
		return result;
	}


	//����ϱ�
	void print(int r)
	{
		System.out.printf("%d %c %d = %d\n",nUser1,ch,nUser2,r);
	}
}

public class Test075
{
	public static void main(String[] args) throws IOException
	{
		// Calculate �ν��Ͻ� ����.
		Calculate c = new Calculate();

		c.input(); //--�Է¹ޱ�
		int r = c.cal(); //--�����ϱ�
		c.print(r); //--����ϱ�.
	}
}

/*
������ �� ���� �Է� (���� ����) : 10 5
������ ������ �Է� ( + - * /) :+
10 + 5 = 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
