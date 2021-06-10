package bp.core3.router;

import com.vaadin.flow.component.dependency.*;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.page.*;
import com.vaadin.flow.router.*;
import com.vaadin.flow.theme.*;
import com.vaadin.flow.theme.lumo.*;

@Theme(value = Lumo.class)
@Route("")
@Push
//@CssImport(value = "./css/leaflet-map-styles.css", themeFor = "leaflet-map")
public class MainRouterLayout
		extends
		Div {

	public MainRouterLayout() {
		setSizeFull();

		add(new Image("img/map_layers_icon.png", ""));
		add(new Image("img/vaadin.png", ""));
	}
}
