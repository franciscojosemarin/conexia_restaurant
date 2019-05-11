package com.mf.mejorcocina.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mf.mejorcocina.domain.Cocinero;

@Repository
public interface CocineroRepo extends CrudRepository<Cocinero, Long> {

}
