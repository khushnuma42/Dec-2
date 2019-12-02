package pack;

public class Demo6 {

	public static void main(String[] args) {
		String str1="hello";
		String str2="Hello";
		if(str1.equals(str2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			try{
			throw new Error("Strings are not equal");
			}catch(Throwable t){
				System.out.println(t.getMessage());
			}
		}

	}

}
