
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreadventure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.moreadventure.world.biome.BlueWorldBiome;
import net.mcreator.moreadventure.MoreAdventureMod;

public class MoreAdventureModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, MoreAdventureMod.MODID);
	public static final RegistryObject<Biome> BLUE_WORLD = REGISTRY.register("blue_world", BlueWorldBiome::createBiome);
}
