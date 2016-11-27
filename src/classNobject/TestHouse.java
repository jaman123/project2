package classNobject;
public class TestHouse {

	public static void main(String[] args) {
		House myHouse =new House("jaman",1122);
		System.out.println(myHouse.houseName+" "+myHouse.address);
		myHouse.watchTVShows();
		myHouse.sleep();
		myHouse.addressName();
		myHouse.noOfTable();
		int totalSize =myHouse.addHouseSize(9,9);
		 System.out.println(totalSize);
	int totalArea =myHouse.addHouseArea(3,3);
	System.out.println(totalArea);
	
		
	}

} 