package study.day0228;

public class Ex6Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//산술연산자 : +,-,*,/,%
		int su1=7;
		int su2=4;
		System.out.printf("%d+%d=%d\n",su1,su2,su1+su2);
		System.out.printf("%d-%d=%d\n",su1,su2,su1-su2);
		System.out.printf("%d*%d=%d\n",su1,su2,su1*su2);
		System.out.printf("%d/%d=%d\n",su1,su2,su1/su2);//자바에서 7/4 는1이다 정수끼리의 계산 결과는 무조건 정수타입
		System.out.printf("%d/%d=%3.1f\n",su1,su2,(double)su1/su2);
		System.out.printf("%d%%%d=%d\n",su1,su2,su1%su2);//printf에서 %자체출력시 %%
		
	}

}
