package com.ccpa.compreqdtls.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ccpa.compreqdtls.entity.CustomerRequestTEntity;

@Repository
public interface CustomerRequestDtlsDAO extends CrudRepository<CustomerRequestTEntity, String> {

}
