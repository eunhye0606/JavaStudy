/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/

// switch �� �ǽ�

// ����ڷκ��� 1���� 3������ ���� �� �ϳ��� �Է¹޾�
// �Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

//�� switch ���� �Ϲ� ���� ����Ѵ�.
//�� switch ���� �⺻ ���� ����ϵ�,
//   ��break���� �� �� ���� ����� �� �ֵ��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~3) : 3
// �ڡڡ�
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է�(1~3) : 1
// �� 
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է�(1~3) : 7
// �Է� ���� ~ !!
// ����Ϸ��� �ƹ� Ű��...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test044
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("������ ���� �Է�(1~3) : ");
	int n;

	n = Integer.parseInt(br.readLine());

	//�� switch ���� �Ϲ� ���� ����Ѵ�

/*	switch (n)
	{
	case 1: System.out.println("��"); break;
	case 2: System.out.println("�ڡ�"); break;
	case 3: System.out.println("�ڡڡ�"); break;
	default:System.out.println("�Է� ���� ~!!");
	
	}
*/
	//�� switch ���� �⺻ ���� ����ϵ� 
	//   ��break���� �� �� ���� ����� �� �ֵ��� �����Ѵ�.
	switch (n)
	{
	//default : System.out.print("�Է� ���� ~!!");break;
	case 3: System.out.print("��");
	case 2: System.out.print("��"); 
	case 1: System.out.print("��\n");break;
	
	default : System.out.println("�Է� ���� ~!!");
	
	}
	//System.out.println();
		
		
	}
}

/*
������ ���� �Է�(1~3) : 1
��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3) : 2
�ڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3) : 3
�ڡڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3) : 4
�Է� ���� ~!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/