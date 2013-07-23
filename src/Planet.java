
public abstract class Planet implements Relatable{
	
	private String name;
	private double mass = 0; // Earth=1
	private double diameter = 0; //km
	private double rotation = 0; // days
	private double temperature = 0; // F
	private double velocity = 0; // km/s
	

//toString()
public String toString(){
	return "Planet: "+name+" - Mass:"+mass+" (Earth=1)"+", Diameter:"+diameter+" Km"+", Rotation:"+rotation+" days"+", Temperature:"+temperature+" F"+", Velocity:"+velocity+" Km/s";
}

//getters

public String getName(){
	return name;
}
public double getMass(){
	return mass;
}
public double getDiameter(){
	return diameter;
}
public double getRotation(){
	return rotation;
}
public double getTemperature(){
	return temperature;
}
public double getVelocity(){
	return velocity;
}

//setters
public void setName(String n){
	this.name = n;
}
public void setMass(Double n){
	if(n>0){
	this.mass = n;
	}
}
public void setDiameter(Double n){
	if(n>0){
	this.diameter = n;
	}
}
public void setRotation(Double n){
	if(n>0){
	this.rotation = n;
	}
}
public void setTemperature(Double n){
	if(n>0){
	this.temperature = n;
	}
}
public void setVelocity(Double n){
	if(n>0){
	this.velocity = n;
	}
}

@Override
public boolean isMassSmaller(Object other) {
	// TODO Auto-generated method stub
	if(other instanceof Planet){
		if(this.getMass() < ((Planet)other).getMass()){
			return true;
		}
	}
	return false;
}

@Override
public boolean isDiameterGreater(Object other) {
	// TODO Auto-generated method stub
	if (other instanceof Planet){
		if (this.getDiameter() > ((Planet)other).getDiameter()){
		return true;
		}
	}
	return false;
}

}





		
		
		
	
	
	
	





