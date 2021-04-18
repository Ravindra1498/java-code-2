package educationCulture;

public class EducationSystem {

	public static void main(String[] args) {
		
		Graduation gd = new Graduation();
		Engineering eg = new Engineering();
		ComputerScienceEngg cse = new ComputerScienceEngg();

		System.out.println("---------call all the methods in Graduation class-----");
		gd.streams();
		gd.hscPercentage();
		gd.ageCritera();
		
		System.out.println("-------------call all the methods in Engineering class---------");
		eg.streams();
		eg.typeOfEngineering();
		
		System.out.println("------------call all the methods in ComputerScienceEngg class---------------");
		cse.hscPercentage();
		cse.subjects();
	}

}
