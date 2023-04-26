package registerNumbers;
import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		int opcion = 0;
		
		do{ 
			System.out.println("");
			 System.out.println("============ MENU PRINCIPAL ===========");
	         System.out.println("========= 1.- SUMA       ==============");
	         System.out.println("========= 2.- RESTA      ==============");
	         System.out.println("========= 3.- DIVISION   ==============");
	         System.out.println("========= 4.- PRODUCTO   ==============");
	         System.out.println("=======================================");

	         System.out.println("Ingrese una opción");
	         opcion = reader.nextInt();
	            
	            switch(opcion){
			    case 1:
			    	System.out.println("===MENU SUMA=====");
			    	suma();
				     break;
				     
			    case 2:
			    	System.out.println("===MENU RESTA=====");
			    	resta();
					break;
					
			    case 3:
			    	System.out.println("===MENU DIVISION=====");
			    	division();
					break;
					
			    case 4:
			    	System.out.println("===MENU PRODUCTO=====");
			    	producto();
				    break;
					
				
			}
	            
		}
		while(opcion <= 5);
		
	}
	
	public static void suma(){
		int n1,n2,suma;
		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese n1");
		n1 = reader.nextInt();
		System.out.println("Ingrese n2");
		n2 = reader.nextInt();
		suma= n1+n2;
		
		System.out.println("la suma es: " + suma);
		
	}
	
	public static void resta(){
		int n1,n2,resta;
		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese n1");
		n1 = reader.nextInt();
		System.out.println("Ingrese n2");
		n2 = reader.nextInt();
		resta= n1-n2;
		
		System.out.println("la resta es: " + resta);
		
	}
	public static void division(){
		float n1,n2,division;
		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese n1");
		n1 = reader.nextFloat();
		System.out.println("Ingrese n2");
		n2 = reader.nextFloat();
		
		if(n2 !=0 )
		{
			
			division= n1/n2;
			 System.out.println("la division es: " + division);
		}
		else{
			System.out.println("Uno de los valores es CERO CORRIJALO ..!");
		}
		
	
	}
	public static void producto(){
		int n1,n2,producto;
		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese n1");
		n1 = reader.nextInt();
		System.out.println("Ingrese n2");
		n2 = reader.nextInt();
		producto= n1*n2;
		
		System.out.println("la multiplicacion es: " + producto);
		
	}
	
	
	
	
	
	

}
