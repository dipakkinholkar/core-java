class StaticInnerClass
{
	static class A
	{
		 public void m1()
		{
			System.out.println("StiticClass:m1()");
		}
	}

public static void main(String args[])
	{
	A a=new A();
	a.m1();
	}
}