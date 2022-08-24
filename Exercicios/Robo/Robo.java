public class Robo{
    private String nome;
    private Ponto posicao;

    public Robo(String nome, Integer x, Integer y){
        this.nome = nome;
        posicao = new Ponto(x, y); 
    }
    
    public Robo(){
        nome = "Robô";
        posicao = new Ponto();
    }  

    public String getNome(){
        return nome;
      }
     
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getPosicao(){
        return " x:"+posicao.getX()+" y:"+posicao.getY();
    }
     
    public void setPosicao(Integer x, Integer y){
        posicao.setX(x);
        posicao.setY(y);
    }

    void andarDireita(){
        posicao.setX(posicao.getX()+1);
    }

    void andarEsquerda(){
        posicao.setX(posicao.getX()-1);
    }

    void andarFente(){
        posicao.setY(posicao.getY()+1);
    }

    void andarTras(){
        posicao.setY(posicao.getY()-1);
    }

}