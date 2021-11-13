public class Moto extends Vehiculo{
  public Moto(){}
 
  public Moto(String p, String m, String c){
        /*this.placa = p;
        this.marca = m;
        this.color = c;
        this.valorComercial=30000000;*/
        super(p,m,c,30000000);
    }
  public Moto(String p, String m, String c, int v){
        super(p,m,c,v);
        //Vehiculo.cantidad=Vehiculo.cantidad+1;
  }
 
  @Override
  public String imprimir(){
      String info= " Es una moto ";
 
      return info;
    } 
 
}