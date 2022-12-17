package DummyCore.ASM;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;
import java.io.File;
import java.util.Map;

@MCVersion(value = "1.7.10")
@TransformerExclusions("DummyCore.ASM.*")
public class DCLoadingPlugin implements IFMLLoadingPlugin {

    public static File mcDir;

    @Override
    public String[] getASMTransformerClass() {
        return new String[] {DCASMManager.class.getName()};
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        mcDir = (File) data.get("mcLocation");
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
