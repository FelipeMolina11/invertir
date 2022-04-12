
package vista;
import javax.swing.JOptionPane;
import modelo.Arreglo;

public class ppal {
    public static void main(String[] args) {
        Arreglo ob = new Arreglo();
        int opc;
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog("menu\n1.Cargar\n2.Imprimir\n3.invertir\n4.Ordenar\n5.Salir\nDigite opcion:"));
            switch(opc){
                case 1:ob.Cargar();break;
            	case 2:ob.Imprimir();
                case 3:ob.Invertir();break;
		case 4:do{
                            opc=Integer.parseInt(JOptionPane.showInputDialog("menu\n1.Burbuja\n2.Secuencial\nDigite opcion:"));
                            switch(opc){
                            case 1:ob.OrdenarB(null);break;
                            case 2:ob.Secuencial();break;
                            }
                }while(opc<0);  
            }
        }while(opc!=5);
    }
}

