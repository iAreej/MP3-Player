package com.example.mp3_player;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;
import javafx.scene.Parent;



    public class HelloApplication extends Application {

        @Override
        public void start(Stage stage) throws IOException {


            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("MP3-PLAYER");
            stage.show();

            stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

                @Override
                public void handle(WindowEvent arg0) {

                    Platform.exit();
                    System.exit(0);
                }
            });
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
