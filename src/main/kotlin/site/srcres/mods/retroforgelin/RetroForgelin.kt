package site.srcres.mods.retroforgelin

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@Mod(modid = Tags.MODID, name = Tags.MODNAME, version = Tags.VERSION,
    acceptableRemoteVersions = "*", acceptedMinecraftVersions = "*",
    modLanguageAdapter = "site.srcres.mods.retroforgelin.KotlinAdapter")
object RetroForgelin {
    lateinit var logger: Logger

    @Mod.EventHandler
    fun onPreInit(event: FMLPreInitializationEvent) {
        logger = LogManager.getLogger(Tags.MODNAME)
        logger.debug("RetroForgelin pre-initialized.")
    }
}
