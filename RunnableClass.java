class RunnableClass
{
		public static void main(String args[])
		{	
		
		new Thread(new Runnable()
		{
		
			public void run()
			{
				for(int i=0; i<=1; i++)
					{										System.out.println("child Thread");
					}
			}
		
		}).start();
	
				for(int i=0; i<=1; i++)
					{										System.out.println("main Thread");
					}
		

}

}