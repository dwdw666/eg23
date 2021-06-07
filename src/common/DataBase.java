package common;

import java.util.ArrayList;

import javax.swing.JLabel;

public class DataBase {
	private ArrayList<Person> persons;
	
	public DataBase() {
		
	}
	public DataBase(Person person1,Person person2,Person person3,Person person4,Person person5,Person person6,Person person7,Person person8) {
		this.persons = new ArrayList<Person>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);
		persons.add(person7);
		persons.add(person8);
	}
	public Person getPerson(int id) {
		return persons.get(id-1);
	}
	/**
	 * @param String name
	 * @return id exist return id else return id = -1;
	 */
	public int checkPerson(String name) {
		int id = -1;
		for(int i = 0;i < persons.size(); i ++){
		    if(persons.get(i).nameLabel.equals(name)) {
		    	id = persons.get(i).id;
		    	break;
		    }
		}
		return id;
		
	}
	
	
	
}
