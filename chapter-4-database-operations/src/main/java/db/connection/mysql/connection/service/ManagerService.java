package db.connection.mysql.connection.service;

import db.connection.mysql.connection.dao.ManagerDAO;

public class ManagerService {

	private ManagerDAO managerDAO;
	
	public ManagerService(ManagerDAO managerDAO) {
		this.managerDAO = managerDAO;
	}
	
	public List<Manager> GetActiveManager(){
		return managerDAO.loadAllActiveManagers();
	}
	// buraya aktif yöneticileri listeleyen bir fonksiyon yazınız.
	
}
