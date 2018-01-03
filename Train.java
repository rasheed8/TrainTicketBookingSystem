public class Train extends Ticket {
    private int current_capacity;
    private int totalCapacity = 6;

    // Constructor
    public Train(int capacity) {
        current_capacity = capacity;
    }

    // Getters
    public int getCapacity() { 
    	return(current_capacity++); 
    }

    // Setters
    public void setCapacity(int capacity) { 
    	capacity = current_capacity; 
    }

    public String addPassenger(int capacity){
        if(totalCapacity <= capacity){
            return "\nTotal Capacity Reached. No more are permitted to board the train.";
        }
        return "";
    }

}
