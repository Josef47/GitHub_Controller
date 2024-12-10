module org.example.github_controller {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.github_controller to javafx.fxml;
    exports org.example.github_controller;
}