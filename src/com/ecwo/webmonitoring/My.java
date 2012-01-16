package com.ecwo.webmonitoring;

import com.ecwo.webmonitoring.component.WindowOpener;
import com.vaadin.Application;
import com.vaadin.data.Property;
import com.vaadin.data.util.FilesystemContainer;
import com.vaadin.data.util.TextFileProperty;
import com.vaadin.ui.Label;
import com.vaadin.ui.Select;
import com.vaadin.ui.Window;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: tor
 * Date: 30.06.11
 * Time: 18:41
 */
public class My extends Application {
    FilesystemContainer doc = new FilesystemContainer(new File("."));
    Select select = new Select("FilesystemContainer", doc);
    Label label = new Label("Select a Doc", Label.CONTENT_RAW);

    @Override
    public void init() {
        setLogoutURL("/logout.html");
        Window window = new Window("Test window");
        setMainWindow(window);
        window.addComponent(label);
        window.addComponent(select);
        window.addComponent(new WindowOpener("Открывашка окон", window));
        window.addListener(new Window.CloseListener() {
            public void windowClose(Window.CloseEvent closeEvent) {
                System.out.println("close App");
                getMainWindow().getApplication().close();
            }
        });
        select.setImmediate(true);
        select.addListener(new Property.ValueChangeListener() {
            @Override
            public void valueChange(Property.ValueChangeEvent valueChangeEvent) {
                label.setPropertyDataSource(new TextFileProperty((File) select.getValue()));
            }
        });
    }

}
