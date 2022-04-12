package modelo;

import javax.swing.JOptionPane;


public class Arreglo {
    int A [] = new int[5];
   
    public void Cargar(){
        for (int i = 0; i < 5 ; i++) {
            A[i]=Integer.parseInt(JOptionPane.showInputDialog("A[" + i + "]:"));
        }
    }    
    public void Invertir() {
        int j = A.length -1;
        String salida = "Los datos invertidos son: "; 
        for (int i = 4; i >= 0; i--) {
            salida = salida + A[i] + " ";
        }
        JOptionPane.showMessageDialog(null,salida);
    }
    public void OrdenarB(int [] Arreglo) {
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A.length; j++){
                        if (A[i] < A[j]) {
                            int aux1 = A[i];
                            A[i] = A[j];
                            A[j] = aux1;
                        }
                }        
            }
    }
    public void Secuencial(){
            for (int i = 0; i < A.length; i++){
                for (int j = 0; j < A.length; j++){
                        if (A[i] > A[j]){
                            int aux = A[i];
                            A[i] = A[j];
                            A[j] = aux;
                        }
                }
            }
    }
    public void Imprimir(){
        String salida = "Los datos del arreglo son:\n ";
        for (int i=0; i<5; i++){
                salida=salida + A[i]+" ";
        }
        JOptionPane.showMessageDialog(null,salida);
    }
}
    
