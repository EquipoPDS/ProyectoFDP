public class Carro extends Vehiculo{
 
    public Carro(){}
 
    public Carro(String p, String m, String c){
        /*this.placa = p;
        this.marca = m;
        this.color = c;
        this.valorComercial=30000000;*/
        super(p,m,c,30000000);
    }
 
    public Carro(String p, String m, String c, int v){
        super(p,m,c,v);
        //Vehiculo.cantidad=Vehiculo.cantidad+1;
    }
 
    @Override
    public String imprimir(){
      String info= " Es un carro ";
 
      return info;
    } 
}