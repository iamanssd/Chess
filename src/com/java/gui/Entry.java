package com.java.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;


public class Entry extends Application{
	
	@Override
	public void start(Stage primaryStage) {
	    Font.loadFont(getClass().getResourceAsStream("resources/NavigoExtraLight.ttf"), 120);

        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);

        VBox layout= new VBox();

        //buttons
        Button clickMe = new Button("click me");
        clickMe.setOnAction(e -> Settings.displaySettings());
        Button closeMain = new Button("close");
        closeMain.setOnAction(e -> primaryStage.close());

        layout.getChildren().addAll(clickMe, closeMain);

        Scene scene1 = new Scene(layout,1920,1080);
        scene1.getStylesheets().add("gui.css");
        //displaying default window
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Title here");
        primaryStage.show();
    }


 	public static void main(String[] args){
	    launch(args);
    }
}