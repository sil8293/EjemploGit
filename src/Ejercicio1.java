import acm.graphics.*;
import acm.program.*;

public class Ejercicio1 extends GraphicsProgram{


	public void run(){
		//cambio el tama�o de l�a ventana
		setSize(800,600);
		//llamo el m�todo que dibuja la pir�mide
		pintaPiramide();
	}

	public void pintaPiramide(){
		int numLadrillosBase = 14;
		int anchoLadrillo = 30;
		int altoLadrillo=12;
		
		
		
		int altoPiramide=numLadrillosBase*altoLadrillo;
		int basePiramide=numLadrillosBase*anchoLadrillo;
		
		
		int alto=getHeight();
		int ancho=getWidth();
		
		
		//querio yo del futuro ya est� terminada la pir�mide

		for(int j=0; j<numLadrillosBase ;j++){
			for (int i=0; i< numLadrillosBase-j;i++){
				GRect ladrillo= new GRect (anchoLadrillo,altoLadrillo);
				
				add(ladrillo,
						ancho/2- basePiramide/2+ anchoLadrillo*j/2 + anchoLadrillo*i,
						alto-2*altoLadrillo-altoLadrillo*j);
				pause(40);
			}
			
		}

	}
}
