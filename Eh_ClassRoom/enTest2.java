import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class enTest2
{
	public static void main(String[] args) throws IOException
	{

	 Scanner input = new Scanner(System.in);
 
        int num;
        String str;
        System.out.println("num�Է�");
        num = input.nextInt();
 
        System.out.println("str�Է�");
        str = input.nextLine();
 
        System.out.println("num : " + num);
        System.out.println("str : " + str);


/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");

		char ch,ch2;
		String str;
		int n, n2;
	
		
		n = System.in.read(); //read()�� int�� �����ϴϱ�.
		//str = br.readLine(); //readLine()�� str�� �����ϴϱ�

		System.out.print("�� ���� �Է��ع� : ");

		//n2 = input.nextInt();


		System.out.println(n);
		//System.out.println(n2);
		//System.out.println(str);
*/
	}
}

/*
���� �Է�A
65

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� System.in.read(); �� ���.
�� BufferedReader�� �־ System.in.read();�� �� �� �ֱ���!!

�� next();�� Scanner���� ��.
�� ���� ��¶� �����.
*/