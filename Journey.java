public class Journey extends Ticket{
	String start;
	String end;
	String[] trainStations = { "Sligo","Collooney","Ballymote","Boyle","Carrick-On-Shannon","Dromod","Longford","Edgeworthstwon","Mullingar","Enfield","Kilcock","Maynooth","Drumcondra","Dublin Connolly"};

	public Journey(String start,String end){
		this.start = start;
		this.end = end;
		}

	public void setJourney(String start, String end) { 
    	this.start = start;
    	this.end = end;
    	 }


    public String getJourney() { 
    	return(this.start + " " + this.end); 
    }

	public int getStops(){
                int firstStation = 0;
                int lastStation = 0;
		for(int i = 0; i < trainStations.length; i++){
			if(trainStations[i].equals(this.start)){
				firstStation = i + 1;
			}
		}
		for(int j = 0; j < trainStations.length; j++){
			if(trainStations[j].equals(this.end)){
				 lastStation = j + 1;
			}
		}
		int between = lastStation - firstStation;
		if(between < 0){
			between = between * -1;
		}
		return between;
	}


}
