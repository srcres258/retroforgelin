package top.srcres.mods.retroforgelin

import cpw.mods.fml.common.FMLModContainer
import cpw.mods.fml.common.ILanguageAdapter
import cpw.mods.fml.common.ModContainer
import cpw.mods.fml.relauncher.Side
import org.apache.logging.log4j.LogManager
import java.lang.reflect.Field
import java.lang.reflect.Method

class KotlinAdapter : ILanguageAdapter {
    private val logger = LogManager.getLogger("KotlinAdapter")

    override fun getNewInstance(
        container: FMLModContainer,
        objectClass: Class<*>,
        classLoader: ClassLoader,
        factoryMarkedAnnotation: Method?
    ) = run {
        logger.debug("Constructing instance for mod class: {}", objectClass.simpleName)
        objectClass.kotlin.objectInstance ?: objectClass.newInstance()
    }

    override fun supportsStatics() = false

    override fun setProxy(target: Field, proxyTarget: Class<*>, proxy: Any) {
        logger.debug("Setting proxy: {}.{} -> {}", target.declaringClass.simpleName, target.name, proxy)
        target.set(proxyTarget.kotlin.objectInstance, proxy)
    }

    override fun setInternalProxies(mod: ModContainer?, side: Side?, loader: ClassLoader?) {
        // Nothing to do; FML has got this covered for Kotlin
    }
}
