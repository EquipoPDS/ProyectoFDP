import java.util.Scanner;
import java.util.Date;
 
public class Principal {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de pisos: ");
        int piso = sc.nextInt();
        System.out.println("Ingrese el numero de espacios: ");
        int espacio = sc.nextInt();
        System.out.println("Tarifa carros: 5.000/h");
        System.out.println("Tarifa motos: 2.500/h");
        
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
        System.out.println("10: Desactivar sensor");
        System.out.println("11: Crea un archivo con toda la información que se creó");


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
                        System.out.println("Que tipo de vehiculo desea parquear, (Moto o Carro)");
                        String tipo_vehiculo= sc.next();
                        Date hora11 = new Date();
                        if(tipo_vehiculo.equalsIgnoreCase("Moto")){
                            Vehiculo m1 = new Moto(placa2,marca2, color2);
 
                            Vehiculo.vehiculos[piso2-1][espacio2-1] = m1;
                            Sensor.sensores[piso2-1][espacio2-1].setEstado(1);
                            //m1.hora();
                            
                            System.out.println(m1.toString()+ m1.imprimir());
                            
                            System.out.println("Vehiculo registrado "+m1.horaIngreso());
 
                        }else if(tipo_vehiculo.equalsIgnoreCase("Carro")){
                            Vehiculo c1 = new Carro(placa2,marca2, color2);
                            Vehiculo.vehiculos[piso2-1][espacio2-1] = c1;
                            Sensor.sensores[piso2-1][espacio2-1].setEstado(1);
                            //c1.hora();
                            System.out.println(c1.toString()+ c1.imprimir());
                            System.out.println("Vehiculo registrado "+ c1.horaIngreso());
 
                        }
 
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
 
                        System.out.println("Que tipo de vehiculo desea parquear, (Moto o Carro)");
                        String tipo_vehiculoo= sc.next();
                        Date hora11 = new Date();
                        if(tipo_vehiculoo.equalsIgnoreCase("Moto")){
                            Vehiculo m1 = new Moto(placa3,marca3, color3,valor3);
 
                            Vehiculo.vehiculos[piso3-1][espacio3-1] = m1;
                            Sensor.sensores[piso3-1][espacio3-1].setEstado(1);
                            //m1.hora();
                            
                            System.out.println(m1.toString()+","+ m1.imprimir());
                            System.out.println("Vehiculo registrado "+ m1.horaIngreso());
 
                        }else if(tipo_vehiculoo.equalsIgnoreCase("Carro")){
                            Vehiculo c1 = new Carro(placa3,marca3, color3, valor3);
                            Vehiculo.vehiculos[piso3-1][espacio3-1] = c1;
                            Sensor.sensores[piso3-1][espacio3-1].setEstado(1);
                            //c1.hora();
                            System.out.println(c1.toString()+ ","+ c1.imprimir());
                            System.out.println("Vehiculo registrado "+ c1.horaIngreso());
 
                        }
 
                        /*Vehiculo v1 = new Vehiculo(placa3, marca3, color3, valor3);
                        Vehiculo.vehiculos[piso3-1][espacio3-1] = v1;
                        Sensor.sensores[piso3-1][espacio3-1].setEstado(1);
                        System.out.println("Vehiculo registrado");*/
 
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
                    System.out.println(Vehiculo.toColorVehiculos(color_nuevo));
                    /*Vehiculo.setColor(color_nuevo);
                    if(color_nuevo.equalsIgnoreCase(Vehiculo.getColor())){
                    System.out.println();
                    }*/
                    break;
                case 9:
                    System.out.println(Vehiculo.ordenarVehiculoValor(Vehiculo.vehiculos));
                    break;
 
                case 10:
                    System.out.println("En que piso y espacio desea desocupar el carro ?");
                    int piso10 = sc.nextInt();
                    int espacio10 = sc.nextInt();
                    Sensor.sensores[piso10-1][espacio10-1].setEstado(0);
                    Date fecha2 = new Date();
                    int obtiene_hora2 = ((fecha2.getHours())*60)+fecha2.getMinutes();
                    int obtiene_hora1 = ((Vehiculo.vehiculos[piso10-1][espacio10-1].horaIngreso().getHours())*60+Vehiculo.vehiculos[piso10-1][espacio10-1].horaIngreso().getMinutes());
                    int resultado_hora = (obtiene_hora2-obtiene_hora1);
                    System.out.println(fecha2);
                    if(Vehiculo.vehiculos[piso10-1][espacio10-1].imprimir().equalsIgnoreCase(" Es una moto ")){
                        double valor_pagar_moto = (2500*1*resultado_hora)/(1*60);

                        System.out.println("El valor a pagar es: "+valor_pagar_moto);
                        
                    }else if(Vehiculo.vehiculos[piso10-1][espacio10-1].imprimir().equalsIgnoreCase(" Es un carro ")){
                        double valor_pagar_carro = (5000*1*resultado_hora)/(1*60);
                        
                        System.out.println("El valor a pagar es: "+ valor_pagar_carro);
                    }
                    break;
 
                case 11:
                    Persistencia.guardarListas();
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