package metodoconstrutor2;

public class Cliente {
	
	private int id;
	private String nome;
	private String telefone;
	private String cpf;
	private String rg;
	
	
	public Cliente () {
	}
	public Cliente (String nome) {
	}
	public Cliente (int id, String nome, String telefone, String cpf, String rg) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String gettelefone() {
		return telefone;
	}
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getrg() {
		return rg;
	}
	public void setrg(String rg) {
		this.rg = rg;
	}

}
