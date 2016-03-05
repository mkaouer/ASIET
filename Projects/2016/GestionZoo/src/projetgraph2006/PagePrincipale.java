package projetgraph2006;

import javax.swing.UIManager;
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class PagePrincipale extends JWindow{
  boolean packFrame = false;
  public static boolean fois = false;
  private BufferedImage splash = null;

  //Construire l'application
  public PagePrincipale(BufferedImage image) {
    createShadowPicture(image);

  }



  public void paint(Graphics g) {
    if (splash != null) {
      g.drawImage(splash, 0, 0, null);
    }
  }

  private void createShadowPicture(BufferedImage image) {
    int width = image.getWidth();
    int height = image.getHeight();
    int extra = 14;

    setSize(new Dimension(width + extra, height + extra));
    setLocationRelativeTo(null);
    Rectangle windowRect = getBounds();

    splash = new BufferedImage(width + extra, height + extra,
                               BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2 = (Graphics2D) splash.getGraphics();

    try {
      Robot robot = new Robot(getGraphicsConfiguration().getDevice());
      BufferedImage capture = robot.createScreenCapture(new Rectangle(
          windowRect.x, windowRect.y, windowRect.width + extra,
          windowRect.height + extra));
      g2.drawImage(capture, null, 0, 0);
    }
    catch (AWTException e) {}

    BufferedImage shadow = new BufferedImage(width + extra, height + extra,
                                             BufferedImage.TYPE_INT_ARGB);
    Graphics g = shadow.getGraphics();
    g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.3f));
    g.fillRoundRect(6, 6, width, height, 12, 12);

    g2.drawImage(shadow, getBlurOp(7), 0, 0);
    g2.drawImage(image, 0, 0, this);
  }

  private ConvolveOp getBlurOp(int size) {
    float[] data = new float[size * size];
    float value = 1 / (float) (size * size);
    for (int i = 0; i < data.length; i++) {
      data[i] = value;
    }
    return new ConvolveOp(new Kernel(size, size, data));
  }
  public static void newFentrePrincipale() {
     FentrePrincipale frame = new FentrePrincipale();
     //Valider les cadres ayant des tailles prédéfinies
     //Compacter les cadres ayant des infos de taille préférées - ex. depuis leur disposition

     //Centrer la fenêtre
     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
     Dimension frameSize = frame.getSize();
     if (frameSize.height > screenSize.height) {
       frameSize.height = screenSize.height;
     }
     if (frameSize.width > screenSize.width) {
       frameSize.width = screenSize.width;
     }
     frame.setLocation( (screenSize.width - frameSize.width) / 2,
                       (screenSize.height - frameSize.height) / 2);
     frame.setVisible(true);

   }

  //Méthode main
  public static void main(String[] args) {
    try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
       }
       catch(Exception e) {
         e.printStackTrace();
            }

    try {
       if (!fois){
      BufferedImage image = ImageIO.read(PagePrincipale.class.getResourceAsStream(
          "logo.jpg"));
     PagePrincipale window = new PagePrincipale(image);
      window.setVisible(true);
      FentrePrincipale frame = new FentrePrincipale();
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
     Dimension frameSize = frame.getSize();
     if (frameSize.height > screenSize.height) {
       frameSize.height = screenSize.height;
     }
     if (frameSize.width > screenSize.width) {
       frameSize.width = screenSize.width;
     }
     frame.setLocation( (screenSize.width - frameSize.width) / 2,
                       (screenSize.height - frameSize.height) / 2);

      try {
        Thread.sleep(3000);
      }
      catch (InterruptedException ex) {
      }
      fois = true;
      window.setVisible(false);
      frame.setVisible(true);
   //   newFentrePrincipale();
    }
  }
    catch (IOException e) {
      e.printStackTrace();

    }
  }
}
