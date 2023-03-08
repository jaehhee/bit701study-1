package study.day0308;

//class 가 class 를 상속받을때 extends
//interface 가 interface 를 상속받을때 extends
//class 가 interface 를 구현할때 implements

interface Kiwi
{
	public void play();
}

interface Manggo extends Kiwi
{
	public void study();
}

class Banana
{
	public void eat()
	{
		System.out.println("바바나를 먹어요");
	}
}

class Berry extends Banana implements Manggo
{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("우리 다같이 놀아요!");
	}
	
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("자바 공부를 합시다!");
	}
}

public class Ex8Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manggo m=new Berry();
		m.play();
		m.study();
		
		Banana b=new Berry();
		b.eat();
		
		Berry b2=new Berry();
		b2.eat();
		b2.play();
		b2.study();
		
	}

}









