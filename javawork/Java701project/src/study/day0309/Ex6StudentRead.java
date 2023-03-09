package study.day0309;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex6StudentRead {
	static final String FILENAME="d:/bit701naver/student.txt";
	
	public static void studentRead()
	{
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			System.out.println("=".repeat(52));
			
			int n=1;
			while(true)
			{
				//한줄씩 읽기
				String data=br.readLine();
				//널이거나 값이 없을경우 빠져나가기
				if(data==null || data.length()==0)
					break;
				
				//, 로 분리하기
				String []arr=data.split(",");
				//총점
				int kor=Integer.parseInt(arr[1]);
				int eng=Integer.parseInt(arr[2]);
				int mat=Integer.parseInt(arr[3]);
				int tot=kor+eng+mat;
				//평균구하기
				double avg=tot/3.0;
				//출력
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%3.1f\n",n++,arr[0],kor,eng,mat,tot,avg);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일없음:"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			}catch(IOException e) {}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentRead();
	}

}








