public class Train extends Ticket {
    private int capacity = 4;
    private int totalCapacity;

    // Constructor
    public Train(int capacity) {
        this.capacity = capacity;
    }

    // Getters
    public int getCapacity() { 
    	return(this.capacity); 
    }

    // Setters
    public void setCapacity(int capacity) { 
    	this.capacity = capacity; 
    }

    public String addPassenger(){
        totalCapacity++;
        if(totalCapacity >= capacity){
            return "Total Capacity Reached. No more are permitted to board the train.";
        }
        return"";
    }

}