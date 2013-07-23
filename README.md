SolarSystem Project
===================

Object model for the Solar System


Create an object model for the Solar System using the following link:
http://airandspace.si.edu/etp/ss/index.htm

Provide an abstract class called Planet and a concrete subclass called MilkyWayPlanet with default constructors
(no-arg) and a full-arg, overloaded constructors (sets all data). Provide accessors and mutators for mass, 
diameter, escape velocity, revolution period and mean surface temperature (instance fields). 

If no value is provided from the data, then set that characteristic to some default value of your choice. Provide
a toString() method to format the planet data.

Provide an interface called Relatable with two methods:

 boolean isMassSmaller(Object other );
 boolean isDiameterGreater(Object other);

Implement this interface in the Planet class.

Provide a driver class that includes the following features:

 creates an instance of each MilkyWayPlanet class
 collects all planet objects into an array of Planets called solarSystem
 displays all planet data using its toString() method using polymorphism
 displays the comparison of the mass of any two planets of your choice
 displays the comparison of the diameter of any two planets of your choice
