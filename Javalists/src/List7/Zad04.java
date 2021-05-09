package List7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Zad04 implements ActionListener {

	private JFrame frame;
	private JLabel Namelabel;
	private JLabel Surnamelabel;
	private JLabel PESELlabel;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtPesel;
	private JTextArea result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zad04 window = new Zad04();
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
	public Zad04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 263, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Namelabel = new JLabel("Name");
		Namelabel.setBounds(40, 26, 46, 17);
		frame.getContentPane().add(Namelabel);

		Surnamelabel = new JLabel("Surname");
		Surnamelabel.setBounds(40, 54, 46, 14);
		frame.getContentPane().add(Surnamelabel);

		PESELlabel = new JLabel("PESEL");
		PESELlabel.setBounds(40, 79, 46, 14);
		frame.getContentPane().add(PESELlabel);

		txtName = new JTextField();
		txtName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isLetter(e.getKeyChar())) {
					e.consume();
				}
				else if(txtName.getText().length() == 0)
				{
				    if (Character.isLowerCase(e.getKeyChar())) {
				        e.setKeyChar(Character.toUpperCase(e.getKeyChar()));
				      }
				}
			}
		});
		txtName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtName.getText().equals("Name")) {
					txtName.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtName.getText().length() == 0) {
					txtName.setText("Name");
				}
			}
		});
		txtName.setText("Name");
		txtName.setBounds(96, 25, 86, 18);
		txtName.setToolTipText("Set your Name here");
		frame.getContentPane().add(txtName);

		txtSurname = new JTextField();
		txtSurname.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtSurname.getText().equals("Surname")) {
					txtSurname.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtSurname.getText().length() == 0) {
					txtSurname.setText("Surname");
				}
			}
		});
		txtSurname.setText("Surname");
		txtSurname.setBounds(96, 51, 86, 20);
		txtSurname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isLetter(e.getKeyChar())) {
					e.consume();
				}
				else if(txtSurname.getText().length() == 0)
				{
				    if (Character.isLowerCase(e.getKeyChar())) {
				        e.setKeyChar(Character.toUpperCase(e.getKeyChar()));
				      }
				}
			}
		});
		txtSurname.setToolTipText("Set your Surname here");
		frame.getContentPane().add(txtSurname);

		txtPesel = new JTextField("PESEL");
		txtPesel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar()) || txtPesel.getText().length() > 10) {
					e.consume();
				}
			}
		});
		txtPesel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {

				if (txtPesel.getText().equals("PESEL")) {
					txtPesel.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {

				if (txtPesel.getText().length() == 0) {
					txtPesel.setText("PESEL");
				}
			}
		});
		txtPesel.setText("PESEL");
		txtPesel.setBounds(96, 76, 86, 20);
		txtPesel.setToolTipText("Set your PESEL here (must be digit and length is equal to 11");
		frame.getContentPane().add(txtPesel);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(60, 104, 89, 23);
		btnNewButton.addActionListener(this);
		frame.getContentPane().add(btnNewButton);

		result = new JTextArea();
		result.setEditable(false);
		result.setLineWrap(true);
		result.setBounds(10, 133, 227, 253);
		frame.getContentPane().add(result);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (!txtName.getText().equals("Name") & !txtSurname.getText().equals("Surname")
				& txtPesel.getText().length() == 11) {
			result.append("Name: " + txtName.getText() + "\n");
			result.append("Surname: " + txtSurname.getText() + "\n");

			String pesel = txtPesel.getText();

			if (Integer.valueOf(pesel.substring(0, 2)) <= 21) {
				if (Integer.valueOf(pesel.substring(2, 4)) - 20 <= 12 & Integer.valueOf(pesel.substring(2, 4)) - 20 > 0) {
					result.append("Rok urodzenia: 20" + pesel.substring(0, 2) + "\n");
					result.append("Miesi¹c: " + (Integer.valueOf(pesel.substring(2, 4)) - 20) + "\n");
					result.append("Data: " + pesel.substring(4, 6) + "\n");
					if (pesel.charAt(9) % 2 == 0) {
						result.append("P³eæ: Kobieta \n");
					} else
						result.append("P³eæ: Mêzczyzna \n");

					result.append("Cyfra kontrolna: " + pesel.charAt(10) + "\n");

					txtName.setText("Name");
					txtSurname.setText("Surname");
					txtPesel.setText("PESEL");
				}
			} else {
				if (Integer.valueOf(pesel.substring(2, 4)) <= 12 & Integer.valueOf(pesel.substring(2, 4)) > 0) {
					result.append("Rok urodzenia: 19" + pesel.substring(0, 2) + "\n");
					result.append("Miesi¹c: " + pesel.substring(2, 4) + "\n");
					result.append("Data: " + pesel.substring(4, 6) + "\n");
					if (pesel.charAt(9) % 2 == 0) {
						result.append("P³eæ: Kobieta \n");
					} else
						result.append("P³eæ: Mêzczyzna \n");
					result.append("Cyfra kontrolna: " + pesel.charAt(10) + "\n");

					txtName.setText("Name");
					txtSurname.setText("Surname");
					txtPesel.setText("PESEL");
				}
			}

		}
	}
}
