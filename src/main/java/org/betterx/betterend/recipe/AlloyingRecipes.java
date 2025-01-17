package org.betterx.betterend.recipe;

import org.betterx.betterend.recipe.builders.AlloyingRecipeBuilder;
import org.betterx.betterend.registry.EndBlocks;
import org.betterx.betterend.registry.EndItems;
import org.betterx.betterend.registry.EndTags;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class AlloyingRecipes {
    public static void register() {
        AlloyingRecipeBuilder.create("additional_iron")
                             .setInput(EndTags.ALLOYING_IRON, EndTags.ALLOYING_IRON)
                             .setOutput(Items.IRON_INGOT, 3)
                             .setExpiriense(2.1F)
                             .build();
        AlloyingRecipeBuilder.create("additional_gold")
                             .setInput(EndTags.ALLOYING_GOLD, EndTags.ALLOYING_GOLD)
                             .setOutput(Items.GOLD_INGOT, 3)
                             .setExpiriense(3F)
                             .build();
        AlloyingRecipeBuilder.create("additional_copper")
                             .setInput(EndTags.ALLOYING_COPPER, EndTags.ALLOYING_COPPER)
                             .setOutput(Items.COPPER_INGOT, 3)
                             .setExpiriense(3F)
                             .build();
        AlloyingRecipeBuilder.create("additional_netherite")
                             .setInput(Blocks.ANCIENT_DEBRIS, Blocks.ANCIENT_DEBRIS)
                             .setOutput(Items.NETHERITE_SCRAP, 3)
                             .setExpiriense(6F)
                             .setSmeltTime(1000)
                             .build();
        AlloyingRecipeBuilder.create("terminite_ingot")
                             .setInput(Items.IRON_INGOT, EndItems.ENDER_DUST)
                             .setOutput(EndBlocks.TERMINITE.ingot, 1)
                             .setExpiriense(2.5F)
                             .setSmeltTime(450)
                             .build();
        AlloyingRecipeBuilder.create("aeternium_ingot")
                             .setInput(EndBlocks.TERMINITE.ingot, Items.NETHERITE_INGOT)
                             .setOutput(EndItems.AETERNIUM_INGOT, 1)
                             .setExpiriense(4.5F)
                             .setSmeltTime(850)
                             .build();
        AlloyingRecipeBuilder.create("terminite_ingot_thallasium")
                             .setInput(EndBlocks.THALLASIUM.ingot, EndItems.ENDER_DUST)
                             .setOutput(EndBlocks.TERMINITE.ingot, 1)
                             .setExpiriense(2.5F)
                             .setSmeltTime(450)
                             .build();
    }
}
