/* 
@ITMillApache2LicenseForJavaFiles@
 */

package com.itmill.toolkit.terminal.gwt.client;

import com.google.gwt.user.client.ui.Widget;
import com.itmill.toolkit.terminal.gwt.client.ui.IAccordion;
import com.itmill.toolkit.terminal.gwt.client.ui.IButton;
import com.itmill.toolkit.terminal.gwt.client.ui.ICheckBox;
import com.itmill.toolkit.terminal.gwt.client.ui.ICoordinateLayout;
import com.itmill.toolkit.terminal.gwt.client.ui.ICustomComponent;
import com.itmill.toolkit.terminal.gwt.client.ui.ICustomLayout;
import com.itmill.toolkit.terminal.gwt.client.ui.IDateFieldCalendar;
import com.itmill.toolkit.terminal.gwt.client.ui.IEmbedded;
import com.itmill.toolkit.terminal.gwt.client.ui.IFilterSelect;
import com.itmill.toolkit.terminal.gwt.client.ui.IForm;
import com.itmill.toolkit.terminal.gwt.client.ui.IFormLayout;
import com.itmill.toolkit.terminal.gwt.client.ui.IGridLayout;
import com.itmill.toolkit.terminal.gwt.client.ui.ILabel;
import com.itmill.toolkit.terminal.gwt.client.ui.ILink;
import com.itmill.toolkit.terminal.gwt.client.ui.IListSelect;
import com.itmill.toolkit.terminal.gwt.client.ui.IMenuBar;
import com.itmill.toolkit.terminal.gwt.client.ui.INativeSelect;
import com.itmill.toolkit.terminal.gwt.client.ui.IOldOrderedLayout;
import com.itmill.toolkit.terminal.gwt.client.ui.IOptionGroup;
import com.itmill.toolkit.terminal.gwt.client.ui.IOrderedLayout;
import com.itmill.toolkit.terminal.gwt.client.ui.IPanel;
import com.itmill.toolkit.terminal.gwt.client.ui.IPasswordField;
import com.itmill.toolkit.terminal.gwt.client.ui.IPopupCalendar;
import com.itmill.toolkit.terminal.gwt.client.ui.IPopupView;
import com.itmill.toolkit.terminal.gwt.client.ui.IProgressIndicator;
import com.itmill.toolkit.terminal.gwt.client.ui.IScrollTable;
import com.itmill.toolkit.terminal.gwt.client.ui.ISlider;
import com.itmill.toolkit.terminal.gwt.client.ui.ISplitPanelHorizontal;
import com.itmill.toolkit.terminal.gwt.client.ui.ISplitPanelVertical;
import com.itmill.toolkit.terminal.gwt.client.ui.ITablePaging;
import com.itmill.toolkit.terminal.gwt.client.ui.ITabsheet;
import com.itmill.toolkit.terminal.gwt.client.ui.ITextArea;
import com.itmill.toolkit.terminal.gwt.client.ui.ITextField;
import com.itmill.toolkit.terminal.gwt.client.ui.ITextualDate;
import com.itmill.toolkit.terminal.gwt.client.ui.ITree;
import com.itmill.toolkit.terminal.gwt.client.ui.ITwinColSelect;
import com.itmill.toolkit.terminal.gwt.client.ui.IUnknownComponent;
import com.itmill.toolkit.terminal.gwt.client.ui.IUpload;
import com.itmill.toolkit.terminal.gwt.client.ui.IWindow;
import com.itmill.toolkit.terminal.gwt.client.ui.absolutegrid.ISizeableGridLayout;
import com.itmill.toolkit.terminal.gwt.client.ui.richtextarea.IRichTextArea;

public class DefaultWidgetSet implements WidgetSet {

    /**
     * This is the entry point method. It will start the first
     */
    public void onModuleLoad() {
        ApplicationConfiguration.initConfigurations(this);
        ApplicationConfiguration.startNextApplication(); // start first app
    }

