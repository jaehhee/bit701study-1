package study.day0302;

import java.util.Scanner;

public class Ex10Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int menu,dan;
		
		while(true) {
			System.out.println("1.구구단입력후출력  2.전체구구단  3.종료");
			menu=sc.nextInt();
			
			if(menu==1) {
				//조건 : 2~9 사이 숫자 입력시 해당 구구단 출력
				//그 값을 벗어날경우 "잘못입력했어요" 메세지 나온후 다시 메뉴가 나오도록 하기
				System.out.println("구구단 입력");
				dan=sc.nextInt();
				if(dan<2 || dan>9)
				{
					System.out.println("잘못 입력했어요");
					continue;
				}else {
					System.out.println("** "+dan+" 단 **\n");
					for(int i=1;i<=9;i++)
					{
						System.out.printf("%d x %2d = %2d\n",dan,i,dan*i);
					}
					
				}
				
			}else if(menu==2)
			{
				//구구단 제목부분
				for(dan=2;dan<=9;dan++)
				{
					System.out.printf("%d 단\t",dan);
				}
				System.out.println();
				//2~9단을 가로방향으로 출력
				for(int i=1;i<=9;i++)
				{
					for(dan=2;dan<=9;dan++)
					{
						System.out.printf("%dx%d=%2d\t",dan,i,dan*i);
					}
					System.out.println();
				}
				
			}else {
				System.out.println("** 프로그램 종료 **");
				break;
			}
		}
	}

}















