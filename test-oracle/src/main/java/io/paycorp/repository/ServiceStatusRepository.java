package io.paycorp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.paycorp.domain.ServiceStatus;

@Repository
public interface ServiceStatusRepository extends CrudRepository<ServiceStatus, String> {

}
