import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;



public class Persistencia {
    public static void guardarListas(){
        try {
        File myObj = new File("informaciónVehiculos.txt");
        if (myObj.createNewFile()) {
            System.out.println("Archivo creado: " + myObj.getName());
        } else {
            System.out.println("El archivo ya existe.");
        }
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
        
        try {
            FileWriter myWriter = new FileWriter("informaciónVehiculos.txt");
            PrintWriter pw = new PrintWriter(myWriter);
            pw.println(Vehiculo.toStringVehiculos());
            
            
            myWriter.close();
        
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    
    }
}