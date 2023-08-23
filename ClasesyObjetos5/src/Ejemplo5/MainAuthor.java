package Ejemplo5;

public class MainAuthor {
	public static void main (String[]args) {
		//String name, String email, char gender
		Author authorone=new Author("Diego", "d.alejo@gmail.com",'m');
		
		System.out.println("information author one: ");
		System.out.println("name: "+authorone.getName());
		System.out.println("email: "+authorone.getEmail());
		
		Author author = new Author("John Doe", "johndoe@example.com", 'm');

        // Imprimir la información del autor
        System.out.println(author);
	}
}
