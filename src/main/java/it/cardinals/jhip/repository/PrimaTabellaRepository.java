package it.cardinals.jhip.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import it.cardinals.jhip.entity.ProvaEntity;

@Repository
public interface PrimaTabellaRepository extends CrudRepository<ProvaEntity, Integer>{
  
}
