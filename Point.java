public class Point{
  
  private int x;
  private int y;

  //Le Constructeur :
  public Point(int x, int y){
    this.x = x;Acesseurs :
    this.y = y;
  }

  //Les Acesseurs :
  public int get_x(){
    return this.x;
  }

  public int get_y(){
    return this.y;
  }

  //Les mutateurs :
  public void set_x(int x){
    this.x = x;
  }

  public void set_y(int y){
    this.y = y;
  }
}//fin de la class