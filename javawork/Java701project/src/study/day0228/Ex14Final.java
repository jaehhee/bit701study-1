package study.day0228;

public class Ex14Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=90;
		final String MESSAGE="Happy Day";
		//변수는 값 변경이 가능하다
		score=100;
		//final 상수는 값변경이 불가능하다
		//MESSAGE="Nice";  //final 상수는 수정이 오류발생
		
		System.out.println(score+","+MESSAGE);
		
	}

}
