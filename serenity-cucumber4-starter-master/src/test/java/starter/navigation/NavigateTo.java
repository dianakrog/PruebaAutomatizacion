package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    HomePageIni HomePageIni;

    @Step("Open the DuckDuckGo home page")
    public void HomePageIni() {
    	HomePageIni.open();
    }
}
