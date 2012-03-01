/*
@VaadinApache2LicenseForJavaFiles@
 */
package com.vaadin.terminal.gwt.client.ui;

import com.google.gwt.core.client.GWT;

public class VerticalLayoutConnector extends AbstractOrderedLayoutConnector {

    @Override
    public VVerticalLayout getWidget() {
        return (VVerticalLayout) super.getWidget();
    }

    @Override
    protected VVerticalLayout createWidget() {
        return GWT.create(VVerticalLayout.class);
    }

}