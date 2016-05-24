package application;

import list.generic.GenericLinkedList;
import list.simple.LinkedList;
import data.Student;

/**
 * Beipsiel-Applikation zur ein einfach verketteten Liste.
 */
public class Application {

	public static void main(String[] args) {

		// Beispiel einer verketteten Liste
		LinkedList list = new LinkedList();

		list.insertSorted(12); // Die Liste speichert ausschließlich Werte vom Typ "int"
		list.insertSorted(3);
		list.insertSorted(66);
		list.insertSorted(12);
		list.insertSorted(5);
		list.insertSorted(15); // Füge einen Wert an die erste Position der
								// Liste.
		list.printAll(); // Ausgabe aller Werte
		list.remove(15); // Löschen eines Element mit dem Wert "15"
		System.out.println("Länge: " + list.getSize()); // Ausgabe der Länge

		// Ein Besipiel einer generischen einfach verketteten Liste.
		// Die Liste ist kann nur Objekte vom Typ Student aufnehmen...
		GenericLinkedList<Student> studentList = new GenericLinkedList<Student>();
		studentList
				.add(new Student("Jérôme Boateng", 654321, "Soziale Arbeit"));
		studentList.add(new Student("Thomas Müller", 123456,
				"Allg. Literaturwissenschaft"));
		studentList.add(new Student("Sami Khedira", 321654, "Design"));

		// Durch die Implementierung des Interfaces "Iterable" können wir
		// mittels der for-each-Schleife über unsere generische Liste iterieren.
		System.out.println();
		for (Student student : studentList) {
			System.out.println(student);
		}

		// Beispiel der Typisierung auf String
		GenericLinkedList<String> stringList = new GenericLinkedList<String>();
		stringList.add("Cogito");
		stringList.add("ergo");
		stringList.add("sum");

		System.out.println();
		for (String token : stringList) {
			System.out.println(token);
		}
	}

}
