public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

}
class MovablePoint implements Movable{
 int x;
 int y;
 int xSpeed;
 int ySpeed;
 public MovablePoint(int x, int y, int xSpeed, int ySpeed){
     this.x = x;
     this.y = y;
     this.xSpeed = xSpeed;
     this.ySpeed = ySpeed;
 }
 @Override
 public String toString(){
     return "(" + x + "," + y +"),speed=(" + "(" + x +","+y+")";
 }
 @Override
 public void moveUp(){
     y -= ySpeed;
 }
 @Override
 public void moveDown(){
     y += ySpeed;
 }
 @Override
 public void moveLeft(){
     x-= xSpeed;
 }
 @Override
 public void moveRight(){
     x+= xSpeed;
 }
}
class MovableCircle extends MovablePoint{
    int radius;
    MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius){
        super(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString(){
        return toString() + ",radius = " + radius;
    }
    @Override
    public void moveUp(){
        y -= ySpeed;
    }
    @Override
    public void moveDown(){
        y += ySpeed;
    }
    @Override
    public void moveLeft(){
        x-= xSpeed;
    }
    @Override
    public void moveRight(){
        x+= xSpeed;
    }
    
}
