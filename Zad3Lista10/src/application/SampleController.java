package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;

public class SampleController{

	private int a = 1;
	private int b = 1;
	
    @FXML
    private TextArea txtbezwatku;
    @FXML
    private TextArea txtwatek;

    @FXML
    private ProgressBar watekbar = new ProgressBar(0);

    @FXML
    private ProgressBar watekbezbar = new ProgressBar(0);
    
    @FXML
    void Uruchom_bezwatku(ActionEvent event) throws InterruptedException {
    	b = 0;
    	txtbezwatku.setText("");
    	watekbezbar.setProgress(0);
    	pomiarbezwatku("1");
    	//watekbezbar.setProgress(0.5);
    	pomiarbezwatku("2");
    	//watekbezbar.setProgress(1);
    	pomiarbezwatku("3");
    }

    @FXML
    void Uruchom_watek(ActionEvent event){
    	a = 0;
    	txtwatek.setText("");
    	watekbar.setProgress(0);
    	Thread th1 = new Thread(){
            public void run(){
            	try {
					pomiar("1");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
    	};
    	Thread th2 = new Thread(){
            public void run(){
            	try {
					pomiar("2");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
    	};
    	Thread th3 = new Thread(){
            public void run(){
            	try {
					pomiar("3");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
    	};
    	th1.start();
    	th2.start();
    	th3.start();
    }
    
    private void pomiar(String name) throws InterruptedException
    {
    	for(int i=0; i<100; i++)
    	{
    		 Platform.runLater(()->{
    			 txtwatek.appendText(name + " ");
                   });
    		a++;
    		if(a % 30 == 0)
    		{
                  	watekbar.setProgress(watekbar.getProgress()+0.1f);
    		}
    		Thread.sleep(100);
    	}
    	
    }
    
    private void pomiarbezwatku(String name) throws InterruptedException
    {
    	for(int i=0; i<100; i++)
    	{
    		txtbezwatku.appendText(name + " ");
    		b++;
    		if(b % 30 == 0)
    		{
    			watekbezbar.setProgress(watekbar.getProgress()+0.1f);
    		}
    		Thread.sleep(10);
    	}
    }
}
