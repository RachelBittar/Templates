package Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {
	
	
	private List<ChegadaDoAniversarianteObserver> observers = new ArrayList<ChegadaDoAniversarianteObserver>();

	public void addChegadaAniversariante(ChegadaDoAniversarianteObserver observer){
		
		this.observers.add(observer);
		
	}
	
	@Override
	public void run() {
		
		Scanner scanner = new Scanner(System.in);
		while(true){
			
			int valor = scanner.nextInt();
			
			if(valor == 1){
				
				ChegadaDoAniversarianteEvent event = new ChegadaDoAniversarianteEvent(new Date());
				for(ChegadaDoAniversarianteObserver observer : this.observers){
					observer.chegou(event);
				}
			}
			
			else
				System.out.println("Alarme Falso!");
			
			
			
		}
		
		
	}

}
