module com.ccasais.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ccasais.demo to javafx.fxml;
    exports com.ccasais.demo;
}