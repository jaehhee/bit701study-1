package study.day0306;

class Apple
{
	public String mes1="Hello";
	private String mes2="Happy";//은닉
	public static final String MES="Have a Good Day!";
	
	public String getMes2() {
		return mes2;
	}
	public void setMes2(String mes2) {
		this.mes2 = mes2;
	}
}

public class Ex4Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Apple 이 가진 멤버변수중 new로 생성하지 않아도 접근이 가능한 변수는 누구일까
		System.out.println(Apple.MES);
		
		//인스턴스 멤버변수는 new 로 생성후 접근이 가능하다
		Apple a=new Apple();
		System.out.println(a.mes1);
		//System.out.println(a.mes2);//패키지 상관없이 접근불가(private)
		
		//mes2출력
		System.out.println(a.getMes2());
		//mes2값을 Bitcamp 로 변경
		a.setMes2("Bitcamp");
		
		//mes2변경된값을 다시 출력
		System.out.println(a.getMes2());
	}

}



















