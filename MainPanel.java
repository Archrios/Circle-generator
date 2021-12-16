import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel
{
	private DataPanel dataPanel;
	private DrawPanel drawPanel;
	private ButtonPanel buttonPanel;

	public MainPanel()
	{
		dataPanel = new DataPanel();
		drawPanel = new DrawPanel();
		buttonPanel = new ButtonPanel(drawPanel, dataPanel);
		setLayout(new BorderLayout());
		JPanel sidePanel = new JPanel();
		JPanel topPanel = new JPanel();

		add(topPanel, BorderLayout.NORTH);
		topPanel.add(dataPanel.circleNumLable);
		topPanel.add(dataPanel.circleNumField);
		topPanel.add(dataPanel.smallCircleLable);
		topPanel.add(dataPanel.smallCircleField);
		topPanel.add(dataPanel.largeCircleLable);
		topPanel.add(dataPanel.largeCircleField);

		int columnHeight = 4;
		int columnWidth = 1;
		add(sidePanel, BorderLayout.WEST);
		sidePanel.setLayout(new GridLayout(columnHeight, columnWidth));
		sidePanel.add(buttonPanel.createButton);
		sidePanel.add(buttonPanel.sortButton);
		sidePanel.add(buttonPanel.centerButton);
		sidePanel.add(buttonPanel.resetButton);
		add(drawPanel, BorderLayout.CENTER);
	}
}
