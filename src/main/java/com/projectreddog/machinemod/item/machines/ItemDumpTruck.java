package com.projectreddog.machinemod.item.machines;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import com.projectreddog.machinemod.entity.EntityDumpTruck;
import com.projectreddog.machinemod.item.ItemMachineMod;
import com.projectreddog.machinemod.model.ModelBulldozer;
import com.projectreddog.machinemod.model.ModelDumpTruck;
import com.projectreddog.machinemod.model.ModelTransportable;

public class ItemDumpTruck extends ItemMachineMod {

	// public ModelTransportable mt ;

	public ItemDumpTruck() {
		super();
		this.setUnlocalizedName("dumptruck");
		this.maxStackSize = 1;

	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float xOff, float yOff, float zOff) {
		boolean result = false;

		if (!world.isRemote)// / only run on server
		{
			// LogHelper.info("Item used on dumptruck!");
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();

			EntityDumpTruck entityDumpTruck = new EntityDumpTruck(world);
			entityDumpTruck.setPosition(x + .5d, y + 1.0d, z + .5d);
			entityDumpTruck.prevPosX = x + .5d;
			entityDumpTruck.prevPosY = y + 1.0d;
			entityDumpTruck.prevPosZ = z + .5d;
			result = world.spawnEntityInWorld(entityDumpTruck);
			// LogHelper.info("Spawn entity resutl:" + result );
			if (result && !player.capabilities.isCreativeMode) {
				stack.stackSize--;
			}
		}
		return result;
	}
	// @Override
	// public ModelTransportable getModel() {
	// if (mt == null){
	// mt = new ModelDumpTruck();
	// }
	// return mt;
	// }
}
