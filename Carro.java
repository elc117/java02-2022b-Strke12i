package aula;

public class Carro {
	private boolean parado;
	private double velocidade;
	
	public Carro(double velocidade,boolean parado) {
		this.parado = parado;
		this.velocidade = velocidade;
	}
	
	public boolean getParado() {
		return this.parado;
	}
	
	public double getVelocidade() {
		return this.velocidade;
	}
	
	public void setParado(boolean set) {
		this.parado = set;
	}
	
	public void acelerar() {
		if(this.parado) {
			System.out.println("Não foi possivel acelerar! Carro parado");
			return;
		}
			
		this.velocidade += 10.0;
		System.out.println("A velocidade do carro é "+this.velocidade);
		
	}
	
	
	
}
