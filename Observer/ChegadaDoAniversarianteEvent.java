package Observer;

import java.util.Date;

public class ChegadaDoAniversarianteEvent {
	
	private final Date horachegada; 

	public ChegadaDoAniversarianteEvent(Date  horachegada) {
		this.horachegada = horachegada;
	}
	
	protected Date getHorachegada() {
		return horachegada;
	} 



}
