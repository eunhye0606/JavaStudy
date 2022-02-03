/*=====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================*/

//StringTokenizer Ŭ����
// ������ ���������� Ȱ��Ǵ� Ŭ������ �ƴ�.
// �׷��� �̰ɷ� ���� ���α׷��� ���� �� �ֱ⿡
// �� ������ ���� ����.

/*
�� StringTokenizer Ŭ������
   ���ڿ� �Ľ�(parsing)�� ���� ������ �����ϴ� Ŭ������
   �Ľ�(parsing)�ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
   ���⿡�� �Ľ�(parsing)�̶� �ϳ��� ���ڿ��� ���� ���ڿ���
   ������ �۾��� �ǹ��ϰ� �Ǹ�, �� �� ������ ������ �Ǵ� ���ڿ���
   ��ū(token)�̶�� �Ѵ�.

   StringTokenizer Ŭ������ ����ϱ� ���ؼ���
   java.util ��Ű���� StringTokenizer �� import �ؾ� �Ѵ�.


   StringTokenizer Ŭ������ ȣȯ���� �����ϴ� ��������
   ���� �����ǰ� ������ ���ڿ��� �Ľ�(parsing)�ϱ� ���ؼ���
   String Ŭ������ split() �޼ҵ峪 java.util.regex ��Ű����
                                              ����Ʈ + ex..
											  ������Ű��...
   ����� ���� �����ϰ� �ִ�.


�� ������
   - ����
     StringTokenizer(String str) �� ��ü���ڿ��� ��� ��ü�� ����.
	 StringTokenizer(String str, String delim) �� �ι�° �Ű������� �ڸ�
	 StringTokenizer(String str, String delim, boolean returnDelims) �� �ι�°�� �ڸ��� �� �ڸ��ű��� ���Խ�Ű�� �Ƚ�Ű�� t/f
	 �� �־��� ���ڿ� str�� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
	    ����(����)���ڴ� delim�� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
		���� returnDelims �� true�̸�
		���� ���ڵ� �и��� �����ͷ� ó���ϰ� �ȴ�.


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test142
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String [] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�Ľ��� ���ڿ� �Է� (�ĸ� ����) : " );
		strTemp = br.readLine();
		//-- "���, ����, �ٳ���, �丶��"
		//    readLine()���� �ϳ��� ���ڿ��� �о��.

		//StringTokenizer Ŭ���� �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp,",");
		// �Ű����� 2��¥�� ������ ȣ���ϸ鼭
		// strTemp�� ����ڿ���...("���, ����, �ٳ���, �丶��")
		// ��,���� �����ڷ�...
		// ��ü�� �����Ȱ��� �迭�� ����� �ƴ�.


		//st�� ��countTokens()�� �޼ҵ� ȣ��
		// ��int counTokens()��
		//  : �Ľ̵� ���ڿ��� ������ ����(��ȯ)�Ѵ�.
		strArr = new String[st.countTokens()];
		//                 -----------------
		//                         4

		// �� strArr = new String[4];
		//    �迭�� ���⼭ ����.



//===========================================================
//                       ���� ���� Ȯ��!
// �� ���� �޼ҵ尡 ����. �÷��ǿ��� ���.

		n = 0;
		// -- ��hasMoreTokens()��
		//    ����� �� �ִ� ��ū�� �����ִ� ��� ture ��ȯ
		//    �� �̻� ����� ��ū�� ���°�� false ��ȯ
		//    Ȯ�� ����� ��ȯ�� ��
		//    ���� ������ �о������ �ʵ�
		//    ���� ������ �д� ��带 �̵���Ű���� �ʴ´�.


		// -- nexToken()
		//    ���� ��ū�����´�.
		//    ���� ��ū�� ������ ��嵵 �̵���Ű�� �ȴ�.
		//    �����ڸ� �ٲپ��� ��� ���� ȣ�⿡
		//    �ٲ� �����ڸ� �̿��Ͽ� ��ū�� �и��Ѵ�.

		while (st.hasMoreTokens()) //�갡 ���� ��ū �ִ��� Ȯ�� t/f
			strArr[n++] = st.nextToken(); //�갡 ������.
		//��true �� strArr[0] = "���";
		//��true �� strArr[1] = "����";
		//��true �� strArr[2] = "�ٳ���";
		//��true �� strArr[3] = "�丶��";
		//��false �� while �ȵ��ϴ�.

		System.out.print("�Ľ̵� ��ū (���ڿ�) : " );
		for (String str:strArr )
			System.out.print(str + " " );
		System.out.println();

//===========================================================
	}
}

/*
 hasmoreToken()�� �갡 �������� �ʰ� ���� ���� �ִ��� ��������
  true, false�� ��ȯ.
��� �� �����̴°� nextToken() 
-----------------------------------------------------------
���, ����, �ٳ���, �丶��
-----------------------------------------------------------
*/