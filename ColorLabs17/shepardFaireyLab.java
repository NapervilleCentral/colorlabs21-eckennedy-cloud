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
        Picture portrait = new Picture("images/selfPortrait.jpeg");
        
        //method1
        Pixel [] pixels1;
        int length =0;
        pixels1=portrait.getPixels();
        for(Pixel spot1: pixels1){
    
        red=spot1.getRed();
        green=spot1.getGreen();
        blue=spot1.getGreen();
        gray= (int)((blue+green+red)/3);
        if (gray>=0 && gray<51){
            gray
        
        }}
        }
}