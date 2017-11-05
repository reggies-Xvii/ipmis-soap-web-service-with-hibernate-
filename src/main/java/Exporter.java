import javax.xml.ws.Endpoint;

import org.tmea.unido.ipmis.ws.MedicineWs;

public class Exporter {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/ipmis/ws", new MedicineWs());
	}

}
