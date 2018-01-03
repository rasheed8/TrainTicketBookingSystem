public class Adult extends Passenger {
    private double price;

    // Constructor
    public Adult(double price) {
        super(price);
        this.price = price;
    }

    // Getters
    public double getPrice() { 
    	return(this.price); 
    }

    // Setters
    public void setPrice(double ticketPrice) { 
    	ticketPrice = 1.00;
    	this.price = ticketPrice; 
    	this.price = this.price * 4.25;
    }

    // toString
    @Override
    public String toEuros(double fullPrice){
    	return "€ " + fullPrice;
    }

}
