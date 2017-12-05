package it.cardinals.jhip.service.impl;

import javax.transaction.Transactional;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.cardinals.jhip.repository.PrimaTabellaRepository;
import it.cardinals.jhip.service.PrimaTabService;

@Service
@Transactional(rollbackOn=java.lang.Exception.class)
public class PrimaTabServiceImpl implements PrimaTabService{
@Autowired
private PrimaTabellaRepository primaTabellaRepository;
private  final Logger logger = LoggerFactory.getLogger(PrimaTabellaRepository.class);

  public void getPrtimaTabella() {
	  long pippo = primaTabellaRepository.count();
	  System.out.println("pipoooooooooooooooo "+pippo);
	  logger.debug("pipoooooooooooooooo "+pippo);
  }

}
