package ga.matthewtgm.multichunk;

import club.sk1er.mods.core.ModCoreInstaller;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Constants.NAME, version = Constants.VER, modid = Constants.ID)
public class MultiChunk {

    @Mod.Instance(Constants.ID)
    private static MultiChunk INSTANCE;

    public static MultiChunk getInstance() {
        if (INSTANCE == null)
            INSTANCE = new MultiChunk();
        return INSTANCE;
    }

    @Mod.EventHandler
    protected void preInit(FMLPreInitializationEvent event) {
        ModCoreInstaller.initializeModCore(Minecraft.getMinecraft().mcDataDir);
    }

}