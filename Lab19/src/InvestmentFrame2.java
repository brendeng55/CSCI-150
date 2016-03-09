import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * 
 * Lab19
 * CSCI 150
 * Programmer: Brenden Goldman
 * Last Revised:  11/10/2015
 * 
 * A frame that shows the growth of an investment with variable interest.
 * 
 */

public class InvestmentFrame2 extends JFrame
{    
   private static final int FRAME_WIDTH = 500;
   private static final int FRAME_HEIGHT = 100;

   private static final double DEFAULT_RATE = 5;
   private static final double INITIAL_BALANCE = 1000;   

   private JLabel rateLabel;
   private JLabel resultLabel2;
   private JTextField rateField;
   private JButton button;
   private JLabel resultLabel;
   private double balance;
   
   private int numYears;
 
   public InvestmentFrame2()
   {  
      balance = INITIAL_BALANCE;
      numYears = 0;
      resultLabel = new JLabel("Balance: " + balance);
      resultLabel2 = new JLabel("Number of years = " + numYears);
      createTextField();
      createButton();
      createPanel();

      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }

   private void createTextField()
   {
      rateLabel = new JLabel("Interest Rate: ");

      final int FIELD_WIDTH = 10;
      rateField = new JTextField(FIELD_WIDTH);
      rateField.setText("" + DEFAULT_RATE);
   }

   /**
      Adds interest to the balance and updates the display.
   */
   class AddInterestListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         double rate = Double.parseDouble(rateField.getText());
         double interest = balance * rate / 100;
         balance = balance + interest;
         resultLabel.setText("Balance: " + balance);
         numYears += 1;
         resultLabel2.setText("Number of years = " + numYears);
      }            
   }
      
   private void createButton()
   {
      button = new JButton("Add Interest");
      
      ActionListener listener = new AddInterestListener();
      button.addActionListener(listener);
   }

   private void createPanel()
   {
      JPanel panel = new JPanel();
      panel.add(rateLabel);
      panel.add(rateField);
      panel.add(button);
      panel.add(resultLabel);     
      panel.add(resultLabel2);
      add(panel);
   } 
}
