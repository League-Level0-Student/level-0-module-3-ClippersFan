void setup() {
  size(1000, 500);
}
int x1 = 250;
int x2 = 750;
int x1speed = 10;
int x2speed = -10;
void draw() {
  background(200,200,200);
  for (int i = 8; i >= 0; i--) {
    if (i % 2 == 0) {
      noFill();
    } else {
      noFill();
    }
    ellipse(x1, 250, i*50, i*50);



    for (int y = 8; y >= 0; y--) {
      if (y % 2 == 0) {
        noFill();
      } else {
        noFill();
      }
      ellipse(x2, 250, i*50, i*50);
    }
  }
  
  if(x1 == 800){
    x1speed = -x1speed;
  
  }
  if(x2 == 200){
    x2speed = -x2speed;
    
    
  }
  if(x1 == 200){
    x1speed = -x1speed;
  }
  if(x2 == 800){
    x2speed = -x2speed;
  }
   x1+=x1speed;
    x2+=x2speed;
  
  
}
