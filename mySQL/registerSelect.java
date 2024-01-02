package mysqlDBTest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class registerSelect { 
	
	private static Connection conn;
    private static PreparedStatement pstmt;
	private static ResultSet rs;  

//학생 관리 조회 시스템 개발

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
	    
	    //2.조회 프로그램 작성
	    	    
	    try {
	    	String sql = "select * from register order by hakbun";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL문장이 잘못되었습니다.!!!");
		}
	    
	    //3.결과 출력 부분
	    
	    System.out.println("--------- 회원 정보 조회 시스템 ---------");
	    System.out.println("hakbun\tkwamok\tclass\tmsungjuk\tfsungjuk");
	    System.out.println("-------------------------------------");
	    try {
			while(rs.next()) {
				int hakbun = rs.getInt(1);//(1)
				String kwamok = rs.getString(2);//(2)
				String ezenclass = rs.getString(3);//(3)
				int medsungjuk = rs.getInt("medsungjuk");
				int finsungjuk = rs.getInt("finsungjuk");
				
				System.out.println(hakbun + "\t" + kwamok + "\t" + ezenclass + "\t" + medsungjuk + "\t" + finsungjuk); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    System.out.println("-------------------------------------");
		
	}

}
