package top.srcres.mods.retroforgelin.preloader;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLCallHook;
import top.srcres.mods.retroforgelin.Tags;

public class ForgelinSetup implements IFMLCallHook {

    @Override
    public void injectData(Map<String, Object> data) {
        ClassLoader cl = (ClassLoader) data.get("classLoader");
        try {
            cl.loadClass("top.srcres.mods.retroforgelin.KotlinAdapter");
        } catch (ClassNotFoundException ex) {
            // This should NOT be happening.
            throw new RuntimeException(Tags.MODNAME + "'s language adapter is not found, which mustn't happen.", ex);
        }
    }

    @Override
    public Void call() throws Exception {
        return null;
    }
}
