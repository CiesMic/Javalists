package List7;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad03 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField dane;
	private JButton numer1;
	private JButton numer2;
	private JButton numer3;
	private JButton numer4;
	private JButton numer5;
	private JButton numer6;
	private JButton numer7;
	private JButton numer8;
	private JButton numer9;
	private JButton numer0;
	private JButton dodawanie;
	private JButton odejmowanie;
	private JButton mnozenie;
	private JButton dzielenie;
	private JButton result;

	private String Znak = "", Wynik = "";
	private double pamiec;

	public static void main(String[] args) {

		Zad03 app = new Zad03();
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public Zad03() {
		setSize(300, 450);
		setTitle("Zad 3: Kalkulator");
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 4;
		c.ipady = 90;
		c.gridheight = 1;
		c.gridx = 0;
		c.gridy = 0;
		dane = new JTextField();
		dane.setEditable(false);
		add(dane, c);

		numer1 = new JButton("1");
		c.weightx = 0.5;
		c.ipady = 0;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.ipady = 0;
		c.ipadx = 0;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 3;
		numer1.addActionListener(this);
		add(numer1, c);

		numer2 = new JButton("2");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 3;
		numer2.addActionListener(this);
		add(numer2, c);

		numer3 = new JButton("3");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 2;
		c.gridy = 3;
		numer3.addActionListener(this);
		add(numer3, c);

		numer4 = new JButton("4");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 2;
		numer4.addActionListener(this);
		add(numer4, c);

		numer5 = new JButton("5");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 2;
		numer5.addActionListener(this);
		add(numer5, c);

		numer6 = new JButton("6");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 2;
		c.gridy = 2;
		numer6.addActionListener(this);
		add(numer6, c);

		numer7 = new JButton("7");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		numer7.addActionListener(this);
		add(numer7, c);

		numer8 = new JButton("8");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 1;
		numer8.addActionListener(this);
		add(numer8, c);

		numer9 = new JButton("9");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 2;
		c.gridy = 1;
		numer9.addActionListener(this);
		add(numer9, c);

		numer0 = new JButton("0");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 4;
		numer0.addActionListener(this);
		add(numer0, c);

		dodawanie = new JButton("+");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 3;
		c.gridy = 3;
		dodawanie.addActionListener(this);
		add(dodawanie, c);

		odejmowanie = new JButton("-");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 3;
		c.gridy = 2;
		odejmowanie.addActionListener(this);
		add(odejmowanie, c);

		mnozenie = new JButton("*");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 3;
		c.gridy = 1;
		mnozenie.addActionListener(this);
		add(mnozenie, c);

		result = new JButton("=");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 3;
		c.gridy = 4;
		result.addActionListener(this);
		add(result, c);

		dzielenie = new JButton("/");
		c.weightx = 0.5;
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 2;
		c.gridy = 4;
		dzielenie.addActionListener(this);
		add(dzielenie, c);
	}

	public void actionPerformed(ActionEvent e) {
		String command = ((JButton) e.getSource()).getText();
		if (command.charAt(0) >= '0' & command.charAt(0) <= '9') {
			Wynik = dane.getText() + command;
			dane.setText(Wynik);
		} else {
			switch (Znak) {
			case "":
				pamiec = Double.parseDouble(dane.getText());
				break;
			case "+":
				pamiec = pamiec + Integer.parseInt(dane.getText());
				break;
			case "-":
				pamiec = pamiec - Integer.parseInt(dane.getText());
				break;
			case "*":
				pamiec = pamiec * Integer.parseInt(dane.getText());
			case "/":
				if (pamiec == 0) {
					pamiec = 0;
				} else
					pamiec = pamiec / Integer.parseInt(dane.getText());
				break;
			case "=":
				dane.setText("" + pamiec);
				pamiec = (double) 0;
				Znak = "";
				break;
			default:
				pamiec = 0;
			}
			Znak = command;
			dane.setText("");
			if (Znak == "=") {
				dane.setText("" + pamiec);
				pamiec = (double) 0;
				Znak = "";
			}
		}
	}
}