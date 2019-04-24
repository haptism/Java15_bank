package com.rjm.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.rjm.util.DBConnector;

public class DBConnectorTest {

	@Test
	public void test() throws Exception {
		Connection conn = DBConnector.getConnector();

		assertNotNull(conn);
	}

}
