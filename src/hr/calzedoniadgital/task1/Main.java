package hr.calzedoniadgital.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import hr.calzedoniadgital.task1.domain.Person;

public class Main {

	private static List<Person> persons = new ArrayList<>();

	public static void initialize() {
		persons.add(new Person("Pero", "Peric", 30, 7500.00));
		persons.add(new Person("Ivan", "Ivic", 22, 5000.00));
		persons.add(new Person("Matej", "Matic", 31, 9500.00));
		persons.add(new Person("Ana", "Anic", 27, 6800.00));
		persons.add(new Person("Mia", "Mijic", 40, 15000.00));
	}

	public static void main(String[] args) {
		/*
		 * Filter persons list leaving only those that have salary equal or higher than
		 * 7500.00 Sort those persons from salary highest to lowest Print results
		 */
		initialize();

		// SOLUTION
		List<Person> personsFilteredSortedList = persons.stream().filter(p -> p.getSalary() >= 7500)
				.sorted((o2, o1) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
		
		System.out.println(personsFilteredSortedList);

	}

}