    public Paintable createWidget(UIDL uidl) {

        final String className = resolveWidgetTypeName(uidl);
        if ("com.itmill.toolkit.terminal.gwt.client.ui.ICheckBox"
                .equals(className)) {
            return new ICheckBox();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IButton"
                .equals(className)) {
            return new IButton();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IWindow"
                .equals(className)) {
            return new IWindow();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IOldOrderedLayout"
                .equals(className)) {
            return new IOldOrderedLayout();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IOrderedLayout"
                .equals(className)) {
            return new IOrderedLayout();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ILabel"
                .equals(className)) {
            return new ILabel();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ILink"
                .equals(className)) {
            return new ILink();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.absolutegrid.ISizeableGridLayout"
                .equals(className)) {
            return new ISizeableGridLayout();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IGridLayout"
                .equals(className)) {
            return new IGridLayout();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ITree"
                .equals(className)) {
            return new ITree();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IOptionGroup"
                .equals(className)) {
            return new IOptionGroup();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ITwinColSelect"
                .equals(className)) {
            return new ITwinColSelect();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.INativeSelect"
                .equals(className)) {
            return new INativeSelect();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IListSelect"
                .equals(className)) {
            return new IListSelect();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IPanel"
                .equals(className)) {
            return new IPanel();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ITabsheet"
                .equals(className)) {
            return new ITabsheet();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IEmbedded"
                .equals(className)) {
            return new IEmbedded();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ICustomLayout"
                .equals(className)) {
            return new ICustomLayout();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ICustomComponent"
                .equals(className)) {
            return new ICustomComponent();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ITextArea"
                .equals(className)) {
            return new ITextArea();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IPasswordField"
                .equals(className)) {
            return new IPasswordField();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ITextField"
                .equals(className)) {
            return new ITextField();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ITablePaging"
                .equals(className)) {
            return new ITablePaging();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IScrollTable"
                .equals(className)) {
            return new IScrollTable();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IDateFieldCalendar"
                .equals(className)) {
            return new IDateFieldCalendar();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ITextualDate"
                .equals(className)) {
            return new ITextualDate();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IPopupCalendar"
                .equals(className)) {
            return new IPopupCalendar();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ISlider"
                .equals(className)) {
            return new ISlider();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IForm"
                .equals(className)) {
            return new IForm();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IFormLayout"
                .equals(className)) {
            return new IFormLayout();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IUpload"
                .equals(className)) {
            return new IUpload();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ISplitPanelHorizontal"
                .equals(className)) {
            return new ISplitPanelHorizontal();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ISplitPanelVertical"
                .equals(className)) {
            return new ISplitPanelVertical();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IFilterSelect"
                .equals(className)) {
            return new IFilterSelect();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IProgressIndicator"
                .equals(className)) {
            return new IProgressIndicator();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.richtextarea.IRichTextArea"
                .equals(className)) {
            return new IRichTextArea();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IAccordion"
                .equals(className)) {
            return new IAccordion();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IMenuBar"
                .equals(className)) {
            return new IMenuBar();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.IPopupView"
                .equals(className)) {
            return new IPopupView();
        } else if ("com.itmill.toolkit.terminal.gwt.client.ui.ICoordinateLayout"
                .equals(className)) {
            return new ICoordinateLayout();
        }

        return new IUnknownComponent();

        /*
         * TODO: Class based impl, use when GWT supports return
         * (Widget)GWT.create(resolveWidgetClass(uidl));
         */
    }

