package com.projectreddog.machinemod.render.machines;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.projectreddog.machinemod.entity.EntityTractor;
import com.projectreddog.machinemod.item.ItemTractorAttachment;
import com.projectreddog.machinemod.item.ItemTractorAttachmentPlanter;
import com.projectreddog.machinemod.item.ItemTractorAttachmentPlow;
import com.projectreddog.machinemod.item.ItemTractorAttachmentSprayer;
import com.projectreddog.machinemod.item.ItemTractorAttachmentTrencher;
import com.projectreddog.machinemod.model.ModelTractor;
import com.projectreddog.machinemod.reference.Reference;

public class RenderTractor extends Render {

	protected ModelBase modelTractor;

	public RenderTractor(RenderManager renderManager) {

		super(renderManager);
		shadowSize = 1F;
		this.modelTractor = new ModelTractor();

	}

	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float pitch) {

		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);
		GL11.glRotatef(180.0F - yaw, 0.0F, 1.0F, 0.0F);
		float f2 = pitch;
		float f3 = pitch;

		if (f3 < 0.0F) {
			f3 = 0.0F;
		}

		if (f2 > 0.0F) {
			// GL11.glRotatef(MathHelper.sin(f2) * f2 * f3 / 10.0F *
			// (float)((EntityBulldozer) entity).getForwardDirection(), 1.0F,
			// 0.0F, 0.0F);
		}

		float f4 = 0.75F;
		GL11.glScalef(f4, f4, f4);
		GL11.glScalef(1.0F / f4, 1.0F / f4, 1.0F / f4);
		this.bindEntityTexture(entity);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		this.modelTractor.render(entity, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		if (((EntityTractor) entity).getStackInSlot(0) != null) {
			if (((EntityTractor) entity).getStackInSlot(0).getItem() instanceof ItemTractorAttachment) {
				if (((EntityTractor) entity).getStackInSlot(0).getItem() instanceof ItemTractorAttachmentPlow) {

					((ModelTractor) this.modelTractor).renderGroupObject("Plow_Cube");
				} else if (((EntityTractor) entity).getStackInSlot(0).getItem() instanceof ItemTractorAttachmentPlanter) {
					((ModelTractor) this.modelTractor).renderGroupObject("Planter_Cube.002");

				} else if (((EntityTractor) entity).getStackInSlot(0).getItem() instanceof ItemTractorAttachmentSprayer) {
					((ModelTractor) this.modelTractor).renderGroupObject("Sprayer_Cube.004");

				} else if (((EntityTractor) entity).getStackInSlot(0).getItem() instanceof ItemTractorAttachmentTrencher) {
					((ModelTractor) this.modelTractor).renderGroupObject("Trencher_Cube.003");

				}

			}
		}
		// ((ModelTractor) this.modelTractor).renderGroupObject("Plow_Cube");

		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {

		return new ResourceLocation("machinemod", Reference.MODEL_TRACTOR_TEXTURE_LOCATION);
	}

}
