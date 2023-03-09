package study.day0309;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex7ScoreRead {
	static final String FILENAME="d:/bit701naver/score.txt";
	public static void scoreRead()
	{
		/*
		 *   총 10 개의 점수 읽음
		 *   90 67 100..... (한줄에 5개씩 출력)
		 *   총점 : xxxx
		 *   평균 : xxx.x
		 */
		FileReader fr=null;
		BufferedReader br=null;
		int count=0;
		int sum=0;
		double avg=0;
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			int idx=1;
			while(true)
			{
				String scores=br.readLine();
				if(scores==null || scores.length()==0)
					break;
				
				try {
					sum+=Integer.parseInt(scores);//예외발생시 try 내의 나머지 코드 실행 안함
					
					System.out.printf("%5s",scores);				
					
					if(idx++ %5==0)
						System.out.println();
					count++;
				}catch(NumberFormatException e) {
					//System.out.println("문자포함된 숫자 발견");
				}
				
			}
			avg=(double)sum/count;
			System.out.println();
			System.out.println("총 갯수 : "+count+"개");
			System.out.println("합계:"+sum);
			System.out.printf("평균 : %5.1f\n",avg);
			
			
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
		scoreRead();
	}

}








