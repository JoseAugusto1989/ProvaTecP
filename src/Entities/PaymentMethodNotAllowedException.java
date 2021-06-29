package Entities;

public class PaymentMethodNotAllowedException extends Exception {
	
	private static final long serialVersionUID = -413894201321915294L;
	
	private String message = "Erro no Sistema";
	
	private String message() {
		return message;
		
		
	}

}
