package net.kacherga07.cavermod.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class CavermanModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart caverman;
	private final ModelPart body2;
	private final ModelPart hear;
	private final ModelPart b1;
	private final ModelPart b2;
	private final ModelPart b3;
	private final ModelPart b4;
	private final ModelPart b5;
	private final ModelPart b6;
	private final ModelPart b7;
	private final ModelPart b8;
	private final ModelPart b9;
	private final ModelPart b10;
	private final ModelPart b11;
	private final ModelPart b12;
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart armr;
	private final ModelPart arml;
	private final ModelPart legr;
	private final ModelPart legl;

	public CavermanModel(ModelPart root) {
		this.caverman = root.getChild("caverman");
		this.body2 = this.caverman.getChild("body2");
		this.hear = this.body2.getChild("hear");
		this.b1 = this.hear.getChild("b1");
		this.b2 = this.hear.getChild("b2");
		this.b3 = this.hear.getChild("b3");
		this.b4 = this.hear.getChild("b4");
		this.b5 = this.hear.getChild("b5");
		this.b6 = this.hear.getChild("b6");
		this.b7 = this.hear.getChild("b7");
		this.b8 = this.hear.getChild("b8");
		this.b9 = this.hear.getChild("b9");
		this.b10 = this.hear.getChild("b10");
		this.b11 = this.hear.getChild("b11");
		this.b12 = this.hear.getChild("b12");
		this.head = this.body2.getChild("head");
		this.body = this.body2.getChild("body");
		this.armr = this.body2.getChild("armr");
		this.arml = this.body2.getChild("arml");
		this.legr = this.body2.getChild("legr");
		this.legl = this.body2.getChild("legl");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition caverman = partdefinition.addOrReplaceChild("caverman", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition body2 = caverman.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hear = body2.addOrReplaceChild("hear", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition b1 = hear.addOrReplaceChild("b1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = b1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 47).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = b1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 57).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = b1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 59).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = b1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 40).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition b2 = hear.addOrReplaceChild("b2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -1.0F));

		PartDefinition cube_r5 = b2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 47).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = b2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(53, 51).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = b2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(34, 47).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -21.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = b2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 32).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition b3 = hear.addOrReplaceChild("b3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -2.0F));

		PartDefinition cube_r9 = b3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 53).mirror().addBox(-1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -26.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = b3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 53).addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -26.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = b3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(45, 51).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -25.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r12 = b3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(45, 51).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -25.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r13 = b3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(32, 60).mirror().addBox(-4.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -24.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r14 = b3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(50, 61).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 60).addBox(3.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = b3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(38, 51).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r16 = b3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(39, 49).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -21.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r17 = b3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(35, 44).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition b4 = hear.addOrReplaceChild("b4", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r18 = b4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(40, 37).mirror().addBox(0.0F, -4.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(33, 8).mirror().addBox(0.0F, -4.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -24.0F, -4.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r19 = b4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(36, 62).mirror().addBox(4.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -26.0F, -1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r20 = b4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(48, 35).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(33, 8).addBox(-1.0F, -4.0F, -5.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(40, 37).addBox(-1.0F, -4.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 37).addBox(-1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -24.0F, 1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r21 = b4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(42, 13).addBox(-1.0F, -4.0F, 1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 39).addBox(-1.0F, -4.0F, 3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -28.0F, -5.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition b5 = hear.addOrReplaceChild("b5", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 9.0F));

		PartDefinition cube_r22 = b5.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(50, 32).addBox(-8.0F, 1.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 34).addBox(-9.0F, -4.0F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 50).addBox(-10.0F, -3.0F, -1.0F, 10.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -24.0F, -4.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition b6 = hear.addOrReplaceChild("b6", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r23 = b6.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(32, 40).mirror().addBox(-4.0F, -2.0F, 0.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(32, 40).mirror().addBox(-4.0F, -2.0F, 0.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -22.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r24 = b6.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(50, 44).mirror().addBox(-3.0F, -1.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(50, 42).mirror().addBox(-3.0F, -1.0F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 57).mirror().addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -32.0F, 1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r25 = b6.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(38, 54).mirror().addBox(-4.0F, -2.0F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -30.0F, -5.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r26 = b6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(56, 35).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(21, 33).mirror().addBox(0.0F, -4.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, -24.0F, -4.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r27 = b6.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(36, 62).addBox(-5.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -26.0F, -1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r28 = b6.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(48, 35).mirror().addBox(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(36, 37).mirror().addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -24.0F, 1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r29 = b6.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(42, 13).mirror().addBox(0.0F, -4.0F, 1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(18, 39).mirror().addBox(0.0F, -4.0F, 3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -28.0F, -5.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r30 = b6.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(21, 33).addBox(-1.0F, -4.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(56, 35).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -24.0F, -4.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition b7 = hear.addOrReplaceChild("b7", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r31 = b7.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(4.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(32, 56).mirror().addBox(2.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -29.0F, -5.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r32 = b7.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(37, 59).mirror().addBox(2.0F, -2.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0F, -29.0F, -5.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r33 = b7.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(37, 59).addBox(-7.0F, -2.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -29.0F, -5.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r34 = b7.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(40, 62).addBox(-5.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 56).addBox(-4.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -29.0F, -5.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r35 = b7.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(38, 54).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.0F, -5.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition b8 = hear.addOrReplaceChild("b8", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r36 = b8.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(50, 44).addBox(-3.0F, -1.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 42).addBox(-3.0F, -1.0F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -32.0F, 1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition b9 = hear.addOrReplaceChild("b9", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r37 = b9.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(58, 47).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -18.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r38 = b9.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(54, 57).mirror().addBox(-2.0F, -2.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -19.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r39 = b9.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(50, 59).mirror().addBox(-3.0F, -2.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -20.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r40 = b9.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(32, 40).mirror().addBox(-4.0F, -2.0F, 0.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -22.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition b10 = hear.addOrReplaceChild("b10", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -1.0F));

		PartDefinition cube_r41 = b10.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(48, 47).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -19.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r42 = b10.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(53, 51).mirror().addBox(-2.0F, -2.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -20.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r43 = b10.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(34, 47).mirror().addBox(-3.0F, -2.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -21.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r44 = b10.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(32, 32).mirror().addBox(-4.0F, -2.0F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -22.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition b11 = hear.addOrReplaceChild("b11", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -2.0F));

		PartDefinition cube_r45 = b11.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-3.0F, -2.0F, 0.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -24.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r46 = b11.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(38, 51).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -20.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r47 = b11.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(39, 49).mirror().addBox(-2.0F, -2.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -21.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r48 = b11.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(35, 44).mirror().addBox(-3.0F, -2.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -22.0F, -3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition b12 = hear.addOrReplaceChild("b12", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 9.0F));

		PartDefinition cube_r49 = b12.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(50, 32).mirror().addBox(2.0F, 1.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(32, 34).mirror().addBox(1.0F, -4.0F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 50).mirror().addBox(0.0F, -3.0F, -1.0F, 10.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -24.0F, -4.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition head = body2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition armr = body2.addOrReplaceChild("armr", CubeListBuilder.create(), PartPose.offset(-4.0F, -4.0F, 0.0F));

		PartDefinition cube_r52 = armr.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-3.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition arml = body2.addOrReplaceChild("arml", CubeListBuilder.create(), PartPose.offset(4.0F, -4.0F, 0.0F));

		PartDefinition cube_r53 = arml.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition legr = body2.addOrReplaceChild("legr", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r54 = legr.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition legl = body2.addOrReplaceChild("legl", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition _r1 = legl.addOrReplaceChild("_r1", CubeListBuilder.create().texOffs(24, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		caverman.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return caverman;
	}
}