 int circle1X = 250;
 int circle2X = 1250;
 int Lspeed = 1;
 int Rspeed = -1;
void setup(){
 noFill();
  size(1500,560); 

}
void draw(){
 //leftcircle
  background(#FFFFFF);

  int size=500;
  
  for(int i = 0;i<50;i++){
     ellipse(circle1X,250,size,size);
    size-=10;
  }
   circle1X+=Lspeed;
   
   //right circle
   size = 500;
  for(int i = 0;i<50;i++){
     ellipse(circle2X,250,size,size);
    size-=10;
  }

    circle2X+=Rspeed;
    if(circle1X=500;==);

    

}
  


  