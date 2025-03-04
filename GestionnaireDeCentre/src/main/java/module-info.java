module sio.devoir1sio1b {
    requires javafx.controls;
    requires javafx.fxml;

    opens sio.devoir1sio1b.models;
    opens sio.devoir1sio1b to javafx.fxml;
    exports sio.devoir1sio1b;
}