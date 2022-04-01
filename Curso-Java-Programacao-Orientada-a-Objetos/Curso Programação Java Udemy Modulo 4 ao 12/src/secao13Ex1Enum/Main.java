package secao13Ex1Enum;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		

	
	
	}

}
