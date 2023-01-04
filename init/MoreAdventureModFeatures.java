
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreadventure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.moreadventure.world.features.ores.RubyOreFeature;
import net.mcreator.moreadventure.MoreAdventureMod;

@Mod.EventBusSubscriber
public class MoreAdventureModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MoreAdventureMod.MODID);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::feature);
}
