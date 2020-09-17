package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleBorder {

    @FXML
    private TextField prihlasovacieMeno;

    @FXML
    private Button ok;
    @FXML
    private Button cancel;

    @FXML
    public void onActionHandler(ActionEvent event){
        if(event.getSource().equals(ok)){
            System.out.println("Hello GUI world " + prihlasovacieMeno.getText());
            ok.setDisable(true);
        }else if(event.getSource().equals(cancel)) {
            System.out.println("Bye GUI world " + prihlasovacieMeno.getText());
            ok.setDisable(false);
        }
    }


  public void onKeyReleased(){
        String text=prihlasovacieMeno.getText();
        if(text.isEmpty()){
            ok.setDisable(true);
        }
  }
}
