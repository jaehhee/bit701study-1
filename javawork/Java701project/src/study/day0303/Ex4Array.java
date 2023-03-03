package study.day0303;

public class Ex4Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr=new int[3][3];//3행3열
		
		arr[0][0]=5;//0행0열
		arr[1][1]=10;//1행1열
		arr[1][2]=15;//1행2열
		
		System.out.println("행갯수:"+arr.length);
		System.out.println("0번행의 열갯수:"+arr[0].length);
		
		System.out.println("2차원 데이타 출력");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
