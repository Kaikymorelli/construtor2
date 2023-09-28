package metodoconstrutor2;

public class EnderecoObjeto {
	
	public static void main (String[] args) { 

		Endereco endereco = new Endereco(); 


		endereco.setId(1); 

		endereco.setLogradouro("praças"); 

		endereco.setNumero(233); 

		endereco.setComplemento("Casa"); 

		endereco.setBairro("Bancários"); 

		endereco.setCidade("São Paulo"); 

		endereco.setCep("18207845"); 

		endereco.setUf("SP"); 
		
		System.out.println(endereco.getId());
		System.out.println(endereco.getLogradouro());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getComplemento());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getCep());
		System.out.println(endereco.getUf());

		} 

}
