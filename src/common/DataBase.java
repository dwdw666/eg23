package common;

import java.util.ArrayList;

import javax.swing.JLabel;

public class DataBase {
	private ArrayList<Person> persons;
	
	public DataBase() {
		
	}
	public DataBase(Person person1,Person person2) {
		this.persons = new ArrayList<Person>();
		persons.add(person1);
		persons.add(person2);
	}
	public Person getPerson(int id) {
		if(id == 1) {
			return persons.get(0);
		}else {
			return persons.get(1);
		}
	}
}
