/*=====================================
���� Ŭ������ �ν��Ͻ� ����
======================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1 ���� �Է¹��� �� ������ ���� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

//��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �Է� ó�� �������� BufferedReader�� readLine()�� ����ϸ�,
// �Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է� ���� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� �Է� (1~1000) : 1050
//������ ���� �Է� (1~1000) : -45
//������ ���� �Է� (1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ϸ��� ............


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	//�ֿ� ���� ����(������� �Է°��� ��Ƴ� ����)
	int su;

	//�Է� �޼ҵ� ���� //���⼭ �˸´� ������ ������.
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("������ ���� �Է� (1 ~ 1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);
	}

	// ���� ó�� �޼ҵ� ����
	int calculate()
	{
		int result = 0;

		for (int i =1;i<=su ;i++ )
		{
			result += i;
		}
		return result;
	}
	//��� ��� �޼ҵ� ����

	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n", su,sum);
	}
}
public class Test074
{
	public static void main(String[] args) throws IOException
	{
		// Hap �ν��Ͻ� ����
		Hap ob = new Hap();

		//������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� �� input()
		//______________________
		//    �������� Ȱ��
		ob.input();

		//������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ�� �� calculate()
		int sum = ob.calculate();
		
		ob.print(sum);
		
	}
}

/*
������ ���� �Է� (1 ~ 1000) : 100
>> 1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/




	


/*
	//Ŭ���� = ���� + �޼ҵ�
	//��������. 
	int num; //--�ճ��� �ִ� ����.

	//�Է¹ޱ� + ���� ���̸� �ٽ� �����.
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ ���� �Է� (1 ~ 1000) : ");
		num = Integer.parseInt(br.readLine());
	}

	//�������ϱ�
	int hapSum()
	{
		int sum=0; //-- �������� ���� ����
		int n=1; //--�ݺ��� ��������
		
		do
		{
			sum += n;
			n++;
		}
		while (num>=1 && num<=100);
		
		return sum;
	}
		
		

	//����ϱ�
	void print(int sum)
	{
		if (num >= 1 && num <= 100)
		{
			System.out.printf("1~%d ������ ���� : %d", num,sum);
		}
		
	}
	
}

public class Test074
{
	public static void main(String[] args) throws IOException
	{
		//Hap �ν��Ͻ� ����.
		Hap h = new Hap();

		h.input();
		int s = h.hapSum();
		h.print(s);
	}
}

*/