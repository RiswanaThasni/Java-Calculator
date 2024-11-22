
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements  ActionListener{

      JFrame jf;
      JLabel displayLabel;
      JButton sevenButton;
      JButton eightButton;
      JButton nineButton;
      JButton sixButton;
      JButton fiveButton;
      JButton fourButton;
      JButton oneButton;
      JButton twoButton;
      JButton threeButton;
      JButton dotButton;
      JButton zeroButton;
      JButton clrButton;
      JButton addButton;
      JButton difButton;
      JButton mulButton;
      JButton divButton;
      JButton eqButton;

      boolean isOperaterClicked=false;
      String oldValue;
      String newValue;
      String op ="";
    public Calculator() {

      jf = new JFrame("CALCULATOR");
      jf.setLayout(null);
      jf.setSize(600,600);
      jf.setLocation(230, 100);

      displayLabel = new JLabel();
      displayLabel.setBounds(20, 30, 520, 80);
      displayLabel.setBackground(Color.GRAY);
      displayLabel.setOpaque(true);
      displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
      displayLabel.setForeground(Color.white);
      jf.add(displayLabel);
      
      sevenButton = new JButton("7");
      sevenButton.setBounds(20, 130, 100, 100);
      sevenButton.setBackground(Color.WHITE);
      sevenButton.addActionListener(this);
      sevenButton.setFont(new Font("Arial", Font.PLAIN, 35));
      jf.add(sevenButton);
       
      
      eightButton = new JButton("8");
      eightButton.setBounds(140, 130, 100, 100);
      eightButton.setBackground(Color.WHITE);
      eightButton.addActionListener(this);
      eightButton.setFont(new Font("Arial", Font.PLAIN, 35));
      eightButton.setFont(new Font("Arial", Font.PLAIN, 35));
      jf.add(eightButton);

      nineButton = new JButton("9");
      nineButton.setBounds(260, 130, 100, 100);
      nineButton.setBackground(Color.white);
      nineButton.addActionListener(this);
      nineButton.setFont(new Font("Arial", Font.PLAIN, 35));
      nineButton.setFont(new Font("Arial", Font.PLAIN, 35));
      jf.add(nineButton);

      fourButton = new JButton("4");
      fourButton.setBounds(20, 250, 100, 100);
      fourButton.setBackground(Color.WHITE);
      fourButton.addActionListener(this);
      fourButton.setFont(new Font("Arial", Font.PLAIN, 35));
      fourButton.setFont(new Font("Arial", Font.PLAIN, 35));
      jf.add(fourButton);
       
      
      fiveButton = new JButton("5");
      fiveButton.setBounds(140, 250, 100, 100);
      fiveButton.setBackground(Color.WHITE);
      fiveButton.addActionListener(this);
      fiveButton.setFont(new Font("Arial", Font.PLAIN, 35));
      fiveButton.setFont(new Font("Arial", Font.PLAIN, 35));
      jf.add(fiveButton);

      sixButton = new JButton("6");
      sixButton.setBounds(260, 250, 100, 100);
      sixButton.setBackground(Color.WHITE);
      sixButton.addActionListener(this);
      sixButton.setFont(new Font("Arial", Font.PLAIN, 35));
      sixButton.setFont(new Font("Arial", Font.PLAIN, 35));
      jf.add(sixButton);

      oneButton = new JButton("1");
      oneButton.setBounds(20, 370, 100, 100);
      oneButton.setBackground(Color.WHITE);
      oneButton.addActionListener(this);
      oneButton.setFont(new Font("Arial", Font.PLAIN, 35));
      oneButton.setFont(new Font("Arial", Font.PLAIN, 35));
      jf.add(oneButton);

      twoButton = new JButton("2");
      twoButton.setBounds(140, 370, 100, 100);
      twoButton.setBackground(Color.WHITE);
      twoButton.addActionListener(this);
      twoButton.setFont(new Font("Arial", Font.PLAIN, 35));
      twoButton.setFont(new Font("Arial", Font.PLAIN, 35));
      jf.add(twoButton);
       
      threeButton = new JButton("3");
      threeButton.setBounds(260, 370, 100, 100);
      threeButton.setBackground(Color.WHITE);
      threeButton.addActionListener(this);
      threeButton.setFont(new Font("Arial", Font.PLAIN, 35));
      threeButton.setFont(new Font("Arial", Font.PLAIN, 35));
      jf.add(threeButton);

      dotButton = new JButton(".");
      dotButton.setBounds(20, 490, 100, 100);
      dotButton.setBackground(Color.WHITE);
      dotButton.addActionListener(this);
      dotButton.setFont(new Font("Arial", Font.PLAIN, 35));
      jf.add(dotButton);

      zeroButton = new JButton("0");
      zeroButton.setBounds(140, 490, 100, 100);
      zeroButton.setBackground(Color.WHITE);
      zeroButton.addActionListener(this);
      zeroButton.setFont(new Font("Arial", Font.PLAIN, 35));
      jf.add(zeroButton);


      eqButton = new JButton("=");
      eqButton.setBounds(260, 490, 100, 100);
      eqButton.setBackground(Color.WHITE);
      eqButton.addActionListener(this);
      jf.add(eqButton);

      divButton = new JButton("/");
      divButton.setBounds(380, 130, 160, 80);
      divButton.setBackground(Color.WHITE);
      divButton.addActionListener(this);
      jf.add(divButton);

      mulButton = new JButton("*");
      mulButton.setBounds(380, 225, 160, 80);
      mulButton.setBackground(Color.WHITE);
      mulButton.addActionListener(this);
      jf.add(mulButton);

      difButton = new JButton("-");
      difButton.setBounds(380, 320, 160, 80);
      difButton.setBackground(Color.WHITE);
      difButton.addActionListener(this);
      jf.add(difButton);

      addButton = new JButton("+");
      addButton.setBounds(380, 415, 160, 80);
      addButton.setBackground(Color.WHITE);
      addButton.addActionListener(this);
      jf.add(addButton);


      clrButton = new JButton("clr");
      clrButton.setBounds(380, 510, 160, 80);
      clrButton.setBackground(Color.WHITE);
      clrButton.addActionListener(this);
      jf.add(clrButton);





      jf.setVisible(true);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }




    public static void main(String[] args) {

      new Calculator();

    }



@Override
public void actionPerformed(ActionEvent e) {
      if(e.getSource()==sevenButton ){
            if(isOperaterClicked)
            {
                  displayLabel.setText("7");
                  isOperaterClicked=false;
            }else{
                  displayLabel.setText(displayLabel.getText()+"7");
            }

      }else if(e.getSource()== eightButton){

            if(isOperaterClicked)
            {
                  displayLabel.setText("8");
                  isOperaterClicked=false;
            }else{
                  displayLabel.setText(displayLabel.getText()+"8");
            }

      }
      else if(e.getSource()==nineButton){
            if(isOperaterClicked)
            {
                  displayLabel.setText("9");
                  isOperaterClicked=false;
            }else{
                  displayLabel.setText(displayLabel.getText()+"9");
            }

      }
      else if(e.getSource()==fourButton){
            if(isOperaterClicked)
            {
                  displayLabel.setText("4");
                  isOperaterClicked=false;
            }else{
                  displayLabel.setText(displayLabel.getText()+"4");
            }
      }
      else if(e.getSource()==fiveButton){
            if(isOperaterClicked)
            {
                  displayLabel.setText("5");
                  isOperaterClicked=false;
            }else{
                  displayLabel.setText(displayLabel.getText()+"5");
            }
      }
      else if(e.getSource()==sixButton){
            if(isOperaterClicked)
            {
                  displayLabel.setText("6");
                  isOperaterClicked=false;
            }else{
                  displayLabel.setText(displayLabel.getText()+"6");
            }
      }
      else if(e.getSource()==oneButton){
            if(isOperaterClicked)
            {
                  displayLabel.setText("1");
                  isOperaterClicked=false;
            }else{
                  displayLabel.setText(displayLabel.getText()+"1");
            }
      }
      else if(e.getSource()==twoButton){
            if(isOperaterClicked)
            {
                  displayLabel.setText("2");
                  isOperaterClicked=false;
            }else{
                  displayLabel.setText(displayLabel.getText()+"2");
            }
      }
      else if(e.getSource()==threeButton){
            if(isOperaterClicked)
            {
                  displayLabel.setText("3");
                  isOperaterClicked=false;
            }else{
                  displayLabel.setText(displayLabel.getText()+"3");
            }
      }
      else if(e.getSource()==zeroButton){
            
                  displayLabel.setText(displayLabel.getText()+"0");
            
      }
      else if(e.getSource()==dotButton){
           
            
                  displayLabel.setText(displayLabel.getText()+".");
            

      }
     
      else if(e.getSource()==difButton){
            isOperaterClicked = true;
            oldValue=displayLabel.getText();
            op="-";


      }

      else if(e.getSource()==divButton){
            isOperaterClicked = true;
            oldValue=displayLabel.getText();
            op="/";

      }

      else if(e.getSource()==mulButton){
            isOperaterClicked = true;
            oldValue=displayLabel.getText();
            op="*";

      }

      else if(e.getSource() == eqButton){
            newValue = displayLabel.getText();
            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);

            float result = 0;
            switch (op) {
                  case "+":
                      result = oldValueF + newValueF;
                      break;
                  case "-":
                      result = oldValueF - newValueF;
                      break;
                  case "*":
                      result = oldValueF * newValueF;
                      break;
                  case "/":
                      if (newValueF != 0) {
                          result = oldValueF / newValueF;
                      } else {
                          displayLabel.setText("Error");
                          return;
                      }
                      break;
              }
              displayLabel.setText(String.valueOf(result));

            
           
      }
      else if(e.getSource() == addButton){

           
            isOperaterClicked = true;
            oldValue=displayLabel.getText();
            op="+";

      }


      else if(e.getSource()== clrButton){
            displayLabel.setText("");
            oldValue = "";
            newValue = "";
            op = "";
            isOperaterClicked = false;

      }





}
      

}


