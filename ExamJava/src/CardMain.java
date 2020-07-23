public class CardMain {
	public static void main(String[] args) {
		int card_Count = 13;
		int pattrn_Count = 4;
		int deck_Index = 0;
		Card[] deck = new Card[pattrn_Count * card_Count];
		
		for (int i = 0; i < pattrn_Count; i++) {
			String pattrns = "";
			switch (i) {
			case 0: pattrns = "하트";break;
			case 1: pattrns = "클럽";break;
			case 2:	pattrns = "다이아몬드";break;
			case 3:	pattrns = "스페이드";break;
			}
			for (int j = 1; j <= card_Count; j++) {
				String denomi;
				switch (j) {
				case 1:	denomi = "A";break;
				case 11:denomi = "J";break;
				case 12:denomi = "Q";break;
				case 13:denomi = "K";break;
				default:denomi = String.valueOf(j);	break;
				}
				deck[deck_Index++] = new Card(pattrns, denomi);
			}
		}
		
		for(Card c: deck) {
			System.out.println(c);
		}
		
		Card c = new Card("스페이드","13");
		System.out.println(c);
	}	
}
