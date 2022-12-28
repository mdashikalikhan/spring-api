package com.api.springapi.rest.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 0;
	
	static {
		users.add(new User(++usersCount, "Ashik", LocalDate.now().minusYears(40).minusDays(110)));
		users.add(new User(++usersCount, "Abir", LocalDate.now().minusYears(34).minusDays(110)));
		users.add(new User(++usersCount, "Akid", LocalDate.now().minusYears(31).minusDays(110)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		/* return users.stream().filter(predicate).findFirst().get(); */
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public void deleteByUserId(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
}
