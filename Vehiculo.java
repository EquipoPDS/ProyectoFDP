public class Vehiculo {
    //Atributos
    private String placa;
    private String marca;
    private String color;
    private int valorComercial;
    public static int cantidad = 0;
    public static int tamano;
    public static Vehiculo[][] vehiculos;
    public static Vehiculo[] ordenadoVehiculo= new Vehiculo[tamano];

    //Constructor vacio
    public Vehiculo(){

    }
    //Constructores con parametros
    public Vehiculo(String p, String m, String c){
        /*this.placa = p;
        this.marca = m;
        this.color = c;
        this.valorComercial=30000000;*/
        this(p,m,c,30000000);
    }
    public Vehiculo(String p, String m, String c, int v){
        this.placa = p;
        this.marca = m;
        this.color = c;
        this.valorComercial = v;
        Vehiculo.cantidad=Vehiculo.cantidad+1;
    }

    //Metodos
    public String toString(){
        return "Placa: " + this.placa + " Marca: " + this.marca + " Color: " + this.color + " Valor Comercial: " + this.valorComercial;
    }

    public void setPlaca(String p){
        this.placa = p;
    }
    public String getPlaca(){
        return placa;
    }

    public void setMarca(String m){
        this.marca = m;
    }
    public String getMarca(){
        return marca;
    }

    public void setColor(String c){
        this.color = c;
    }
    public String getColor(){
        return color;
    }

    public void setValorComercial(int v){
        this.valorComercial = v;
    }
    public int getValorComercial(){
        return valorComercial;
    }

    public static void toColorVehiculos(String color_nuevo){

        for(int i = 0; i<vehiculos.length; i++){
            for(int j = 0; j<vehiculos[i].length; j++){
                if(vehiculos[i][j] != null){
                 if(color_nuevo.equalsIgnoreCase(vehiculos[i][j].getColor())){
                    System.out.println(vehiculos[i][j].toString() + "\n");
                 }
                }
            }
            }
        }



    public static String ordenarVehiculoValor(Vehiculo [][] nuevo){
        int contador = 0;
        String arreglo_ordenado = "";
        nuevo = vehiculos;
        Vehiculo [] temporal = new Vehiculo[cantidad];
        Vehiculo aux;
        for(int i = 0; i<nuevo.length;i++){
            for(int j = 0; j<nuevo[i].length;j++){
                if(vehiculos[i][j] != null){
                    temporal[contador] = nuevo[i][j];
                    contador++;
                }
            }
        }
        
        for(int i = 0; i<temporal.length;i++){
            for(int j = i+1; j<temporal.length; j++){
                if(temporal[i].getValorComercial() > temporal[j].getValorComercial()){
                    aux = temporal[i];
                    temporal[i] = temporal[j];
                    temporal[j] = aux;
                }
            }
        }
        
        for(contador = 0; contador<temporal.length;contador++){
            if(temporal[contador] != null){
                arreglo_ordenado = arreglo_ordenado + temporal[contador].toString() + "\n";
            }
        }
        
        return arreglo_ordenado;
    }
    
    public static String toStringVehiculos(){
        String informacion_vehiculo = "";
        for(int i = 0; i<vehiculos.length; i++){
            for(int j = 0; j<vehiculos[i].length; j++){
                if(vehiculos[i][j] != null){
                informacion_vehiculo = informacion_vehiculo + vehiculos[i][j].toString() + "\n";
                }
            }
        }
        return informacion_vehiculo;
     }

    public static int cantidadVehiculos(){
        int cantidad_vehiculo = 0;
        cantidad_vehiculo = cantidad_vehiculo + Vehiculo.cantidad;
        return cantidad_vehiculo;
    }
}