    protected String resolveWidgetTypeName(UIDL uidl) {

        final String tag = uidl.getTag();
        if ("button".equals(tag)) {
            if ("switch".equals(uidl.getStringAttribute("type"))) {
                return "com.itmill.toolkit.terminal.gwt.client.ui.ICheckBox";
            } else {
                return "com.itmill.toolkit.terminal.gwt.client.ui.IButton";
            }
        } else if ("window".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IWindow";
        } else if ("orderedlayout".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IOrderedLayout";
        } else if ("oldorderedlayout".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IOldOrderedLayout";
        } else if ("label".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.ILabel";
        } else if ("link".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.ILink";
        } else if ("gridlayout".equals(tag)) {
            if (uidl.hasAttribute("height")) {
                // height needs to be set to use sizeable grid layout, with
                // width only or no size at all it fails to render properly.
                return "com.itmill.toolkit.terminal.gwt.client.ui.absolutegrid.ISizeableGridLayout";
            } else {
                // Fall back to GWT FlexTable based implementation.
                return "com.itmill.toolkit.terminal.gwt.client.ui.IGridLayout";
            }
        } else if ("tree".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.ITree";
        } else if ("select".equals(tag)) {
            if (uidl.hasAttribute("type")) {
                final String type = uidl.getStringAttribute("type");
                if (type.equals("twincol")) {
                    return "com.itmill.toolkit.terminal.gwt.client.ui.ITwinColSelect";
                }
                if (type.equals("optiongroup")) {
                    return "com.itmill.toolkit.terminal.gwt.client.ui.IOptionGroup";
                }
                if (type.equals("native")) {
                    return "com.itmill.toolkit.terminal.gwt.client.ui.INativeSelect";
                }
                if (type.equals("list")) {
                    return "com.itmill.toolkit.terminal.gwt.client.ui.IListSelect";
                }
            } else {
                if (uidl.hasAttribute("selectmode")
                        && uidl.getStringAttribute("selectmode")
                                .equals("multi")) {
                    return "com.itmill.toolkit.terminal.gwt.client.ui.IListSelect";
                } else {
                    return "com.itmill.toolkit.terminal.gwt.client.ui.IFilterSelect";
                }
            }
        } else if ("panel".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IPanel";
        } else if ("tabsheet".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.ITabsheet";
        } else if ("accordion".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IAccordion";
        } else if ("embedded".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IEmbedded";
        } else if ("customlayout".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.ICustomLayout";
        } else if ("customcomponent".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.ICustomComponent";
        } else if ("textfield".equals(tag)) {
            if (uidl.getBooleanAttribute("richtext")) {
                return "com.itmill.toolkit.terminal.gwt.client.ui.richtextarea.IRichTextArea";
            } else if (uidl.hasAttribute("multiline")) {
                return "com.itmill.toolkit.terminal.gwt.client.ui.ITextArea";
            } else if (uidl.getBooleanAttribute("secret")) {
                return "com.itmill.toolkit.terminal.gwt.client.ui.IPasswordField";
            } else {
                return "com.itmill.toolkit.terminal.gwt.client.ui.ITextField";
            }
        } else if ("table".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IScrollTable";
        } else if ("pagingtable".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.ITablePaging";
        } else if ("datefield".equals(tag)) {
            if (uidl.hasAttribute("type")) {
                if ("inline".equals(uidl.getStringAttribute("type"))) {
                    return "com.itmill.toolkit.terminal.gwt.client.ui.IDateFieldCalendar";
                } else if ("popup".equals(uidl.getStringAttribute("type"))) {
                    return "com.itmill.toolkit.terminal.gwt.client.ui.IPopupCalendar";
                }
            }
            // popup calendar is the default
            return "com.itmill.toolkit.terminal.gwt.client.ui.IPopupCalendar";
        } else if ("slider".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.ISlider";
        } else if ("form".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IForm";
        } else if ("formlayout".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IFormLayout";
        } else if ("upload".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IUpload";
        } else if ("hsplitpanel".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.ISplitPanelHorizontal";
        } else if ("vsplitpanel".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.ISplitPanelVertical";
        } else if ("progressindicator".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IProgressIndicator";
        } else if ("menubar".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IMenuBar";
        } else if ("popupview".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.IPopupView";
        } else if ("coordinatelayout".equals(tag)) {
            return "com.itmill.toolkit.terminal.gwt.client.ui.ICoordinateLayout";
        }

        return "com.itmill.toolkit.terminal.gwt.client.ui.IUnknownComponent";

        /*
         * TODO: use class based impl when GWT supports it
         */
    }

    public boolean isCorrectImplementation(Widget currentWidget, UIDL uidl) {
        return currentWidget.getClass().getName().equals(
                resolveWidgetTypeName(uidl));
    }

}
