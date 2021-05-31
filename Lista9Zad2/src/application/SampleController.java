package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SampleController extends Student {
	
	List<Student>studentlist = new ArrayList<Student>();
	
    @FXML
    private TextArea result;
	
    @FXML
    private TextField txtnazwisko;

    @FXML
    private TextField txtrocznik;

    @FXML
    private TextField txtavg;

    @FXML
    void Dodaj(ActionEvent event) {
    	try
    	{
    	int rocznik = Integer.valueOf(txtrocznik.getText());
    	String nazwisko = txtnazwisko.getText();
    	double avg = Double.valueOf(txtavg.getText());
    	studentlist.add(new Student(rocznik, nazwisko, avg));
    	txtrocznik.setText("");
    	txtnazwisko.setText("");
    	txtavg.setText("");
    	}
    	catch (Exception e)
    	{
    		JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
    	}
    }

    @FXML
    void Sort(ActionEvent event) {
    	//if(studentlist.size() > 0)
    	//{
    		Collections.sort(studentlist);
    		JOptionPane.showMessageDialog(null, "Posortowane", "Sort", 1);
    	//}
    }

    @FXML
    void Wyswietl(ActionEvent event) {
    	if(studentlist.size() > 0)
    	{
    		result.setText("");
    		for(Student str: studentlist){
    			result.appendText(str.toString());
    		}
    	}
    }

}