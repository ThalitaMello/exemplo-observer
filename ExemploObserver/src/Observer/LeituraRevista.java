package Observer;

public class LeituraRevista {

		public static void main(String[] args) {
			Leitor leitor = new Leitor();
			CaixaCorreioEletronico caixacorreioeletronico = new CaixaCorreioEletronico();
			
			caixacorreioeletronico.addChegadaRevistaObserver(leitor);
			
			caixacorreioeletronico.start();			
		}
}
