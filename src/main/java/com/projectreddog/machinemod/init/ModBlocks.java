package com.projectreddog.machinemod.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.projectreddog.machinemod.block.BlockBioFuel;
import com.projectreddog.machinemod.block.BlockMachineAsphalt;
import com.projectreddog.machinemod.block.BlockMachineAssemblyTable;
import com.projectreddog.machinemod.block.BlockMachineDrilledAndesite;
import com.projectreddog.machinemod.block.BlockMachineDrilledDiorite;
import com.projectreddog.machinemod.block.BlockMachineDrilledGranite;
import com.projectreddog.machinemod.block.BlockMachineDrilledStone;
import com.projectreddog.machinemod.block.BlockMachineExplosivePackedDrilledStone;
import com.projectreddog.machinemod.block.BlockMachineMod;
import com.projectreddog.machinemod.block.BlockMachineModBlastedStone;
import com.projectreddog.machinemod.block.BlockMachineModBlastedStone2;
import com.projectreddog.machinemod.block.BlockMachineModCentrifuge;
import com.projectreddog.machinemod.block.BlockMachineModConveyor;
import com.projectreddog.machinemod.block.BlockMachineModCorn;
import com.projectreddog.machinemod.block.BlockMachineModDistiller;
import com.projectreddog.machinemod.block.BlockMachineModFermenter;
import com.projectreddog.machinemod.block.BlockMachineModFuelPump;
import com.projectreddog.machinemod.block.BlockMachineModPrimaryCrusher;
import com.projectreddog.machinemod.block.BlockMachineModScreen;
import com.projectreddog.machinemod.item.ItemBlockBlastedStone;
import com.projectreddog.machinemod.reference.Reference;
import com.projectreddog.machinemod.tileentities.TileEntityCentrifuge;
import com.projectreddog.machinemod.tileentities.TileEntityConveyor;
import com.projectreddog.machinemod.tileentities.TileEntityDistiller;
import com.projectreddog.machinemod.tileentities.TileEntityFermenter;
import com.projectreddog.machinemod.tileentities.TileEntityFuelPump;
import com.projectreddog.machinemod.tileentities.TileEntityPrimaryCrusher;
import com.projectreddog.machinemod.tileentities.TileEntityScreen;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final BlockMachineMod machineassemblytable = new BlockMachineAssemblyTable();
	public static final BlockMachineMod machineasphalt = new BlockMachineAsphalt();

	public static final BlockMachineMod machinedrilledstone = new BlockMachineDrilledStone();
	public static final BlockMachineMod machinedrilledandesite = new BlockMachineDrilledAndesite();
	public static final BlockMachineMod machinedrilleddiorite = new BlockMachineDrilledDiorite();
	public static final BlockMachineMod machinedrilledgranite = new BlockMachineDrilledGranite();

	public static final BlockMachineMod machineexplosivepackeddrilledstone = new BlockMachineExplosivePackedDrilledStone();

	public static final BlockMachineMod machineblastedstone = new BlockMachineModBlastedStone();
	public static final BlockMachineMod machineblastedstone2 = new BlockMachineModBlastedStone2();
	public static final Block corn = new BlockMachineModCorn();
	public static final Block machinedistiller = new BlockMachineModDistiller();
	public static final Block machinefermenter = new BlockMachineModFermenter();
	public static final Block machinefuelpump = new BlockMachineModFuelPump();

	public static final Block machineprimarycrhuser = new BlockMachineModPrimaryCrusher();
	public static final Block machinecentrifuge = new BlockMachineModCentrifuge();

	public static final Block machineconveyor = new BlockMachineModConveyor();

	public static Fluid fluidBioFuel = new Fluid("BioFuel");
	public static final Block machinescreen = new BlockMachineModScreen();

	public static BlockBioFuel biofuel;

	public static void init() {
		GameRegistry.registerBlock(machineassemblytable, Reference.MODBLOCK_MACHINE_ASSEMBLY_TABLE);
		GameRegistry.registerBlock(machineasphalt, Reference.MODBLOCK_MACHINE_ASPHALT);

		GameRegistry.registerBlock(corn, Reference.MODBLOCK_MACHINE_CORN);

		GameRegistry.registerBlock(machinedrilledstone, Reference.MODBLOCK_MACHINE_DRILLED_STONE);
		GameRegistry.registerBlock(machinedrilledandesite, Reference.MODBLOCK_MACHINE_DRILLED_ANDESITE);

		GameRegistry.registerBlock(machinedrilleddiorite, Reference.MODBLOCK_MACHINE_DRILLED_DIORITE);

		GameRegistry.registerBlock(machinedrilledgranite, Reference.MODBLOCK_MACHINE_DRILLED_GRANITE);

		GameRegistry.registerBlock(machineexplosivepackeddrilledstone, Reference.MODBLOCK_MACHINE_EXPLOSIVE_PACKED_DRILLED_STONE);
		GameRegistry.registerBlock(machineblastedstone, ItemBlockBlastedStone.class, Reference.MODBLOCK_MACHINE_BLASTED_STONE);
		GameRegistry.registerBlock(machineblastedstone2, Reference.MODBLOCK_MACHINE_BLASTED_STONE2);

		GameRegistry.registerBlock(machineprimarycrhuser, Reference.MODBLOCK_MACHINE_PRIMARY_CRUSHER);
		GameRegistry.registerBlock(machinecentrifuge, Reference.MODBLOCK_MACHINE_CENTRIFUGE);

		GameRegistry.registerBlock(machineconveyor, Reference.MODBLOCK_MACHINE_CONVEYOR);
		GameRegistry.registerBlock(machinescreen, Reference.MODBLOCK_MACHINE_SCREEN);

		GameRegistry.registerBlock(machinefuelpump, Reference.MODBLOCK_MACHINE_FUEL_PUMP);
		GameRegistry.registerBlock(machinedistiller, Reference.MODBLOCK_MACHINE_DISTILLER);
		GameRegistry.registerBlock(machinefermenter, Reference.MODBLOCK_MACHINE_FERMENTER);

		// next section for tile entities regsistration.
		GameRegistry.registerTileEntity(TileEntityPrimaryCrusher.class, Reference.MODBLOCK_MACHINE_PRIMARY_CRUSHER);
		GameRegistry.registerTileEntity(TileEntityCentrifuge.class, Reference.MODBLOCK_MACHINE_CENTRIFUGE);

		GameRegistry.registerTileEntity(TileEntityConveyor.class, Reference.MODBLOCK_MACHINE_CONVEYOR);
		GameRegistry.registerTileEntity(TileEntityScreen.class, Reference.MODBLOCK_MACHINE_SCREEN);

		GameRegistry.registerTileEntity(TileEntityFuelPump.class, Reference.MODBLOCK_MACHINE_FUEL_PUMP);
		GameRegistry.registerTileEntity(TileEntityDistiller.class, Reference.MODBLOCK_MACHINE_DISTILLER);
		GameRegistry.registerTileEntity(TileEntityFermenter.class, Reference.MODBLOCK_MACHINE_FERMENTER);
		// /Register Fluids
		// fluidBioFuel.setDensity(10);
		// FluidRegistry.registerFluid(fluidBioFuel);
		// biofuel = new BlockBioFuel(fluidBioFuel, Material.water) ;
		//
		// GameRegistry.registerBlock(biofuel,
		// Reference.MODBLOCK_MACHINE_FLUID_BIOFUEL);
		// fluidBioFuel.setUnlocalizedName(biofuel.getUnlocalizedName());
	}

	public static void initBlockRender() {
		// TODO Auto-generated method stub
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machineassemblytable), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_ASSEMBLY_TABLE, "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machineasphalt), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_ASPHALT, "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machinedrilledstone), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_DRILLED_STONE, "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machinedrilledandesite), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_DRILLED_ANDESITE, "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machinedrilleddiorite), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_DRILLED_DIORITE, "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machinedrilledgranite), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_DRILLED_GRANITE, "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machineexplosivepackeddrilledstone), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_EXPLOSIVE_PACKED_DRILLED_STONE, "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machineblastedstone), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_BLASTED_STONE, "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(corn), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_CORN, "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machineprimarycrhuser), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_PRIMARY_CRUSHER, "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machinecentrifuge), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_CENTRIFUGE, "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machineconveyor), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_CONVEYOR, "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machinescreen), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_SCREEN, "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machinefuelpump), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_FUEL_PUMP, "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machinedistiller), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_DISTILLER, "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(machinefermenter), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_FERMENTER, "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(biofuel), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_FLUID_BIOFUEL, "inventory"));

		Item itemBlockBlastedStone = GameRegistry.findItem(Reference.MOD_ID, Reference.MODBLOCK_MACHINE_BLASTED_STONE);

		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_BLASTED_STONE + "_variants_" + "stone", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockBlastedStone, BlockMachineModBlastedStone.EnumVanillaOres.STONE.getMetadata(), itemModelResourceLocation);
		itemModelResourceLocation = new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_BLASTED_STONE + "_variants_" + "granite", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockBlastedStone, BlockMachineModBlastedStone.EnumVanillaOres.GRANITE.getMetadata(), itemModelResourceLocation);
		itemModelResourceLocation = new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_BLASTED_STONE + "_variants_" + "diorite", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockBlastedStone, BlockMachineModBlastedStone.EnumVanillaOres.DIORITE.getMetadata(), itemModelResourceLocation);
		itemModelResourceLocation = new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_BLASTED_STONE + "_variants_" + "andesite", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockBlastedStone, BlockMachineModBlastedStone.EnumVanillaOres.ANDESITE.getMetadata(), itemModelResourceLocation);
		itemModelResourceLocation = new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_BLASTED_STONE + "_variants_" + "gold", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockBlastedStone, BlockMachineModBlastedStone.EnumVanillaOres.GOLD.getMetadata(), itemModelResourceLocation);
		itemModelResourceLocation = new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_BLASTED_STONE + "_variants_" + "iron", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockBlastedStone, BlockMachineModBlastedStone.EnumVanillaOres.IRON.getMetadata(), itemModelResourceLocation);
		itemModelResourceLocation = new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_BLASTED_STONE + "_variants_" + "coal", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockBlastedStone, BlockMachineModBlastedStone.EnumVanillaOres.COAL.getMetadata(), itemModelResourceLocation);
		itemModelResourceLocation = new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_BLASTED_STONE + "_variants_" + "lapis", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockBlastedStone, BlockMachineModBlastedStone.EnumVanillaOres.LAPIS.getMetadata(), itemModelResourceLocation);
		itemModelResourceLocation = new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_BLASTED_STONE + "_variants_" + "diamond", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockBlastedStone, BlockMachineModBlastedStone.EnumVanillaOres.DIAMOND.getMetadata(), itemModelResourceLocation);
		itemModelResourceLocation = new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_BLASTED_STONE + "_variants_" + "redstone", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockBlastedStone, BlockMachineModBlastedStone.EnumVanillaOres.REDSTONE.getMetadata(), itemModelResourceLocation);
		itemModelResourceLocation = new ModelResourceLocation(Reference.MOD_ID + ":" + Reference.MODBLOCK_MACHINE_BLASTED_STONE + "_variants_" + "emerald", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockBlastedStone, BlockMachineModBlastedStone.EnumVanillaOres.EMERALD.getMetadata(), itemModelResourceLocation);

	}
}
