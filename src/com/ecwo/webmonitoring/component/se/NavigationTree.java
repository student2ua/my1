package com.ecwo.webmonitoring.component.se;

import com.vaadin.ui.Tree;

/**
 * Created by IntelliJ IDEA.
 * User: Admin
 * Date: 11.03.12
 * Time: 1:36
 */
public class NavigationTree extends Tree {
    public static final Object SHOW_ALL = "Show all";
    public static final Object SEARCH = "Search";

    public NavigationTree() {
        addItem(SHOW_ALL);
        addItem(SEARCH);
    }
}
