package com.ecwo.webmonitoring.component;

import com.vaadin.ui.*;

/**
 * Created by IntelliJ IDEA.
 * User: tor
 * Date: 30.06.11
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class WindowOpener extends CustomComponent implements Window.CloseListener {
    Window main;
    Window newWindow;
    Button createButton;
    Button removeButton;
    Label label;

    public WindowOpener(String windowsName, Window main) {
        this.main = main;
        final VerticalLayout layout = new VerticalLayout();
        createButton = new Button("Создать Окно", this, "openButtonClick");
        layout.addComponent(createButton);
        label = new Label("Explanation");
        layout.addComponent(label);
        setCompositionRoot(layout);
    }

    public void openButtonClick(Button.ClickEvent event) {
        newWindow = new Window("Созданное новое окно");
        newWindow.setPositionX(200);
        newWindow.setPositionY(400);
        main.addWindow(newWindow);
        newWindow.addListener(this);
        newWindow.addComponent(new Label("close window"));
        removeButton = new Button("Close", this, "closeButtonClick");
        newWindow.addComponent(removeButton);
        label.setValue("Window Opened");
        createButton.setEnabled(false);
    }

    public void closeButtonClick(Button.ClickEvent event) {
        main.removeWindow(newWindow);
        label.setValue("Window Closed with Button");
        createButton.setEnabled(true);
    }

    public void windowClose(Window.CloseEvent closeEvent) {
        createButton.setEnabled(true);
        label.setValue("Window Closed with control");
    }
}
