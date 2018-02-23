/* Kairasi Muthukrishnan
   Student number: 2016029
   UoW number: 16266553 */

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Date;
import java.text.SimpleDateFormat;

public class timer 
{
	public static void main(String[] args) 
	{
		//Creating a JFrame variable
		JFrame timer = new JFrame();
		
		//Assigning the structure of the JFrame timer
		timer.setTitle("Digital Clock");
		timer.setSize(100,100);
		timer.setLayout(new GridLayout(3, 1));
		timer.setDefaultCloseOperation(timer.EXIT_ON_CLOSE);
		timer.setVisible(true);
		Color color = new Color(25, 0, 51);
		timer.getContentPane().setBackground(color);
		
		//Creating JLabels to display the date, time and day separately
		JLabel Today = new JLabel();
		timer.add(Today);
		JLabel Time = new JLabel();
		timer.add(Time);
		JLabel Day = new JLabel();
		timer.add(Day);
		
		//Assigning the structure of the labels in the JFrame
		Font f1 = new Font("Berlin Sans FB Demi", Font.BOLD, 154);
		Font f2 = new Font("Berlin Sans FB Demi", Font.BOLD, 60);
		Time.setFont(f1);
		Today.setFont(f2);
		Day.setFont(f2);
		Time.setForeground(Color.WHITE);
		Today.setForeground(Color.WHITE);
		Day.setForeground(Color.WHITE);
		Time.setHorizontalAlignment(SwingConstants.CENTER);
		Today.setHorizontalAlignment(SwingConstants.LEFT);
		Day.setHorizontalAlignment(SwingConstants.RIGHT);
		
		//Refreshing the User Interface
		while(true)
		{
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		//Dividing the derived date into simpler formats and assigning them to the respective labels
		//All the labels are then printed to the screen
		Date date = new Date();
		SimpleDateFormat today = new SimpleDateFormat("MMMM dd,  yyyy");	
		Today.setText("It's " +today.format(date));
		SimpleDateFormat clock = new SimpleDateFormat("hh:mm:ss a");
		Time.setText(clock.format(date));
		SimpleDateFormat day = new SimpleDateFormat("EEEE  ");
		Day.setText("Today is a " +day.format(date));
		}
	}
}

