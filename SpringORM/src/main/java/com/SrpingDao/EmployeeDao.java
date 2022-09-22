package com.SrpingDao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.ORM.Entities.Employee;

@Transactional
public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public int insert(Employee employee) {

		// hibernate save method retuns
		// serializable obj // we cant cast serializable object to int so we use
		// (Integer)wrapper class object

		Integer i = (Integer) this.hibernateTemplate.save(employee);

		return i;
	}

	public Employee getEmployee(int Eid) {

		Employee emp = this.hibernateTemplate.get(Employee.class, Eid);

		return emp;

	}

	public List<Employee> getAllEmployee() {

		List<Employee> emp = this.hibernateTemplate.loadAll(Employee.class);

		return emp;

	}
    public void delete(int Emp) {
    	
    Employee Emp1 =	this.hibernateTemplate.get(Employee.class,Emp);
    	
    this.hibernateTemplate.delete(Emp1);
    	
    	
    }
	
    public void update(Employee emp) {
    	
        	
        this.hibernateTemplate.update(emp);
        	
        	
        }
    	
}
