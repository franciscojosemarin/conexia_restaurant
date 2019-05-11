package com.mf.mejorcocina.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mf.mejorcocina.domain.Camarero;

@Repository
public interface CamareroRepo extends CrudRepository<Camarero, Long> {

}
