
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreadventure.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.moreadventure.block.RubyOreBlock;
import net.mcreator.moreadventure.block.RubyBlockBlock;
import net.mcreator.moreadventure.block.AdventureWorldPortalBlock;
import net.mcreator.moreadventure.MoreAdventureMod;

public class MoreAdventureModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreAdventureMod.MODID);
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> ADVENTURE_WORLD_PORTAL = REGISTRY.register("adventure_world_portal",
			() -> new AdventureWorldPortalBlock());
}
