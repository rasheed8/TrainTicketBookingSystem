
public class Ticket {

    public String toString(String start, String end, String euros){

        System.out.println("Departing From: " + start + " --- " + "Arriving To: " + end + " ---- " + "Price: " + euros + "0");
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
        int trainCapacity = 4;

        Passenger passenger1 = new Adult(price);
        Adult adult = (Adult)passenger1;
        Journey journey1 = new Journey("Maynooth","Dublin Connolly");
        Train train1 = new Train(trainCapacity);

        adult.setPrice(price);
        train1.setCapacity(trainCapacity);

        double stops = journey1.getStops();
        double fullPrice = adult.getPrice() * stops;

        trainCapacity = train1.getCapacity();
        System.out.println(train1.addPassenger());

        String euros = adult.toEuros(fullPrice);
        euros = adult.roundTo(euros, 6);


        adult.toString(journey1.start, journey1.end, euros);


        Passenger passenger2 = new Student(price);
        Student student = (Student)passenger2;
        Journey journey2 = new Journey("Sligo","Drumcondra");
        Train train2 = new Train(trainCapacity);


        student.setPrice(price);
        train2.setCapacity(trainCapacity);

        double stops2 = journey2.getStops();
        double fullPrice2 = student.getPrice() * stops2;

        trainCapacity = train2.getCapacity();
        System.out.println(train2.addPassenger());

        String euros2 = student.toEuros(fullPrice2);
        euros2 = student.roundTo(euros2, 6);

        student.toString(journey2.start, journey2.end, euros2);


        Passenger passenger3 = new Senior(price);
        Senior senior = (Senior)passenger3;
        Journey journey3 = new Journey("Boyle","Sligo");
        Train train3 = new Train(trainCapacity);


        senior.setPrice(price);
        train3.setCapacity(trainCapacity);

        double stops3 = journey3.getStops();
        double fullPrice3 = senior.getPrice() * stops3;

        trainCapacity = train3.getCapacity();
        System.out.println(train3.addPassenger());

        String euros3 = senior.toEuros(fullPrice3);
        euros3 = senior.roundTo(euros3, 6);

        senior.toString(journey3.start, journey3.end, euros3);


        Passenger passenger4 = new Child(price);
        Child child = (Child)passenger4;
        Journey journey4 = new Journey("Ballymote","Sligo");
        Train train4 = new Train(trainCapacity);


        child.setPrice(price);
        train4.setCapacity(trainCapacity);

        double stops4 = journey4.getStops();
        double fullPrice4 = child.getPrice() * stops4;

        trainCapacity = train4.getCapacity();
        System.out.println(train4.addPassenger());

        String euros4 = child.toEuros(fullPrice4);
        euros4 = child.roundTo(euros4, 6);

        child.toString(journey4.start, journey4.end, euros4);

        Passenger passenger5 = new Student(price);
        Student student2 = (Student)passenger5;
        Journey journey5 = new Journey("Sligo","Drumcondra");
        Train train5 = new Train(trainCapacity);


        student2.setPrice(price);
        train5.setCapacity(trainCapacity);

        double stops5 = journey5.getStops();
        double fullPrice5 = student2.getPrice() * stops5;

        trainCapacity = train5.getCapacity();
        System.out.println(train5.addPassenger());

        String euros5 = student2.toEuros(fullPrice5);
        euros5 = student2.roundTo(euros5, 6);

        student2.toString(journey5.start, journey5.end, euros5);
       
    }
}