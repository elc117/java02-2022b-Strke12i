package aula;

public class CarroTeste {
	public static void main(String[] args) {
		System.out.println("Carro 1");
		Carro c = new Carro(0.0,true);
		System.out.println(c.getParado());
		c.setParado(false);
		c.acelerar();
		c.acelerar();
		System.out.println(c.getVelocidade());
		
		System.out.println("Carro 2");
		Carro c2 = new Carro(10.0,false);
		c2.getVelocidade();
		c2.setParado(true);
		System.out.println(c2.getParado());
	}
}
