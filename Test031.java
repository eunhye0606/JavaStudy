/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/

//if ~else 

//����ڷκ��� ������ ���ڸ� �ϳ� �Է¹޾�
//�빮���̸� �ҹ��ڷ� �ҹ����̸� �빮�ڷ�
//���ĺ��� �ƴ� ��Ÿ�����̸� �Է¿��� ó���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �� ���� �Է� : A
// >> A �� a
//����Ϸ��� �ƹ� Ű�� ��������....


// �� ���� �Է� : b
// >> b �� B
//����Ϸ��� �ƹ� Ű�� ��������....

// �� ���� �Է� : 7
// >> �Է� ���� ~!!!
//����Ϸ��� �ƹ� Ű�� ��������....
=============================================*/
import java.io.IOException;


public class Test031
{
	public static void main(String[] args) throws IOException
	{

	System.out.print("�� ���� �Է� : ");	//����� �Է¹ޱ�

	int nWord;	//����� �Էº���
	boolean bigW, smallW;	//��ҹ��ڶ��? ����
	char result; //�ƽ�Ű�ڵ忡 ���� �Ǵ� ���� ����
	char newWord; //ó�� ����� �� ���� ����
	
	
	nWord = System.in.read();  //�ƽ�Ű�ڵ�� ���� 
	newWord = (char)nWord; //�� �ƽ�Ű�ڵ� ���� ����

	//System.out.println(nWord);

	//�ƽ�Ű�ڵ� �빮�� A : 65		B:66	65~90
	//			 �ҹ��� a : 97		b:98	97~122
	//
	// �빮�� �� �ҹ��� : �빮�� + 32
	// �ҹ��� �� �빮�� : �ҹ��� - 32
 	//result = (char)(nWord >= 65 && nWord <= 90)? nWord:((nWord >= 97 && nWord <= 122)? nWord : (char)nWord));	//�빮��
	//��boolean �� char�� ����ȯ �Ҷ��ؼ� �����Ͽ��� �� �Ҹ����� ����ȯ ���� 
	


	bigW = nWord >= 65 && nWord <= 90;  //�빮��
	smallW = nWord >= 97 && nWord <= 122; //�ҹ���

	//result = (char)((bigW)? nWord:((smallW)? nWord : (char)nWord));

//	result = bigW ? (char)(nWord+= 32) : (smallW ? (char)(nWord -= 32) : (char)(nWord));
	result = (char)(bigW ? (nWord+= 32) : (smallW ? (nWord -= 32) : (nWord)));
    //             ______  ___________  
	//            �빮��t   �ҹ����ڵ�
	//                                   ____________________________________
	//                                        �ƴϸ� ����

	//                                  ________    ____________
	//                                  �ҹ���       �빮���ڵ�
	//                                                             ________
	//                                                             ���ڰ��ڵ�
	//      _____
	//     ��ü�� int�ϱ� char�� �ٲ㼭 ���ڰ����� ���������ȯ
//________
//��� char

	//nWord = (char)nWord;




	//result = '1';
	//smallW = (int)(nWord >= 97 && nWord <= 122);	//�ҹ���
	//ch = (char)nWord; //���ĺ��ƴҶ�

	//result = nWord != (char)(bigW || smallW) ?  ch : (char)(nWord == bigW ? bigW : smallW);

	System.out.printf("%c �� %c\n",newWord,result);  

	/*
	�� ���� �Է� : a
97 �� a
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
	*/

	/*
	�� ���� �Է� : 1
49 �� 1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
	*/






	



	









/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String strUser; //����� ���� ��� ����	
    String result; // ���ڿ� + 10
	String realResult;
	System.out.print(" �� ���� �Է� : ");

	strUser = br.readLine();
	
	
	result = strUser + 10;//_____10


	//���ڿ� �߿� ���ĺ��� ��� �Ÿ���?
	//String �� char, int�� ��ȯ �Ұ�.
	//��� �ù� ���ĺ��� �� ?


	

	realResult = result != "10" ? "���ĺ����Ͷ� ! " : result;
	System.out.println(realResult);
*/
	
	
	//System.out.print(" �� ���� �Է� : ");
	//System.in.read();

	
    

	//String != char

	//System.out.println(strUser+10); //�����϶� ���
	

	//nUser = strUser;
	//���ڿ� �� intŸ������ ��ȯ�� �������� ���ϸ� �������� ����.
	// ����, intŸ���� �ٽ� ���ڷ� ��ȯ�� ��ȯ.

	




/*	int word; //����ڰ� �Է��� ���� ��� ����
	int bigWord, smallWord; //�빮��,�ҹ��� ��� ����

	String strResult; //��� ��� ����

	System.out.print("�� ���� �Է� : ");

	//word = br.readLine();

	//ch == �빮�� ? �빮�� : �ҹ���
	//------------------------------

	//((ch = Integer.paselInt(br.readLine()))) >= 98 &&  ((ch = Integer.paselInt(br.readLine())) <=122) // �빮��
	//((ch = Integer.paselInt(br.readLine()))) >= 65 &&  ((ch = Integer.paselInt(br.readLine())) <=90)  // �ҹ���

	bigWord = ((word = Integer.paselInt(br.readLine()))) >= 98 &&  ((word = Integer.paselInt(br.readLine())) <=122);
	smallWord = ((word = Integer.paselInt(br.readLine()))) >= 65 &&  ((word = Integer.paselInt(br.readLine())) <=90);

	bigWord +=32;
	smallWord -=32;

*/

/*   String s; 
   char a = 'A';
   int b;

   b = a; //A �� 65


   System.out.print("�� ���� �Է� : ");

   s = br.readLine();
   System.out.println(s);
   System.out.println(a);
   System.out.println(b);

	//System.out.printf("%s �� %s\n",word,strResult);

*/	

	





	}
}
/*
�� ���� �Է� : a
a �� A
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


�� ���� �Է� : A
A �� a
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ���� �Է� : 7
7 �� 7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ���� �Է� : ?
? �� ?
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


���� ���п� Ǯ���� ������ �ߴ�. .. �ù�.. ������ƴ�

*/