package com.lxisoft.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.lxisoft.Restaurant;

@SpringBootApplication
@ImportResource("classpath:bean.xml")
public class DemoApplication  implements CommandLineRunner{

	@Autowired
	Restaurant resf ;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		resf.prepareMeal();
		
	}

}
