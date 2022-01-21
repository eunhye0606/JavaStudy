 /*===============================================
	  ���� �ֹε�Ϲ�ȣ ��ȿ�� �˻����
================================================*/ 

/*
�� �ֹε�Ϲ�ȣ ���� ����

   �� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

   123456-1234567 (�ֹι�ȣ)
   ****** ****** ---------------------- �� �ڸ����� ���ϱ�
   234567 892345 (�� �ڸ��� ������ ��)

   �� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

   ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
       * * * * * *   * * * * * *
	   2 3 4 5 6 7   8 9 2 3 4 5
	   ----------------------------
	   �� 14 + ... + 15
	    9 8 0 6 0 6 - 2 1 6 9 2 1 7
		2 3 4 5 6 7   8 9 2 3 4 5
		
		
	      
		  == 217
	�� ������ ������� 11�� ������ ������������ ���Ѵ�.
	         19  �� ��(x)
	      ----------
	   11 | 217
	        11 
		  ----------
		    107
			 99
		  ----------
		      8 �� ������(O)
	
	�� 11���� ������ 8�� �� ������� ���Ѵ�.
	   
	   11 - 8 �� 3

	   �� ���� ó�� �������� �������� 0�� ��� �� 11-0 �� 11
	                         �������� 1�� ��� �� 11-1 �� 10

		  �̸� �ٽ� 10���� ������ �������� ���Ѵ�.     �� 1
		                                               �� 0
	      
	  
	�� ���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ� 
	   ��ġ�ϴ����� ���θ� ���Ѵ�.

	   ��ġ   �� ��ȿ�� �ֹι�ȣ
	   ����ġ �� �߸��� �ֹι�ȣ

*/

// ���� �� )
// �ֹι�ȣ�Է�(XXXXXX - XXXXXXX) : 123456 - 12345678 �� �Է� ���� �ʰ�
// >> �Է� ���� ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(XXXXXX - XXXXXXX) : 123456 - 123456   �� �Է� ���� �̴�
// >> �Է� ���� ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(XXXXXX - XXXXXXX) : 750615 - 1252085 �� ��ȿ�� �ֹι�ȣ
// >> ��Ȯ�� �ֹι�ȣ ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(XXXXXX - XXXXXXX) : 750615 - 1252086 �� ��ȿ���� ���� �ֹι�ȣ
// >> �߸��� �ֹι�ȣ ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...


// �� ���� �ذ��� ���� �߰� tip~!!!

//    �迭.length     �� �迭�� ����(�迭���� ����) ��ȯ
//    ���ڿ�.length() �� ���ڿ��� ���� ��ȯ
//                      m,    n  �� m��°���� n-1��° ����. �ε����� 0����.
//    ���ڿ�.substring(int i, int j) �� ���ڿ� ����
//                     i ~ j-1����.   �� �̻��ΰŵ� ��Ÿ�ӿ�����.

