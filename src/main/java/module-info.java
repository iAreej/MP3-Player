module com.example.mp3_player {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.mp3_player to javafx.fxml;
    exports com.example.mp3_player;
}