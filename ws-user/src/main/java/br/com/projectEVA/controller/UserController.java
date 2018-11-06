package br.com.projectEVA.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

import br.com.projectEVA.model.User;

@RestController
public class UserController {

	private HashMap<Integer, User> hashMap = new HashMap<Integer, User>();
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET, produces="application/json")
	public User getUserById(@PathVariable(value="id") int id){
		init();
		return hashMap.get(id);
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET, produces="application/json")
	public List<User> getAllUsers(){
		init();
		List<User> users = new ArrayList<>(hashMap.values());
		return users;
	}
	
	private void init() {
		for (int i = 1; i <= 20; i++) {
			Faker faker = new Faker(new Locale("pt-BR"));
			hashMap.put(i, new User(i, faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(), faker.date().birthday()));
		}
	
	}
	
}
