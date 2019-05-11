package com.mf.mejorcocina.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mf.mejorcocina.domain.Plato;

@Repository
public interface PlatoRepo extends CrudRepository<Plato, Long> {

}
