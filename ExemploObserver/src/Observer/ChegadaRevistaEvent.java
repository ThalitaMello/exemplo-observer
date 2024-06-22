package Observer;

import java.util.Date;

public class ChegadaRevistaEvent {

		private final Date horaDaChegada;
		
		public ChegadaRevistaEvent(Date horaDaChegada) {
			super();
			this.horaDaChegada = horaDaChegada;
		}

		public Date getHoraDaChegada() {
			return horaDaChegada;
		}
}