package test;

import carros.CarroBase;
import carros.Crossover;
import carros.Pickup;
import carros.Sedan;
import carros.Suv;
import motores.MotorDiesel;
import motores.MotorGasolina;

public class Test {
	
	
	

	public static void main(String[] args) {
	     //CarroBase carro = new CarroBase(); //composition
	     //carro.imprimirCategoria();
		 //System.out.println("*****hello world 2*****");
	       
		MotorGasolina motorGasolina = new MotorGasolina();//composicion
		
		//inyectando una instancia de motor gasolina al carro sedan
		//esto lo permite el polimorfismo
		//CarroBase carro = new Sedan(motorGasolina);//polimorfismo
		//carro.imprimirCategoria();
		
		CarroBase carro = new Crossover(motorGasolina);
		carro.imprimirCategoria();
		
		
		
		MotorDiesel motorDiesel = new MotorDiesel();
		carro = new Sedan(motorDiesel);//polimorfismo
		carro.imprimirCategoria();
		
		
		carro = new Pickup(motorGasolina);
		carro.imprimirCategoria();
		
		carro = new Pickup(motorDiesel);
		carro.imprimirCategoria();
		
		
		carro = new Sedan(motorDiesel);
		carro.imprimirCategoria();
		
		carro = new Sedan(motorGasolina);
		carro.imprimirCategoria();
		
		carro = new Crossover(motorGasolina);
		carro.imprimirCategoria();
		
		carro = new Crossover(motorDiesel);
		carro.imprimirCategoria();
		
		
		
		
	}
	
}
