package org.tmea.unido.ipmis.test;

import org.tmea.unido.ipmis.data.entity.Medicine;
import org.tmea.unido.ipmis.data.service.MedicineService;

public class Test {

	public static void main(String[] args) {
		
		MedicineService medicineService = new MedicineService();
		
		Medicine medicine = new Medicine(3, "Malariaquin","Quinine", "SKL", "Karundi", "Swallow");
		System.out.println("Persisting medicine to database...");
		medicineService.persist(medicine);
		System.out.println("Medicine persisted ");

	}

}
