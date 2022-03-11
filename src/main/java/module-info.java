module per.zzz.pip.pip2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens per.zzz.pip.pip2 to javafx.fxml;
    exports per.zzz.pip.pip2;
}
