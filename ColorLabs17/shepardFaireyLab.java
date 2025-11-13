/**
 * Emma Kennedy
 * 11/12/25
 * Shepard Fairey Lab
 * Takes your picture and turns it into different colors.
 */
import java.awt.*;
import java.util.*;
import java.util.List;

public class shepardFaireyLab{
    public static void main(String[] args){
        int red,green,blue,gray,group1,group2,group3,group4,group5;
        group1=0;
        group2=0;
        group3=0;
        group4=0;
        group5=0;
        int max=0;
        int min=255;
        Picture portrait = new Picture("images/selfPortrait.jpeg");
        
        
        //method1
        /*Pixel [] pixels1;
        int length =0;
        pixels1=portrait.getPixels();
        for(Pixel spot1: pixels1){
    
        red=spot1.getRed();
        green=spot1.getGreen();
        blue=spot1.getGreen();
        gray= (int)((blue+green+red)/3);
        if (gray>=0 && gray<51){
            spot1.setRed(255);
            spot1.setGreen(0);
            spot1.setBlue(0);
        }
        if (gray>=51 && gray<102){
            spot1.setRed(0);
            spot1.setGreen(0);
            spot1.setBlue(139);
        }
        if (gray>=102 && gray<153){
            spot1.setRed(0);
            spot1.setGreen(0);
            spot1.setBlue(255);
        }
        if (gray>=153 && gray<204){
            spot1.setRed(211);
            spot1.setGreen(211);
            spot1.setBlue(211);
        }
        if (gray>=204 && gray<=255){
            spot1.setRed(250);
            spot1.setGreen(249);
            spot1.setBlue(246);
        }
        }
        portrait.explore();*/
        //portrait.write("images/Method1.jpg");
        
        //method2
        /**Pixel [] pixels1;
        int length =0;
        pixels1=portrait.getPixels();
        for(Pixel spot1: pixels1){
            red=spot1.getRed();
            green=spot1.getGreen();
            blue=spot1.getGreen();
            gray= (int)((blue+green+red)/3);
            if (gray<min){
                min=gray;
            }
            if (gray>max){
                max=gray;
            }
        }
        for(Pixel spot1: pixels1){
            red=spot1.getRed();
            green=spot1.getGreen();
            blue=spot1.getGreen();
            gray= (int)((blue+green+red)/3);
            int added = (int)((max-min)/4);
            if (gray>=min && gray<(min+added)){
            spot1.setRed(0);
            spot1.setGreen(0);
            spot1.setBlue(139);
        }
        if (gray>=(min+added) && gray<(min+ 2*added)){
            spot1.setRed(255);
            spot1.setGreen(0);
            spot1.setBlue(0);
        }
        if (gray>=(min+2*added) && gray<(min+3*added)){
            spot1.setRed(250);
            spot1.setGreen(249);
            spot1.setBlue(246);
        }
        if (gray>=(min+3*added) && gray<=max){
            spot1.setRed(0);
            spot1.setGreen(0);
            spot1.setBlue(255);
        }
        }
        portrait.explore();
        portrait.write("images/Method2.jpg");*/
        
        //method 3
        Pixel [] pixels1;
        int length =0;
        pixels1=portrait.getPixels();
        for(Pixel spot1: pixels1){
    
        red=spot1.getRed();
        green=spot1.getGreen();
        blue=spot1.getGreen();
        gray= (int)((blue+green+red)/3);
        if (gray>=0 && gray<51){
            spot1.setRed(255);
            spot1.setGreen(145);
            spot1.setBlue(164);
        }
        if (gray>=51 && gray<102){
            spot1.setRed(255);
            spot1.setGreen(102);
            spot1.setBlue(204);
        }
        if (gray>=102 && gray<153){
            spot1.setRed(250);
            spot1.setGreen(249);
            spot1.setBlue(246);
        }
        if (gray>=153 && gray<204){
            spot1.setRed(255);
            spot1.setGreen(192);
            spot1.setBlue(203);
        }
        if (gray>=204 && gray<=255){
            spot1.setRed(255);
            spot1.setGreen(182);
            spot1.setBlue(193);
        }
        }
        portrait.explore();
        portrait.write("images/Try1.jpg");
    }
}