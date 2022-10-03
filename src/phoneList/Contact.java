package phoneList;

/*
 * This contains info for a single contact
 * 
 * Parameters Needed to Store
 *   - Contact's Name
 *   - Contact's Phone Number
 *   
 * Needed Methods
 *   - Constructor(s)
 *   - getter methods
 *   - Setter methods not necessary unless Constructor
 *        initialize variables.
 *   - Override toString() so that Contact can
 *        be printed as part of a list.
 * 
 */



public class Contact {
private String Name;
	private long Number;
	
	public  String getName() {
		
		return Name;
	}

	public void setName(String name) {
		// makes Name = name 
		Name = name;
	}
public void setNumber(long number) {
	Number = number;
}
	public long getNumber() {
		// return number
		return Number;
	}

	public boolean equals(Contact obj) {
		
		return Name.equals(getName()) &&  Number==obj.getNumber();
		//return Name.equals(getName()) &&  Number==obj.getNumber();

	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name : "+Name+" Phone : "+Number;
	}

}
   