package org.betterx.betterend.recipe;

import org.betterx.bclib.recipes.AnvilRecipe;
import org.betterx.betterend.config.Configs;
import org.betterx.betterend.item.material.EndToolMaterial;
import org.betterx.betterend.registry.EndItems;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tiers;

public class AnvilRecipes {
    public static void register() {
        AnvilRecipe.create("ender_pearl_to_dust")
                   .checkConfig(Configs.RECIPE_CONFIG)
                   .setInput(Items.ENDER_PEARL)
                   .setOutput(EndItems.ENDER_DUST)
                   .setAnvilLevel(Tiers.IRON.getLevel())
                   .setToolLevel(4)
                   .setDamage(5)
                   .build();
        AnvilRecipe.create("ender_shard_to_dust")
                   .checkConfig(Configs.RECIPE_CONFIG)
                   .setInput(EndItems.ENDER_SHARD)
                   .setOutput(EndItems.ENDER_DUST)
                   .setAnvilLevel(Tiers.IRON.getLevel())
                   .setToolLevel(0)
                   .setDamage(3)
                   .build();

        int anvilLevel = EndToolMaterial.AETERNIUM.getLevel();
        AnvilRecipe.create("aeternium_axe_head")
                   .checkConfig(Configs.RECIPE_CONFIG)
                   .setInput(EndItems.AETERNIUM_INGOT)
                   .setOutput(EndItems.AETERNIUM_AXE_HEAD)
                   .setAnvilLevel(anvilLevel)
                   .setToolLevel(anvilLevel)
                   .setDamage(6)
                   .build();
        AnvilRecipe.create("aeternium_pickaxe_head")
                   .checkConfig(Configs.RECIPE_CONFIG)
                   .setInput(EndItems.AETERNIUM_INGOT)
                   .setOutput(EndItems.AETERNIUM_PICKAXE_HEAD)
                   .setAnvilLevel(anvilLevel)
                   .setToolLevel(anvilLevel)
                   .setDamage(6)
                   .build();
        AnvilRecipe.create("aeternium_shovel_head")
                   .checkConfig(Configs.RECIPE_CONFIG)
                   .setInput(EndItems.AETERNIUM_INGOT)
                   .setOutput(EndItems.AETERNIUM_SHOVEL_HEAD)
                   .setAnvilLevel(anvilLevel)
                   .setToolLevel(anvilLevel)
                   .setDamage(6)
                   .build();
        AnvilRecipe.create("aeternium_hoe_head")
                   .checkConfig(Configs.RECIPE_CONFIG)
                   .setInput(EndItems.AETERNIUM_INGOT)
                   .setOutput(EndItems.AETERNIUM_HOE_HEAD)
                   .setAnvilLevel(anvilLevel)
                   .setToolLevel(anvilLevel)
                   .setDamage(6)
                   .build();
        AnvilRecipe.create("aeternium_hammer_head")
                   .checkConfig(Configs.RECIPE_CONFIG)
                   .setInput(EndItems.AETERNIUM_INGOT)
                   .setOutput(EndItems.AETERNIUM_HAMMER_HEAD)
                   .setAnvilLevel(anvilLevel)
                   .setToolLevel(EndToolMaterial.THALLASIUM.getLevel())
                   .setDamage(6)
                   .build();
        AnvilRecipe.create("aeternium_sword_blade")
                   .checkConfig(Configs.RECIPE_CONFIG)
                   .setInput(EndItems.AETERNIUM_INGOT)
                   .setOutput(EndItems.AETERNIUM_SWORD_BLADE)
                   .setAnvilLevel(anvilLevel)
                   .setToolLevel(anvilLevel)
                   .setDamage(6)
                   .build();
        AnvilRecipe.create("aeternium_forged_plate")
                   .checkConfig(Configs.RECIPE_CONFIG)
                   .setInput(EndItems.AETERNIUM_INGOT)
                   .setOutput(EndItems.AETERNIUM_FORGED_PLATE)
                   .setAnvilLevel(anvilLevel)
                   .setToolLevel(anvilLevel)
                   .setDamage(6)
                   .build();
    }
}
