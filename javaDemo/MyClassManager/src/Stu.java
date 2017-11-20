
public class Stu {
	String id;
	String name;
	int age;
	String sex;
	double score;
	
	public Stu() {
		super();
		 
	}
	
	public Stu(String id, String name, int age, String sex, double score) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
	}
	public boolean xiangDeng(Stu s)
	{
		return this.id.equals(s.id);
		 
		
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", age=" + age + ", sex="
				+ sex + ", score=" + score + "]";
	}
	
	
	
	

}
