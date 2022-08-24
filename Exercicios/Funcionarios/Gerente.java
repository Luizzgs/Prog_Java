public class Gerente extends Funcionario{
    private int salarioMensal;
    
    public Gerente(int salarioMensal){
        this.salarioMensal =salarioMensal;

   }

   public double calcularSlario(){
        return salarioMensal * 1.10;
   }

   public void setSalarioMensal(int salarioMensal) {
       this.salarioMensal = salarioMensal;
   }

}