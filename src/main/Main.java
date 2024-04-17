package main;

import model.Hulk;

//Clase Main
public class Main {
public static void main(String[] args) {
	
   // create object hulk	
   Hulk hulk = new Hulk();
   
   // transform to rage
   hulk.transform();

   // show data
   System.out.println("Nombre: " + hulk.getName());
   System.out.println("Edad: " + hulk.getAge());
   hulk.showPowers();
   System.out.println("Furia: " + hulk.isFuria());
   System.out.println("Potencial: " + hulk.calculatePotential());

   // restaure to original status
   hulk.restaure();
}
}
