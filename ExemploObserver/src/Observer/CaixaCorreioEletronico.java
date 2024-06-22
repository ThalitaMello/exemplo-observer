package Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CaixaCorreioEletronico extends Thread{
	
	private List<ChegadaRevistaObserver> observers = new ArrayList<ChegadaRevistaObserver>();
	
	public void addChegadaRevistaObserver(ChegadaRevistaObserver observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int valor = scanner.nextInt();
			
			if(valor== 1) {
				ChegadaRevistaEvent event = new ChegadaRevistaEvent(new Date());
				
				for(ChegadaRevistaObserver observer: this.observers) {
					observer.chegou(event);
				}
			}else {
				System.out.println("Sem notificação");
			}
		}
	}

}
