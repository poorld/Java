package book;

public class Information {
	String name;//����������
	String Contacts;//��ϵ��
	String address;//��ַ
	String number;//�绰����
	
	
	public Information(String address, String contacts, String name, String number) {
		super();
		this.name = name;
		this.Contacts = contacts;
		this.address = address;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContacts() {
		return Contacts;
	}
	public void setContacts(String contacts) {
		Contacts = contacts;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Chubanshe [name=" + name + ", Contacts=" + Contacts
				+ ", address=" + address + ", number=" + number + "]";
	}
	
	
}
