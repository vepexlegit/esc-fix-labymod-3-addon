package de.vepexlegit.escfix;

import net.labymod.api.LabyModAddon;
import net.labymod.api.events.MessageSendEvent;
import net.labymod.main.LabyMod;
import net.labymod.settings.elements.SettingsElement;
import net.labymod.utils.Consumer;
import net.labymod.utils.ServerData;
import java.util.List;

public class ESCFixAddon extends LabyModAddon {
    @Override
    public void onEnable() {
        this.getApi().registerForgeListener(this);

        this.getApi().getEventManager().registerOnJoin(new Consumer<ServerData>() {
            @Override
            public void accept(ServerData serverData) {
                if (LabyMod.getInstance().getPlayerId() != null) {
                    LabyMod.getInstance().displayMessageInChat("§6" + serverData.getIp());
                }
            }
        });

        this.getApi().getEventManager().register(new MessageSendEvent() {
            @Override
            public boolean onSend(final String message) {
                return message.startsWith("-");
            }
        });
        this.getApi().registerModule(new ESCFixModule());
    }

    @Override
    public void loadConfig() {

    }

    @Override
    protected void fillSettings(final List<SettingsElement> list) {

    }
}
