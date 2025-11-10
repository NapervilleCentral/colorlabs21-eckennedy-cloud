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
        Picture barbaraS= new Picture("images\\barbaraS.jpg");
        int red,green,blue;
        //Adjust Colors
        Pixel[] pixels1;
        pixels1 = arch.getPixels();
        
        for (Pixel spot1: pixels1)
        {
            red=spot1.getRed();
            red = (int)(red*0.5);
            spot1.setRed(red);
            green = spot1.getGreen();
            green = (int)(green*1.5);
            spot1.setGreen(green);
            blue=spot1.getBlue();
            blue=(int)(blue*0.25);
            spot1.setBlue(blue);
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
        }
    }
}