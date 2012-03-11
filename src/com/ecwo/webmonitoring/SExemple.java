package com.ecwo.webmonitoring;

import com.ecwo.webmonitoring.component.se.ListView;
import com.ecwo.webmonitoring.component.se.NavigationTree;
import com.ecwo.webmonitoring.component.se.PersonForm;
import com.ecwo.webmonitoring.component.se.PersonList;
import com.vaadin.Application;
import com.vaadin.terminal.Sizeable;
import com.vaadin.ui.*;

/**
 * Created by IntelliJ IDEA.
 * User: Admin
 * Date: 11.03.12
 * Time: 1:03
 */
public class SExemple extends Application {
    private Button addContact = new Button("Add contact");
    private Button search = new Button("Search");
    private Button share = new Button("Share");
    private Button help = new Button("Help");
    private HorizontalSplitPanel horizontalSplit = new HorizontalSplitPanel();
    private NavigationTree navigationTree = new NavigationTree();
    private ListView listView = null;
    private PersonList personList=null;
    private PersonForm personForm=null;

    @Override
    public void init() {
        buildMainLayaut();
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.setSizeFull();
        verticalLayout.addComponent(buildToolBar());
        verticalLayout.addComponent(horizontalSplit);
        verticalLayout.setExpandRatio(horizontalSplit, 1);
        horizontalSplit.setSplitPosition(200, Sizeable.UNITS_PIXELS);
        getMainWindow().setContent(verticalLayout);
        setMainView(getListView());
    }

    private Component buildToolBar() {
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.addComponent(addContact);
        horizontalLayout.addComponent(search);
        horizontalLayout.addComponent(share);
        horizontalLayout.addComponent(help);
        return horizontalLayout;
    }

    private void buildMainLayaut() {
        setMainWindow(new Window("Main Window"));
        horizontalSplit.setFirstComponent(navigationTree);
    }

    private void setMainView(Component mainView) {
        horizontalSplit.setSecondComponent(mainView);
    }

    private ListView getListView() {
        if (listView == null) {
            personList=new PersonList();
            personForm=new PersonForm();
            listView = new ListView(personList,personForm);
        }
        return listView;
    }
}
