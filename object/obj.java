package object;
import java.util.*; 
import lcdpackage.*;

public class obj {
    public static void main(String[] args) {

        lcd lcdsekar = new lcd();
        
        lcdsekar.setTurnOn();
        lcdsekar.setVolume(45);
        lcdsekar.setVolumeUp();
        lcdsekar.setVolumeDown();
        lcdsekar.setFreeze();
        lcdsekar.setBrightness(10);
        lcdsekar.setBrightnessUp();
        lcdsekar.setBrightnessDown();
        lcdsekar.setCable("VGA");

        lcdsekar.display();
    }
}
