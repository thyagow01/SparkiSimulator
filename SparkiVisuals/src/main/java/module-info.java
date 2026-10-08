module com.sparkivisuals {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sparkivisuals to javafx.fxml;
    exports com.sparkivisuals;
}
