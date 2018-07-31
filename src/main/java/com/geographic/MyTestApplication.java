package com.geographic;


import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class MyTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyTestApplication.class, args);
		/*Md5Hash md5Hash = new Md5Hash("1234567","dongzhu");
		System.out.println(md5Hash.toString());*/
	}
}
