package programafinal;

public class ProgramaFinalClase {

	public static void main(String[] args) {
		int sbase1=200000; //En este paso se define la variable sbase1 con el valor inical//
		int sbase2= sbase1 + sbase1 *10 / 100; // Se calcula el valor del salario para base2 sumandole el valor del 10% del salario inicial//
		int sbase3= sbase2 + sbase2 *10 / 100; // Se calcula el valor del salario para base3 sumandole el valor del 10% del salario 2. //
		int sbase4= sbase3 + sbase3 *10 / 100; // Se calcula el valor del salario para base4 sumandole el valor del 10% del salario 3. //
		int sbase5= sbase4 + sbase4 *10 / 100; // Se calcula el valor del salario para base5 sumandole el valor del 10% del salario 4. //
		
		int op1 = 0, op2= 0;// Variables inicializadas en 0 lo cual recibiran los datos elegidos en el swtichcase op1 , op2 //"
						// Variable para el numero de empleados a buscar
		String menu ="", menu2="", menu3=""; // Cadena vacia que recibira los datos del menu y menu2 //
		
		do // Inicio del ciclo que permitira permanecer en el programa hasta que el usuario desee salir //
		{
			menu="";
			
			menu2="Ingrese el numero de empleado a consultar";
					
			menu+=" -UMB - Virtual";
			menu+=" Opciones de Menu";
			menu+="1. Consultar Salario por Empleado";
			menu+="2. Consultar Total de los Salarios";
			menu+="3. Salir del Programa";
		// Se crea un JOptionPane.ShowInputpDialog para obtener el valor ingresado por el usuario //
		// Se convierte en entero  y los asignamos a la variable = op1 que sera utilizado para el Switch//
			
			op1=Integer.parseInt(javax.swing.JOptionPane.showInputDialog(menu));
			
			switch (op1) // Esta variable Evaluara el dato que se pasa al case para iniciar la opción //
			
			{
			case 1:
				menu2+="";
				op2=Integer.parseInt(javax.swing.JOptionPane.showInputDialog(menu2));
				int num = op2;
				
				if (num == 1);	{
					descuento (sbase1);
				}
				else if (num == 2);	{
					descuento(sbase2);
				}
				else if (num == 3);	{
					descuento(sbase3);
				}
				else if (num == 4);	{
					descuento(sbase4);
				}
				else {
					//JOptionpane.showMessageDialog es muy parecido al anterior con la diferencia del otro//
					javax.swing.JOptionPane.showMessageDialog(null, "Debe Ingresar una Opcion Valida");
				}
				
				break;
				
			case 2:
				descuento (sbase1);
				descuento (sbase2);
				descuento (sbase3);
				descuento (sbase4);
				descuento (sbase5);
				break;
				
			case 3:
				menu3="";
				menu3+="  UMB - VIRTUAL";
				menu3+="  Muchas Gracias";
				menu3+="-------------------";
				javax.swing.JOptionPane.showMessageDialog(null, menu3);
				break;
				
			default:
				javax.swing.JOptionPane.showMessageDialog(null, "Opción Invalida");// Esta es la validación de la opcion ingresada en el menu switch case// 
				
			}
		}
		while(op1);
	}

	private static void descuento(int salarioBase) {
		int retencion,salud,pension,salarioFinal; //Variable en las que se almacena todos los datos//
		
		double descRetefuente=14;
		double descSalud=8.5;
		double descPension=12;
		String paraFiscales="";
		
		retencion = (int) ((salarioBase * descRetefuente) / 100); // Se calacula el porcentaje de retencion, en un resultado entero//
		salud = (int) ((salarioBase * descSalud) / 100);          // Se calcula el porcentaje de seguridad social, en un resultado entero//
		pension = (int) ((salarioBase * descPension) / 100);      // Se calcula el procentaje de pension, en un resultado entero//
		salarioFinal = (int) (salarioBase-(retencion + salud + pension)); // Se calcula el porcentaje de descuento de paraFiscales al salario base, que se guardara en la variable salarioFinal//
		
		
			paraFiscales+=" -------Cuenta Total del Empleado-------\n\n";
			paraFiscales+=" * $"+salarioBase+"- Salario Base. \n\n";
			paraFiscales+="------------ Menos Descuentos------------\n\n";
			paraFiscales+="* $"+retencion+"-ReteFuente del 14%. \n";
			paraFiscales+="* $"+salud+"-Seguridad Social del 8.5%. \n";
			paraFiscales+="* $"+pension+"-Pension del 12%. \n";
			paraFiscales+="------------------------------------------\n";
			paraFiscales+="* $"+salarioFinal+"-Total del Salario con Descuentos.   \n";
			javax.swing.JOptionPane.showMessageDialog(null, paraFiscales);// Esto aplicara en la pantalla todos los datos calculados, de forma ordenada//
			
			
			
			
			
		
	}
	

}
