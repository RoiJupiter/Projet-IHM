public class Figure{
	
  private double rotation;
  private boolean plein;
  private int x;
  private int y;

  //Le Constructeur :
  public Figure(int x,int y,double rotation,boolean plein){
    this.x = x;
    this.y = y;
    this.plein = plein;
    this.rotation = rotation;
  }

  //Les Acsesseurs :
  public int getx(){
    return this.x;
  }

  public int gety(){
    return this.y;
  }

  public double getRotation(){
    return this.rotation;
  }

  public boolean get_plein(){
    return this.plein;
  }

  //Les Mutateurs :
  public void setx(int x){
    this.x = x;
  }


  public void sety(int y){
    this.y = y;
  }


  public void setRotation(int rotation){
    this.rotation = rotation;
  }


  public void set_plein(boolean plein){
    this.plein=  plein;
  }

}//fin de la class