package me.furt.dvz.handler;

import me.furt.dvz.capability.IManaCapability;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class ManaStorageHandler implements IStorage<IManaCapability> {

	@Override
	public NBTBase writeNBT(Capability<IManaCapability> capability,
			IManaCapability instance, EnumFacing side) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readNBT(Capability<IManaCapability> capability,
			IManaCapability instance, EnumFacing side, NBTBase nbt) {
		// TODO Auto-generated method stub
		
	}

}
