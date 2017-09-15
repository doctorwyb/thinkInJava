package ch1802;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

import nu.xom.*;
public class Person {
	private String first, last;

	public Person(String frist, String last) {
		super();
		this.first = frist;
		this.last = last;
	}
	//produce an xml element from this person object
	public Element getXML(){
		Element person = new Element("person");
		Element firstName = new Element("first");
		firstName.appendChild(first);
		Element lastName = new Element("last");
		lastName.appendChild(last);
		person.appendChild(firstName);
		person.appendChild(lastName);
		return person;
	}
	//Constructor to restore a Person from an xml element
	public Person(Element person){
		first = person.getFirstChildElement("first").getValue();
		last = person.getFirstChildElement("last").getValue();
	}
	public String toString(){
		return first + " " + last;
	}
	//make it human-readable
	public static void format(OutputStream os, Document doc) throws Exception{
		Serializer serializer = new Serializer(os, "ISO-8859-1");
		serializer.setIndent(4);
		serializer.setMaxLength(60);
		serializer.write(doc);
		serializer.flush();
	}
	public static void main(String[] args) throws Exception {
		List<Person> people = Arrays.asList(
				new Person("aaaa","bbbb"),
				new Person("aaaa","bbbb"),
				new Person("aaaa","bbbb"));
		System.out.println(people);
		Element root = new Element("people");
		for(Person p : people){
			root.appendChild(p.getXML());
		}
		Document doc = new Document(root);
		format(System.out,doc);
		format(new BufferedOutputStream(new FileOutputStream("People.xml")), doc);
	}
}
