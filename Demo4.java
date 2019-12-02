package pack;

public class Demo4 {

	public static void main(String[] args) {
		try{
		int x=34,y=0,z;
		z=x/y;
		System.out.println(z);
		}catch(Throwable t)
		{
		System.out.println(t.getMessage());	
		}
		
		int a=456,b=56,c;
		c=a/b;
		System.out.println(c);

	}

}
