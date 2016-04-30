package Observer;

public class Namorada implements ChegadaDoAniversarianteObserver {

	public Namorada() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void chegou(ChegadaDoAniversarianteEvent event) {
		System.out.println("Apagar");
		System.out.println("Silencio");
		System.out.println("Surpresa");
	}

}
