package mysqlDBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class memberTotalmethod {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private void DBConnection() {
		//드라이버 로딩 및 연결정보 설정
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
		
	}
	
	private void memberSelect() {
	    //조회 프로그램 작성	    
	    try {
	    	
	    	DBConnection();
	    	
	    	String sql = "select * from member order by id desc";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL문장이 잘못되었습니다.!!!");
		}
	    
	    //3.결과 출력 부분
	    
	    System.out.println("--------- 회원 정보 조회 시스템 ---------");
	    System.out.println("-------------------------------------");
	    try {
			while(rs.next()) {
				String id = rs.getString(1);//(1)
				String name = rs.getString(2);//(2)
				double height = rs.getDouble(3);//(3)
				double weight = rs.getDouble("weight");
				int age = rs.getInt("age");
				
				System.out.println(id + "\t" + name + "\t" + height + "\t" + weight + "\t" + age); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    System.out.println("-------------------------------------");		
	}
	
	private void memberInsert() {
		//입력 프로그램 작성	    
	    try {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("아이디를 입력해 주세요.");
	    	String id = sc.next();
	    	System.out.println("이름을 입력해 주세요.");
	    	String name = sc.next();
	    	System.out.println("키를 입력해 주세요.");
	    	double height = sc.nextDouble();
	    	System.out.println("몸무게를 입력해 주세요.");
	    	double weight = sc.nextDouble();
	    	System.out.println("나이를 입력해 주세요.");
	    	int age = sc.nextInt();
	    		    	
	    	pstmt = conn.prepareStatement("insert into member values(?, ?, ?, ?, ?)");
	    			pstmt.setString(1, id); 
	    			pstmt.setString(2, name);
	    			pstmt.setDouble(3, height);
	    			pstmt.setDouble(4, weight);
	    			pstmt.setInt(5, age); 
	    	
			pstmt.executeUpdate();//insert, update, delete 사용
			System.out.println("데이터 입력이 성공하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("입력 데이터가 문제이거나 SQL문장이 잘못되었습니다.!!!");
		}		
	}
	
	private void memberDelete() {
		 //삭제 프로그램 작성
	    
	    try {
	    	
	    	DBConnection();
	    	
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("삭제 할 아이디를 입력해 주세요.");
	    	String id = sc.next();
	    		    		    	
	    	//pstmt = conn.prepareStatement("update member set name=?, height=?, weight=?, age=? where id=?");
	    	String sql = "delete from member where id=?";
	    		pstmt = conn.prepareStatement(sql);
	    		
	    			pstmt.setString(1, id); 	    			
	    	
			pstmt.executeUpdate();//insert, update, delete 사용
			System.out.println("데이터 삭제가 성공하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("삭제 아이디 데이터가 문제이거나 SQL문장이 잘못되었습니다.!!!");
		}
		
	}

	private void memberUpdate() {
		 //수정 프로그램 작성	    
	    try {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("수정 할 아이디를 입력해 주세요.");
	    	String id = sc.next();
	    	System.out.println("이름을 입력해 주세요.");
	    	String name = sc.next();
	    	System.out.println("키를 입력해 주세요.");
	    	double height = sc.nextDouble();
	    	System.out.println("몸무게를 입력해 주세요.");
	    	double weight = sc.nextDouble();
	    	System.out.println("나이를 입력해 주세요.");
	    	int age = sc.nextInt();
	    		    	
	    	//pstmt = conn.prepareStatement("update member set name=?, height=?, weight=?, age=? where id=?");
	    	String sql = "update member set name=?, height=?, weight=?, age=? where id=?";
	    		pstmt = conn.prepareStatement(sql);
	    		
	    			pstmt.setString(1, name); 
	    			pstmt.setDouble(2, height);
	    			pstmt.setDouble(3, weight);
	    			pstmt.setInt(4, age);
	    			pstmt.setString(5, id); 
	    	
			pstmt.executeUpdate();//insert, update, delete 사용
			System.out.println("데이터 수정이 성공하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("수정 데이터가 문제이거나 SQL문장이 잘못되었습니다.!!!");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		memberTotalmethod mtm = new memberTotalmethod();
		boolean stop = true;
		
		while(stop) {
			System.out.println("---------------------");
			System.out.println("1.회원정보 조회");
			System.out.println("2.회원정보 입력");
			System.out.println("3.회원정보 수정");
			System.out.println("4.회원정보 삭제");
			System.out.println("5.회원정보 시스템 종료");
			System.out.println("---------------------");
			
			Scanner sc = new Scanner(System.in);
			String x = sc.next();
			
			switch(x) {
			case "1": mtm.memberSelect(); break;
			case "2": mtm.memberInsert(); break;
			case "3": mtm.memberUpdate(); break;
			case "4": mtm.memberDelete(); break;
			case "5": stop = false;
			 
			}
			
		}

	}

	
}
