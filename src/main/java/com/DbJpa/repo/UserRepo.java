package com.DbJpa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.DbJpa.entity.*;

public interface UserRepo extends CrudRepository<User, Integer>{
	//select * from user_master where user_country='India';
	public List<User> findByCountry(String name);
	
	//select * from user_master where user_age=32;
	public List<User> findByAge(Integer age);
	
	//select * from
	public List<User> findByAgeGreaterThanEqual(Integer age);
	
	//select * from user_master where user_country in('India','Australia');
	public List<User> findByCountryIn(List<String> countries);
	
	//select * from user_master where user_country='India' and user_age=25;
	public List<User> findByCountryAndAge(String cname,Integer age);
	
	//select * from user_master where usert_country='India' and user_age=25 and user_gender='Male'
	public List<User> findByCountryAndAgeAndGender(String cname,Integer age,String gender);
}
