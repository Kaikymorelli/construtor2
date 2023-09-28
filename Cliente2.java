package metodoconstrutor2;

public class Cliente2 {
	
public static void main(String [] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setid(1);
		cliente.setnome("Kaiky morelli");
		cliente.settelefone("3262543436");
		cliente.setcpf("356923775336");
		cliente.setrg("325246351716");
		
		
		
		System.out.println(cliente.getid());
		System.out.println(cliente.getnome());
		System.out.println(cliente.gettelefone());
		System.out.println(cliente.getcpf());
		System.out.println(cliente.getrg());
		
		
}
}
