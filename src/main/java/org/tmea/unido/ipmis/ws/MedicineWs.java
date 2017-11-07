package org.tmea.unido.ipmis.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.tmea.unido.ipmis.data.entity.Medicine;
import org.tmea.unido.ipmis.data.service.MedicineService;

@WebService
public class MedicineWs {

	public String getTestString() {
		return "Hellow from Medicine WS";
	}

	public List<Medicine> getAllMedicine() {
		MedicineService medicineService = new MedicineService();
		List<Medicine> med = medicineService.findAll();

		return med;
	}

	public List<String> getTestListString()	{
		List<String> names = new ArrayList<String>();
		names.add("Reggies");
		names.add("Oluoch");
		names.add("Jackohango");
		return names;
	}
	
	@WebMethod
	public List<Medicine> getSearchResult(String result){
		MedicineService medicineService = new MedicineService();
		List<Medicine> med = medicineService.search(result);
		return med;
	}
}
