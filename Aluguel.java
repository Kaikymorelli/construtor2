package metodoconstrutor2;

public class Aluguel {
	private long id;
	private String dataFesta;
	private String horarioInicio;
	private String horarioTermino;
	private double valorCobrado;
	
	
	public Aluguel () {
	}
	public Aluguel (String dataFesta) {
	}
	public Aluguel (long id, String dataFesta, String horarioInicio, String horarioTermino, double valorCobrado) {
		this.id = id;
		this.dataFesta = dataFesta;
		this.horarioInicio = horarioInicio;
		this.horarioTermino = horarioTermino;
		this.valorCobrado = valorCobrado;
		
		
	}
	
	public long getid() {
		return id;
	}
	public void setid(long id) {
		this.id = id;
	}
	public String getdataFesta() {
		return dataFesta;
	}
	public void setdataFesta(String dataFesta) {
		this.dataFesta = dataFesta;
	}
	public String gethorarioInicio() {
		return horarioInicio;
	}
	public void sethorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	public String gethorarioTermino() {
		return horarioTermino;
	}
	public void sethorarioTermino(String horarioTermino) {
		this.horarioTermino = horarioTermino;
	}
	public double getvalorCobrado() {
		return valorCobrado;
	}
	public void setvalorCobrado(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

}
