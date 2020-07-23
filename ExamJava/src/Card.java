
public class Card {

	private String cardPattrn;
	private String cardDeno;

	public Card(String cardPattrn, String cardDeno) {
		this.cardPattrn = cardPattrn;
		this.cardDeno = cardDeno;
	}

	public String getCardPattrn() {
		return cardPattrn;
	}

	public void setCardPattrn(String cardPattrn) {
		this.cardPattrn = cardPattrn;
	}

	public String getCardDeno() {
		return cardDeno;
	}

	public void setCardDeno(String cardDeno) {
		this.cardDeno = cardDeno;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%2s)", cardPattrn,cardDeno);
	}

}
