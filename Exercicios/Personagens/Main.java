public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        
        System.out.println(jogo.heroi.getPosicao()+jogo.inimigo.getPosicao());
        System.out.println(jogo.colidiu()); 
    }
}
