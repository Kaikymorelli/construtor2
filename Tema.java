package metodoconstrutor2;

public class Tema {
	
	private float id;
	private String nome;
	private double valorAluguel;
	private int corToalha;
	
	public Tema () {
	}
	public Tema (String nome) {
	}
	public Tema (float id, String nome, double valorAluguel, int corToalha) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.corToalha = corToalha;
	}
	
	public float getid() {
		return id;
	}
	public void setid(float id) {
		this.id = id;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public double getvalorAluguel() {
		return valorAluguel;
	}
	public void setvalorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public int getcorToalha() {
		return corToalha;
	}
	public void setcorToalha(int corToalha) {
		this.corToalha = corToalha;
	}


}
