import javax.swing.JFrame;

/**
 * 
 * Lab19
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  11/10/2015
 * 
 * This program displays the growth of an investment with variable interest
 * 
 */
public class InvestmentViewer2
{  
   public static void main(String[] args)
   {  
      JFrame frame = new InvestmentFrame2();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
