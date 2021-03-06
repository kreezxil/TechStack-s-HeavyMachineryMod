package com.projectreddog.machinemod.entity;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import com.projectreddog.machinemod.init.ModBlocks;
import com.projectreddog.machinemod.init.ModItems;

public class EntityPaver extends EntityMachineModRideable {

	private static final AxisAlignedBB boundingBox = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);

	public EntityPaver(World world) {
		super(world);

		setSize(5.5f, 4f);
		inventory = new ItemStack[9];

		this.mountedOffsetY = 0.6D;
		this.mountedOffsetX = 0.4D;
		this.mountedOffsetZ = 0.4D;
		this.maxAngle = 15;
		this.minAngle = -90;
		this.droppedItem = ModItems.paver;
		// this.shouldSendClientInvetoryUpdates = true;

	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (!worldObj.isRemote) {
			if (this.isPlayerPushingSprintButton) {
				// player trying
				for (int j = 0; j < this.getSizeInventory(); j++) {

					if (this.getStackInSlot(j) != null && this.getStackInSlot(j).getItem() == ModItems.rawasphalt && this.getStackInSlot(j).stackSize > 1) {
						int angle;
						for (int i = -2; i < 3; i++) {
							if (i == 0) {
								angle = 0;
							} else {
								angle = 90;
							}
							BlockPos bp;
							if (this.getStackInSlot(j) != null && this.getStackInSlot(j).getItem() == ModItems.rawasphalt && this.getStackInSlot(j).stackSize > 1) {
								bp = new BlockPos(posX + calcTwoOffsetX(3.5, angle, i), posY - 1, posZ + calcTwoOffsetZ(3.5, angle, i));
								if (worldObj.isAirBlock(bp)) {
									worldObj.setBlockState(bp, ModBlocks.machineasphalt.getDefaultState());

									this.decrStackSize(j, 1);
								}
							}
						}
						return;

					}
				}
			}
		}
	}

	public AxisAlignedBB getBoundingBox() {
		return boundingBox;
	}

	private void collidedEntitiesInList(List par1List) {
		for (int i = 0; i < par1List.size(); ++i) {
			Entity entity = (Entity) par1List.get(i);
			if (entity != null) {
				if (entity instanceof EntityItem) {
					ItemStack is = ((EntityItem) entity).getEntityItem().copy();
					is.setItemDamage(((EntityItem) entity).getEntityItem().getItemDamage());
					if (!entity.isDead) {
						if (is.stackSize > 0) {
							ItemStack is1 = addToinventory(is);

							if (is1 != null && is1.stackSize != 0) {
								((EntityItem) entity).setEntityItemStack(is1);
							} else {
								entity.setDead();
							}
						}
					}
				}
			}
		}
	}

}
