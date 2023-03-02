package study.day0302;

public class Ex8Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *         *
		 *        **
		 *       ***
		 *      ****
		 *     *****
		 * 
		 */
		for(int i=1;i<=5;i++)
		{
			for(int sp=i;sp<5;sp++)//공백은 4,3,2,1,0
				System.out.print(' ');
			
			for(int j=1;j<=i;j++)//* 는 1,2,3,4,5
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("=".repeat(20));
		/*
		 *          *
		 *         ***
		 *        *****
		 *       *******
		 *      *********  
		 * 
		 */
		for(int i=1;i<=5;i++)
		{
			//공백은 4,3,2,1,0
			for(int sp=i;sp<5;sp++)
				System.out.print(' ');
			//*출력이 1,3,5,7,9
			for(int j=0;j<i*2-1;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}












