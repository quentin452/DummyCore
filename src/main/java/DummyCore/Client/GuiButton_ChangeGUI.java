package DummyCore.Client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;

public class GuiButton_ChangeGUI extends GuiButton{

	public GuiButton_ChangeGUI(int stateName, int id, int p_i1021_3_,int p_i1021_4_, int p_i1021_5_, String p_i1021_6_) {
		super(stateName, id, p_i1021_3_, p_i1021_4_, p_i1021_5_, p_i1021_6_);
	}
	
	@Override
    public void func_146113_a(SoundHandler soundHandlerIn)
    {
		soundHandlerIn.playSound(PositionedSoundRecord.func_147674_a(new ResourceLocation("gui.button.press"), 1.0F));
		Minecraft.getMinecraft().displayGuiScreen(new GuiMenuList(Minecraft.getMinecraft().currentScreen));
    }

}
