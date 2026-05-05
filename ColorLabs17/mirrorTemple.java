/**
 * Emma Kennedy
 * 5/5/26
 * mirror temple
 */

public class mirrorTemple{
    public static void main(String[] args){
        Picture temple = new Picture("images\\temple.jpg");
        mirrorHorizontal(temple);
        temple.explore();
    }
    public static void mirrorHorizontal(Picture temple){
        int width=temple.getWidth();
        int mirrorPoint=width/2;
        Pixel leftPixel=null;
        Pixel rightPixel=null;
        for (int y=0; y<100;y++){
            for (int x=0; x<mirrorPoint; x++){
                leftPixel=temple.getPixel(x,y);
                rightPixel=temple.getPixel(width-1-x,y);
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    
    }