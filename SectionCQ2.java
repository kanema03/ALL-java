import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SectionCQ2 {

	private JFrame frame;
	private JTextField textExam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SectionCQ2 window = new SectionCQ2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SectionCQ2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Section C Q2");
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 974, 617);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(200, 255, 255));
		frame.getContentPane().setLayout(null);

		JLabel Examlbl = new JLabel("joshua's Java");
		Examlbl.setHorizontalAlignment(SwingConstants.CENTER);
		Examlbl.setFont(new Font("Tahoma", Font.BOLD, 25));
		Examlbl.setBounds(218, 40, 437, 56);
		frame.getContentPane().add(Examlbl);

		textExam = new JTextField();
		textExam.setHorizontalAlignment(SwingConstants.CENTER);
		textExam.setBounds(149, 100, 603, 361);
		frame.getContentPane().add(textExam);
		textExam.setColumns(10);

		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String b1 = "You clicked okay";

				textExam.setText(b1);
				textExam.setFont(new Font("Tahoma", Font.ITALIC, 40));

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(299, 500, 326, 56);
		frame.getContentPane().add(btnNewButton);
	}
}
