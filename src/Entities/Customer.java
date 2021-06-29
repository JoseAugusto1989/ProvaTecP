package Entities;

public class Customer {
	
	private long id;
	private String name;
	private String cpf;
	private PaymentMethod paymentMethod;
	
	
	public Customer() {
		
	}
	
	public Customer(long id, String name, String cpf) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
}
