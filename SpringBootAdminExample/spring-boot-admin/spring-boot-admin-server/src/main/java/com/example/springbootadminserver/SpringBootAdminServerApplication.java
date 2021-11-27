package com.example.springbootadminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
//@SpringBootApplication(exclude = AdminServerHazelcastAutoConfiguration.class)
//@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootAdminServerApplication {

	// to allow us permission to inspect our URL. Necessary to auto register the server itself.
//    @Configuration
//    public static class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
//	@Override
//	protected void configure(final HttpSecurity http) throws Exception {
//	    http.authorizeRequests().anyRequest().permitAll().and().csrf().disable();
//	}
//    }

	public static void main(final String[] args) {
		SpringApplication.run(SpringBootAdminServerApplication.class, args);
	}

}
