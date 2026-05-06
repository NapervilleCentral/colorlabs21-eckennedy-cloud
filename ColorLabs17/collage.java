
/**
 * creates a poster with different versions of an image
 *
 * @Emma Kennedy
 * @5/6/26
 */
public class collage
{
    public static void main(String[] args){
        Picture ballerina = new Picture("images\\ballerina1.jpg");
        Picture canvas = new Picture("images\\canvas.jpg");
        copytoCanvas(ballerina,canvas);
        canvas.explore();
        negate(ballerina);
        copytoCanvas(ballerina,canvas);
        canvas.explore();
    }
    public static void copytoCanvas(Picture source, Picture target){
        Pixel sourcePix=null;
        Pixel targetPix=null;
        for (int sourceX=0,targetX=0;sourceX<source.getWidth()&&targetX<target.getWidth();sourceX++,targetX++){
            for (int sourceY=0,targetY=0; sourceY<source.getHeight()&&targetY<target.getHeight();sourceY++,targetY++){
                sourcePix= source.getPixel(sourceX,sourceY);
                targetPix=target.getPixel(targetX,targetY);
                if (targetPix.getRed()==255 && targetPix.getGreen()==255 && targetPix.getBlue()==255){
                    targetPix.setColor(sourcePix.getColor());
                }
                else sourceY--;
            }
        }
    }
    public static void negate(Picture source){
        //negate:
        Pixel[] pixels2;
        pixels2 = source.getPixels();
        
        for (Pixel spot1 : pixels2)
        {
            int red = spot1.getRed();
            red= 255-red;
            spot1.setRed(red);
            int blue = spot1.getBlue();
            blue = 255-blue;
            spot1.setBlue(blue);
            int green = spot1.getGreen();
            green = 255-green;
            spot1.setGreen(green);
        }
    }
    
}
