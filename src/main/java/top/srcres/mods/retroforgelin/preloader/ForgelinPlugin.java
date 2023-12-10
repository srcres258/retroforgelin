package top.srcres.mods.retroforgelin.preloader;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

public class ForgelinPlugin implements IFMLLoadingPlugin {

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return "top.srcres.mods.retroforgelin.preloader.ForgelinSetup";
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
