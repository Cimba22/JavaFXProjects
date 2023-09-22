package com.cimba.caculator;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController{

    @FXML private Pane titlePane;
    @FXML private ImageView imgViewClose;
    @FXML private ImageView imgViewHide;

    private double x, y;

    public void init(Stage stage) {
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();

        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX() - x);
            stage.setY(mouseEvent.getScreenY() - y);
        });

        imgViewClose.setOnMouseClicked(mouseEvent -> stage.close());
        imgViewHide.setOnMouseClicked(mouseEvent -> stage.setIconified(true));


    }

//    @FXML
//    void close(MouseEvent event){
//        Stage stage = (Stage) ((ImageView)event.getSource()).getScene().getWindow();
//        stage.close();
//    }

}