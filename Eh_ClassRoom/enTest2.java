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
        System.out.println("num입력");
        num = input.nextInt();
 
        System.out.println("str입력");
        str = input.nextLine();
 
        System.out.println("num : " + num);
        System.out.println("str : " + str);


/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 입력 : ");

		char ch,ch2;
		String str;
		int n, n2;
	
		
		n = System.in.read(); //read()는 int로 저장하니까.
		//str = br.readLine(); //readLine()은 str로 저장하니까

		System.out.print("또 문자 입력해바 : ");

		//n2 = input.nextInt();


		System.out.println(n);
		//System.out.println(n2);
		//System.out.println(str);
*/
	}
}

/*
문자 입력A
65

계속하려면 아무 키나 누르십시오 . . .

→ System.in.read(); 만 출력.
→ BufferedReader가 있어도 System.in.read();은 쓸 수 있구나!!

→ next();는 Scanner에서 씀.
→ 다음 출력때 저장됨.
*/