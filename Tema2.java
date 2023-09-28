package metodoconstrutor2;

public class Tema2 {
public static void main(String [] args) {
		
		Tema tema1 = new Tema();
		
		tema1.setid(1);
		tema1.setnome("Kaiky morelli");
		tema1.setvalorAluguel(1000);
		tema1.setcorToalha(1);
		
		
		
		
		System.out.println(tema1.getid());
		System.out.println(tema1.getnome());
		System.out.println(tema1.getvalorAluguel());
		System.out.println(tema1.getcorToalha());
		
		
		
}
}
