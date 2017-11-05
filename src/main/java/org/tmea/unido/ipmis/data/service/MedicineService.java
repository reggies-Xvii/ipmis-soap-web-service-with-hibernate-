package org.tmea.unido.ipmis.data.service;

import java.util.List;

import org.tmea.unido.ipmis.data.dao.MedicineDao;
import org.tmea.unido.ipmis.data.entity.Medicine;

public class MedicineService {

	public static MedicineDao medicineDao;
	
	public MedicineService(){
		medicineDao = new MedicineDao();
	}
	
	public void persist(Medicine entity){
		medicineDao.openCurrentSessionwithTransaction();
		medicineDao.persist(entity);
		medicineDao.closeCurrentSessionwithTransaction();
	}
	
	public void update(Medicine entity){
		medicineDao.openCurrentSessionwithTransaction();
		medicineDao.persist(entity);
		medicineDao.closeCurrentSessionwithTransaction();
	}
	
	public Medicine findById(Long id){
		medicineDao.openCurrentSession();
		Medicine medicine = medicineDao.findById(id);
		return medicine;
	}
	
	public void delete(String id){
		medicineDao.openCurrentSessionwithTransaction();
		Medicine medicine = medicineDao.findById(id);
		medicineDao.delete(medicine);
		medicineDao.closeCurrentSessionwithTransaction();
	}
	
	public List<Medicine> findAll(){
		medicineDao.openCurrentSession();
		List<Medicine> medicines = medicineDao.findAll();
		medicineDao.closeCurrentSession();
		return medicines;
	}
	
	public void deleteAll(){
		medicineDao.openCurrentSessionwithTransaction();
		medicineDao.deleteAll();
		medicineDao.closeCurrentSessionwithTransaction();
	}
	
	public MedicineDao medicineDao(){
		return medicineDao;
	}
	
	public List<Medicine> search(String result){
		medicineDao.openCurrentSession();
		List<Medicine> medicines = medicineDao.search(result);
		medicineDao.closeCurrentSession();
		return medicines;
	}
}
