package com.blog.samples.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.samples.entity.FundEntity;

@Repository
public class FundDAOImpl implements FundDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<FundEntity> listFund() {
		
		return sessionFactory.getCurrentSession().createQuery("from FundEntity").list();
	}

}
