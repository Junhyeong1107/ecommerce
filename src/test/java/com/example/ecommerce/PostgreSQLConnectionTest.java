package com.example.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

public class PostgreSQLConnectionTest {
	private String URL = "jdbc:postgresql://localhost:5432/ecommerce";
	private String USERNAME = "postgres"; //postgresql 계정
	private String PASSWORD = "ahWl0119@@"; //비밀번호
	
	@Test
	public void ConnectionTest() throws Exception{
		Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD); //db 연결
		System.out.println(con); //연결 정보 출력
		Statement pre = con.createStatement();
		ResultSet rs = pre.executeQuery("select * from products");

		if (rs.next()) {
		    System.out.println(rs);
		    System.out.println(rs.getString("id"));
		}
	}
}