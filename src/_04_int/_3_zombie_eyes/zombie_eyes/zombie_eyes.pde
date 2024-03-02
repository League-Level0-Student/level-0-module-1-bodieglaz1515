void setup(){
  PImage face = loadImage("human.jpg");
  size(500,500);
  face.resize(500,500);
  image(face, 0, 0);
}

void draw(){


  
  fill(mouseX,0,0);
ellipse(190, 190, 50, 50); 
ellipse(330, 180, 50, 50);
fill(0,0,0);
ellipse(170, 190, 10, 10); 
ellipse(350, 180, 10, 10);
}
