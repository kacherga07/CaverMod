package net.kacherga07.cavermod.event;
import net.kacherga07.cavermod.CaverMod;
import net.kacherga07.cavermod.entity.ModEntities;
import net.kacherga07.cavermod.entity.custom.CaverManEntity;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CaverMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.CAVERMAN.get(), CaverManEntity.createAttribute().build());
    }
}
