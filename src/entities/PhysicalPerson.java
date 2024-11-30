package entities;

public class PhysicalPerson extends Person{
	
	private double healthExpenses;
	
	public PhysicalPerson() {}

	public PhysicalPerson(String name, double anualIncome, double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}

	public double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double calculateTaxes() {
		double fullTax = 0;
		if (getAnualIncome() < 20000) {
			fullTax = getAnualIncome() * 0.15;
		}
		else {
			fullTax = getAnualIncome() * 0.25;
		}
		
		if (healthExpenses > 0) {
			fullTax = fullTax - (healthExpenses * 0.50);
		}
		
		if (fullTax < 0) {
			fullTax = 0;
		}
		
		return fullTax;
	};
	
	

}
