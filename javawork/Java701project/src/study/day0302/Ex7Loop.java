package study.day0302;

public class Ex7Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5행5열로 * 출력
		for(int i=1;i<=5;i++)//행
		{
			for(int j=1;j<=5;j++)//열
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=".repeat(20));
		/*
		 *       *
		 *       **
		 *       ***
		 *       ****
		 *       *****
		 */
		
		for(int i=1;i<=5;i++)//행
		{
			for(int j=1;j<=i;j++)//열
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("=".repeat(20));
		/*
		 *           *****
		 *           ****
		 *           ***
		 *           **
		 *           *  
		 */
		for(int i=1;i<=5;i++)//행
		{
			for(int j=i;j<=5;j++)//열
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}







