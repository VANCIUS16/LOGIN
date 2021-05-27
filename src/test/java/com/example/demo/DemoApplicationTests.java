package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = "admin";
        String encondeString = encoder.encode(password);
        System.out.println(encondeString);
    }

}
