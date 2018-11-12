package com.capgemini.trg.service;

import com.capgemini.trg.dao.IUserDAO;
import com.capgemini.trg.dao.UserDaoImpl;
import com.capgemini.trg.entity.User;
import com.capgemini.trg.exception.UserException;

public class UserServiceImpl implements IUserService{
	private IUserDAO userDAO=new UserDaoImpl();
	
	@Override
	public User getUserDetails(Integer userid) throws UserException {
		return userDAO.getUserDetails(userid);
	}

	@Override
	public Boolean isValidUser(String username, String password) throws UserException {
			return userDAO.isValidUser(username, password);
	}

	@Override
	public Integer addUserDetails(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
