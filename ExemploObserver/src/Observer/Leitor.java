package Observer;

public class Leitor implements ChegadaRevistaObserver{

		@Override
		public void chegou(ChegadaRevistaEvent event) {
			System.out.println("Verificar notificação");
			System.out.println("abrir e-mail");
			System.out.println("Ler a Revista");
		}
}
