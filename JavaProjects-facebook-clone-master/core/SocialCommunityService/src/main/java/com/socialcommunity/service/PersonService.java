package com.socialcommunity.service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.hibernate.HibernateException;

import com.socialcommunity.domain.Person;

public interface PersonService {
	
	public List<Person> getAll();
	//public Person get( Integer id );
	public void addUser(String password,Person person) throws NoSuchAlgorithmException;
	//public void delete(Integer id);
	//public void edit(Person person);
	public String checkLogin(String userName, String password) throws HibernateException, NoSuchAlgorithmException;
	public List<Person> getUserInformation(String username);
	public List<Person> getUserNameInformation();
	
	
}
