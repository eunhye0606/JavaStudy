 /*===============================================
	  ■■■ 정렬(Sort) 알고리즘 ■■■
================================================*/ 
// 향상된 버블 정렬(Bubble Sort)


// ※ 앞에서 본 Selection Sort(Test109) 이나 Bubble Sort(Test110)의 성능은 같다.
//    성능은 소스코드로 평가되지 않음.
//    반복의 횟수로 평가
//    (→ 반복의 횟수로 추정)
//    반복의 횟수가 같음. 1회전 ~ 4회전

//    하지만, 향상된 Bubble Sort는 대상 데이터의 구조에 따라서
//    일반 Bubble Sort 나 Selection Sort 보다 성능이 좋을 수 있다.

// 원본 데이터 : 61 15 20 22 30
//				 15 20 22 30 61	- 1회전(스왑 발생 → true → 다음 회전 진행 O)	
//				 15 20 22 30 61	- 2회전(스왑 발생 → false → 다음 회전 진행 X)
//               → 반복문 덜 하겠지? ㅇㅋ

//==> 1회전 수행 ... 2회전 수행 ... 을 해보았더니 ...
//    2회전에서 스왑(자리바꿈)이 전혀 일어나지 않았기 때문에
//    불필요한 추가 연산(더 이상의 회전)은 무의미한 것으로 판단하여
//    수행하지 않는다.


// 실행 예)
// Source Data : 10 50 20 30 40
// Sorted Date : 10 20 30 40 50




public class Test111
{
	public static void main(String[] args)
	{
		int [] a = {10, 50, 20, 30, 40};
		/*
		10, 50, 20, 30, 40
		== --
		10, 20, 50, 30, 40
		    ==  --
		10, 20, 30, 50, 40
		        ==  --
		10, 20, 30, 40, 50
		            ==  --
	    ------------------------1회전 → 스왑 발생
		10, 20, 30, 40, 50
		==  --
		10, 20, 30, 40, 50
			==  --
		10, 20, 30, 40, 50
				==  --
		------------------------2회전 → 스왑 발생하지 않음.

				X

				X
		
		------------------------3회전 → X
		
				X

		------------------------4회전 → X
		*/
		//Source Data
		System.out.print("Source Data : ");
		for (int n:a)
		{
			System.out.print(n + " ");
		}
		System.out.println();

		// 향상된 Bubble Sorted
		int pass =0;
		boolean flag;

		do	//-- do ~ while 쓰는 이유, 1회전은 반드시함. break를 안해도됨.
		{
			flag = false; // 이번 회전에서는 자리 바꿈이 일어나지 않을 것이다...
			pass ++;
		
			for (int i = 0;i<a.length-pass ;i++ )	//반복문하나로 버블Sort만들기!
			{
				//System.out.println("쑝");
				if (a[i] > a[i+1])
				{
					// 자리 바꾸기.
					a[i] = a[i]^a[i+1];
					a[i+1] = a[i+1]^a[i];
					a[i] = a[i]^a[i+1];
				
					flag = true;
					// -- 단 한번이라도 스왑(자리바꿈)이 발생하게 되면
					//    flag 변수는 true로 변경..!!
				}
			}
		}
		while (flag);
		// -- flag 변수가 false 라는 것은
		//    회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은 경우로
		//    더 이상의 반복문 수행은 무의미한 것으로 판단 가능





		/* 내코드
		int i,j;
		boolean sw=false; //-- 스왑 발생 판단. false이면 스왑 발생 ㄴㄴ

		for (i = 1;i<a.length ;i++ )							//i는 1          2           3           4
		{
			sw = false; // -- 자리 바꾸기 전에 false로 초기화.
						// -- 혹은 누적곱이나 누적합도 될듯 ?
						// -- 결국 j 반복문 들어가기 전에 초기화 시켜서 
						//    그 조건이 0이든 f이든 하면 break; 걸어라 하면 되지 않을까?
			
			for (j=0;j<a.length-i ;j++ )					  // j는 0123   012        01          0
			{	
				
				if (a[j]>a[j+1])
				{
					// 자리 바꾸기.
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
					sw = true;
					System.out.println(" j반복문 실행" + i + "회전");
				}
				
				
			}
			if (sw == false)
				{
					break; //-- break를 끼고있는 반복문을 나가라 멈추고 나가라 ~!
				}
				
		}
		*/




		//Sorted Data
		System.out.print("Sorted Data : ");
		for (int n:a)
		{
			System.out.print(n + " ");
		}
		System.out.println();



	}
}

/*
Source Data : 10 50 20 30 40
Sorted Data : 10 20 30 40 50
계속하려면 아무 키나 누르십시오 . . .
*/