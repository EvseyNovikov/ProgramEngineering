module builder.pattern.builder {
    requires javafx.controls;
    requires javafx.fxml;


    opens builder.pattern.builder to javafx.fxml;
    exports builder.pattern.builder;
}