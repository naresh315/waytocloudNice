package com.example.demo;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

 
 @SpringBootApplication(scanBasePackages={"com.example.demo"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
 @RestController
public class WayToCloud1Application {

	public static void main(String[] args) {
		SpringApplication.run(WayToCloud1Application.class, args);
	}
	@RequestMapping(value = "/naresh", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return "Nothing here. Go to <a href='/sample'>/sample</a>";
    }
	@RequestMapping(value = "/sample", produces = MediaType.TEXT_HTML_VALUE)
    public String getWellSoon() {
        return "Alright All is well ...get well soon";
    }
}
