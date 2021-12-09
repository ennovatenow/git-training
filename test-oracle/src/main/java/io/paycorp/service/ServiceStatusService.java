package io.paycorp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.paycorp.domain.ServiceStatus;
import io.paycorp.repository.ServiceStatusRepository;

@Service
public class ServiceStatusService {

	@Autowired
	private ServiceStatusRepository repo;
	
	public ServiceStatus save(ServiceStatus ss) {
		return repo.save(ss);
	}
	
	public ServiceStatus findById(String id) {
		return repo.findById(id).orElse(null);
	}
	
}
