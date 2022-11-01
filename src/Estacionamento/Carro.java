package Estacionamento;

public class Carro {
	
	private String placa;
	private String nome;
	private int vaga;
	
	
	public Carro(String p, String n, int v) {
		super();
		this.setVaga(v);
		this.setPlaca(p);
		this.setNome(n);
		
	}	
	public int getVaga() {
		return vaga;
	}
	public void setVaga(int vaga) {
		this.vaga = vaga;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Vaga: " + this.getVaga() + "\nPlaca: " + this.getPlaca() + "\nNome: " + this.getNome();
	}
	

}
