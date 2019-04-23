package com.rjm.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.rjm.util.DBConnector;

import xcom.rjm.point.AccountDAO;
import xcom.rjm.point.AccountDTO;
import xcom.rjm.point.MemberDAO;
import xcom.rjm.point.MemberDTO;

public class MemberDAOtest {

	@Test
	public void test() {
		MemberDAO mDAO = new MemberDAO();
		MemberDTO mDTO = new MemberDTO();
		mDTO.setId("account01");
		mDTO.setPw(99);
		mDTO.setMem_name("Member01");
		mDTO.setPhone(010 - 1234 - 5678);
		mDTO.setEmail("abcdef@ghij.com");
		Connection con = null;
		int result = 0;
		try {
			con = DBConnector.getConnection();
			con.setAutoCommit(false);

			result = mDAO.insert(mDTO, con);
			if (result < 1) {
				throw new Exception();
			}

			AccountDAO aDAO = new AccountDAO();
			AccountDTO aDTO = new AccountDTO();
			
			

			if (result < 1) {
				throw new Exception();
			}  

			con.commit();

		} catch (Exception e) {
			con.rollback();
		} finally {
			con.close();
			con.setAutoCommit(true);
		}
		assertEquals(1, result);

	}
}