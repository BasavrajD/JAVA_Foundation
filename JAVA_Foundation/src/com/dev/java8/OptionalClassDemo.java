package com.dev.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class User{
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}
	
	public Optional<String> getName(){
		return Optional.ofNullable(name);
	}
}

public class OptionalClassDemo {
	
	public static Optional<User> findUserById(String userId){
		if(userId.equals("admin1")) {
			return Optional.of(new User("Raj"));
		}else {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {
		Optional<User> user = findUserById("admin1");
		user.ifPresent(u -> u.getName().orElse("Name Not found"));
		System.out.println(user.flatMap(User::getName).orElse("Not found"));
		
		List<String> users = Arrays.asList("prem", "david", "hari", "john", "altaf", "rajesh");
		Optional<String> name = users.stream().filter(u -> u.startsWith("a")).findFirst();
		System.out.println(name.orElse("not found 2"));
		

	}

}
