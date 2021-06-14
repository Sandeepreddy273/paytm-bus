module paytm {
    requires javafx.controls;
    requires javafx.fxml;

    opens paytm to javafx.fxml;
    exports paytm;
}
