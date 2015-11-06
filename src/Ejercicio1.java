import acm.graphics.*;
import acm.program.*;

public class Ejercicio1 extends GraphicsProgram{


	public void run(){
		//cambio el tamaño de lña ventana
		setSize(800,600);
		//llamo el método que dibuja la pirámide
		pintaPiramide();
	}

	public void pintaPiramide(){
		int numLadrillosBase = 14;
		int anchoLadrillo = 30;
		int altoLadrillo=12;


		for(int j=0; j<numLadrillosBase ;j++){
			for (int i=0; i< numLadrillosBase;i++){
				GRect ladrillo= new GRect (anchoLadrillo,altoLadrillo);
				add(ladrillo,anchoLadrillo*j/2 + anchoLadrillo*i,altoLadrillo*j-i);
				pause(10);
			}
			
		}

	}
}
