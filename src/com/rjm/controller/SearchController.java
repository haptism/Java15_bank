package com.rjm.controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import com.rjm.bankbook.BankbookDAO;
import com.rjm.bankbook.BankbookDTO;
import com.rjm.history.HistoryDAO;
import com.rjm.history.HistoryDTO;
import com.rjm.util.DBConnector;
import com.rjm.view.BankView;

public class SearchController {

	BankView v;
	Scanner sc;
	BankbookDAO bDao;
	BankbookDTO bDto;
	HistoryDAO hDao;
	HistoryDTO hDto;
	Connection conn;

	public SearchController() {
		v = new BankView();
		sc = new Scanner(System.in);
		bDao = new BankbookDAO();
		bDto = new BankbookDTO();
		hDao = new HistoryDAO();
		hDto = new HistoryDTO();
	}

	public void searchSelect(String account) throws Exception {
		conn = DBConnector.getConnector();
		ArrayList<HistoryDTO> arr;

		v.view("1.전체조회 / 2.입금조회 / 3.출금조회  ");
		int select = sc.nextInt();

		switch (select) {
		case 1:
			bDto = bDao.select(account, conn);
			arr = hDao.select(account, conn);
			conn.close();
			if (!bDto.equals(null) && !arr.equals(null)) {
				v.view(bDto);
				v.view(arr);
			} else
				v.view("정보가 없음");
			break;
		case 2:
			arr = hDao.select(account, 1, conn);
			v.view(arr);
			break;
		case 3:
			arr = hDao.select(account, 0, conn);
			v.view(arr);
			break;
		default:
			v.view("1~4중 선택하세요");
		}

	}
}
