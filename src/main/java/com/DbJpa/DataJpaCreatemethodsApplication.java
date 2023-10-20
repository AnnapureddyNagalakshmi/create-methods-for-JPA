package com.DbJpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DbJpa.entity.User;
import com.DbJpa.repo.UserRepo;

@SpringBootApplication
public class DataJpaCreatemethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DataJpaCreatemethodsApplication.class, args);
		UserRepo repo=context.getBean(UserRepo.class);
		User u1=new User(101,"varun","Male",23,"Australia");
		User u2=new User(102,"ammu","Female",13,"India");
		User u3=new User(103,"mohan","Male",32,"India");
		User u4=new User(104,"geethu","Female",29,"U.S");
		User u5=new User(105,"vamshi","Male",33,"Australia");
	//	repo.saveAll(Arrays.asList(u1,u2,u3,u4,u5));
		
		
		//to get Listof country details
/*		List<User> user=repo.findByCountry("India");
			user.forEach(users->{
			System.out.println(users);}
					);*/
		//To get the Listof particular age details
/*		List<User> user=repo.findByAge(23);
		user.forEach(users->{
		System.out.println(users);}
				);*/
		
		//To get particular person name with certian age person name only
/*		List<User> user=repo.findByAge(23);
		user.forEach(users->{
		System.out.println(users.getUserName());}
				);*/
		
		//To get details whose age is greatertha or equal to 30
/*		List<User> user=repo.findByAgeGreaterThanEqual(30);
		user.forEach(users->{
		System.out.println(users);}
				);*/
		
		//getting multiple country names
/*		List<User> user=repo.findByCountryIn(Arrays.asList("India","Australia"));
		user.forEach(users->{
			System.out.println(users);
		});*/
		
		//getting the details age and country combination
/*		List<User> user=repo.findByCountryAndAge("India",32);
		user.forEach(users->{
			System.out.println(users);
		});*/
		
		//getting the details of ageand country and gender
/*		List<User> user=repo.findByCountryAndAgeAndGender("India",25,"Male");
		user.forEach(users->{
			System.out.println(users);
		});*/
		
		//
		


	}

}
