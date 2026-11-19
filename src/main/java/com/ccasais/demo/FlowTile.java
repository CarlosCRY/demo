package com.ccasais.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.IOException;

public class FlowTile extends Application {
    private static Scene scene;
    private static int TEN = 10;
    @Override
    public void start(Stage stage) throws IOException {

        TilePane root = new TilePane();
        for (int i = 0; i < TEN; i++) {

        }

        Button bt1 = new Button("A");
        bt1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        Button bt2 = new Button("B");
        bt2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        Button bt3 = new Button("C");
        bt3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        Button bt4 = new Button("D");
        bt4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        Button bt5 = new Button("E");
        bt5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        Button bt6 = new Button("F");
        bt6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        root.getChildren().addAll(bt1, bt2, bt3, bt4, bt5, bt6);

        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
    public static void main (String[] args) {launch();}
}

