package study.day0310;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex8ListShopFile {

	static final String FILENAME="d:/bit701naver/shop.txt";
	
	List<ShopDTO> list=new Vector<>();
	Scanner sc=new Scanner(System.in);
	
	public Ex8ListShopFile() {
		// TODO Auto-generated constructor stub
		shopFileRead();
	}
	
	//처음 시작시 파일 읽어서 list 에 담기
	public void shopFileRead()
	{
		//프로그램 시작시 파일에서 데이타를 읽어서 list 에 넣는다
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			while(true)
			{
				String line=br.readLine();
				if(line==null)
					break;
				
				String []data=line.split(",");//, 로 분리(저장형태  딸기,2,1000 )
				//dto 에 각각 분리해서 넣은후 다시 list 에 담기
				ShopDTO dto=new ShopDTO();
				dto.setSangpum(data[0]);
				dto.setSu(Integer.parseInt(data[1]));
				dto.setDan(Integer.parseInt(data[2]));
				
				list.add(dto);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			}catch (IOException e) {
				// TODO: handle exception
			}
		}
		System.out.println("총 "+list.size()+" 개 데이타 가져옴");
		
	}
	
	//종료시 list 의 데이타를 파일에 저장
	public void shopFileSave()
	{
		
	}
	
	//데이타 추가하는 메서드
	public void dataAdd()
	{
		
	}
	
	//전체 출력하는 메서드
	public void shopList()
	{
		
	}
	
	//상품 검색
	public void shopSearch()
	{
		
	}
	
	//상품 삭제
	public void shopDelete()
	{
		
	}
	
	//메뉴
	public int getMenu()
	{
		int menu;
		System.out.println(" ** 메뉴 선택 **");
		System.out.println("1.상품 추가  2.상품전체출력  3.상품검색  4.상품삭제  5.종료");
		try {
			menu=Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e)
		{
			menu=2;//문자로 잘못 입력시 무조건 전체 출력하기
		}
		
		return menu;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex8ListShopFile ex=new Ex8ListShopFile();
		while(true)
		{
			switch (ex.getMenu()) {
			case 1:
				ex.dataAdd();
				break;
			case 2:
				ex.shopList();
				break;
			case 3:
				ex.shopSearch();
				break;
			case 4:
				ex.shopDelete();
				break;
			default:
				ex.shopFileSave();
				System.out.println("** 데이타 저장후 종료합니다 **");
				System.exit(0);
			}
			System.out.println("-".repeat(50));
		}
	}

}





















