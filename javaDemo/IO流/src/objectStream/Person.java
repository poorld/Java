package objectStream;

import java.io.Serializable;

public class Person implements Serializable{
	static final long serialVersionUID = 66L;
	String name;
	String password;
	public Person(String name,String password){
		this.name = name;
		this.password = password;
	}
	public String toString(){
		return "ĞÕÃû:" + name + ",ÃÜÂë:" + password;
	}
}
