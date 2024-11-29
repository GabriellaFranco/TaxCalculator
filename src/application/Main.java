package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.JuridicPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Person> listPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int qtdPayers = sc.nextInt();
		
		for (int i = 1; i <= qtdPayers; i++) {
			System.out.println("TAX PAYER #" + i + " DATA:");
			System.out.print("Physical or Juridic (p/j)? ");
			char typePerson = sc.next().charAt(0);
			System.out.print("Enter the name: ");
			sc.nextLine();
			String personName = sc.nextLine();
			System.out.print("Annual income: ");
			double personIncome = sc.nextDouble();
			
			if (typePerson == 'p') {
				System.out.print("Health expenses: ");
				double personHealthExpenses = sc.nextDouble();
				listPayers.add(new PhysicalPerson(personName, personIncome, personHealthExpenses));
			}
			else {
				System.out.print("Number of employees: ");
				int personEmployees = sc.nextInt();
				listPayers.add(new JuridicPerson(personName, personIncome, personEmployees));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Person person : listPayers) {
			System.out.println(person.getName() + " - $" + String.format("%.2f", person.calculateTaxes()));
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: ");
		double sum = 0;
		for (Person person : listPayers) {
			sum += person.calculateTaxes();	
		}
		
		System.out.print(String.format("%.2f", sum));
	}

}
