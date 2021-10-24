import java.util.Scanner;
public class Principal {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de pisos: ");
        int piso = sc.nextInt();
        System.out.println("Ingrese el numero de espacios: ");
        int espacio = sc.nextInt();
        //Llamando al atributo de clase Vehiculo
        Vehiculo.vehiculos = new Vehiculo[piso][espacio];
        //Llamando al atributo de clase Sensor
        Sensor.sensores = Sensor.asignarSensores(piso, espacio);
        //Llamando y asignando valor al atributo tamaño de la clase Vehiculo
        int tamaño = piso*espacio; 
        Vehiculo.tamano = tamaño;
        System.out.println("¿Qué desea hacer?");
        System.out.println("0: Salir");
        System.out.println("1: Imprime sensores desocupados");
        System.out.println("2: Parquear e ingresar información del vehiculo");
        System.out.println("3: Parquear e ingresar información del vehiculo con valor comercial");
        System.out.println("4: Información de todos los vehiculos almacenados");
        System.out.println("5: Cantidad de vehiculos almacenados");
        System.out.println("6: Estado de un sensor");
        System.out.println("7: Estado de todos los sensores");
        System.out.println("8: Muestra la información de todos los vehiculos de ese color ingresado" );
        System.out.println("9: Muestra la información de los vehiculos ordenados por valor comercial");
            int ingreso = sc.nextInt();
        while (ingreso!=0){
            switch(ingreso){
                //case 0:
                    //System.out.println("Saliendo...");
                    //break;
                case 1:
                    System.out.println("Sensores libres: "+"\n" + Sensor.sensorLibre());
                    break;
                case 2:
                    System.out.println("En que piso y espacio desea parquear el vehiculo");
                    int piso2 = sc.nextInt();
                    int espacio2 = sc.nextInt();
                    if((Sensor.sensores[piso2-1][espacio2-1].getEstado() == 0)){
                        System.out.println("Ingreso");
                        System.out.println("Ingrese la placa");
                        String placa2 = sc.next();
                        System.out.println("Ingrese la marca");
                        String marca2 = sc.next();
                        System.out.println("Ingrese el color");
                        String color2 = sc.next();
                        Vehiculo v1 = new Vehiculo(placa2,marca2, color2);
                        Vehiculo.vehiculos[piso2-1][espacio2-1] = v1;
                        Sensor.sensores[piso2-1][espacio2-1].setEstado(1);
                        System.out.println("Vehiculo registrado");
                    }else {
                        System.out.println("No lo puede parquear");
                    }
                    break;
                case 3:
                    System.out.println("En que piso y espacio desea parquear el vehiculo");
                    int piso3 = sc.nextInt();
                    int espacio3 = sc.nextInt();
                    if(Sensor.sensores[piso3-1][espacio3-1].getEstado() == 1){
                        System.out.println("No se puede parquear");
                    } else {
                        System.out.println("Ingresa");
                        System.out.println("Ingrese la placa");
                        String placa3 = sc.next();
                        System.out.println("Ingrese la marca");
                        String marca3 = sc.next();
                        System.out.println("Ingrese el color");
                        String color3 = sc.next();
                        System.out.println("Ingrese el valor comercial");
                        int valor3 = sc.nextInt();
                        Vehiculo v1 = new Vehiculo(placa3, marca3, color3, valor3);
                        Vehiculo.vehiculos[piso3-1][espacio3-1] = v1;
                        Sensor.sensores[piso3-1][espacio3-1].setEstado(1);
                        System.out.println("Vehiculo registrado");
                    }
                    break;
                case 4:
                        System.out.println(Vehiculo.toStringVehiculos());
                    break;
                case 5: 
                    System.out.println("En estos momentos en el edificio hay: " + Vehiculo.cantidadVehiculos()+ " vehiculos parqueados");
                    break;
                case 6:
                    System.out.println("Ingrese el piso: ");
                    int piso4 = sc.nextInt();
                    System.out.println("Ingrese el espacio: ");
                    int espacio4 = sc.nextInt();
                    System.out.println(Sensor.sensores[piso4-1][espacio4-1].toString());
                    break;
                case 7: 
                    System.out.println(Sensor.sensoresEstado());
                    break;
                case 8:
                    System.out.println("Que color desea buscar");
                    String color_nuevo = sc.next();
                    Vehiculo.toColorVehiculos(color_nuevo);
                    /*Vehiculo.setColor(color_nuevo);
                    if(color_nuevo.equalsIgnoreCase(Vehiculo.getColor())){
                        System.out.println();
                    }*/
                    break;
                case 9:
                    System.out.println(Vehiculo.ordenarVehiculoValor(Vehiculo.vehiculos));
                    break;
                default:
                    System.out.println("Comando incorrecto");
                    break;
            }
            System.out.println("¿Qué desea hacer?");
            ingreso = sc.nextInt();
        }
        System.out.println("Saliendo...");
    }
}