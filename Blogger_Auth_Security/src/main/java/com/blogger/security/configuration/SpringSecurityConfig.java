package com.blogger.security.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class SpringSecurityConfig extends GlobalAuthenticationConfigurerAdapter{

	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("vengat")
		.password("123")
		.roles("USER")
		.and()
		.withUser("Vijayan")
		.password("12345")
		.roles("ADMIN","USER");
	}

}
