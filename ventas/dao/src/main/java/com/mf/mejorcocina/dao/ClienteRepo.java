package com.mf.mejorcocina.dao;

import org.springframework.data.repository.CrudRepository;

import com.mf.mejorcocina.domain.Cliente;

public interface ClienteRepo extends CrudRepository<Cliente, Long> {

}
