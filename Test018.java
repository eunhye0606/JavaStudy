/*==============================================
�����ڹ��� ���� �� Ư¡ ����
=============================================*/
public class Test018
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");
		/*
		AAABBBCCC
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

		*/

		System.out.println();
		//���� 
		//System.out.print(); �����߻�.

		System.out.printf("123");
		System.out.printf("1234\n%n");
		//printf(); == print(); �� ���� �����߻�

		System.out.printf("�ȳ�%d�ϼ���\n",123);




		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123);
		System.out.printf("%8d\n",123);
/*
123
       123
     123
*/

		//��� ������
		System.out.printf("%+d\n",123);
		System.out.printf("+%d\n",123);
/*
+123
+123
*/
		
		System.out.printf("%d\n",+123);
		//123



		//����
		//System.out.printf("%-d\n",365);
		//��Ÿ�� ���� �߻�


		System.out.printf("-%d\n",365);
		System.out.printf("%d\n",-365);
/*
-365
-365
*/

		//System.out.printf("%d\n",'A');
		//ó���� �ƴ϶� ǥ���̴ϱ� �ƽ�Ű���� - int �ƴϾ�
		//��Ÿ�� ���� ��
		
		//���ڴ� %c, ���ڿ��� %s
		System.out.printf("%c\n",'4');
		System.out.printf("%s\n","132232");
/*
4
132232
*/

		System.out.printf("%h\n", 365);
//HEX 16������ �ٲ㼭
//DEC 10����
//OCT 8����
//BIN 2���� �� �̰� ��Ʈ�ڳ� ,,,, 2������ ǥ�� ����?
		System.out.printf("%o\n",365);


		System.out.printf("%b\n", true);
		
		System.out.printf("%.2f\n",123.4344234);
		//�� �ݿø�.

		System.out.printf("%.2f\n", 123.231);
		System.out.printf("%.2f\n", 123.235);
/*
123.23
123.24
*/

		System.out.printf("%8.2f\n", 123.236);
		//  123.24
		//dot�� �ڸ� �ϳ�
		// �տ� �� �ڸ�

		System.out.printf("%2.2f\n",123.236);
		//123.24 
		//���� �� �ڸ����� �츮�ڷ翡 ���� ������
		//�� ���ñ�

		System.out.printf("%3d\n",1231313);
		//1231313
		//int�� ��������


	}
}