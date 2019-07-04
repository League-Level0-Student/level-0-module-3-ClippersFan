void setup() {
 size(500,500);
  
  
  
}
void draw(){
  for(int i = 8; i >= 0; i--){
     if(i % 2 == 0){
       fill(0,0,0);
    
 }else{
   fill(255,0,0);
 }

  ellipse(250,250,i*50,i*50);
  
  
  
}
}
