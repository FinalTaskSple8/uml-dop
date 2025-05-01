package SIPH.payment.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface IPayment {
	public EFloat getAmount();
	public void setAmount(EFloat amount);
	public void processPayment();
	HashMap<String, Object> toHashMap();
}
