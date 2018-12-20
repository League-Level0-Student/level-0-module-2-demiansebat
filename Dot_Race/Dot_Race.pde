void setup() {
    size(800, 200);
}

void draw() {
    //3. make it a nice color
fill(#1AFF51);
    //4. if the mouse is pressed...
if (mousePressed){
    //5. ... change the X co-ordinate so that the dot moves to the right
    X+=15;}
    //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.
    background(#F5020B);
    ellipse(X,100,25,25);
    //6. Make your dot move really fast so that it can win the race 

    //7. Use this method to play a ding when your dot crosses the finish line. 
    if (X>width){
      playSound();}
}

int X=400;
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding2.wav");
        sound.trigger();
        soundPlayed = true;
    }
}