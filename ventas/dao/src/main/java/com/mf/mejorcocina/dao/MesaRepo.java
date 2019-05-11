package com.mf.mejorcocina.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mf.mejorcocina.domain.Mesa;

@Repository
public interface MesaRepo extends CrudRepository<Mesa, Long> {

}
