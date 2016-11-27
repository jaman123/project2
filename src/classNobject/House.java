package classNobject;

public class House {
	//Variable
	public int table = 5;
	public int address;
	public String houseName;
	
	//Constructor 1
	public House(){
		
	}
	// constructor 2
	public House(String houseName){
		this.houseName = houseName;
		
		
	}
	// constructor 3
	public House(String houseName, int address){
	 this.houseName= houseName;
	 this.address=address;
	 
	 
	}
	
	//methods
	public void watchTVShows(){
		System.out.println("Watching Tv game ");
		
	}
	public void sleep(){
		System.out.println("People are sleeping in the bedroom ");
		
	}
	public void addressName(){
		System.out.println("My address is " + address + "Grand Concourse , Apt # 31B" );
	}
	public void noOfTable(){
		System.out.println("No Of Table  "+ table);
		
	}
	public int addHouseSize(int height , int length){
		int total= height + length;
		return total;
		
	}
	public int addHouseArea(int height , int length){
		int area= height * length;
		return area;
		
	}




}
