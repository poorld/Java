
public class MyClass {
	Stu[]array;
	int size;
	int count;
	public MyClass(int size)
	{
		this.size = size;
		array = new Stu[size];
		count = 0 ; 
	}
	public void add(Stu s)
	{
		if(count<size)
		{
			array[count] = s;
			count++;
		}
		else
		{
			Stu[]arrayTmp = new Stu[this.size+10];
			for(int i =0;i<count;i++)
			{
				arrayTmp[i] = array[i];
			}
			this.array = arrayTmp;
			this.size = this.size+10;
			add(s);
			
			
		}
	}
	public void print()
	{
		for(int i =0;i<count;i++)
		{
			System.out.println(array[i]);
			
		}		
	}
	public Stu find(String id)
	{
		for(int i =0;i<count;i++)
		{
			
			if(array[i].id .equals(id))
			{
				return array[i];
				
			}
		}
		return null;
	}
	
	public int findIndex(String id)
	{
		for(int i =0;i<count;i++)
		{
			
			if(array[i].id .equals(id))
			{
				return i;
				
			}
		}
		return -1;
	}
	public Stu find(Stu s)
	{
		for(int i =0;i<count;i++)
		{
			
			if(array[i].xiangDeng(s) )
			{
				return array[i];
				
			}
		}
		return null;
		
	}
	public void  update(String id,Stu s)
	{
		 Stu s1 = this.find(id);
		 if(s1==null)
			 return;
		 s1.age = s.age;
		 s1.name = s.name;
		 s1.sex = s.sex;
		 s1.score = s.score;
	}
	//É¾³ý
	public void delete(String id )
	{
		
		int index = this.findIndex(id);
		if(index ==-1)
			return;
		
		for(int i=index+1;i<count;i++ )
		{
			array[i-1] = array[i];
		}
		count--;
	}
	//ÅÅÐò
	public void sort()
	{
		
		for(int i =0;i<count;i++)
		{
			for(int j =i+1;j<count;j++)
			{
				if(array[i].score<array[j].score)
				{
					Stu tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
					
					
				}
				
			}
			
		}
		
		
	}
	
	 
	
	

}