//    ���ڿ�.substring(int i) �� �Ű����� 1���� ����.
//                     i ���� ���ڿ� ������!

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test108
{
	public static void main(String[] args) throws IOException
	{ 
		// �Է¹޴� �ֹι�ȣ(���ڿ� ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �Է¹޴� �ֹι�ȣ (���ڿ� ����)
		String str;
		
		// �ֹι�ȣ�� �� �ڸ����� ���ϰ� �� �� �� �迭 ���·� ����
		//            7  5  0  6  1  5  -  1  8  6  2  1  3  3       
		int [] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//                             ---
		//                             check~!!

		// ���� ���� �� ������ ( �� ������ ����� ���� ������...)

		int tot = 0; //7*2 + 5*3 + .. + 3 * 5 �׷��� �ʱ�ȭ 0����

		System.out.print("�ֹι�ȣ�Է�(XXXXXX - XXXXXXX) : ");
		//"750615-1862133"
		str = br.readLine();
		
		if (str.length() != 14)
		{
			System.out.println("�Է� ���� ~!!");
			return; // �� �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		}

		// ex)"750615-1862133"
		for (int i =0;i<13 ;i++ )//0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			if (i ==6)
			{
				//break;
				continue; // -- �޺κ� �����ϰ� ����ض�.
			}
			tot+= chk[i] * Integer.parseInt(str.substring(i,i+1)); //���ڿ��� �ε��� ������ ���� 13�̶� i+1����.
			// ���Ⱑ �޺κ���!

		}
		//System.out.println(tot);
		int result; //-- ������ ���̶� ���� ����

		result = tot%11;
		if (result == Integer.parseInt(str.substring(13)))
		{
			System.out.println(" >> ��Ȯ�� �ֹι�ȣ ~!!!");
		}
		else if (result % 10 ==  Integer.parseInt(str.substring(13)))
		{
			 System.out.println(" >> ��Ȯ�� �ֹι�ȣ ~!!!");
		}
		else
			System.out.println(" >> �߸��� �ֹι�ȣ ~!!!");
	}
}



















		/*
		String strTemp = "ȫ����";
		System.out.println(strTemp.length());
		//-->>3

		strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		//-->>9
		//---------------------------------------------
		strTemp = "�ȳ��ϼ���";
		System.out.println(strTemp.substring(2,5));
		//-->>�ϼ���

		strTemp = "�ȳ��ϼ���";
		//System.out.println(strTemp.substring(2,100));
		//-->>StringIndexOutOfBoundsExcep

		strTemp = "�ȳ��ϼ���";
		System.out.println(strTemp.substring(4));
		//-->> ��
		*/
		//========================================================
/*
		//BufferedReader �ν��Ͻ� ����
		// ��ĳ�ʴ� ���鱸���ϸ鼭 ���� ���� �Ȱ������°� ����Ʈ.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�ֿ� ���� ����
		String user;  // -- ����ڰ� �Է��� ���ڿ� ���� ����
		int nUser; // -- user ���� ��� ����
		String userA; // -- ����ڰ� �Է��� ���� �� ���� ����
		int a ; // -- userA�� ���� ��� ����
		String userB; // -- ����ڰ� �Է��� ���� �� ���� ����
		int b ; // -- userB�� ���� ��� ����


		// ����� �Է� �ް�
		// �ֹι�ȣ ���� ��ȿ�� �˻�
		// 1. ���ڸ� 6��
		// 2. ���ڸ� 7��
		
		//====================================================

		//�׽�Ʈ
		//System.out.print("�ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : ");
		//user = br.readLine();
		//System.out.println(user);
		//userA = user.substring(0,6);
		//System.out.println(userA);
		//userB = user.substring(7);
		//System.out.println(userB);
		//����

		

		//====================================================
		/*
			System.out.print("�ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : ");
			user = br.readLine();
			userA = user.substring(0,6);
			System.out.println(userA);
			userB = user.substring(7);
			System.out.println(userB);
			a = userA.length();
			System.out.println("a : "+a);
			System.out.println("a�� ���ڿ��ΰ�? : " + (a == 6));
			b = userB.length();
			System.out.println("b : " +b);
			System.out.println("a+b : "+a+b);
			
		    if (a+b==14)
		    {
				System.out.println("��ȿ�� �ֹι�ȣ �Է�~!!");
		    }
			else 
				System.out.println("�Է¿���~!!");

		*/
/*		
		System.out.print("�ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : ");
		
		user = br.readLine();
		System.out.println(user);
		nUser = user.length();
		System.out.println(nUser);

		if (nUser == 14)
		{
			System.out.println("�׽�Ʈ");
		}
		else
			System.out.println("�Է¿���~!!");
		

		// �ֹι�ȣ ����.
		int sum=0;
		int number;
		int result=0;
		//���� �迭��
		int [] arr = {2, 3, 4, 5, 6, 7,8, 9, 2, 3, 4, 5};

		for (int i = 0;i<arr.length ;i++ )
		{
			int n = i+1;
			number = Integer.parseInt(user.substring(i,n));
			sum += number * arr[i];
		}
		
		result = (sum % 11)%10;

		int x ; 
		x = Integer.parseInt(user.substring(13,14));

		if (x == result)
		{
			System.out.println("��ȿ�� �ֹι�ȣ �Է�~!!");
		}
		else 
			System.out.println("��ȿ��������.");

		




		// ��� ���


		
		
		
		
	}
}
*/