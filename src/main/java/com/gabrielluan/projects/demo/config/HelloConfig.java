package com.gabrielluan.projects.demo.config;

// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Profile;

// import com.gabrielluan.projects.demo.services.HelloWorldService;
// import com.gabrielluan.projects.demo.services.HelloWorldServiceFactory;

@Configuration
public class HelloConfig {
	
	// @Bean
	// HelloWorldServiceFactory helloWorldServiceFactory() {
	// 	return new HelloWorldServiceFactory();
	// }
	
	// @Bean
	// @Profile({"english", "default"})
	// @Primary
	// public HelloWorldService helloWorldServiceEnglishImpl(HelloWorldServiceFactory helloWorldServiceFactory) {
	// 	return helloWorldServiceFactory.createHelloWorldService("en");
	// }
	
	// @Bean
	// @Profile("spanish")
	// @Primary
	// public HelloWorldService helloWorldServiceSpanishImpl(HelloWorldServiceFactory helloWorldServiceFactory) {
	// 	return helloWorldServiceFactory.createHelloWorldService("es");
	// }
	
	// @Bean(name="french")
	// public HelloWorldService helloWorldServiceFrenchImpl(HelloWorldServiceFactory helloWorldServiceFactory) {
	// 	return helloWorldServiceFactory.createHelloWorldService("fr");
	// }
	
	// @Bean
	// public HelloWorldService helloWorldServiceGermanImpl(HelloWorldServiceFactory helloWorldServiceFactory) {
	// 	return helloWorldServiceFactory.createHelloWorldService("de");
	// }
}
