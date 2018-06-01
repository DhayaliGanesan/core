package javaproject;


	public class Taxi extends Car{
		public Taxi(){
			System.out.println(" cons taxi ");
		}
		public Taxi(int i)
		{
			i=i+2;
			System.out.println(i);
			System.out.println("cons 2");
		}
		public static void main(String args[]){
			
		  
		   Taxi t1=new Taxi(2);
		   
		    
		}


}


