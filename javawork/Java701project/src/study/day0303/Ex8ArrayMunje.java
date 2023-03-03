package study.day0303;

import java.util.Scanner;

public class Ex8ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []members= {"이효리","강호동","손미나","손흥민","강호순",
				"이진","박재범","이효순","박재순","손예진","김순자","김말자",
				"이진상","박진상","손진상","마이클","재니퍼","재니슨","마이콜","이순자"};
		//System.out.println(members.length);
		
		/*
		 * 검색할 이름을 입력후 몇번째에 있는지 출력
		 * 없을경우 없다는 메세지 출력
		 */
		Scanner sc=new Scanner(System.in);
		String searchName;
		boolean find=false;
		
		System.out.println("검색할 이름 입력");
		searchName=sc.nextLine();
		
		for(int i=0;i<members.length;i++)
		{
			//if(searchName.equals(members[i]))
			if(searchName.compareTo(members[i])==0)//0이면 같다는뜻
			{
				find=true;
				System.out.println(searchName+"님은 "+(i+1)+"번째에 있어요!");
				break;
			}
		}
		
		if(!find)
			System.out.println(searchName+"님은 명단에 없어요!!");
		
	}

}
















