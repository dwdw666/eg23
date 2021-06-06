package common;

import javax.swing.JLabel;

public class Person {
	public int id;
	public String prenom;
	public String nom;
	public String telLabel;
	public String mailLabel;
	public String nameLabel;
	public String typeLabel;
	public String[] ues;
	public String heure;
	public String date;
	
	public Person(int id, String prenom, String nom, String telLabel,String mailLabel,String nameLabel,String typeLabel,String[] ues,String heure,String date) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.telLabel = telLabel;
		this.mailLabel = mailLabel;
		this.nameLabel = nameLabel;
		this.typeLabel = typeLabel;
		this.ues = ues;
		this.heure = heure;
		this.date = date;
	}
	
	
}
