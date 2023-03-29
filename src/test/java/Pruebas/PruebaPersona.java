package Pruebas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ObjComplejos.Persona;

public class PruebaPersona {
	@Test
	void testPersona() {
		Persona p1= new Persona("Daniel","de la Osa","78135577V",2001,"Chinatown");
		Persona p2= new Persona("Pablo","Biruk","74435577V",2004,"Jamausito");
		Persona p3= new Persona("Pedro","Sanchez","78235525V",2004,"Chapote");
		//p4 con los atributos de p1
		Persona p4= new Persona(p1);
		//p5 igual a p1
		Persona p5=p1;
		Persona p6 = null;
		// clonamos p1 en p6
		try {
			p6 = (Persona) p1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}	
		
		// p1==p2? false
				assertFalse(p1 == p2);
				// p1==p3? false
				assertFalse(p1 == p3);
				// p1==p4? false
				assertFalse(p1 == p4);
				// p1==p5? true
				assertTrue(p1 == p5);
				// p1==p6? false
				assertFalse(p1 == p6);

	}
	

}
