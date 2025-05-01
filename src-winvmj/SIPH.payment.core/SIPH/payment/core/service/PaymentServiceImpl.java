package SIPH.payment.core;
import java.util.*;
import com.google.gson.Gson;
import java.util.*;
import java.util.logging.Logger;
import java.io.File;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import SIPH.payment.PaymentFactory;
import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class PaymentServiceImpl extends PaymentServiceComponent{

    public List<HashMap<String,Object>> saveIPayment(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		IPayment ipayment = createIPayment(vmjExchange);
		ipaymentRepository.saveObject(ipayment);
		return getAllIPayment(vmjExchange);
	}

    public IPayment createIPayment(Map<String, Object> requestBody){
		
		//to do: fix association attributes
		IPayment IPayment = IPaymentFactory.createIPayment(
			"SIPH.payment.core.PaymentImpl",
		);
		Repository.saveObject(ipayment);
		return ipayment;
	}

    public IPayment createIPayment(Map<String, Object> requestBody, int id){
		
		//to do: fix association attributes
		
		IPayment ipayment = IPaymentFactory.createIPayment("SIPH.payment.core.PaymentImpl", );
		return ipayment;
	}

    public HashMap<String, Object> updateIPayment(Map<String, Object> requestBody){
		String idStr = (String) requestBody.get("");
		int id = Integer.parseInt(idStr);
		IPayment ipayment = Repository.getObject(id);
		
		
		Repository.updateObject(ipayment);
		
		//to do: fix association attributes
		
		return ipayment.toHashMap();
		
	}

    public HashMap<String, Object> getIPayment(Map<String, Object> requestBody){
		List<HashMap<String, Object>> ipaymentList = getAllIPayment("ipayment_impl");
		for (HashMap<String, Object> ipayment : ipaymentList){
			int record_id = ((Double) ipayment.get("record_id")).intValue();
			if (record_id == id){
				return ipayment;
			}
		}
		return null;
	}

	public HashMap<String, Object> getIPaymentById(int id){
		String idStr = vmjExchange.getGETParam(""); 
		int id = Integer.parseInt(idStr);
		IPayment ipayment = ipaymentRepository.getObject(id);
		return ipayment.toHashMap();
	}

    public List<HashMap<String,Object>> getAllIPayment(Map<String, Object> requestBody){
		String table = (String) requestBody.get("table_name");
		List<IPayment> List = Repository.getAllObject(table);
		return transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<IPayment> List){
		List<HashMap<String,Object>> resultList = new ArrayList<HashMap<String,Object>>();
        for(int i = 0; i < List.size(); i++) {
            resultList.add(List.get(i).toHashMap());
        }

        return resultList;
	}

    public List<HashMap<String,Object>> deleteIPayment(Map<String, Object> requestBody){
		String idStr = ((String) requestBody.get("id"));
		int id = Integer.parseInt(idStr);
		Repository.deleteObject(id);
		return getAllIPayment(requestBody);
	}

	public void processPayment() {
		// TODO: implement this method
	}
}
