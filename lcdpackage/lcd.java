package lcdpackage;
import java.util.*;

public class lcd {
    private String status;
    private int volume;
    private int brightness;
    private String cable;
    
    // Konstruktor
    public lcd(){
        this.status = "off";
        this.volume = 45;
        this.brightness = 10;
        this.cable = "HDMI";
    }

    public void setTurnOff(){
        this.status = "off";
    }

    public void setTurnOn(){
        this.status = "on";
    }

    public void setFreeze(){
        this.status = "Freeze";
    }

    public void setVolumeUp(){
        this.volume++; 
    }

    public void setVolumeDown(){
        this.volume--;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setBrightnessUp(){
        this.brightness++;
    }

    public void setBrightnessDown(){
        this.brightness--;
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    public void setCable(String choose){
            switch(choose){
                case "VGA":
                    this.cable = "VGA";
                break;
                case "DVI":
                    this.cable = "DVI";
                break;
                case "HDMI":
                    this.cable = "HDMI";
                break;
                case "DisplayPort":
                    this.cable = "DisplayPort";
                break;            
                default:
                    System.out.println("Kabel tidak digunakan");
                break;
            }    
    }

    public void display(){
        System.out.println("LCD Status: " + this.status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Cable: " + this.cable);
    }
}