module be.inf1.flappybird {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens be.inf1.flappybird to javafx.fxml;
    exports be.inf1.flappybird;
}
