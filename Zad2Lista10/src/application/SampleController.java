package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SampleController {

    @FXML
    private TextArea result1;

    @FXML
    private TextArea result2;

    @FXML
    void Click(ActionEvent event)  throws InterruptedException {
    	result1.clear();
    	result2.clear();
    	Thread thr = new Thread(){
            public void run(){
            	writea(1);
            }
    	};
    	Thread thr2 = new Thread(){
            public void run(){
            	writea(2);
            }
    	};
    	Thread thr3 = new Thread(){
            public void run(){
            	writea(3);
            }
    	};
    	Thread thr4 = new Thread(){
            public void run(){
            	writea(4);
            }
    	};
    	Thread thre = new Thread(){
            public void run(){
            	writeb(1);
            }
    	};
    	Thread thre2 = new Thread(){
            public void run(){
            	writeb(2);
            }
    	};
    	Thread thre3 = new Thread(){
            public void run(){
            	writeb(3);
            }
    	};
    	Thread thre4 = new Thread(){
            public void run(){
            	writeb(4);
            }
    	};
    	thr.start();
    	thr2.start();
    	thr3.start();
    	thr4.start();
    	thre.start();
    	thre2.start();
    	thre3.start();
    	thre4.start();
    	
    }
    
    private synchronized void writea(int a) 
    {
    	for(int i=0; i<100; i++)
    	{
    		Platform.runLater(()->{
    		result1.appendText(a + " ");
    		});
    	}
    }
    private void writeb(int a)
    {
    	for(int i=0; i<100; i++)
    	{
    		Platform.runLater(()->{
    		result2.appendText(a + " ");
    		});
    	}
    }
}
