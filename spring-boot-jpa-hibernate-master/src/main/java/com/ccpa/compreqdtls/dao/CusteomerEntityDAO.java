package com.ccpa.compreqdtls.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ccpa.compreqdtls.entity.CustomerTEntity;

@Repository
public interface CusteomerEntityDAO extends CrudRepository<CustomerTEntity, Long> {

}
