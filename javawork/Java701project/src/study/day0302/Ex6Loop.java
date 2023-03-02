package study.day0302;

public class Ex6Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1~20까지의 숫자중 3의배수만 출력 (printf("%4d",변수))
		for(int i=1;i<=20;i++) {
			if(i%3==0)
				System.out.printf("%4d",i);
		}
		System.out.println();
		//2. 10~1 까지 거꾸로 출력
		for(int i=10;i>=1;i--)
			System.out.printf("%4d",i);
		System.out.println();
		//3. 1~30까지 숫자중 5의 배수만 출력
		for(int i=1;i<=30;i++) {
			if(i%5==0)
				System.out.printf("%4d",i);
		}
		System.out.println();
		//4. * 20개 출력
		for(int i=1;i<=20;i++)
			System.out.print('*');
		System.out.println();
		
		//5. 1~20 까지중 홀수만 출력
		for(int i=1;i<=20;i+=2)
			System.out.printf("%4d",i);
	}

}










