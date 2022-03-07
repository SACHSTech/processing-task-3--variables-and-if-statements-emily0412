import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  public void settings() {
    
    size(500, 500);
  }


  public void setup() {
  
    // creating variables
    float recX = random (0, 400);
    float recY = random (0, 400);
    float recWidth = (160);
    float recHeight = (165);


    // if statements to change the colours based on recX and recY
    if (recX <= 100 || recY <= 100){
      background(216, 191, 216);
      
      // house
      fill(147, 112, 219);
      rect(recX, recY, recWidth, recHeight);

      // window
      fill(203, 195, 227);
      ellipse(recX + 80, recY + 40, 30, 30);

      // roof
      fill(106, 90, 205);
      triangle(recX - 25, recY, recX + 80, recY - 85, recX + 185, recY);

      // door
      fill(179, 158, 181);
      rect (recX + 90, recY + 100, 40, 60);

      // doorknob
      fill(147, 112, 219);
      ellipse(recX + 120, recY + 130, 7, 7);
      
    }
      
    else if (recX <= 200 && recY <= 200){
      background(175, 238, 238);
      
      // house
      fill(114, 160, 193);
      rect(recX, recY, recWidth, recHeight);

      // window
      fill(188, 212, 230);
      ellipse(recX + 80, recY + 40, 30, 30);

      // roof
      fill(68, 108, 207);
      triangle(recX - 25, recY, recX + 80, recY - 85, recX + 185, recY);

      // door
      fill(96, 130, 182);
      rect (recX + 90, recY + 100, 40, 60);

      // doorknob
      fill(188, 212, 230);
      ellipse(recX + 120, recY + 130, 7, 7);
      
    }
    
    else if (recX <= 300 || recY <= 300){
      background(245, 222, 179);
      
      // house
      fill(188, 152, 126);
      rect(recX, recY, recWidth, recHeight);

      // window
      fill(227, 218, 201);
      ellipse(recX + 80, recY + 40, 30, 30);

      // roof
      fill(152, 116, 86);
      triangle(recX - 25, recY, recX + 80, recY - 85, recX + 185, recY);

      // door
      fill(209, 190, 168);
      rect (recX + 90, recY + 100, 40, 60);

      // doorknob
      fill(152, 116, 86);
      ellipse(recX + 120, recY + 130, 7, 7);
      
    }
    
    else {
      background(144, 238, 144);
      // house
      fill(163, 193, 173);
      rect(recX, recY, recWidth, recHeight);

      // window
      fill(172, 225, 175);
      ellipse(recX + 80, recY + 40, 30, 30);

      // roof
      fill(103, 146, 103);
      triangle(recX - 25, recY, recX + 80, recY - 85, recX + 185, recY);

      // door
      fill(60, 179, 113);
      rect (recX + 90, recY + 100, 40, 60);

      // doorknob
      fill(163, 193, 173);
      ellipse(recX + 120, recY + 130, 7, 7);
      
    }
  }

  public void draw() {

    // getting the values for the time
    int s = second();  // Values from 0 - 59
    int m = minute();  // Values from 0 - 59
    int h = hour() - 5;    // Values from 0 - 23

    String strTime = h + ":" + m + ":" + s;

    // printing the time to the screen
    textSize(60);
    fill(70,130,180);
    text(strTime, 50, 100);

    noLoop();
    
  }
  
}