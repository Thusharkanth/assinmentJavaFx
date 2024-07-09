module com.example.assinmentjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assinmentjavafx to javafx.fxml;
    exports com.example.assinmentjavafx;
}