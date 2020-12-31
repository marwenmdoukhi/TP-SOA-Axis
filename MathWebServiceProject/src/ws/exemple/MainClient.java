package ws.exemple;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class MainClient {
	public static void main(String[] args) {
		System.out.println("Appel du service sans utilisation de proxy");
		Service mathService = new Service();
		try {
			Call appel = (Call)mathService.createCall();
			String url = "http://localhost:8080/MathWebServiceProject/services/Math";
			appel.setTargetEndpointAddress(new URL(url));
			appel.setOperationName(new QName("Math","add"));
			Object resultat = appel.invoke(new Object[] {/*i=*/5,/*j=*/8});
			System.out.println(resultat);
		}
		catch (ServiceException e) {
			e.printStackTrace();
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (RemoteException e) {
			e.printStackTrace();
		}
		
			
		}
	

}

