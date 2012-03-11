package com.ecwo.webmonitoring.component.se;

import com.vaadin.ui.Table;

/**
 * Created by IntelliJ IDEA.
 * User: Admin
 * Date: 11.03.12
 * Time: 1:32
 */
public class PersonList extends Table {
    public PersonList() {
        addContainerProperty("First Name", String.class, "fff");
        addContainerProperty("Last Name", String.class, "Laaaast N");
        addItem();
        addItem();
        setSizeFull();
    }
}
