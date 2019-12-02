package pack;
public class Demo3 {
public static void method1(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public static String method2(String str1,String str2)
{
	String res="";
if(str1.equals(str2))
{
System.out.println("Strings are equal");
}
else
{
	System.out.println("Strings are Not equal");	
}
return res;
}
public static boolean method3(int x,int y)
{
	if(x==y)
	{
	System.out.println("x and y are equal");
	return true;
	}

else
{
System.out.println("x and y are not equal");
return false;
}
}
	public static void main(String[] args) {
		Demo3.method1(100, 78);
		Demo3.method2("Testing", "testing");
Demo3.method3(100, 300);
	}

}
