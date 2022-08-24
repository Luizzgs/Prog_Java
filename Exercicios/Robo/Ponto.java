public class Ponto
{
    private Integer x;
    private Integer y;

    public Ponto(){
      x = 0;
      y = 0;
    }

    public Ponto(Integer x, Integer y){
      this.x = x;
      this.y = y;
    }

     public Integer getX(){
       return x;
     }
    
     public void setX(Integer x){
       this.x = x;
     }
    
     public Integer getY(){
      return y;
    }
   
    public void setY(Integer y){
      this.y = y;
    }
}
