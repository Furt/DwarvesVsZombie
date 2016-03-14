package me.furt.dvz.handler;

import java.util.concurrent.Callable;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import me.furt.dvz.capability.IManaCapability;
import me.furt.dvz.capability.ManaCapability;

public class ManaHandler implements ICapabilityProvider, INBTSerializable {

	@CapabilityInject(IManaCapability.class)
    private static final Capability<IManaCapability> MANA_CAP = null;
	
	@Override
	public NBTBase serializeNBT() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
