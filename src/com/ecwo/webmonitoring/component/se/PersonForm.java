package com.ecwo.webmonitoring.component.se;

import com.vaadin.ui.Button;
import com.vaadin.ui.Form;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

/**
 * Created by IntelliJ IDEA.
 * User: Admin
 * Date: 11.03.12
 * Time: 1:25
 */
public class PersonForm extends Form {
    Button save = new Button("Save");
    Button cancel = new Button("Cancel");

    public PersonForm() {
        addField("First Name", new TextField("First Name"));
        addField("Last Name", new TextField("Last Name"));
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.setSpacing(true);
        horizontalLayout.addComponent(save);
        horizontalLayout.addComponent(cancel);
        setFooter(horizontalLayout);
    }
}
