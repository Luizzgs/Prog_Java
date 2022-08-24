public class OperaDiarista extends Funcionario {
    private int salarioDia;
    private int diasTrabalhos;

    public OperaDiarista(int salario, int dia){
        salarioDia=salario;
        diasTrabalhos = dia;
    }
    public double calcularSlario(){
        return salarioDia * diasTrabalhos;
    }

    public void setDiasTrabalhos(int diasTrabalhos) {
        this.diasTrabalhos = diasTrabalhos;
    }
    
    public void setSalarioDia(int salarioDia) {
        this.salarioDia = salarioDia;
    }

}
