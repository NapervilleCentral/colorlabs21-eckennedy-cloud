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
        
        Picture ballerina3 = new Picture("images\\ballerina1.jpg");
        Sepia(ballerina3);
        copytoCanvas(ballerina3,canvas);
        
        Picture ballerina4 = new Picture("images\\ballerina1.jpg");
        recursion(ballerina4,ballerina4.getWidth(),ballerina4.getHeight());
        copytoCanvas(ballerina4,canvas);
        
        Picture ballerina5 = new Picture("images\\ballerina1.jpg");
        scale(ballerina5);
        copytoCanvas(ballerina5,canvas);
        canvas.explore();
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
    public static void recursion(Picture source, int pictureLength, int pictureHeight){
        if (pictureLength<=50){
            for (int x=0, sx=1000; x<pictureLength-1 && sx<pictureLength;x+=2, sx++){
                for (int y=0, sy=1000; y<pictureHeight && sy<pictureHeight;y+=2,sy++){
                    Color color=source.getPixel(x,y).getColor();
                    source.getPixel(sx,sy).setColor(color);
                }
            }
        }
        else{
            for (int x=0, sx=1000; x<pictureLength;x+=2,sx++){
                for (int y=0, sy=1300; y<pictureHeight;y+=2,sy++){
                    Color color=source.getPixel(x,y).getColor();
                    if (!(color.getRed()<50 && color.getGreen()<50 && color.getBlue()<50))
                        source.getPixel(sx,sy).setColor(color);
                    
                }
            }
            pictureLength=pictureLength/2;
            pictureHeight=pictureHeight/2;
            recursion(source, pictureLength,pictureHeight);
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
    public static void Rotate(Picture source){
        Pixel leftPixel=null;
        Pixel rightPixel=null;
        for (int x=0; x<source.getWidth()-1;x++){
            for (int y=0; y<source.getWidth();y++){
                leftPixel=source.getPixel(x,y);
                rightPixel=source.getPixel(y,x);
                Color original = rightPixel.getColor();
                rightPixel.setColor(leftPixel.getColor());
                leftPixel.setColor(original);
            }
        }
    }
    public static void scale(Picture source){
        
        Pixel [] pixels1;
        int length =0;
        pixels1=source.getPixels();
        for(Pixel spot1: pixels1){
    
        int red=spot1.getRed();
        int green=spot1.getGreen();
        int blue=spot1.getGreen();
        int gray= (int)((blue+green+red)/3);
        if (gray>=0 && gray<70){
            spot1.setRed(128);
            spot1.setGreen(0);
            spot1.setBlue(128);
        }
        if (gray>=70 && gray<100){
            spot1.setRed(255);
            spot1.setGreen(102);
            spot1.setBlue(204);
        }
        if (gray>=100 && gray<130){
            spot1.setRed(230);
            spot1.setGreen(180);
            spot1.setBlue(200);
        }
        if (gray>=130 && gray<200){
            spot1.setRed(255);
            spot1.setGreen(200);
            spot1.setBlue(200);
        }
        if (gray>=200&&gray<230){
            spot1.setRed(90);
            spot1.setGreen(70);
            spot1.setBlue(120);
        }
        if (gray>=230 && gray<255){
            spot1.setRed(150);
            spot1.setGreen(42);
            spot1.setBlue(85);
        }
        }
    }
}
