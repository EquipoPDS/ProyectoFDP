public class Sensor {
    //Atributos
    private int estado;
    public static Sensor[][] sensores;

    //Constructor
    public Sensor(){

    }

    public Sensor(int e){
        this.estado = e;
    }

    //Setter & getter
    public void setEstado(int e){
        this.estado = e;
    }
    public int getEstado(){
        return estado;
    }

    //Metodos
    public String toString(){
        String estado_texto = "";
            if(estado == 1){
                estado_texto = "Ocupado";
            }else if(estado == 0){
                estado_texto = "Libre";
            }
        return estado_texto;
    }

    public static String sensorLibre(){
        String espacio_libre = "";
        for(int i = 0; i<sensores.length; i++){
            for(int j = 0; j<sensores[i].length; j++){
                if(sensores[i][j].getEstado() == 0){

                    espacio_libre =  espacio_libre + "Piso: "+(i+1) + " Espacio: " + (j+1) + " \n";
                }
            }
        }
        return espacio_libre;
    }

    public static String sensoresEstado(){
        String estado_sensores = "";
        for(int i = 0; i<sensores.length; i++){
            for(int j = 0; j<sensores[i].length; j++){
                    estado_sensores = estado_sensores + "Piso: " + (i+1) + " Espacio: " + (j+1) + " Estado: " + sensores[i][j].toString() + "\n";
            }
        }
        return estado_sensores;
    }

    public static Sensor[][] asignarSensores(int pisos, int espacios){
        sensores = new Sensor[pisos][espacios];

        for(int i = 0; i<sensores.length; i++){
            for(int j = 0; j<sensores[i].length; j++){

                Sensor a = new Sensor(0);
                sensores[i][j] = a;
            }
        }
        return sensores;
    }

}