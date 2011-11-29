package com.ecwo.webmonitoring;

import com.ecwo.webmonitoring.component.WindowOpener;
import com.vaadin.*;
import com.vaadin.ui.Window;

/**
 * Created by IntelliJ IDEA.
 * User: tor
 * Date: 30.06.11
 * Time: 18:41
 * To change this template use File | Settings | File Templates.
 */
public class My extends Application {
    @Override
    public void init() {
        setLogoutURL("/logout.html");
        Window window=new Window("Test window");
        setMainWindow(window);
        window.addComponent(new WindowOpener("Открывашка окон",window));
        window.addListener(new Window.CloseListener() {
                    public void windowClose(Window.CloseEvent closeEvent) {
                       System.out.println("close App");
                       getMainWindow().getApplication().close();
                    }
                });
    }

}
