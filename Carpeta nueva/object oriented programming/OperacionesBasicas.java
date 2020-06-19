package operaciones;
public class OperacionesBasicas {
    private double resultado;
    private String operacion;
    private Datos Dto;
    public double getResultado() {
        return resultado;
    }

    public String getOperacion() {
        return operacion;
    }
   
    public void IngresarDatos(String usuario, double primervalor,double segundovalor ){
        this.Dto=new Datos();
        this.Dto.setPrimervalor(primervalor);
        this.Dto.setSegundovalor(segundovalor);
        this.Dto.setUsuario(usuario);
    }
    
    public void Sumar(){
        this.operacion="Suma";
        this.resultado=this.Dto.getPrimervalor()+this.Dto.getSegundovalor();
    }
    
    public void Restar(){
        this.operacion="Resta";
        this.resultado=this.Dto.getPrimervalor()-this.Dto.getSegundovalor();
    }
     
    public void Multiplicar(){
        this.operacion="Multiplicacion";
        this.resultado=this.Dto.getPrimervalor()*this.Dto.getSegundovalor();
    }
      
       public void Dividir(){
        this.operacion="Division";
        this.resultado=this.Dto.getPrimervalor()/this.Dto.getSegundovalor();
    }
    
}
