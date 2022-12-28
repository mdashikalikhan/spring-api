package com.api.springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.api.springapi.enterprise.example.web.MyWebController;
import com.api.springapi.game.GameRunner;

@SpringBootApplication
/* @EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class}) */
public class SpringApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringApiApplication.class, args);
		/*
		 * MarioGame game1 = new MarioGame(); SuperContraGame game2 = new
		 * SuperContraGame(); GameRunner runner = new GameRunner(game1); runner.run();
		 * runner = new GameRunner(game2); runner.run();
		 */
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
