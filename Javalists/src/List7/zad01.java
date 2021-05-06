package List7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class zad01 extends JFrame implements ActionListener {

	private JButton add_but;
	private JTextField text_field;
	private JLabel infolabel;
	private JLabel formatlabel;
	private JLabel resultlabel;
	
	private Date data;
	private List<Date> listdate = new ArrayList<Date>();

	private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

	public zad01() {
	
		setSize(250,300);
		setTitle("Zad 1: Arraylist na datach");
		setLayout(null);
		
		formatlabel = new JLabel("Podaj date wg formatu dd.MM.yyyy");
		formatlabel.setBounds(20,10,400,20);
		add(formatlabel);
		
		text_field = new JTextField();
		text_field.setBounds(40,40,150,20);
		add(text_field);
		
		add_but = new JButton("Add");
		add_but.setBounds(60,70,110,20);
		add_but.addActionListener(this);
		add(add_but);
		
		infolabel = new JLabel();
		infolabel.setBounds(10,130,200,20);
		add(infolabel);
		
		resultlabel = new JLabel();
		resultlabel.setBounds(10, 100,400,20);
		add(resultlabel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		zad01 app = new zad01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(!text_field.getText().isEmpty())
		{
			boolean is_Duplicate;
			try {
				is_Duplicate = false;
				data = sdf.parse(text_field.getText());
				if (listdate.size() < 4 & listdate.size() > 0) {
					for (int i = 0; i < listdate.size(); i++) {
						if (((Date) listdate.get(i)).equals(data) & !is_Duplicate) {
							is_Duplicate = true;
						}
					}
					if (!is_Duplicate) {
						listdate.add(data);
						text_field.setText("");
						Collections.sort(listdate);
						resultlabel.setText(listdate.toString());
					} else {
						infolabel.setText("Duplicated");
					}
				} else if (listdate.size() == 0) {
					listdate.add(data);
					text_field.setText("");
					resultlabel.setText(listdate.toString());
				} else if (listdate.size() > 3) {
					infolabel.setText("Is Full");
				}
			} catch (ParseException z) {
				infolabel.setText("Wrong format");
			}
		}
		
	}

}
