package study.day0303;

import java.util.Scanner;

public class Ex9ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []members= {"이효리","강호동","손미나","손흥민","강호순",
				"이진","박재범","이효순","박재순","손예진","김순자","김말자",
				"이진상","박진상","손진상","마이클","재니퍼","재니슨","마이콜","이순자"};
		
		Scanner sc=new Scanner(System.in);
		String name;
		int count=0;
		
		/*
		 *  이름의 앞글자를 앞글자를 입력시 그 단어로 시작하는 이름들을 출력하고
		 *  그 인원수를 출력하시오
		 *  
		 *  (예)
		 *     검색할 이름은? 강호
		 *     
		 *     1:강호동
		 *     4:강호순
		 *     
		 *     총 2명
		 *     
		 *     없을경우   '강호' 로 시작하는 회원님은 없습니다
		 */
		
		System.out.println("검색할 이름 입력");
		name=sc.nextLine();
		
		for(int i=0;i<members.length;i++)
		{
			if(members[i].startsWith(name))
			{
				count++;
				System.out.println(i+":"+members[i]);
			}
		}
		
		if(count==0)
			System.out.println("\'"+name+"\' 로 시작하는 회원님은 없습니다!");
		else
			System.out.println("총 "+count+"명");
		
	}

}















