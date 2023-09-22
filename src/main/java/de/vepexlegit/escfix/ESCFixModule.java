package de.vepexlegit.escfix;

import net.labymod.gui.ModGuiScreenServerList;
import net.labymod.ingamegui.Module;
import net.labymod.settings.elements.ControlElement;
import net.minecraft.client.gui.*;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

public class ESCFixModule extends Module {
    @Override
    public ControlElement.IconData getIconData() {
        return null;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public void loadSettings() {

    }

    @Override
    public String getSettingName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int getSortingId() {
        return 0;
    }

    @SubscribeEvent
    public void onGuiOpen(GuiScreenEvent.KeyboardInputEvent.Pre event) {
        if (event.getGui() instanceof GuiScreenServerList && Keyboard.getEventKeyState() && Keyboard.getEventKey() == Keyboard.KEY_ESCAPE) {
            mc.displayGuiScreen(new GuiMultiplayer(null));
        }
        if (event.getGui() instanceof GuiScreenAddServer && Keyboard.getEventKeyState() && Keyboard.getEventKey() == Keyboard.KEY_ESCAPE) {
            mc.displayGuiScreen(new GuiMultiplayer(null));
        }
        if (event.getGui() instanceof GuiCreateWorld && Keyboard.getEventKeyState() && Keyboard.getEventKey() == Keyboard.KEY_ESCAPE) {
            mc.displayGuiScreen(new GuiWorldSelection(null));
        }
        if (event.getGui() instanceof GuiScreenRealmsProxy && Keyboard.getEventKeyState() && Keyboard.getEventKey() == Keyboard.KEY_ESCAPE) {
            mc.displayGuiScreen(new GuiMainMenu());
        }
        if (event.getGui() instanceof ModGuiScreenServerList && Keyboard.getEventKeyState() && Keyboard.getEventKey() == Keyboard.KEY_ESCAPE) {
            mc.displayGuiScreen(new GuiMultiplayer(null));
        }
    }
}
