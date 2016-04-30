package Observer;

public class FestaDeAniversario {

	public static void main(String[] args) {
		 
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.addChegadaAniversariante(namorada);
		porteiro.start();

	}

}
