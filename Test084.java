/*=====================================
		    ���� �迭 ����
======================================*/

// �迭�� ����� �ʱ�ȭ
// �迭�� �⺻�� Ȱ��

// ����ڷκ��� �ο����� �Է� �ް�
// �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
// �̸� �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ� 
// ����� ����� �� �ִ� ���α׷��� �����Ѵ�.

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1 ~ 10) : 27
// �Է� ó���� �л� �� �Է�(��, 1 ~ 10) : -5
// �Է� ó���� �л� �� �Է�(��, 1 ~ 10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : ������ 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : �Ž��� 010-2222-2222
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : ���̻� 010-3333-3333

//---------------------------------
// ��ü �л� �� : 3��
//---------------------------------
//�̸�		       ��ȭ��ȣ
//������	       010-1111-1111
//�Ž���		   010-2222-2222
//���̻�		   010-3333-3333
//---------------------------------
//����Ϸ��� ................
/*
import java.util.Scanner;
import java.io.IOException;


public class Test084
{
	public static void main(String[] args) throws IOException
	{
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �����ڰ� �Է��ϴ� �л� ���� ��Ƴ� ����  
		int memberCount = 0;

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է� (1 ~ 10) : ");
			memberCount = sc.nextInt();

		}
		while (memberCount<1 || memberCount>10);
		//1���� �۰ų� 10���� ũ�� �ݺ�����~

		// �׽�Ʈ
		//System.out.println("�ο��� Ż��~!!!" + memberCount);

		// ���ο� �� ��ŭ�� �̸� ���� �迭 ����
		String [] names = new String[memberCount];

		// �ο� �� ��ŭ�� ��ȭ��ȣ ���� �迭 ����
		String [] tels = new String[names.length];
		//memberCount == names.length == tels.length


		// ���ο� �� ��ŭ�� �ȳ� �޼��� ��� �� �Է°� ��Ƴ���
		//for (int i = 0 ;i<names.length; i++ )
		//for (int i = 0 ;i<tels.length; i++ )
		for (int i = 0 ;i<memberCount; i++ )
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ",(i+1));
			//������ 010-1111-1111
			// ----- --------------
			names[i] = sc.next(); // ���ڿ��� ������.
			tels[i] = sc.next();

		}
		
		// ���� ��� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println();
		System.out.println("---------------------------------");
		System.out.printf("��ü �л� �� : %d\n",memberCount);
		System.out.println("---------------------------------");
		System.out.println("�̸�	��ȭ��ȣ");
		//�л� ����Ʈ �ݺ� ���
		for (int i = 0;i < memberCount ;i++ )
		
			System.out.printf("%4s %14s\n", names[i], tels[i]); 
		
		System.out.println("---------------------------------");
	}
}
*/
/*
������
�Է� ó���� �л� �� �Է� (1 ~ 10) : 27
�Է� ó���� �л� �� �Է� (1 ~ 10) : -5
�Է� ó���� �л� �� �Է� (1 ~ 10) : 3
�̸� ��ȭ��ȣ �Է�[1](���� ����) : ������ 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���� ����) : �Ž��� 010-2222-2222
�̸� ��ȭ��ȣ �Է�[3](���� ����) : ���̻� 010-3333-3333

---------------------------------
��ü �л� �� : 3
---------------------------------
�̸�    ��ȭ��ȣ
 ������  010-1111-1111
 �Ž���  010-2222-2222
 ���̻�  010-3333-3333
---------------------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/






import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Test084
{
	public static void main(String[] args) throws IOException
	{

		//��ü �ο��� �Է� �ޱ�
		//�� �ο��� ���� ���̸� �ٽ� ����
		// do ~ while

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nUser; //-- �Է¹��� �ο����� ��� ����.
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1 ~ 10) : ");
			nUser = Integer.parseInt(br.readLine());
		}
		while (nUser <1 || nUser>11);
		

		//System.out.println(nUser); //- nUser �� Ȯ��.

		//2. �̸��� ��ȭ��ȣ�� ���� �迭�� �����Ѵ�.

		//String [] strnUser = [nUser];

		//String [] strName = [nUser];
		//String [] strNumber = [nUser];

		
		String [] strnUser = new String[nUser]; //--nUserũ���� �迭 ����.

		String [] arr1 = new String[nUser];
		String [] arr2 = new String[nUser];


		Scanner sc = new Scanner(System.in);
		String nName="0";
		String nNumber="0";


		int i;
		
		//3. �Է��� �ް� �迭�� �ִ´�.
		for (i=0;i<strnUser.length ;i++ )
		{
	
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ",i);
			nName = sc.next();
			nNumber = sc.next();

			arr1[i] = nName;
			arr2[i] = nNumber;
			

		}
			
			
		System.out.println("---------------------------------");
		System.out.printf("��ü �л� �� : %d \n" , nUser);
		System.out.println("---------------------------------");
		System.out.println("  �̸�    ��ȭ��ȣ");

		for (int j=0;j<arr1.length ;j++ ) //�� ���������� ���..
		{
			System.out.printf("%4s %8s\n",arr1[j],arr2[j]);
			//System.out.printf("%4s %8s\n",nName,nNumber);	�� ���⼭ �߸���.
			//System.out.println(arr1[i]);
			//System.out.println(arr2[i]);

		}
		System.out.println("---------------------------------");

		
		

		//for (i=0;i<nUser.length ;i++ )
		//{
		//	strName[i] = nName;
		//	strNumber[i] = nNumber;
		//}
	}
}
/*
�Է� ó���� �л� �� �Է�(��, 1 ~ 10) : 3
�̸� ��ȭ��ȣ �Է�[0](���� ����) : �ֹ��� 010-1111-1111
�̸� ��ȭ��ȣ �Է�[1](���� ����) : ������ 010-2222-2222
�̸� ��ȭ��ȣ �Է�[2](���� ����) : ȫ���� 010-3333-3333
---------------------------------
��ü �л� �� : 3
---------------------------------
  �̸�    ��ȭ��ȣ
 �ֹ��� 010-1111-1111
 ������ 010-2222-2222
 ȫ���� 010-3333-3333
---------------------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/





/*

		for (int i=0;i<strArr.length ;i++ )
		{
			System.out.print(strArr[i]);
			
		}
*/
		//Scanner�� �̿��ؼ� �̸��� ��ȭ��ȣ�� �޴´�.
		
