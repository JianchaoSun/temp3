package data;

public class Meat //extends Food
{
	
	private String Name;
	private double Weight;
	
	public Meat() {
		
	}
	
	public Meat(String Name, String Weight) {
		this.Name =Name;
		this.Weight = Double.parseDouble(Weight);
		
	}
	
	public String getName() {
		return Name;
	}

	public double getWeight() {
		return Weight;
	}
	public void setWeight(double Weight) {
		this.Weight = Weight;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String toString() {
		return "Name: "+ Name+" Weight: "+ Weight;
	}
	

}
