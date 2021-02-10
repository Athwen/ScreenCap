import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import java.awt.Rectangle;

class ScreenCap{

    public static void main(String args[]){

        try{
            Robot robit = new Robot();

            Rectangle rect = new Rectangle(0, 0, 1920, 1080);

            BufferedImage buff = robit.createScreenCapture(rect);

            File output = new File("image.jpg");

            ImageIO.write(buff, "jpg", output);
            



        }catch(Exception err){
            System.out.println(err);

        }
        




    }


}
