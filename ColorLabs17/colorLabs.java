/*
 * Emma Kennedy
 * 11/10/25
 * Color Labs
 */
public class colorLabs{
    public static void main(String[] args){
        Picture arch = new Picture("images\\arch.jpg");
        Picture butterfly = new Picture("images\\butterfly1.jpg");
        Picture beach = new Picture("images\\beach.jpg");
        Picture swan = new Picture("images\\swan.jpg");
        Picture temple = new Picture("images\\temple.jpg");
        Picture whiteFlower = new Picture("images\\whiteFlower.jpg");
        Picture barbaraS= new Picture("images\\barbaraS.jpg");
        int red,green,blue, gray;
        //Adjust Colors
        Pixel[] pixels1;
        pixels1 = arch.getPixels();
        
        for (Pixel spot1: pixels1)
        {
            red=spot1.getRed();
            red = (int)(red*0.5);
            spot1.setRed(red);
        }
        arch.explore();
        
        
        //negate:
        Pixel[] pixels2;
        pixels2 = butterfly.getPixels();
        
        for (Pixel spot1 : pixels2)
        {
            red = spot1.getRed();
            red= 255-red;
            spot1.setRed(red);
            blue = spot1.getBlue();
            blue = 255-blue;
            spot1.setBlue(blue);
            green = spot1.getGreen();
            green = 255-green;
            spot1.setGreen(green);
        }
        butterfly.explore();
        
        //grayscale();
        
        Pixel[] pixels3;
        pixels3 = beach.getPixels();
        
        for (Pixel spot1:pixels3)
        {
            red=spot1.getRed();
            green=spot1.getGreen();
            blue = spot1.getBlue();
            gray = (int)((red+green+blue)/3);
            spot1.setRed(gray);
            spot1.setGreen(gray);
            spot1.setBlue(gray);
        }
        beach.explore();
        
        //lighten();
        
        Pixel [] pixels4;
        pixels4 = swan.getPixels();
        
        for (Pixel spot1: pixels4)
        {
            red=spot1.getRed();
            green=spot1.getGreen();
            blue=spot1.getBlue();
            red = red+100;
            green = green+100;
            blue= blue+100;
            spot1.setRed(red);
            spot1.setGreen(green);
            spot1.setBlue(blue);
        }
        swan.explore();
        
        //darken();
        Pixel [] pixels5;
        pixels5 = temple.getPixels();
        
        for (Pixel spot1: pixels5)
        {
            red=spot1.getRed();
            green=spot1.getGreen();
            blue=spot1.getBlue();
            red = red-100;
            green = green-100;
            blue= blue-100;
            spot1.setRed(red);
            spot1.setGreen(green);
            spot1.setBlue(blue);
        }
        temple.explore();
        
        //change colors();
        
        Pixel[] pixels6;
        pixels6 = whiteFlower.getPixels();
        
        for(Pixel spot2: pixels6)
        {
            red=spot2.getRed();
            green=spot2.getGreen();
            blue=spot2.getBlue();
            red = red+250;
            green = green+100;
            blue= blue-75;
            spot2.setRed(red);
            spot2.setGreen(green);
            spot2.setBlue(blue);
        }
        whiteFlower.explore();
        
        //bluify()
        Pixel[] pixels7;
        pixels7 = barbaraS.getPixels();
        
        Pixel spot5=barbaraS.getPixel(66,71);
        for(Pixel spot1: pixels7)
        {
            red=spot1.getRed();
            green=spot1.getGreen();
            blue=spot1.getBlue();
            if (red>=140 && red<=240){
                System.out.println("yes");
                if (green>=80 && green<=190){
                    System.out.println("no");
                    if (blue>=50 && blue<=190){
                        gray = (int)((red+blue+green)/3);
                        spot1.setRed(gray);
                        spot1.setGreen(gray);
                        spot1.setBlue(gray);
                        System.out.println("run");
                    }
                }
            }
        }
        barbaraS.explore();
    }
}