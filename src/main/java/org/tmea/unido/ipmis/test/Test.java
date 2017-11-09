package org.tmea.unido.ipmis.test;

import java.util.List;

import org.tmea.unido.ipmis.data.entity.Medicine;
import org.tmea.unido.ipmis.data.service.MedicineService;

public class Test {

	public static void main(String[] args) {
		
		MedicineService medicineService = new MedicineService();
		
		Medicine medicine = new Medicine(6788666, "Malariaquin","Quinine", "SKL", "Karundi", "Swallow", "aaa", "xxx", "askjfs", "adsfs", "xyz", "test", "khadds", "jahsda", "asfjlasjf", "asldfjs", "aljfaljf", "LastOne","Kenya");
		System.out.println("Persisting medicine to database...");
		medicineService.persist(medicine);
		System.out.println("Medicine persisted ");
		
		List<Medicine> med = medicineService.findAll();
		
		for(Medicine m : med){
			System.out.println(m.toString());
		}
		
		Medicine medicine2 = medicineService.findById((long) 131072);
		System.out.println("Getting values by id...");
		String genericName = medicine2.getGenericName();
		String manufacturer = medicine2.getManufacturer();
		
		List<Medicine> meds = medicineService.search("Panadol");
		for(Medicine m : meds){
			System.out.println(">>>Product Trade Name is: " + m.getProductTradeName());
		}
		
		
		System.out.println("The generic name is: " + genericName + " and manufacturer is: " + manufacturer);

	}

}
