
public abstract class Planet implements Relatable{
	
	String name;
	double mass = 0; // Earth=1
	double diameter = 0; //km
	double rotation = 0; // days
	double temperature = 0; // F
	double velocity = 0; // km/s
	

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
	this.mass = n;
}
public void setDiameter(Double n){
	this.diameter = n;
}
public void setRotation(Double n){
	this.rotation = n;
}
public void setTemperature(Double n){
	this.temperature = n;
}
public void setVelocity(Double n){
	this.velocity = n;
}

@Override
public boolean isMassSmaller(Object other) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isDiameterGreater(Object other) {
	// TODO Auto-generated method stub
	return false;
}

}





		
		
		
	
	
	
	





