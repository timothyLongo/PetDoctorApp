//Timothy Longo

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)
    public static Character userIn = 'a'; // creating variable used for main decision branching
    public static void main(String[] args) {
    	// creating scanner for inputs
    	Scanner scanner = new Scanner(System.in);
        initializeDogList();
        initializeMonkeyList();

        while (userIn != 'q') {
        	displayMenu();
        	userIn = scanner.next().charAt(0);
        	if (userIn == '1') {
        		intakeNewDog(scanner);
        	}
        	else if (userIn == '2') {
        		intakeNewMonkey(scanner);
        	}
        	else if (userIn == '3') {
        		reserveAnimal(scanner);
        	}
        	else if (userIn == '4') {
        		printAnimals();
        	}
        	else if (userIn == '5') {
        		printAnimals();
        	}
        	else if (userIn == '6') {
        		printAnimals();
        	}
        	else if (userIn == 'q') {
        		System.out.print("Goodbye");
        		System.exit(0);
        	}
        	else {
        		System.out.print("Invalid input, try again.");
        		
        	}
        }
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Squirrel monkey", 5.6, 38.4, 12.3, "MrBananas",
    			"male", "9", "45.5", "02-14-2022", "South America", "Phase III", false, 
    			"United States");
    	Monkey monkey2 = new Monkey("Marmoset", 4.4, 23.4, 10.6, "MrZen",
    			"male", "12", "34.5", "07-16-2022", "South America", "in service", false, 
    			"United States");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    }

    public static void intakeNewDog(Scanner scanner) {
    	scanner.nextLine();
        System.out.println("What is the dog's name?");
        String name;
        name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        
        // additional variables for this method to be inputed, then used to create the new dog object
        String breed;
        String gender;
        String age;
        String weight;
        String acquisitionDate;
        String acquisitionCountry;
    	String trainingStatus;
    	String reservedValidation;
        boolean reserved;
    	String inServiceCountry;
        System.out.println("Enter breed: ");
        breed = scanner.nextLine();
        System.out.println("Enter gender: ");
        gender = scanner.nextLine();
        System.out.println("Enter age: ");
        age = scanner.nextLine();
        System.out.println("Enter weight: ");
        weight = scanner.nextLine();
        System.out.println("Enter date acquired: ");
        acquisitionDate = scanner.nextLine();
        System.out.println("Enter from which country acquired: ");
        acquisitionCountry = scanner.nextLine();
        System.out.println("Enter training status: ");
        trainingStatus = scanner.nextLine();
        System.out.println("Is the animal currently reserved?: \n"
        		+ "[yes]\n"
        		+ "[no]");
        reservedValidation = scanner.nextLine();
        if (reservedValidation.equals("yes")) {
        	reserved = true;
        }
        else if (reservedValidation.equals("no")) {
        	reserved = false;
        }
        else {
        	reserved = false;
        }
        System.out.println("Enter country dog will be servicing: ");
        inServiceCountry = scanner.nextLine();
        
        // now we have all the information to make a new dog object.
        
        Dog  dog4 = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, 
        		trainingStatus, reserved, inServiceCountry);
        //object made	

        dogList.add(dog4); // added object to the arraylist
        System.out.println("---------------------------");
        System.out.println(name + " was added to the data base! =D");
        }
        public static void intakeNewMonkey(Scanner scanner) {
        	scanner.nextLine();
        	System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
            //additional variables for this method to be inputed
            //then used to create the new monkey object
            String speciesValidation;
            String species;
            double tailLength;
            double height;
            double bodyLength;
            String gender;
            String age;
            String weight;
            String acquisitionDate;
            String acquisitionCountry;
        	String trainingStatus;
        	String reservedValidation;
            boolean reserved;
        	String inServiceCountry;
        	//species validation
        	System.out.println("Enter species: ");
            speciesValidation = scanner.nextLine();
            if (speciesValidation.equals("capuchin") || speciesValidation.equals("guenon")
            	|| speciesValidation.equals("macaque") || speciesValidation.equals("marmoset")
            	|| speciesValidation.equals("squirrel monkey") || speciesValidation.equals("tamarin")) {
            	species = speciesValidation;
            }
            else {
            	System.out.println("We cannot accept that species. \n"
            			+ "capuchin, guenon, macaque, marmoset, \n"
            			+ "squirrel monkey, and tamarin "
            			+ "are acceptable.");
            	return; // returns to menu.
            }
            System.out.println("Enter tail length: ");
            tailLength = scanner.nextDouble();
            System.out.println("Enter height: ");
            height = scanner.nextDouble();
            System.out.println("Enter body length");
            bodyLength = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter gender: ");
            gender = scanner.nextLine();
            System.out.println("Enter age: ");
            age = scanner.nextLine();
            System.out.println("Enter weight: ");
            weight = scanner.nextLine();
            System.out.println("Enter date acquired: ");
            acquisitionDate = scanner.nextLine();
            System.out.println("Enter from which country acquired: ");
            acquisitionCountry = scanner.nextLine();
            System.out.println("Enter training status: ");
            trainingStatus = scanner.nextLine();
            System.out.println("Is the animal currently reserved?: \n"
            		+ "[yes]\n"
            		+ "[no]");
            reservedValidation = scanner.nextLine();
            if (reservedValidation.equals("yes")) {
            	reserved = true;
            }
            else if (reservedValidation.equals("no")) {
            	reserved = false;
            }
            else {
            	reserved = false;
            }
            System.out.println("Enter country monkey will be servicing: ");
            inServiceCountry = scanner.nextLine();
            //now we have all characteristics to make a monkey object
            
            Monkey monkey3 = new Monkey(species, tailLength, height, bodyLength, name, gender, age, 
            		weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, 
            		inServiceCountry);
            //object made
            monkeyList.add(monkey3);
        	//object added to the array list
            System.out.println("---------------------------");
            System.out.println(name + " was added to the data base! =D");
        }

        public static void reserveAnimal(Scanner scanner) {
        	scanner.nextLine();
        	System.out.println("Available animals to reserve: \n");
        	System.out.println("---------------------------");
        	//prints available animals to reserve
    		for (int i = 0; i < monkeyList.size(); ++i) {
    			if ((monkeyList.get(i).getTrainingStatus().equals("in service"))
    					&& (monkeyList.get(i).getReserved() == false)) {
    				System.out.println(monkeyList.get(i).getName() + ": monkey");
    			}
    		}
    		for (int i = 0; i < dogList.size(); ++i) {
    			if ((dogList.get(i).getTrainingStatus().equals("in service"))
    					&& (dogList.get(i).getReserved() == false)) {
    				System.out.println(dogList.get(i).getName() + ": dog");
    			}
            }
    		System.out.println("Enter the name of the animal you wish to reserve.\n"
    				+ "Enter 'r' to return to menu");
    		String userReserve = scanner.nextLine();
    		if (userReserve.equals('r')) {
    			return;
    		}
    		//this checks every monkey in the array list to find the match and change reserve type
    		for (int i = 0; i < monkeyList.size(); ++i) {
    			if (userReserve.equals(monkeyList.get(i).getName())){
    				monkeyList.get(i).setReserved(true);
    				System.out.println();
    				System.out.println(monkeyList.get(i).getName() + " from " 
    						+ monkeyList.get(i).getAcquisitionLocation() + " is now reserved =D");
    			}
    		}
    		//this checks every dog in the array list to find the match and change reserve type
    		for (int i = 0; i < dogList.size(); ++i) {
    			if (userReserve.equals(dogList.get(i).getName())){
    				dogList.get(i).setReserved(true);
    				System.out.println();
    				System.out.println(dogList.get(i).getName() + " from "
    						+ dogList.get(i).getAcquisitionLocation() + " is now reserved =D");
    			}
    		}	
        }
    
        public static void printAnimals() {
        	if (userIn == '4') {
        	//print a list of all dogs
        		for (int i = 0; i < dogList.size(); ++i) {
        			System.out.print(dogList.get(i).getName());
        			System.out.print(", from " + dogList.get(i).getAcquisitionLocation()
        			+ ", reserved: " + dogList.get(i).getReserved());
        			System.out.println();
        		}
        	}
        	else if (userIn == '5') {
        	//prints all monkeys in the list
        		for (int i = 0; i < monkeyList.size(); ++i) {
        			System.out.print(monkeyList.get(i).getName());
        			System.out.print(", from " + monkeyList.get(i).getAcquisitionLocation()
        			+ ", reserved: " + monkeyList.get(i).getReserved());
        			System.out.println();
        		}
        	}
        	else if (userIn == '6') {
        		System.out.println("Available animals: \n");
        		System.out.println("---------------------------");
        		//this checks every monkey's training status with its reserved status
        		//if both meet requirements, the name and animal type are displayed
        		for (int i = 0; i < monkeyList.size(); ++i) {
        			if ((monkeyList.get(i).getTrainingStatus().equals("in service"))
        					&& (monkeyList.get(i).getReserved() == false)) {
        				System.out.println(monkeyList.get(i).getName() + ": monkey");
        			}
        		}
        		for (int i = 0; i < dogList.size(); ++i) {
        			if ((dogList.get(i).getTrainingStatus().equals("in service"))
        					&& (dogList.get(i).getReserved() == false)) {
        				System.out.println(dogList.get(i).getName() + ": dog");
        			}
        		}
        	}
        }
}

