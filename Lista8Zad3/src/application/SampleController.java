package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import javax.swing.JOptionPane;

public class SampleController {

    @FXML
    private TextField txtNick;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSurname;

    @FXML
    private RadioButton male;

    @FXML
    private ToggleGroup plec;

    @FXML
    private RadioButton female;
    
    @FXML
    private TextArea result;

    @FXML
    private TextField txtadress;

    @FXML
    void Check(ActionEvent event) {
    	try
    	{
    		CheckName(txtName);
    		CheckName(txtSurname);
    		Checkplec();
    		SprawdzNick(txtNick.getText());
    		Checkemail(txtadress.getText());
    		
    		result.appendText("\nImie: "+txtName.getText() + "\n");
    		result.appendText("Nazwisko: "+txtSurname.getText() + "\n");
    		if(male.isSelected())
    		{
    			result.appendText("Plec: Mezczyzna\n");
    		}
    		else if(female.isSelected())
    		{
    			result.appendText("Plec: Kobieta\n");
    		}
    		result.appendText("Nick: " + txtNick.getText() + "\n");
    		result.appendText("Email: "+txtadress.getText() + "\n");
    		
    		txtName.setText("");
    		txtSurname.setText("");
    		txtNick.setText("");
    		txtadress.setText("");
    		
    		
    	}
    	catch (lengthException le)
    	{
    		JOptionPane.showMessageDialog(null, le.getMessage(), "Length Exception", 0);
    	}
    	catch (UpperNumberException up)
    	{
    		JOptionPane.showMessageDialog(null, up.getMessage(), "Letter Exception", 0);
    	} 
    	catch (NumberException nb) 
    	{
    		JOptionPane.showMessageDialog(null, nb.getMessage(), "Number Exception", 0);
		} 
    	catch (plecException pl) 
    	{
			JOptionPane.showMessageDialog(null, pl.getMessage(), "Plec Exception", 0);
		} 
    	catch (domenaException dm) {
			JOptionPane.showMessageDialog(null, dm.getMessage(), "Domena Exception", 0);
		}
    }
    
    private void SprawdzNick(String nick) throws lengthException, NumberException
    {
    	if (nick.length() < 6)
    	{
    		throw new lengthException("nick");
    	}
    	boolean isNumber = false;
    	for(int i=0; i<nick.length(); i++)
    	{
    		if (Character.isDigit(nick.charAt(i)))
    		{
    			isNumber = true;
    		}
    	}
    	if(!isNumber)
    	{
    		throw new NumberException("nick");
    	}
    }
    private void CheckName(TextField text) throws lengthException, UpperNumberException
    {
    	if (text.getText().length() < 2)
    	{
    		throw new lengthException(text.getId());
    	}
    	boolean isNotLetter = false;
    	String name = text.getText();
    	for(int i=0; i<name.length(); i++)
    	{
    		if (!Character.isLetter(name.charAt(i)))
    		{
    			isNotLetter = true;
    		}
    	}
    	if(isNotLetter || Character.isLowerCase(name.charAt(0)))
    	{
    		throw new UpperNumberException(text.getId());
    	}
    }
    private void Checkplec() throws plecException
    {
    	String name = txtName.getText();
    	int len = name.length();
    	if(name.substring(len - 2, len).equals("ek") || name.substring(len - 3, len).equals("usz"))
    	{
    		if(female.isSelected())
    		{
    			throw new plecException("Kobieta");
    		}
    	}
    	else if (name.substring(len - 2, len).equals("ta") || name.substring(len - 2, len).equals("na"))
    	{
    		if(male.isSelected())
    		{
    			throw new plecException("Mezczyzna");
    		}
    	} else throw new plecException("plec");
    }
    private void Checkemail(String email) throws lengthException, domenaException
    {
    	if(email.length() < 8)
    	{
    		throw new lengthException("email");
    	}
    	int len = email.length();
    	if(!email.substring(len - 7, len).equals("@gra.pl"))
    	{
    		throw new domenaException(email);
    	}
    }
}

