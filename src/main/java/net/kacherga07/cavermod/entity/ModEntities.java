package net.kacherga07.cavermod.entity;

import net.kacherga07.cavermod.CaverMod;
import net.kacherga07.cavermod.entity.custom.CaverManEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
        DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CaverMod.MOD_ID);

    public static final RegistryObject<EntityType<CaverManEntity>> CAVERMAN =
            ENTITY_TYPES.register("caverman", () -> EntityType.Builder.of(CaverManEntity::new, MobCategory.CREATURE)
                    .sized(1f, 2f).build("caverman"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
