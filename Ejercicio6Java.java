import java.util.*;

public class Ejercicio6Java{
    static Scanner leer = new Scanner(System.in);   
    public static void main (String[] args){
        int menos25 = 0;
        int mas25 = 0;
        int cantidadMenos = 0;
        int cantidadMas = 0;
        int edad = 0;
        double promedioMas = 0;
        double promedioMenos = 0;

        for(int i=0;i<100;i++){
            edad = getInt("Ingrese la edad");
            if(edad < 25){
                cantidadMenos++;
                menos25 = menos25 + edad;
            }
            else{
                cantidadMas++;
                mas25 = mas25 + edad;
            }
        }

        promedioMas = (double)mas25 / cantidadMas;
        promedioMenos = (double)menos25 / cantidadMenos;
        System.out.println("El promedio de personas menores de 25 años es de " + promedioMenos + " y el promedio de personas mayores o iguales de 25 años es de " + promedioMas);
        
    }

    public static int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }

}