import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Rectangle;

class ScreenCap{

    public static void main(String args[]){

        try{
            Robot robit = new Robot();

            Rectangle rect = new Rectangle(0, 0, 1920, 1080);

            BufferedImage buff = robit.createScreenCapture(rect);

            /*
            File output = new File("image.jpg");

            ImageIO.write(buff, "jpg", output);
            */

            ByteArrayOutputStream imageInBytes = new ByteArrayOutputStream();
            ImageIO.write(buff, "jpg", imageInBytes);
            byte[] imageArray = imageInBytes.toByteArray();

            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(new Dimension(800, 600));
            frame.setVisible(true);

            ImageIcon image = new ImageIcon(buff);


            JLabel imageLabel = new JLabel(image); 
            frame.add(imageLabel);

            imageLabel.setVisible(true);

            while(true){
                buff = robit.createScreenCapture(rect);

                image = new ImageIcon(buff);
                imageLabel.setIcon(image);


            }


            
            



        }catch(Exception err){
            System.out.println(err);

        }
        




    }


}
