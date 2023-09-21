package de.vepexlegit.escfix;

import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.SettingsElement;
import java.util.List;

public class ESCFixAddon extends LabyModAddon {
    @Override
    public void onEnable() {
        this.getApi().registerForgeListener(this);
        this.getApi().registerModule(new ESCFixModule());
    }

    @Override
    public void loadConfig() {

    }

    @Override
    protected void fillSettings(final List<SettingsElement> list) {

    }
}
