package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
	
	private Scanner scan;
	private Customer customer;
	private int option;
	private List<Customer> list;
	
	public void start() {
		scan = new Scanner(System.in);
		try {
			createCustomer();
			
		} catch (PaymentMethodNotAllowedException e) {
			e.getMessage();
			e.printStackTrace();
			
		} finally {
			scan.close();
		}
		
	}
	
	public Customer createCustomer() throws PaymentMethodNotAllowedException {
		list = new ArrayList<>();
		
		System.out.print("Digite o ID do cliente: ");
			customer.setId(scan.nextLong());   scan.nextLine();
			
		System.out.print("Digite o nome do cliente: ");
			customer.setName(scan.nextLine());
			
		System.out.print("Digite o CPF do cliente: ");
			customer.setCpf(scan.nextLine());
			
		System.out.println("Digite o método de pagamento: ");
		System.out.println("1 - Credit Card");
		System.out.println("2 - Account Debit");
		System.out.println("3 - Pix");
		System.out.println("4 - Bank Slip");
		System.out.println("9 - Sair");
			option = scan.nextInt();   scan.nextLine();
				checkCustomer();
		
		list.add(customer);
		
		return customer;
		
	}
	
	public void checkCustomer() {
		while (option != 9) {
			if (option == 1) {
				//credit
				CreditCard card = new CreditCard();
				customer.setPaymentMethod(card);
				
			} else if (option == 2) {
				//debit
				AccountDebit debit = new AccountDebit();
				customer.setPaymentMethod(debit);
				
			} else if (option == 3) {
				//pix
				Pix pix = new Pix();
				customer.setPaymentMethod(pix);
				
			} else if (option == 4) {
				//slip
				BankSlip slip = new BankSlip();
				customer.setPaymentMethod(slip);
				
			} else if (option == 9) {
				System.out.println("End of App!!!");
				break;
				
			} else {
				System.out.println("Invalid Option!!!");
			}
		}
	}

}
