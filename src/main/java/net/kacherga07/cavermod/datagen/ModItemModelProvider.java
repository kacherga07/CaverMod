package net.kacherga07.cavermod.datagen;

import net.kacherga07.cavermod.CaverMod;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CaverMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
