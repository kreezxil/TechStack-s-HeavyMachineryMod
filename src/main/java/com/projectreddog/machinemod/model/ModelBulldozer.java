// Date: 12/24/2014 5:11:17 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.projectreddog.machinemod.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.projectreddog.machinemod.entity.EntityMachineModRideable;
import com.projectreddog.machinemod.model.advanced.AdvancedModelLoader;
import com.projectreddog.machinemod.model.advanced.IModelCustom;
import com.projectreddog.machinemod.reference.Reference;

public class ModelBulldozer extends ModelTransportable {
	// fields
	private IModelCustom myModel;

	public ModelBulldozer() {

		myModel = AdvancedModelLoader.loadModel(new ResourceLocation(Reference.MOD_ID.toLowerCase(), "models/bulldozer.obj"));
		// casinoTexture = new ResourceLocation("modid",
		// "textures/casinoTexture.png");

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		// myModel.renderAll();

		this.renderGroupObject("Body_Cube.001");

		if (entity != null) {
			GL11.glRotatef((((EntityMachineModRideable) entity).Attribute1), 1, 0, 0);

		}
		this.renderGroupObject("Bucket_Cube.002");

	}

	public void renderGroupObject(String groupName) {
		myModel.renderPart(groupName);

	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}

	public ResourceLocation getTexture() {

		return new ResourceLocation("machinemod", Reference.MODEL_BULLDOZER_TEXTURE_LOCATION);
	}

}
