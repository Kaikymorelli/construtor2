package metodoconstrutor2;

public class Aluguel2 {

public static void main(String [] args) {
		
		Aluguel aluguel1 = new Aluguel();
		
		aluguel1.setid(1);
		aluguel1.setdataFesta("01/10");
		aluguel1.sethorarioInicio ("20:00");
		aluguel1.sethorarioTermino ("2:00");
		aluguel1.setvalorCobrado (1000);
		
		
		
		
		
		System.out.println(aluguel1.getid());
		System.out.println(aluguel1.getdataFesta());
		System.out.println(aluguel1.gethorarioInicio());
		System.out.println(aluguel1.gethorarioTermino());
		System.out.println(aluguel1.getvalorCobrado());
	
		
		
}
}
