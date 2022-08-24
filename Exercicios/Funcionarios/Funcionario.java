public abstract class Funcionario{
    private int codigo;
    private String nome;

    public abstract double calcularSlario();

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString(){
        return "O funcionario: " + nome + " - " + codigo +" vai receber: " +calcularSlario();  
    }

}