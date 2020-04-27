package db.connection.mysql.connection.service;

import db.connection.mysql.connection.dao.DepartmentDAO;

public class DepartmentService {

	private DepartmentDAO departmentDAO;
	
	public DepartmentService(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}
	
	public List <Department> findAll(){return this.departmentDAO.getAll();}
	
	// burada tüm departmanları listeleyen fonksiyonu yazınız.
}
