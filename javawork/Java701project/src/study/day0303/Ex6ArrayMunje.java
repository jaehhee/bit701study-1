package study.day0303;

public class Ex6ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data= {100,78,67,190,-100,89,350,-290,78,200};
		int max=data[0];//첫 데이타를 max 값으로 일단 준다
		int min=data[0];
		
		for(int i=1;i<data.length;i++)
		{
			if(max<data[i])
				max=data[i];
			
			if(min>data[i])
				min=data[i];
		}
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		
	}

}
