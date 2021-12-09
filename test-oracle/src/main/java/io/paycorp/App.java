package io.paycorp;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.paycorp.domain.ServiceStatus;
import io.paycorp.service.ServiceStatusService;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class App implements CommandLineRunner
{
	@Autowired
	private ServiceStatusService service;
	
	public static void main(final String[] args) {
		SpringApplication.run(App.class, args);
	}

	public void run(String... args) throws Exception {
		var ss = new ServiceStatus();
		ss.setCode("code");
		ss.setStatus("status");
		ss.setCreationDate(LocalDate.now());
		ss.setCreationTimestamp(LocalDateTime.now());
		
		var rss = service.save(ss);
		log.info("service save: {}", rss);
		
		var returnSs = service.findById(rss.getId());
		log.info("service return: {}", returnSs);
	}	
}
