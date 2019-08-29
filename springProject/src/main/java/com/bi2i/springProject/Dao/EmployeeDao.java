package com.bi2i.springProject.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bi2i.springProject.entity.Employee;

@Repository
public class EmployeeDao {

	@PersistenceContext	
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployeeDetails(){
		return (List<Employee>) entityManager.createQuery("from Employee as e join fetch e.manager as m").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> getSortedEmployeeDetails(String sortBy){
		return (List<Employee>) entityManager.createQuery("from Employee as e join fetch e.manager as m order by "+sortBy).getResultList();
	}
	
}
