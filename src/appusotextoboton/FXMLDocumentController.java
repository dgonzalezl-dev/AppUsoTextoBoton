/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import CustomController.CustomControl;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Usuario
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private CustomControl cc1;
    @FXML
    private CustomControl cc2;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cc1.addEventHandler(EventType.ROOT, event->{
            if(event.getEventType().getName().equalsIgnoreCase("Action")){
                if(cc1.getText().equals(""))
                    label.setText("Aun no ha añadido texto");
                else
                    label.setText("Se ha guardado "+cc1.getText());
            }
        });
        
        cc2.addEventHandler(EventType.ROOT, event->{
            //Ignora los eventos que no sean onaction
            if(event.getEventType().getName().equalsIgnoreCase("Action")){
                if(cc2.getText().equals(""))
                    label.setText("Aun no ha añadido texto");
                else
                    label.setText("Se ha guardado "+cc2.getText());
            }
        });
    }    
    
}
