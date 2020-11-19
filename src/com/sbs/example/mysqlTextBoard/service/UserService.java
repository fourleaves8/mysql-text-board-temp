package com.sbs.example.mysqlTextBoard.service;

import com.sbs.example.mysqlTextBoard.container.Container;
import com.sbs.example.mysqlTextBoard.dao.UserDao;
import com.sbs.example.mysqlTextBoard.dto.User;

public class UserService {

	private UserDao userDao;

	public UserService() {
		userDao = Container.userDao;
	}

	public int doJoin(String accountName, String accountPW, String name) {
		return userDao.add(accountName, accountPW, name);
	}

	public boolean isValidAcctName(String accountName) {
		User user = userDao.getUserByAcctName(accountName);
		if (user != null) {
			return false;
		}
		return true;
	}

}
