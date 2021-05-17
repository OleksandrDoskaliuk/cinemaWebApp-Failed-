package com.epam.learn.cinema.dao.util.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import ua.lvil.learn.epam.odoskaliuk.cinema.db.util.ConnectionCreator;

public class ConnectionCreatorTest {
	@Test
	public void createConnectionTest() {
		Connection expectedConnection = null;
		try {
			expectedConnection = ConnectionCreator.createConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(expectedConnection);
		if (expectedConnection != null) {
			try {
				expectedConnection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
