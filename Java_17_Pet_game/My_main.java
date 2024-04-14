package Question_in_class;
import java.util.*;
public class My_main {

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Pet p1 = new Pet("a pet name", 15,15,15);
	System.out.println("What type of pet you are looking for adopting?");
	p1.setPet_type(input.nextLine());
	boolean stop = false;
	
		System.out.println("your pet is a " + p1.getPet_type() +" and your pet has the levels for hunger, energy, and happines as below: \n" 
				+ p1.getHungerlvl() + "\n" + p1.getEnergylvl() + "\n" + p1.getHappinesslvl() + "\n\n\n" + "now you have these options for your pet:" + "\n\n" + "type 'play' if you want to play with the pet" + "\n" + 
					"type 'feed' if you want to feed the pet" + "\n" + "type 'yes' if you want to quit the game right now.");
					String opt = input.nextLine().toLowerCase();
					while(!opt.equals("yes") && !opt.equals("play") && !opt.equals("feed")) {
						System.out.println("Invalid input, please try again!");
					opt = input.nextLine().toLowerCase();}
					if(opt.equals("yes")) {
						System.out.println("your pet is a " + p1.getPet_type() +" and your pet has the levels for hunger, energy, and happines as below: \n" 
								+ p1.getHungerlvl() + "\n" + p1.getEnergylvl() + "\n" + p1.getHappinesslvl());
					}
					while(!stop) {
				if(opt.equals("play")) {
					while(opt.equals("play")){
				p1.setHungerlvl(p1.getHungerlvl() - 1);
				p1.setEnergylvl(p1.getEnergylvl() + 1);
				p1.setHappinesslvl(p1.getHappinesslvl() + 1);
			System.out.println("the hungerlevel is now " + p1.getHungerlvl());
			System.out.println("the energy for your " + p1.getPet_type() + " is decreased to " + p1.getEnergylvl());
			System.out.println("the happiness for your " + p1.getPet_type() + " is increased to " + p1.getHappinesslvl());
			System.out.println("if you are done, type 'yes'. \nif you want to do something again with your pet, type it:");
			opt = input.nextLine().toLowerCase();
			while(!opt.equals("yes") && !opt.equals("play") && !opt.equals("feed")) {
				System.out.println("Invalid input, please try again!");
			opt = input.nextLine().toLowerCase();}
					if(opt.equals("yes")) {
						System.out.println("your pet is a " + p1.getPet_type() +" and your pet has the levels for hunger, energy, and happines as below: \n" 
								+ p1.getHungerlvl() + "\n" + p1.getEnergylvl() + "\n" + p1.getHappinesslvl());
						stop = true;

}}}
				if(opt.equals("feed")) {
					while(opt.equals("feed")){
				p1.setHungerlvl(p1.getHungerlvl() + 1);
				p1.setEnergylvl(p1.getEnergylvl() +1);
				p1.setHappinesslvl(p1.getHappinesslvl() - 1);
			System.out.println("the hunger for your " + p1.getPet_type() + " is increased to " + p1.getHungerlvl());
			System.out.println("the energy for your " + p1.getPet_type() + " is increased to " + p1.getEnergylvl());
			System.out.println("the happiness for your " + p1.getPet_type() + " is decreased to " + p1.getHappinesslvl());
			System.out.println("if you are done, type 'yes'. \nif you want to do something again with your pet, type it:");
			opt = input.nextLine().toLowerCase();
			while(!opt.equals("yes") && !opt.equals("play") && !opt.equals("feed")) {
				System.out.println("Invalid input, please try again!");
			opt = input.nextLine().toLowerCase();}
					if(opt.equals("yes")) {
						System.out.println("your pet is a " + p1.getPet_type() +" and your pet has the levels for hunger, energy, and happines as below: \n" 
								+ p1.getHungerlvl() + "\n" + p1.getEnergylvl() + "\n" + p1.getHappinesslvl());
						stop = true;
					}}}}
				}}
	