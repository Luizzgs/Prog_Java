public class Personagem extends Ponto{

    public Personagem(){
      super();
    }

    public Personagem(int x, int y){
      super(x, y);
    }

    public String getPosicao(){
      return ""+getX()+getY();
    }
}