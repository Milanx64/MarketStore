
public class Card {
	
	private double turnover;
	private double discountRate;
	private String type;
	private Customer customer;
	
	Card(Customer customer, double turnover, String type){
		this.customer = customer;
		this.turnover = turnover;
		this.type = type;
	}
	
	//Set discountRate depending on type of card and turnover;
	Card initializeDiscountRate(Card card) {
		if(card.getType().equalsIgnoreCase("bronze")) {
			if(card.getTurnover() < 100) {
				card.setDiscountRate(0);
			} else if(card.getTurnover()>=100 && card.getTurnover()<=300) {
				card.setDiscountRate(1);
			}else if(card.getTurnover()>300) {
				card.setDiscountRate(2.5);
			}
		}
		if(card.getType().equalsIgnoreCase("silver")) {
			if(card.getTurnover() < 300) {
				card.setDiscountRate(2);
			} else if(card.getTurnover() >= 300) {
				card.setDiscountRate(3.5);
			}
		}
		if(card.getType().equalsIgnoreCase("gold")) {
			double discountGrow;
			int newDiscount;
			discountGrow = card.getTurnover() /100;
			card.setDiscountRate(2);
			if(card.getTurnover() >= 100) {
				if(discountGrow >= 10) {
					card.setDiscountRate(10);
				}else if (discountGrow < 10) {
					newDiscount = (int) discountGrow;
					card.setDiscountRate(card.getDiscountRate() + newDiscount);
				}
			} else if(card.getTurnover() < 100) {
				card.setTurnover(2);
			}
		}
		return card;
	}
	
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
