public class Jogo extends Personagem{
    Personagem heroi = new Personagem(2,3);
    Personagem inimigo = new Personagem(2,3);

    /*public boolean colidiu(){
        if ((heroi.getX() == inimigo.getX()) && (heroi.getY() == inimigo.getY())){
        return true;
           
        }
        else return false;
    }*/

    public boolean colidiu(){
        if (heroi.getPosicao().equals(inimigo.getPosicao())) {
            return true;
        } else {
            return false;
        }
    }


}
