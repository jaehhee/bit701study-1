package study.day0303;

public class Ex1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []ch;//배열 선언,메모리할당이 안되있어서 이상태로는 데이타 저장 불가
		ch=new char[4];//메모리 할당, 총 4개의 char문자를 저장할수 있다,할당과 동시에 초기값 지정(0)
		//할당된 배열에 데이타 넣기
		ch[0]='A';
		ch[1]='J';
		ch[2]='N';
		ch[3]='L';
		
		//출력 #1
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]+":"+(int)ch[i]);
		}
		System.out.println("=".repeat(20));
		//출력 #2
		for(char a:ch)
		{
			System.out.println(a+":"+(int)a);
		}
	}

}
