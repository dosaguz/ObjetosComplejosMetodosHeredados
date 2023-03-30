package Pruebas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ObjComplejos.Empleado;
import ObjComplejos.Persona;

public class PruebaEmpleado {
	@Test
	void testEmpleado() {
		Persona p1= new Persona("Daniel","de la Osa","78135577V",2001,"Chinatown");
		Persona p2= new Persona("Pablo","Biruk","74435577V",2004,"Jamausito");
		Persona p3= new Persona("Pedro","Sanchez","78235525V",2004,"Chapote");
		Empleado e1= new Empleado(001,"i+D",p1);
		Empleado e2= new Empleado(002,"Finanzas",p2);
		Empleado e3= new Empleado(003,"Derecho",p3);
		Empleado e4 = null;
		// clonamos e1 en e4
		try {
			e4 = (Empleado) e1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}	
		Empleado e5 = e1;
		Empleado e6= new Empleado(001,"i+D",p1);
		
		//Prueba del toString
		System.out.println(e1.toString());

		// e1==e2? false
		assertFalse(e1 == e2);
		// e1==e4? false
				assertFalse(e1 == e4);
		// e1==e5? true
				assertTrue(e1 == e5);
		// e1==e6? false
			assertFalse(e1 == e6);
		// e1 equals e5? True
		assertTrue(e1.equals(e5));
		// e1 equals e2? False
		assertFalse(e1.equals(e2));
		// e1 equals e6? True
		assertTrue(e1.equals(e6));


	}
	

}
