 int circle1X = 250;
 int circle2X = 1250;
void setup(){

  size(1500,560); 

}
void draw(){
 //leftcircle
  background(#FFFFFF);
  noFill();
  int size=500;
  
  for(int i = 0;i<50;i++){
     ellipse(circle1X,250,size,size);
    size-=10;
  }
   circle1X+=1;
   
   //right circle
   size = 500;
  for(int i = 0;i<50;i++){
     ellipse(circle2X,250,size,size);
    size-=10;
  }

    circle2X-=0.5;
}
  


  