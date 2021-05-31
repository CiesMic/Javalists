package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Timer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SampleController extends Student {
	
	LinkedList<Student>linkedlist = new LinkedList<Student>();
	ArrayList<Student>arraylist = new ArrayList<Student>();
	
    @FXML
    private Label arraytime;

    @FXML
    private Label linkedtime;

    @FXML
    private TextArea result1;

    @FXML
    private TextArea result2;

    @FXML
    void Sprawdz(ActionEvent event) {
    	result1.setText("");
    	result2.setText("");
    	if (linkedlist.size() > 0)
    	{
    	linkedlist.clear();
    	}
    	linkedlist = new LinkedList<Student>(Arrays.asList(
                new Student(1999,"Kowalski", 2),
                new Student(2001,"Kowalska", 3),
                new Student(2002,"Danina", 4),
                new Student(2001,"Willi", 3.5),
                new Student(2003,"Amontytalion", 3.5),
                new Student(2003,"Amelinium", 3),
                new Student(2003,"Zak", 4),
                new Student(2003,"Nowak", 5),
                new Student(2003,"Nowy", 5),
                new Student(2003,"Karoza", 3),
                new Student(2003,"Jarma", 4),
                new Student(2003,"Erasmuz", 2),
                new Student(2003,"Mandalorian", 3.5),
                new Student(2003,"Alan", 4.5),
                new Student(2003,"Bogdan", 5)
    	        ));
    	if (arraylist.size() > 0)
    	{
    	arraylist.clear();
    	}
    	arraylist = new ArrayList<Student>(Arrays.asList(
                new Student(1999,"Kowalski", 2),
                new Student(2001,"Kowalska", 3),
                new Student(2002,"Danina", 4),
                new Student(2001,"Willi", 3.5),
                new Student(2003,"Amontytalion", 3.5),
                new Student(2003,"Amelinium", 3),
                new Student(2003,"Zak", 4),
                new Student(2003,"Nowak", 5),
                new Student(2003,"Nowy", 5),
                new Student(2003,"Karoza", 3),
                new Student(2003,"Jarma", 4),
                new Student(2003,"Erasmuz", 2),
                new Student(2003,"Mandalorian", 3.5),
                new Student(2003,"Alan", 4.5),
                new Student(2003,"Bogdan", 5)
            ));
    	double start = System.nanoTime();
    	Collections.sort(linkedlist);
    	double stop = System.nanoTime();
		for(Student str: linkedlist){
			result1.appendText(str.toString());
		}
		linkedtime.setText(String.valueOf((stop-start)/1000));
		start = System.nanoTime();
		Collections.sort(arraylist);
		stop = System.nanoTime();
		for(Student str: arraylist){
			result2.appendText(str.toString());
		}
		arraytime.setText(String.valueOf((stop-start)/1000));
    }

}
