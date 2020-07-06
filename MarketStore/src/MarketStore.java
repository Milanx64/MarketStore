
public class MarketStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer(150);
		Card card = new Card(customer,0,"bronze");
		card = card.initializeDiscountRate(card);
		calculatePurchase(card);
		
		Customer customerTwo = new Customer(850);
		Card cardTwo = new Card(customerTwo,600,"silver");
		cardTwo = cardTwo.initializeDiscountRate(cardTwo);
		calculatePurchase(cardTwo);
		
		Customer customerThree = new Customer(1300);
		Card cardThree = new Card(customerThree,1500,"gold");
		cardThree = cardThree.initializeDiscountRate(cardThree);
		calculatePurchase(cardThree);

	}
	
	public static void calculatePurchase(Card card) {
		double discount = card.getCustomer().getValueOfPurchase() * (card.getDiscountRate()/100);
		double total = card.getCustomer().getValueOfPurchase() - discount;
		
		System.out.println("Purchase value: " + card.getCustomer().getValueOfPurchase());
		System.out.println("Discount rate : " + card.getDiscountRate());
		System.out.println("Discount      : " + discount);
		System.out.println("Total         : " + total);
		
	}

}
