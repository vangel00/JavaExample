package mysqlDBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class memberInsert { 
	
	private static Connection conn;
    private static PreparedStatement pstmt;
	private static ResultSet rs;  

	//회원 정보 입력 시스템 개발

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
	    
	    //2.입력 프로그램 작성
	    	    
	    try {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("아이디를 입력해 주세요.");
	    	String id = sc.next();
	    	System.out.println("이름을 입력해 주세요.");
	    	String name = sc.next();
	    	System.out.println("키를 입력해 주세요.");
	    	float height = sc.nextFloat();
	    	System.out.println("몸무게를 입력해 주세요.");
	    	float weight = sc.nextFloat();
	    	System.out.println("나이를 입력해 주세요.");
	    	int age = sc.nextInt();
	    		    	
	    	pstmt = conn.prepareStatement("insert into member values(?, ?, ?, ?, ?)");
	    			pstmt.setString(1, id); 
	    			pstmt.setString(2, name);
	    			pstmt.setFloat(3, height);
	    			pstmt.setFloat(4, weight);
	    			pstmt.setInt(5, age); 
	    	
			pstmt.executeUpdate();//insert, update, delete 사용
			System.out.println("데이터 입력이 성공하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("입력 데이터가 문제이거나 SQL문장이 잘못되었습니다.!!!");
		}
		

	}

}
