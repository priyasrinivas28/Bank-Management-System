package com.capgemini.trg.dao;

import com.capgemini.trg.entity.User;
import com.capgemini.trg.exception.UserException;

public interface IUserDAO {
	public abstract User getUserDetails(Integer userid) 
			throws UserException;
	public abstract Boolean isValidUser(String username,String password) 
			throws UserException;
	public abstract Integer addUserDetails(User user) 
			throws UserException;
	
}
