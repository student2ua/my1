package com.ecwo.webmonitoring.component;

import com.vaadin.ui.AbstractComponentContainer;
import com.vaadin.ui.Button;


/**
 * Created by IntelliJ IDEA.
 * User: tor
 * Date: 30.06.11
 * Time: 20:51
 * To change this template use File | Settings | File Templates.
 */
public class TheButtons2 {
    Button button1;
    Button button2;

    public TheButtons2(AbstractComponentContainer container) {
        button1 = new Button("Do not push this button");
        button1.addListener(Button.ClickListener.class, this, "theButtonClick");
        container.addComponent(button1);

        button2 = new Button("Push this button");
        button2.addListener(new Button.ClickListener() {
            public void buttonClick(Button.ClickEvent event) {
                button2.setCaption("Да, Да еще!!!");
            }
        });
        container.addComponent(button2);
    }

    public void theButtonClick(Button.ClickEvent event) {
        button1.setCaption("Не нажимать! написано же");

    }
}
