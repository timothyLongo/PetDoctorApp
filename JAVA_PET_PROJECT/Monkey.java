//Timothy Longo

public class Monkey extends RescueAnimal {

	//Instance Variables - special features of monkeys
	private String species;
	private double tailLength;
	private double height;
	private double bodyLength;
	
	//constructor - characteristics of monkey objects
	public Monkey (String species, double tailLength, double height, double bodyLength,
	String name, String gender, String age, String weight, String acquisitionDate, 
	String acquisitionCountry,String trainingStatus, boolean reserved, String inServiceCountry) {
		
		setSpecies(species);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);   
	}
	
	//setters
	public void setSpecies(String s) {
		species = s;
	}
	public void setTailLength(double d) {
		tailLength = d;
	}
	public void setHeight(double d) {
		height = d;
	}
	public void setBodyLength(double d) {
		bodyLength = d;
	}
	
	//getters
	public String getSpecies() {
		return species;
	}
	public double getTailLength() {
		return tailLength;
	}
	public double getHeight() {
		return height;
	}
	public double getBodyLength() {
		return bodyLength;
	}

}
