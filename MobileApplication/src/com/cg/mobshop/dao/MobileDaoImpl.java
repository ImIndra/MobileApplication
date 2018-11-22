package com.cg.mobshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.mobshop.dto.Mobiles;

@Repository
public class MobileDaoImpl implements MobileDao 
{
	@PersistenceContext
	EntityManager manager;
	
	@Override
	public List<Mobiles> getAllMobiles() {
		System.out.println("In Dao");
		String str= "select mobile from Mobiles mobile";
		TypedQuery<Mobiles> query= manager.createQuery(str, Mobiles.class);
		return query.getResultList();
	}

}
