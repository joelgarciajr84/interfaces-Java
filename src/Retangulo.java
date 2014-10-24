
public class Retangulo implements iAreaCalculavel {
	
	private int largura;
	
	private int altura;
	
	public Retangulo(int largura, int altura){
		
		this.largura = largura;
		
		this.altura = altura;
	}
	
	public double calculaArea(){
		
		return this.largura * this.altura;
	}

}
