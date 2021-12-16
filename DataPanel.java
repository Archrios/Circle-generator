import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DataPanel
{
	private static final int circleNum = 5;
	private static final int smallCircle = 10;
	private static final int largeCircle = 300;

	public JLabel circleNumLable;
	public JLabel smallCircleLable; 
	public JLabel largeCircleLable;

	public JTextField circleNumField;
	public JTextField smallCircleField;
	public JTextField largeCircleField;

	/**
	 * default constructor of the DataPanel
	 */
	public DataPanel()
	{
		circleNumLable = new JLabel("Number of Circles: ");
		smallCircleLable = new JLabel("Size of smallest circle: ");
		largeCircleLable = new JLabel("Size of largest circle: ");

		final int FIELD_WIDTH = 5;
		circleNumField = new JTextField(FIELD_WIDTH);
		circleNumField.setText("" + circleNum);

		smallCircleField = new JTextField(FIELD_WIDTH);
		smallCircleField.setText("" + smallCircle);

		largeCircleField = new JTextField(FIELD_WIDTH);
		largeCircleField.setText("" + largeCircle);
	}
}
