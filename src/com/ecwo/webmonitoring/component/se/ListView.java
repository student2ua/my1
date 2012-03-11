package com.ecwo.webmonitoring.component.se;

import com.vaadin.ui.VerticalSplitPanel;

/**
 * Created by IntelliJ IDEA.
 * User: Admin
 * Date: 11.03.12
 * Time: 1:43
 */
public class ListView extends VerticalSplitPanel {
    public ListView(PersonList personList, PersonForm personForm) {
        setFirstComponent(personList);
        setSecondComponent(personForm);
        setSplitPosition(40,UNITS_PIXELS);
    }
}
