
public class module2 {
	
	
	public void chemistry() {
		String chem[]={"Organic Chemistry","Physical chemistry","Bio chemistry","Inorganic chemisry","Polymer chemistry"};
		
		System.out.println("The books available in chemisry department are as follow:");
		for (int i=0; i< chem.length; i++) {
			
			System.out.println(chem[1]);
		}
	}
	
	public void physics() {
		String phy[]={"mechanics","Dynamics","Solid state physics","Astro physics","Electromagnetics"};
		
		System.out.println("The books available in Physics department are as follow:");
		for (int j=0; j< phy.length; j++) {
			
			System.out.println(phy[1]);
		}
	}
	
	public void biology() {
		String bio[]={"Zoology","Botony","Medical Science"};
		System.out.println("The books available in Biology  department are as follow:");
		for (int k=0; k< bio.length; k++) {
			
			System.out.println(bio[1]);
		}
	}

}
