abstract public class Passenger extends Ticket {
    private double price;

    // Constructor
    public Passenger(double price) {
        this.price = price;

    }

    // Getters
    public double getPrice() { 
    	return(this.price); 
    }


    // Setters
    public void setPrice(double ticketPrice) { 
    	this.price = ticketPrice;
    	 }


    // toString
    public String toEuros(double fullPrice){
    	return "€ " + fullPrice;
    }

    
    
}