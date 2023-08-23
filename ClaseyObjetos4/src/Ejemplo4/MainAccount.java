package Ejemplo4;

public class MainAccount {
	public static void main (String[]args) {
		Account acountone = new Account ("0010", "Cuenta de camilo", 100 ); 
		Account acounttwo = new Account ("0020", "Cuenta de diego", 200 ); 
		
		acountone.credit(100);
		acounttwo.debit(500);
        acountone.transferTo(acounttwo, 100);

        
        System.out.println(acountone);
        System.out.println(acounttwo);
		
	}
	
}
