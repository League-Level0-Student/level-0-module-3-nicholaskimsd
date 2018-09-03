void setup(){
 size(500,500); 
  noFill();
  int size=250;
  for(int i = 0;i<10;i++){
    if(i%2==0){
    fill(255,0,0);
    }
    else{
    fill(255,255,255);
    }
    ellipse(250,250,size,size);
    size-=25;
    
  }
  
}
