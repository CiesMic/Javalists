package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.event.ActionEvent;

public class SampleController {

    @FXML
    private Label result;

    @FXML
    private TextField field1;

    @FXML
    private Button Dziel;

    @FXML
    private RadioButton nb1;

    @FXML
    private ToggleGroup gr;

    @FXML
    private RadioButton nb2;

    private String[] str = {"1","12", "12f"};
    @FXML
    void Licz(ActionEvent event) {
    	
    	if(nb1.isSelected())
    	{
    		try
    		{
    		int nb = Integer.valueOf(str[Integer.valueOf(field1.getText())]);
    		result.setText(String.valueOf(nb));
    		}
    		catch(NumberFormatException nb)
    		{
    			result.setText(nb.getMessage());
    		}
    		catch(ArrayIndexOutOfBoundsException ar)
    		{
    			result.setText(ar.getMessage());
    		}
    			
    	}
    	else if (nb2.isSelected())
    	{
    		try
    		{
    		Integer zn = Integer.valueOf(field1.getText());
    		zn = zn/0;
    		result.setText(String.valueOf(zn));
    		}
    		catch (ArithmeticException arith)
    		{
    			result.setText(arith.getMessage());
    		}
    	}
    }

}
