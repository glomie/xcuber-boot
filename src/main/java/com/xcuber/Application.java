package com.xcuber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@RestController
@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter implements EmbeddedServletContainerCustomizer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "hello worldgdgs";
	}
	@GetMapping("/test1")
	public String hom1e() {
		return "hello worldgdgs";
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8088);
	}
}
