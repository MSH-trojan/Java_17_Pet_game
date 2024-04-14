package Question_in_class;

public class Pet{
	private String pet_type;
	private int hungerlvl;
	private int energylvl; 
	private int happinesslvl;	
public  Pet(){
	pet_type = "cat";
}
public Pet(String pt,int hul,int el,int hal){
	pet_type = pt;
	hungerlvl = hul;
	energylvl = el;
	happinesslvl = hal;
}
public String getPet_type(){
return pet_type; 
}
public void setPet_type(String new_pet_type){
	pet_type = new_pet_type;
}
public int getHungerlvl(){
return hungerlvl;
}
public void setHungerlvl(int new_hungerlvl){
	hungerlvl = new_hungerlvl;
}
public int getEnergylvl(){
return hungerlvl;
}
public void setEnergylvl(int new_energylvl){
	energylvl = new_energylvl;
}
public int getHappinesslvl(){
return happinesslvl;
}
public void setHappinesslvl(int new_happinesslvl){
	happinesslvl = new_happinesslvl;
}
}
