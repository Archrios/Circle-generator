import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class ButtonPanel
{
	Random rand = new Random();
	DrawPanel drawPanel;
	DataPanel dataPanel;
	JButton createButton;
	JButton sortButton;
	JButton centerButton;
	JButton resetButton;
	

	/**
	 * constructor of ButtonPanel that takes in a DrawPanel and a DataPanel
	 * @param drawpanel
	 * @param datapanel
	 */
	public ButtonPanel(DrawPanel drawpanel, DataPanel datapanel)
	{
		drawPanel = drawpanel;
		dataPanel = datapanel;
		this.createButton = createButton("create");
		this.sortButton = sortButton("sort");
		this.centerButton = centerButton("co-centre");
		this.resetButton = resetButton("reset");
	}

	/**
	 * creates a button with String title as a title
	 * using inner class that implements actionlistener,
	 * calls the addCircle function from drawPanel n number of times and repaints the panel when pressed
	 * where n is the integer from circleNumField from dataPanel
	 * circle sizes are randomly generated from the int frome smallCircleField of dataPanel to
	 * the int from largeCircleField from dataPanel
	 * @param title: title of JButton
	 * @return JButton
	 */
	private JButton createButton(String title)
	{
		class CreateListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				int w = drawPanel.getWidth();
				int h = drawPanel.getHeight();
				int num = Integer.parseInt(dataPanel.circleNumField.getText());
				int smallSize = Integer.parseInt(dataPanel.smallCircleField
				      .getText());
				int largeSize = Integer.parseInt(dataPanel.largeCircleField
				      .getText());
				for (int i = 0; i < num; i++)
				{
					drawPanel.addCircle(rand.nextInt(w ), rand.nextInt(h ),
					      rand.nextInt(largeSize - smallSize) + smallSize);
				}
				drawPanel.repaint();
			}
		}
		JButton button = new JButton(title);
		button.addActionListener(new CreateListener());
		return button;
	}


	/**
	 * * creates a button with String title as a title
	 * using inner class that implements actionlistener,
	 * calls sort function from drawpanel and repaints the panel when pressed
	 * @param titleL title of JButton
	 * @return JButton
	 */
	private JButton sortButton(String title)
	{
		class SortListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				drawPanel.sort();
				drawPanel.repaint();
			}

		}
		JButton button = new JButton(title);
		button.addActionListener(new SortListener());
		return button;
	}

	/**
	 * creates a button with String title as a title
	 * using inner class that implements actionlistener,
	 * calls move function from drawpanel and repaints the panel when pressed
	 * repaints the panel
	 * @param title: title of JButton
	 * @return JButton
	 */
	private JButton centerButton(String title)
	{
		class CenterListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				drawPanel.move();
				drawPanel.repaint();
			}
		}
		JButton button = new JButton(title);
		button.addActionListener(new CenterListener());
		return button;
	}

	
	/**
	 * creates a button with String title as a title
	 * using inner class that implements actionlistener,
	 * calls reset function from drawpanel and repaints the panel when pressed
	 * @param title: title of JButton
	 * @return JButton
	 */
	private JButton resetButton(String title)
	{
		class ResetListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				drawPanel.reset();
				drawPanel.repaint();
			}
		}
		JButton button = new JButton(title);
		button.addActionListener(new ResetListener());
		return button;
	}
}
