Cours de Java
Chapitre 1 - Correction 5 : 5 points pour Gryfondor
public class R_C2A5 { 

 public static void main(String[] args) { 
  Scanner inputChecker = new Scanner(System.in); 
  System.out.println("In which Hogward house would you like to ?"); 
  String hogwardHouse = inputChecker.nextLine(); 
  inputChecker.close(); 
  System.out.println("You want to go to " + hogwardHouse.toUpperCase() + " ? But you're just a muggle, the best mages speak Java !"); 
 } 
}