package com.projectreddog.machinemod.item;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

import com.projectreddog.machinemod.init.ModBlocks;
import com.projectreddog.machinemod.reference.Reference;

public class ItemCornSeed extends ItemFood implements IPlantable {

	public ItemCornSeed() {

		// heal sat wolf fav
		super(2, 0.3F, false);
		this.setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ":" + "cornseed");
		this.maxStackSize = 64;

	}

	/**
	 * Called when a Block is right-clicked with this Item
	 * 
	 * @param pos
	 *            The block being right-clicked
	 * @param side
	 *            The side being right-clicked
	 */
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (side != EnumFacing.UP) {
			return false;
		} else if (!playerIn.func_175151_a(pos.offset(side), side, stack)) {
			return false;
		} else if (worldIn.getBlockState(pos).getBlock().canSustainPlant(worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.offsetUp())) {
			worldIn.setBlockState(pos.offsetUp(), ModBlocks.corn.getDefaultState());
			--stack.stackSize;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return net.minecraftforge.common.EnumPlantType.Crop;
	}

	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return ModBlocks.corn.getDefaultState();
	}
}
