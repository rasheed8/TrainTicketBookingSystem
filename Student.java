public class Student extends Passenger {
    private double price;

    // Constructor
    public Student(double price) {
        super(price);
        this.price = price;
    }

    // Getters
    public double getPrice() { 
    	return(this.price); 
    }

    // Setters
    public void setPrice(double ticketPrice) { 
    	this.price = ticketPrice; 
    	this.price = this.price * 2.25;
    }

    // toString
    @Override
    public String toEuros(double fullPrice){
    	return "€ " + fullPrice;
    }


}
