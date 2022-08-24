public class Pixel extends Ponto{
  private String cor;

  public Pixel(){
    super();
    cor = "preto";
  }

  public Pixel(int x, int y){
    super(x,y);
    cor = "preto";
  }

  public  String getPosicao(){
    return "";
  }
  public Pixel(int x, int y, String cor){
    super(x, y);
    this.cor = cor;
  } 
  
}