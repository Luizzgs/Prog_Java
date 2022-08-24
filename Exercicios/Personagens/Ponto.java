public abstract class Ponto{
  private int x;
  private int y;

  public Ponto(){
    x = 0;
    y = 0;
  }

  public Ponto(int x, int y){
    this.x = x;
    this.y = y;
  }

  public abstract String getPosicao();

  public int getX(){
    return x;
  }

   public int getY(){
    return y;
  }

   public void setX(int x){
    this.x =x;
  }

  public void setY(int y){
    this.y =y;
  }
}
