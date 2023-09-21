module com.cimba.javafxminiprojects {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cimba.caculator to javafx.fxml;
    exports com.cimba.caculator;
}