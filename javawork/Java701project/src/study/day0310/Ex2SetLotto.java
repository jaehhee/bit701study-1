package study.day0310;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex2SetLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		Set<Integer> setLotto=new TreeSet<>();
		
		//1~45 의 난수 6개를 구한후 오름차순으로 출력
		while(true)
		{
			setLotto.add(r.nextInt(45)+1);
			if(setLotto.size()==6)
				break;
		}
		
		System.out.println("** 로또 숫자 구하기 **");
		for(int a:setLotto)
			System.out.printf("%5d",a);
		
	}

}
