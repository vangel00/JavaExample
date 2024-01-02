package mysqlDBTest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class registerDelete { 
	
	private static Connection conn;
    private static PreparedStatement pstmt;
	private static ResultSet rs;  

	//회원 정보 삭제 시스템 개발

	public static void main(String[] args) {
			
		//1.드라이버 로딩 및 연결정보 설정
		String driver = "com.mysql.cj.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/hyunDB";
	    String userid = "hyun";
	    String userpw = "1234";
	    
	    try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공~~~");
			
			try {
				conn = DriverManager.getConnection(url, userid, userpw);
				System.out.println("연결 성공하였습니다.");
			} catch (SQLException e) {				
				e.printStackTrace();
				System.out.println("url, userid, userpw가 설정이 잘못되었습니다.");
			}			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    
	    //2.삭제 프로그램 작성
	    	    
	    try {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("삭제 할 학번을 입력해 주세요.");
	    	int hakbun = sc.nextInt();
	    		    		    	
	    	//pstmt = conn.prepareStatement("update member set name=?, height=?, weight=?, age=? where id=?");
	    	String sql = "delete from register where hakbun = ?";
	    		pstmt = conn.prepareStatement(sql);
	    		
	    			pstmt.setInt(1, hakbun); 	    			
	    	
			pstmt.executeUpdate();//insert, update, delete 사용
			System.out.println("데이터 삭제가 성공하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("삭제 아이디 데이터가 문제이거나 SQL문장이 잘못되었습니다.!!!");
		}
		

	}

}
