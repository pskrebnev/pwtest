package io.github.tahanima.ui.component;

import com.microsoft.playwright.Page;


public final class SideNavMenu extends BaseComponent {

    public SideNavMenu(final Page page) {
        super(page);
    }

    public void clickOnLogout() {
        page.click("#logout_sidebar_link");
    }
}
