import java.awt.Color;
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
        
        negate(ballerina);
        copytoCanvas(ballerina,canvas);
        
        Picture ballerina2 = new Picture("images\\ballerina1.jpg");
        mirrorVertical(ballerina2);
        copytoCanvas(ballerina2,canvas);
        canvas.explore();
        
        Picture ballerina3 = new Picture("images\\ballerina1.jpg");
        Sepia(ballerina3);
        copytoCanvas(ballerina3,canvas);
        canvas.explore();
        
        Picture ballerina4 = new Picture("images\\ballerina1.jpg");
        recursion(ballerina4,canvas);
    }
    public static void copytoCanvas(Picture source, Picture target){
        Pixel sourcePix=null;
        Pixel targetPix=null;
        for (int sourceX=0,targetX=10;sourceX<source.getWidth()&&targetX<target.getWidth();sourceX++,targetX++){
            for (int sourceY=0,targetY=10; sourceY<source.getHeight()&&targetY<target.getHeight();sourceY++,targetY++){
                sourcePix= source.getPixel(sourceX,sourceY);
                targetPix=target.getPixel(targetX,targetY);
                if (targetPix.getRed()==255 && targetPix.getGreen()==255 && targetPix.getBlue()==255){
                    targetPix.setColor(sourcePix.getColor());
                }
                else sourceY--;
                if (targetY>=6490){
                    targetY=0;
                    targetX+=2126;
                }
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
    public static void mirrorVertical(Picture source){
        int height=source.getHeight();
        int mirrorPoint=height/2;
        Pixel leftPixel=null;
        Pixel rightPixel=null;
        for (int x=0; x<source.getWidth()-1;x++){
            for (int y=0; y<mirrorPoint;y++){
                leftPixel=source.getPixel(x,y);
                rightPixel=source.getPixel(x,height-1-y);
                Color original = rightPixel.getColor();
                rightPixel.setColor(leftPixel.getColor());
                leftPixel.setColor(original);
            }
        }
    }
    public static void recursion(Picture source,Picture canvas){
        if (source.getWidth()<=10){
        for (int sourceX=0,targetX=10;sourceX<source.getWidth()&&targetX<canvas.getWidth();sourceX++,targetX++){
            for (int sourceY=0,targetY=10; sourceY<source.getHeight()&&targetY<canvas.getHeight();sourceY++,targetY++){
                Pixel sourcePix= source.getPixel(sourceX,sourceY);
                Pixel targetPix=canvas.getPixel(targetX,targetY);
                if (targetPix.getRed()==255 && targetPix.getGreen()==255 && targetPix.getBlue()==255){
                    targetPix.setColor(sourcePix.getColor());
                }
                else sourceY--;
                if (targetY>=6490){
                    targetY=0;
                    targetX+=2126;
                }
            }
        }
        }
        else{
         
        int[][] Pixels = new int[source.getWidth()/2][source.getHeight()/2];
        for (int sourceX=0,targetX=10;sourceX<source.getWidth()&&targetX<canvas.getWidth();sourceX+=2,targetX++){
            for (int sourceY=0,targetY=10; sourceY<source.getHeight()&&targetY<canvas.getHeight();sourceY+=2,targetY++){
                Pixel sourcePix= source.getPixel(sourceX,sourceY);
                Pixel targetPix=canvas.getPixel(targetX,targetY);
                if (targetPix.getRed()==255 && targetPix.getGreen()==255 && targetPix.getBlue()==255){
                    targetPix.setColor(sourcePix.getColor());
                    Pixels[sourceX][sourceY]=targetPix;
                }
                else sourceY--;
                if (targetY>=6490){
                    targetY=0;
                    targetX+=2126;
                }
            }
        }
        recursion( source,canvas);
        }
        
    }
    public static void Sepia(Picture source){
        //negate:
        Pixel[] pixels2;
        pixels2 = source.getPixels();
        
        for (Pixel spot1 : pixels2)
        {
            int red = spot1.getRed();
            int blue = spot1.getBlue();
            int green = spot1.getGreen();
            int r= (int)((red * 0.393) + (green * 0.769) + (blue * 0.189));
            spot1.setRed(r);
            int b = (int)((red * 0.272) + (green * 0.534) + (blue * 0.131));
            spot1.setBlue(b);
            int g = (int)((red * 0.349) + (green * 0.686) + (blue * 0.168));
            spot1.setGreen(g);
        }
    }
    }
