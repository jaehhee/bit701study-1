package study.day0310;

//T 로 String 이 전달될경우 멤버변수는 String의 배열 타입이되고
// Integer 로 전달될경우 멤버변수는 Integer 의 배열 타입이 된다
class GenericType<T>
{
	T[] v;
	
	public void setV(T[] v) {
		this.v = v;
	}
	
	public void print()
	{
		for(T n:v)
		{
			System.out.println(n);
		}
		System.out.println("=".repeat(30));
	}
}

public class Ex4Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []colors= {"red","green","blue","yellow"};
		GenericType<String> list1=new GenericType<>();
		list1.setV(colors);
		list1.print();
		
		Integer []nums= {100,300,200,67};
		GenericType<Integer> list2=new GenericType<>();
		list2.setV(nums);
		list2.print();
	}

}














