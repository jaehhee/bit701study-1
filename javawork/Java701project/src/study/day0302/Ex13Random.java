package study.day0302;

import java.util.Random;
import java.util.Scanner;

public class Ex13Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int su,cnt,rnd;
		char ans;
		/*
		 * 1~100 사이의 난수를 10회이내에 맞추기
		 * 정답을 맞췄을경우
		 * "계속하려면 y,그만하려면 n
		 * y면 다른 난수 발생 ,cnt도 초기화등등
		 * n이면 프로그램 종료
		 */
		
		Exit:
			while(true)
			{
				//1~100 사이 새로운 난수 구하기
				rnd=r.nextInt(100)+1;
				//입력횟수 초기화
				cnt=0;
				
				while(true)
				{
					System.out.print(++cnt+"회:");
					//숫자다음에 문자열 입력시 엔터때문에 문제가 발생
					//그래서 한줄을 문자열로 읽은후 정수로 변환함
					su=Integer.parseInt(sc.nextLine());
					
					if(su>rnd)
						System.out.println("\t"+su+"보다 작습니다");
					else if(su<rnd)
						System.out.println("\t"+su+"보다 큽니다");
					else {
						System.out.println("\t정답입니다("+rnd+")");
						System.out.println("계속하려면 y,그만하려면 n을 눌러주세요");
						ans=sc.nextLine().charAt(0);
						if(ans=='y') {
							System.out.println("새로운 난수 발생!!!!");
							continue Exit;//바깥쪽 while문의 처음으로 간다
						}
						else
							break Exit;//다중 while문을 빠져나간다
							
					}
					
					//횟수 비교
					if(cnt>=10)
					{
						System.out.println("시간이 초과되었습니다. 현재 게임은 종료!");
						System.out.println("계속하려면 y,그만하려면 n을 눌러주세요");
						ans=sc.nextLine().charAt(0);
						if(ans=='y') {
							System.out.println("새로운 난수 발생!!!!");
							continue Exit;//바깥쪽 while문의 처음으로 간다
						}
						else
							break Exit;//다중 while문을 빠져나간다
					}
				}
			}
		
		System.out.println("** 프로그램 종료 **");
	}

}











