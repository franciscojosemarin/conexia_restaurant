package com.mf.mejorcocina.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mf.mejorcocina.domain.Cliente;

@Repository
public interface ClienteRepo extends CrudRepository<Cliente, Long> {

}
