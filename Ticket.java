
public class Ticket {

    public String toString(String start, String end, String euros){

        System.out.println("Departing From: " + start + " --- " + "Arriving To: " + end + " ---- " + "Price: " + euros + "0\n");
        return "\n";

    }


    public String roundTo(String value, int places){
        if(value.length() >= 6){
            return value.substring(0,places);
        }
        else{
            return value;
        }
    }


    public static void main(String[] args) {

        double price = 1.00;
        String start;
        String end;
        String status;
        int trainCapacity = 0;


        Train train1 = new Train(trainCapacity);
        train1.setCapacity(trainCapacity);
        

        Passenger passenger1 = new Adult(price);
        Adult adult = (Adult)passenger1;
        Journey journey1 = new Journey("Maynooth","Dublin Connolly");
        adult.setPrice(price);
        double stops1 = journey1.getStops();
        double fullPrice1 = adult.getPrice() * stops1;
        trainCapacity = train1.getCapacity();
        status = train1.addPassenger(trainCapacity);
        if (status == ""){ 
            String euros1 = adult.toEuros(fullPrice1);
            euros1 = adult.roundTo(euros1, 6);
            adult.toString(journey1.start, journey1.end, euros1);
        }
        else {
            System.out.println(status);
        }


        Passenger passenger2 = new Student(price);
        Student student = (Student)passenger2;
        Journey journey2 = new Journey("Sligo","Drumcondra");
        student.setPrice(price);
        double stops2 = journey2.getStops();
        double fullPrice2 = student.getPrice() * stops2;
        trainCapacity = train1.getCapacity();
        status = train1.addPassenger(trainCapacity);
        if (status == ""){
            String euros2 = student.toEuros(fullPrice2);
            euros2 = student.roundTo(euros2, 6);

            student.toString(journey2.start, journey2.end, euros2);
        }
        else{   
            System.out.println(status);    
        }
       

        Passenger passenger3 = new Senior(price);
        Senior senior = (Senior)passenger3;
        Journey journey3 = new Journey("Ballymote","Sligo");
        student.setPrice(price);
        double stops3 = journey3.getStops();
        double fullPrice3 = senior.getPrice() * stops2;
        trainCapacity = train1.getCapacity();
        status = train1.addPassenger(trainCapacity);
        if (status == ""){
            String euros3 = student.toEuros(fullPrice2);
            euros3 = senior.roundTo(euros3, 6);

            senior.toString(journey3.start, journey3.end, euros3);
        }
        else{   
            System.out.println(status);    
        }


        Passenger passenger4 = new Student(price);
        Student student2 = (Student)passenger4;
        Journey journey4 = new Journey("Mullingar","Dublin Connolly");
        student2.setPrice(price);
        double stops4 = journey4.getStops();
        double fullPrice4 = student2.getPrice() * stops4;
        trainCapacity = train1.getCapacity();
        status = train1.addPassenger(trainCapacity);
        if (status == ""){
            String euros4 = student2.toEuros(fullPrice4);
            euros4 = student2.roundTo(euros4, 6);

            student2.toString(journey4.start, journey4.end, euros4);
        }
        else{   
            System.out.println(status);    
        }


        Passenger passenger5 = new Adult(price);
        Adult adult2 = (Adult)passenger5;
        Journey journey5 = new Journey("Dublin Connolly","Boyle");
        adult2.setPrice(price);
        double stops5 = journey5.getStops();
        double fullPrice5 = adult2.getPrice() * stops2;
        trainCapacity = train1.getCapacity();
        status = train1.addPassenger(trainCapacity);
        if (status == ""){
            String euros5 = adult2.toEuros(fullPrice5);
            euros5 = student.roundTo(euros5, 6);

            adult2.toString(journey5.start, journey5.end, euros5);
        }
        else{   
            System.out.println(status);    
        }


        Passenger passenger6 = new Child(price);
        Child child = (Child)passenger6;
        Journey journey6 = new Journey("Dublin Connolly","Boyle");
        child.setPrice(price);
        double stops6 = journey6.getStops();
        double fullPrice6 = child.getPrice() * stops6;
        trainCapacity = train1.getCapacity();
        status = train1.addPassenger(trainCapacity);
        if (status == ""){
            String euros6 = child.toEuros(fullPrice6);
            euros6 = student.roundTo(euros6, 6);

            child.toString(journey6.start, journey6.end, euros6);
        }
        else{   
            System.out.println(status);    
        }


        Passenger passenger7 = new Adult(price);
        Adult adult3 = (Adult)passenger7;
        Journey journey7 = new Journey("Enfield","Kilcock");
        adult3.setPrice(price);
        double stops7 = journey7.getStops();
        double fullPrice7 = adult3.getPrice() * stops7;
        trainCapacity = train1.getCapacity();
        status = train1.addPassenger(trainCapacity);
        if (status == ""){
            String euros7 = child.toEuros(fullPrice7);
            euros7 = student.roundTo(euros7, 6);

            adult3.toString(journey7.start, journey7.end, euros7);
        }
        else{   
            System.out.println(status);

        }
    }
}
