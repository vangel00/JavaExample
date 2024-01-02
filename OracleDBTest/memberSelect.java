package oracleDBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class memberSelect { 
	
	private static Connection conn;
    private static PreparedStatement pstmt;
	private static ResultSet rs;  

//회원관리 조회시스템 개발

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
	    
	    //2.조회 프로그램 작성
	    	    
	    try {
	    	String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL문장이 잘못되었습니다.!!!");
		}
	    
	    //3.결과 출력 부분
	    try {
			while(rs.next()) {
				String id = rs.getString("id");//(1)
				String name = rs.getString("name");//(2)
				int height = rs.getInt("height");//(3)
				int weight = rs.getInt("weight");
				int age = rs.getInt("age");
				
				System.out.println(id + "\t" + name + "\t" + height + "\t" + weight + "\t" + age); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    
		

	}

}
