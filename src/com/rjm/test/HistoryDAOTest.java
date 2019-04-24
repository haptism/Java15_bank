package com.rjm.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.rjm.bankbook.BankbookDAO;
import com.rjm.bankbook.BankbookDTO;
import com.rjm.util.DBConnector;

public class HistoryDAOTest {

	@Test
	public void insertTest() throws Exception {
		// 입금내역추가
		Connection conn = DBConnector.getConnector();
		BankbookDAO dao = new BankbookDAO();
		BankbookDTO dto = new BankbookDTO();

		dto.setId("a");
		dto.setAccount("110-361-1111111");
		dto.setCreate_date("2019-04-23");
		dto.setAcc_name("a");
		dto.setBalance(1000);

		int result = dao.insert(dto, conn);
	}

}
