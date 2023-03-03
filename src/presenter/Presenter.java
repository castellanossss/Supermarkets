package presenter;

import view.View;

public class Presenter {
	private View view;
	
	public Presenter() {
		view = new View();
	}
	
	public void newSupplierOption() {
		
		view.displayArchiveInfo();
	}
	
	public void newCustomerOption() {
		
		view.displayArchiveInfo();
	}
	
	public void newProductOption() {
		
		view.displayArchiveInfo();
	}
	
	public void recordSaleOption() {
		
		view.displayArchiveInfo();
	}
	
	public void showAllSalesOption() {
		
		view.displayArchiveInfo();
	}
	
	
	private void firstDecision() {
		int option = view.firstMenu();
		
		switch (option) {
			case 1:
				secondDecision();
			case 2:
				view.goodbyeMessage();
				System.exit(0);
				break;
			default:
				view.alertMessage();
				firstDecision();
		}
	}
	
	private void secondDecision() {
		int option = view.secondMenu();
		
		switch (option) {
			case 1:
				newSupplierOption();
				thirdDecision();
			case 2:
				newCustomerOption();
				thirdDecision();
			case 3:
				newProductOption();
				thirdDecision();
			case 4:
				recordSaleOption();
				thirdDecision();
			case 5:
				showAllSalesOption();
				thirdDecision();
			case 6:
				view.goodbyeMessage();
				System.exit(0);
				break;
			default:
				view.alertMessage();
				secondDecision();
		}
	}
	
	private void thirdDecision() {
		int option = view.thirdMenu();
		
		switch (option) {
			case 1:
				secondDecision();
			case 2:
				view.goodbyeMessage();
				System.exit(0);
				break;
			default:
				view.alertMessage();
				thirdDecision();
		}
	}
	
	private void run() {
		view.welcomeMessage();
		firstDecision();
	}
	

	public static void main(String[] args) {
		Presenter main = new Presenter();
		main.run();
	}

}
