package com.java.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;


public class Settings {

    public static void displaySettings(){
        Stage window = new Stage();
        window.initStyle(StageStyle.UNDECORATED);

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Settings");
        window.setMinHeight(640);
        window.setMinWidth(360);

        Button save = new Button("save");
        Button close = new Button("close");

        close.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(close);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
}
