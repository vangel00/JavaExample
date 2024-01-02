package oracleDBTest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class registerInsert { 
	
	private static Connection conn;
    private static PreparedStatement pstmt;
	private static ResultSet rs;  

	//회원 정보 입력 시스템 개발

	public static void main(String[] args) {
			
		//1.드라이버 로딩 및 연결정보 설정
		String driver = "oracle.jdbc.OracleDriver";
	    String url = "jdbc:oracle:thin:@localhost:1521:xe";// fullVersion => orcl  
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
	    	System.out.println("학번을 입력해 주세요.");
	    	int hakbun = sc.nextInt();
	    	System.out.println("과목을 입력해 주세요.");
	    	String kwamok = sc.next();
	    	System.out.println("반을 입력해 주세요.");
	    	String ezenclass = sc.next();
	    	System.out.println("중간고사점수를 입력해 주세요.");
	    	int medsungjuk = sc.nextInt();
	    	System.out.println("기말고사점수를 입력해 주세요.");
	    	int finsungjuk = sc.nextInt();
	    	
	    	pstmt = conn.prepareStatement("insert into register values(?, ?, ?, ?, ?)");
	    			pstmt.setInt(1, hakbun); 
	    			pstmt.setString(2, kwamok);
	    			pstmt.setString(3, ezenclass);
	    			pstmt.setInt(4, medsungjuk);
	    			pstmt.setInt(5, finsungjuk); 
	    	
			pstmt.executeUpdate();//insert, update, delete 사용
			System.out.println("데이터 입력이 성공하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("입력 데이터가 문제이거나 SQL문장이 잘못되었습니다.!!!");
		}
		

	}

}
