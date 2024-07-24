import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class SimpleCalculator extends JFrame
{

    public SimpleCalculator (String title)
    {
        super(title);
        JTextField text = new JTextField();

        JFrame frame = new JFrame("Simple Calculator");

        JTextField display = new JTextField();
        display.setEditable(false);
        display.setBounds(5, 50, 380, 50);
        display.setBorder(new LineBorder(Color.black, 2));
        frame.add(display);

        JTextField invisibleNum = new JTextField();
        invisibleNum.setEditable(false);
        invisibleNum.setBounds(190, 10, 190, 15);
        invisibleNum.setBorder(new LineBorder(Color.black, 0));
        frame.add(invisibleNum);

        JTextField invisibleSign = new JTextField();
        invisibleSign.setEditable(false);
        invisibleSign.setBounds(190, 29, 190, 15);
        invisibleSign.setBorder(new LineBorder(Color.black, 0));
        frame.add(invisibleSign);

        JButton button = new JButton("1");
        button.setBounds(5, 180, 60, 60);
        frame.add(button);
        frame.setSize(410, 525);
        frame.setLayout(null);

        button.addActionListener(e->
        {
            //edit so it displays
            text.setText(text.getText() + "1");
            display.setText(text.getText());
        });


        button = new JButton("2");
        button.setBounds(85, 180, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            text.setText(text.getText() + "2");
            display.setText(text.getText());
        });


        button = new JButton("3");
        button.setBounds(165, 180, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            //edit so it displays
            text.setText(text.getText() + "3");
            display.setText(text.getText());
        });

        button = new JButton("0");
        button.setBounds(245, 180, 60, 210);
        frame.add(button);

        button.addActionListener(e->
        {
            //edit so it displays
            text.setText(text.getText() + "0");
            display.setText(text.getText());
        });

        button = new JButton("-");
        button.setBounds(325, 180, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            if ((invisibleSign.getText().equals("+") || invisibleSign.getText().equals("-") || invisibleSign.getText().equals("\\") || invisibleSign.getText().equals("*")) && display.getText().equals(""))
            {
                invisibleSign.setText("-");
            }
            else
            {
                if (!invisibleSign.getText().equals(""))
                {
                    double num = Double.parseDouble(invisibleNum.getText());
                    double secondNum = Double.parseDouble(text.getText());
                    double number = 0;
                    if (invisibleSign.getText().equals("+"))
                    {
                        number = num + secondNum;
                    }
                    if (invisibleSign.getText().equals("-"))
                    {
                        number = num - secondNum;
                    }
                    if (invisibleSign.getText().equals("\\"))
                    {
                        number = num / secondNum;
                    }
                    if (invisibleSign.getText().equals("*"))
                    {
                        number = num * secondNum;
                    }

                    display.setText(number + "");
                    text.setText(number + "");
                    invisibleNum.setText("");
                    invisibleSign.setText("");
                }
                if (text.getText().equals(""))
                {
                    display.setText("Error");
                }
                else
                {
                    invisibleNum.setText(text.getText());
                    invisibleSign.setText("-");
                    display.setText("");
                    text.setText("");
                }
            }
        });

        button = new JButton(".");
        button.setBounds(85, 110, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            if (text.getText().equals(""))
            {
                display.setText("Error");
            }
            else if (!text.getText().contains("."))
            {
                text.setText(text.getText() + ".");
                display.setText(text.getText());
            }
        });

        button = new JButton("-\\+");
        button.setBounds(165, 110, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            if (text.getText().equals(""))
            {
                display.setText("Error");
            }
            else if (text.getText().contains("-"))
            {
                text.setText(text.getText().substring(1));
                display.setText(text.getText());
            }
            else
            {
                text.setText("-" + text.getText());
                display.setText(text.getText());
            }
        });

        button = new JButton("C");
        button.setBounds(245, 110, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            text.setText("");
            display.setText("");
            invisibleNum.setText("");
            invisibleSign.setText("");
        });

        button = new JButton("+");
        button.setBounds(325, 110, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            if ((invisibleSign.getText().equals("+") || invisibleSign.getText().equals("-") || invisibleSign.getText().equals("\\") || invisibleSign.getText().equals("*")) && display.getText().equals(""))
            {
                invisibleSign.setText("+");
            }
            else
            {
                if (!invisibleSign.getText().equals(""))
                {
                    double num = Double.parseDouble(invisibleNum.getText());
                    double secondNum = Double.parseDouble(text.getText());
                    double number = 0;
                    if (invisibleSign.getText().equals("+"))
                    {
                        number = num + secondNum;
                    }
                    if (invisibleSign.getText().equals("-"))
                    {
                        number = num - secondNum;
                    }
                    if (invisibleSign.getText().equals("\\"))
                    {
                        number = num / secondNum;
                    }
                    if (invisibleSign.getText().equals("*"))
                    {
                        number = num * secondNum;
                    }

                    display.setText(number + "");
                    text.setText(number + "");
                    invisibleNum.setText("");
                    invisibleSign.setText("");
                }
                if (text.getText().equals(""))
                {
                    display.setText("Error");
                }
                else
                {
                    invisibleNum.setText(text.getText());
                    invisibleSign.setText("+");
                    display.setText("");
                    text.setText("");
                }
            }
        });

        button = new JButton("4");
        button.setBounds(5, 250, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            //edit so it displays
            text.setText(text.getText() + "4");
            display.setText(text.getText());
        });

        button = new JButton("5");
        button.setBounds(85, 250, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            //edit so it displays
            text.setText(text.getText() + "5");
            display.setText(text.getText());
        });

        button = new JButton("6");
        button.setBounds(165, 250, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            //edit so it displays
            text.setText(text.getText() + "6");
            display.setText(text.getText());
        });

        button = new JButton("*");
        button.setBounds(325, 250, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            if ((invisibleSign.getText().equals("+") || invisibleSign.getText().equals("-") || invisibleSign.getText().equals("\\") || invisibleSign.getText().equals("*")) && display.getText().equals(""))
            {
                invisibleSign.setText("*");
            }
            else
            {
                if (!invisibleSign.getText().equals(""))
                {
                    double num = Double.parseDouble(invisibleNum.getText());
                    double secondNum = Double.parseDouble(text.getText());
                    double number = 0;
                    if (invisibleSign.getText().equals("+"))
                    {
                        number = num + secondNum;
                    }
                    if (invisibleSign.getText().equals("-"))
                    {
                        number = num - secondNum;
                    }
                    if (invisibleSign.getText().equals("\\"))
                    {
                        number = num / secondNum;
                    }
                    if (invisibleSign.getText().equals("*"))
                    {
                        number = num * secondNum;
                    }

                    display.setText(number + "");
                    text.setText(number + "");
                    invisibleNum.setText("");
                    invisibleSign.setText("");
                }
                if (text.getText().equals(""))
                {
                    display.setText("Error");
                }
                else
                {
                    invisibleNum.setText(text.getText());
                    invisibleSign.setText("*");
                    display.setText("");
                    text.setText("");
                }
            }
        });

        button = new JButton("7");
        button.setBounds(5, 330, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            //edit so it displays
            text.setText(text.getText() + "7");
            display.setText(text.getText());
        });

        button = new JButton("8");
        button.setBounds(85, 330, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            text.setText(text.getText() + "8");
            display.setText(text.getText());
        });

        button = new JButton("9");
        button.setBounds(165, 330, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            text.setText(text.getText() + "9");
            display.setText(text.getText());
        });

        button = new JButton("\\");
        button.setBounds(325, 330, 60, 60);
        frame.add(button);

        button.addActionListener(e->
        {
            if ((invisibleSign.getText().equals("+") || invisibleSign.getText().equals("-") || invisibleSign.getText().equals("\\") || invisibleSign.getText().equals("*")) && display.getText().equals(""))
            {
                invisibleSign.setText("\\");
            }
            else
            {
                if (!invisibleSign.getText().equals(""))
                {
                    double num = Double.parseDouble(invisibleNum.getText());
                    double secondNum = Double.parseDouble(text.getText());
                    double number = 0;
                    if (invisibleSign.getText().equals("+"))
                    {
                        number = num + secondNum;
                    }
                    if (invisibleSign.getText().equals("-"))
                    {
                        number = num - secondNum;
                    }
                    if (invisibleSign.getText().equals("\\"))
                    {
                        number = num / secondNum;
                    }
                    if (invisibleSign.getText().equals("*"))
                    {
                        number = num * secondNum;
                    }

                    display.setText(number + "");
                    text.setText(number + "");
                    invisibleNum.setText("");
                    invisibleSign.setText("");
                }
                if (text.getText().equals(""))
                {
                    display.setText("Error");
                }
                else
                {
                    invisibleNum.setText(text.getText());
                    invisibleSign.setText("\\");
                    display.setText("");
                    text.setText("");
                }
            }
        });

        button = new JButton("=");
        button.setBounds(5, 410, 380, 50);
        frame.add(button);

        button.addActionListener(e->
        {
            if (text.getText().equals(""))
            {
                display.setText("Error");
            }
            else
            {
                double num = Double.parseDouble(invisibleNum.getText());
                double secondNum = Double.parseDouble(text.getText());
                double number = 0;
                if (invisibleSign.getText().equals("+"))
                {
                    number = num + secondNum;
                }
                if (invisibleSign.getText().equals("-"))
                {
                    number = num - secondNum;
                }
                if (invisibleSign.getText().equals("\\"))
                {
                    number = num / secondNum;
                }
                if (invisibleSign.getText().equals("*"))
                {
                    number = num * secondNum;
                }

                display.setText(number + "");
                text.setText(number + "");
                invisibleNum.setText("");
                invisibleSign.setText("");
            }
        });

        frame.setVisible(true);
    }

}
