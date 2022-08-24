public class Principal{
    public static void main(String[] args) {
        Robo robo0 = new Robo(); // Cria um robo vazio, seu nome sera: Robô.
        Robo robo1 = new Robo("Arnaldo", 66, 6); // Cria um robo com nome e posições definidas.
        Robo robo2 = new Robo("Claudio", 33, 3); // Cria um robo com nome e posições definidas.
        Robo[] robo = new Robo[]{robo0,robo1,robo2}; 
        
        robo[0].setNome("Walter");
        robo[0].setPosicao(76, 23);
        robo[0].andarDireita();
        for (int i = 0; i < robo.length; i++) {
            System.out.println(robo[i].getNome()+ robo[i].getPosicao());//Imprime os nomes e posições dos robôs.
        }
        
    }
}