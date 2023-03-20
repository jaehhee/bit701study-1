package study.day0320;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex3OracleShopCRUD {
	static final String ORACLE_DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String ORACLE_URL="jdbc:oracle:thin:@localhost:1521:xe";
	//static final String ORACLE_URL="jdbc:oracle:thin:@192.168.0.24:1521:xe";// 강사 pc
	
	Scanner sc=new Scanner(System.in);
	
	Ex3OracleShopCRUD()
	{
		try {
			Class.forName(ORACLE_DRIVER);
			//System.out.println("오라클 드라이버 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 실패:"+e.getMessage());
		}
	}
	
	public Connection getConnection()
	{
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(ORACLE_URL, "angel", "a1234");
			//System.out.println("로칼 오라클 연결 성공");
		} catch (SQLException e) {
			System.out.println("로칼 오라클 연결 실패:"+e.getMessage());
		}
		return conn;
	}

	public int getMenu()
	{
		int menu=0;
		System.out.println(" ** Shop 메뉴 **");
		System.out.println("1. 상품 추가");
		System.out.println("2. 상품 조회");
		System.out.println("3. 상품 수정");
		System.out.println("4. 상품 삭제");
		System.out.println("5. 종료");
		menu=Integer.parseInt(sc.nextLine());		
		return menu;
	}

	public void addSangpum()
	{
		
		System.out.println("상품명은?");
		String sangpum=sc.nextLine();
		System.out.println("색상은?");
		String color=sc.nextLine();
		System.out.println("수량은?");
		int su=Integer.parseInt(sc.nextLine());
		System.out.println("단가는?");
		int dan=Integer.parseInt(sc.nextLine());		
		
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		String sql="insert into shop (num,sangpum,color,su,dan,today) values (seq_test.nextval,?,?,?,?,sysdate)";	
		
		try {
			pstmt=conn.prepareStatement(sql);//statement 생성시 sql문 검사
			
			//? 갯수만큼 데이타 바인딩 ? 는 1,2,3,4 순서
			pstmt.setString(1, sangpum);
			pstmt.setString(2, color);
			pstmt.setInt(3, su);
			pstmt.setInt(4, dan);
			//실행
			pstmt.execute();
			System.out.println(sangpum+" 상품이 추가되었습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {				
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(SQLException e) {}
		}		
	}
	
	public void selectShop()
	{
		
	}
	
	public void updateSangpum()
	{
		
	}
	
	public void deleteSangpum()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3OracleShopCRUD ex=new Ex3OracleShopCRUD();
		
		while(true)
		{
			switch (ex.getMenu()) {
			case 1:
				ex.addSangpum();
				break;
			case 2:
				ex.selectShop();
				break;
			case 3:
				ex.updateSangpum();
				break;
			case 4:
				ex.deleteSangpum();
				break;
			default:
				System.out.println("** 프로그램을 종료합니다");
				System.exit(0);
			}
		}
	}

}











