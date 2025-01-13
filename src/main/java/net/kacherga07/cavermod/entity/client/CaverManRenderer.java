package net.kacherga07.cavermod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.kacherga07.cavermod.CaverMod;
import net.kacherga07.cavermod.entity.custom.CaverManEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class CaverManRenderer extends MobRenderer<CaverManEntity, CavermanModel<CaverManEntity>> {
    public CaverManRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new CavermanModel<>(pContext.bakeLayer(ModModelLayers.CAVERMAN_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(CaverManEntity caverManEntity) {
        return new ResourceLocation(CaverMod.MOD_ID, "textures/entity/caverman.png");
    }

    @Override
    public void render(CaverManEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
