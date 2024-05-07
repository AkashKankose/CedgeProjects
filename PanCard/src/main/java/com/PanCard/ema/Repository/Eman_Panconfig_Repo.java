package com.PanCard.ema.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PanCard.ema.DbEntity.Eman_panconfig;

@Repository
public interface Eman_Panconfig_Repo extends CrudRepository<Eman_panconfig, Integer> {
	
	public Eman_panconfig findBybankcode(String bankcode);

}
