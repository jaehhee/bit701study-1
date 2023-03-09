package study.day0309;

import java.io.FileWriter;
import java.io.IOException;

public class Ex9FileWriter {

	static final String FILENAME="d:/bit701naver/memo.txt";
	
	public static void memoWrite()
	{
		FileWriter fw=null;
		
		try {
			//fw=new FileWriter(FILENAME);//memo.txt가 없을경우 새로 만듬, 있을경우 덮어씀
			fw=new FileWriter(FILENAME,true);//기존 파일에 추가
			fw.write("이름: 이영자\n");
			fw.write("주소:서울시 강동구\n");
			fw.write("핸드폰:010-7777-3333\n");
			fw.write("=====================\n");		
			
			System.out.println("파일탐색기에서 memo.txt 를 확인하세요");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		memoWrite();
	}

}
