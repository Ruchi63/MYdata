package DemoOOPS;

public class DemoConstruct2 {
	 int nm;
	public  DemoConstruct2(int nm) 
	{
		this.nm=nm;//for refer to current variable
		nm=20;
		
	}

	public static void main(String[] args) {
			
		DemoConstruct2 dc = new DemoConstruct2(30);
System.out.println(dc.nm);
	
	
		
	
	}
}
