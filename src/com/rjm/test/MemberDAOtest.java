package com.rjm.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.rjm.bankbook.BankbookDTO;
import com.rjm.member.MemberDAO;
import com.rjm.member.MemberDTO;
import com.rjm.util.DBConnector;

public class MemberDAOTest {

	// @Test
	public void insetTest() throws Exception {
		Connection conn = DBConnector.getConnector();
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();

		dto.setId("a");
		dto.setPw("a");
		dto.setName("a");
		dto.setPhone("010-1111-1111");
		dto.setEmail("a@a.com");

		int result = dao.insert(dto, conn);
	}

}
