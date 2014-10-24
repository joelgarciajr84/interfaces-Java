
public class Quadrado implements iAreaCalculavel {
	
	private int lado;
	
	public Quadrado (int lado){
		
		this.lado = lado;
	}

	public double calculaArea(){
		
		return this.lado * this.lado;
	}
		
}
