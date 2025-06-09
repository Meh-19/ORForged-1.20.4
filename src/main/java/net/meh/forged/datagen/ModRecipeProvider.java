package net.meh.forged.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.meh.forged.block.ModBlocks;
import net.meh.forged.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        // Mushroom Stem -> 4 Fungal Planks
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FUNGAL_PLANKS, 4)
                .input(Blocks.MUSHROOM_STEM)
                .criterion("has_mushroom_stem", conditionsFromItem(Blocks.MUSHROOM_STEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FUNGAL_PLANKS)));

        // Fungal Planks -> Fungal Stairs (4)
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FUNGAL_STAIRS)));

        // Fungal Planks -> Fungal Slabs (6)
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FUNGAL_SLAB)));

        // Fungal Planks -> Fungal Button (1)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.FUNGAL_BUTTON)
                .input(ModBlocks.FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FUNGAL_BUTTON)));

        // Fungal Planks -> Fungal Pressure Plate (1)
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FUNGAL_PRESSURE_PLATE)));

        // Fungal Planks -> Fungal Fence (3)
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FUNGAL_FENCE)));

        // Fungal Planks -> Fungal Fence Gate (1)
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FUNGAL_FENCE_GATE)));

        // White Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.WHITE_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.WHITE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.WHITE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.WHITE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.WHITE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.WHITE_FUNGAL_BUTTON)
                .input(ModBlocks.WHITE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.WHITE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.WHITE_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.WHITE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.WHITE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WHITE_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.WHITE_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.WHITE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.WHITE_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.WHITE_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.WHITE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_FUNGAL_FENCE_GATE)));

        // Light Gray Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.LIGHT_GRAY_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIGHT_GRAY_FUNGAL_BUTTON)
                .input(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIGHT_GRAY_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIGHT_GRAY_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE_GATE)));

        // Gray Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.GRAY_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.GRAY_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.GRAY_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.GRAY_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.GRAY_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GRAY_FUNGAL_BUTTON)
                .input(ModBlocks.GRAY_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.GRAY_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GRAY_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.GRAY_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.GRAY_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GRAY_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.GRAY_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.GRAY_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GRAY_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.GRAY_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.GRAY_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_FUNGAL_FENCE_GATE)));

        // Black Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.BLACK_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.BLACK_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BLACK_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.BLACK_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BLACK_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BLACK_FUNGAL_BUTTON)
                .input(ModBlocks.BLACK_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BLACK_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BLACK_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.BLACK_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BLACK_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BLACK_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.BLACK_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BLACK_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BLACK_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.BLACK_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BLACK_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_FUNGAL_FENCE_GATE)));

        // Brown Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.BROWN_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.BROWN_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BROWN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.BROWN_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BROWN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BROWN_FUNGAL_BUTTON)
                .input(ModBlocks.BROWN_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BROWN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BROWN_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.BROWN_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BROWN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BROWN_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.BROWN_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BROWN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BROWN_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.BROWN_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BROWN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_FUNGAL_FENCE_GATE)));

        // Red Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.RED_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.RED_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.RED_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.RED_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.RED_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RED_FUNGAL_BUTTON)
                .input(ModBlocks.RED_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.RED_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RED_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.RED_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.RED_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.RED_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.RED_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.RED_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RED_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.RED_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.RED_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_FUNGAL_FENCE_GATE)));

        // Orange Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.ORANGE_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.ORANGE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.ORANGE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.ORANGE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.ORANGE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ORANGE_FUNGAL_BUTTON)
                .input(ModBlocks.ORANGE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.ORANGE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ORANGE_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.ORANGE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.ORANGE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.ORANGE_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.ORANGE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ORANGE_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.ORANGE_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.ORANGE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_FUNGAL_FENCE_GATE)));

        // Yellow Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.YELLOW_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.YELLOW_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.YELLOW_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.YELLOW_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.YELLOW_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.YELLOW_FUNGAL_BUTTON)
                .input(ModBlocks.YELLOW_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.YELLOW_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.YELLOW_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.YELLOW_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.YELLOW_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.YELLOW_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.YELLOW_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.YELLOW_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.YELLOW_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.YELLOW_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_FUNGAL_FENCE_GATE)));

        // Lime Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.LIME_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.LIME_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIME_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.LIME_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIME_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIME_FUNGAL_BUTTON)
                .input(ModBlocks.LIME_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIME_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIME_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.LIME_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIME_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIME_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.LIME_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIME_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIME_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.LIME_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIME_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_FUNGAL_FENCE_GATE)));

        // Green Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.GREEN_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.GREEN_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.GREEN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.GREEN_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.GREEN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GREEN_FUNGAL_BUTTON)
                .input(ModBlocks.GREEN_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.GREEN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GREEN_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.GREEN_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.GREEN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GREEN_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.GREEN_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.GREEN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GREEN_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.GREEN_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.GREEN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_FUNGAL_FENCE_GATE)));

        // Cyan Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.CYAN_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.CYAN_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.CYAN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.CYAN_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.CYAN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CYAN_FUNGAL_BUTTON)
                .input(ModBlocks.CYAN_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.CYAN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CYAN_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.CYAN_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.CYAN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CYAN_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.CYAN_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.CYAN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CYAN_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.CYAN_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.CYAN_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_FUNGAL_FENCE_GATE)));

        // Light Blue Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.LIGHT_BLUE_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIGHT_BLUE_FUNGAL_BUTTON)
                .input(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIGHT_BLUE_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIGHT_BLUE_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE_GATE)));

        // Blue Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.BLUE_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.BLUE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BLUE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.BLUE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BLUE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BLUE_FUNGAL_BUTTON)
                .input(ModBlocks.BLUE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BLUE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BLUE_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.BLUE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BLUE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BLUE_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.BLUE_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BLUE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BLUE_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.BLUE_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.BLUE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_FUNGAL_FENCE_GATE)));

        // Purple Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.PURPLE_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.PURPLE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.PURPLE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.PURPLE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.PURPLE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PURPLE_FUNGAL_BUTTON)
                .input(ModBlocks.PURPLE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.PURPLE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PURPLE_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.PURPLE_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.PURPLE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.PURPLE_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.PURPLE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PURPLE_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.PURPLE_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.PURPLE_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_FUNGAL_FENCE_GATE)));

        // Magenta Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.MAGENTA_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.MAGENTA_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.MAGENTA_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.MAGENTA_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.MAGENTA_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MAGENTA_FUNGAL_BUTTON)
                .input(ModBlocks.MAGENTA_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.MAGENTA_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MAGENTA_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.MAGENTA_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.MAGENTA_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.MAGENTA_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.MAGENTA_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MAGENTA_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.MAGENTA_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.MAGENTA_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_FUNGAL_FENCE_GATE)));

        // Pink Fungal Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_FUNGAL_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .input('I', Items.PINK_DYE)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_FUNGAL_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.PINK_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.PINK_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_FUNGAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_FUNGAL_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.PINK_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.PINK_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_FUNGAL_SLAB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PINK_FUNGAL_BUTTON)
                .input(ModBlocks.PINK_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.PINK_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_FUNGAL_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PINK_FUNGAL_PRESSURE_PLATE)
                .pattern("PP")
                .input('P', ModBlocks.PINK_FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.PINK_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_FUNGAL_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PINK_FUNGAL_FENCE, 3)
                .pattern("PIP")
                .pattern("PIP")
                .input('P', ModBlocks.PINK_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.PINK_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_FUNGAL_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PINK_FUNGAL_FENCE_GATE)
                .pattern("IPI")
                .pattern("IPI")
                .input('P', ModBlocks.PINK_FUNGAL_PLANKS)
                .input('I', Ingredient.ofItems(Items.STICK))
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.PINK_FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_FUNGAL_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_MAPLE_PLANKS, 3)
                .pattern("P")
                .pattern("P")
                .pattern("P")
                    .input('P', ModBlocks.MAPLE_PLANKS)
                .criterion("has_maple_planks", conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_MAPLE_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_BEAM, 2)
                .pattern("PP")
                .input('P', ModBlocks.MAPLE_LOG)
                .criterion("has_maple_log", conditionsFromItem(ModBlocks.MAPLE_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAPLE_BEAM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_BLEAK_PLANKS, 3)
                .pattern("P")
                .pattern("P")
                .pattern("P")
                .input('P', ModBlocks.BLEAK_PLANKS)
                .criterion("has_bleak_planks", conditionsFromItem(ModBlocks.BLEAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_BLEAK_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_FIR_PLANKS, 3)
                .pattern("P")
                .pattern("P")
                .pattern("P")
                .input('P', ModBlocks.FIR_PLANKS)
                .criterion("has_fir_planks", conditionsFromItem(ModBlocks.FIR_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_FIR_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_PALM_PLANKS, 3)
                .pattern("P")
                .pattern("P")
                .pattern("P")
                .input('P', ModBlocks.PALM_PLANKS)
                .criterion("has_palm_planks", conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_PALM_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_BAYOU_PLANKS, 3)
                .pattern("P")
                .pattern("P")
                .pattern("P")
                .input('P', ModBlocks.BAYOU_PLANKS)
                .criterion("has_bayou_planks", conditionsFromItem(ModBlocks.BAYOU_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_BAYOU_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_WISTERIA_PLANKS, 3)
                .pattern("P")
                .pattern("P")
                .pattern("P")
                .input('P', ModBlocks.WISTERIA_PLANKS)
                .criterion("has_wisteria_planks", conditionsFromItem(ModBlocks.WISTERIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_WISTERIA_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_BAOBAB_PLANKS, 3)
                .pattern("P")
                .pattern("P")
                .pattern("P")
                .input('P', ModBlocks.BAOBAB_PLANKS)
                .criterion("has_baobab_planks", conditionsFromItem(ModBlocks.BAOBAB_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_BAOBAB_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_FUNGAL_PLANKS, 3)
                .pattern("P")
                .pattern("P")
                .pattern("P")
                .input('P', ModBlocks.FUNGAL_PLANKS)
                .criterion("has_fungal_planks", conditionsFromItem(ModBlocks.FUNGAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.VERTICAL_FUNGAL_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLEAK_BEAM, 2)
                .pattern("PP")
                .input('P', ModBlocks.BLEAK_LOG)
                .criterion("has_bleak_log", conditionsFromItem(ModBlocks.BLEAK_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLEAK_BEAM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIR_BEAM, 2)
                .pattern("PP")
                .input('P', ModBlocks.FIR_LOG)
                .criterion("has_fir_log", conditionsFromItem(ModBlocks.FIR_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIR_BEAM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_BEAM, 2)
                .pattern("PP")
                .input('P', ModBlocks.PALM_LOG)
                .criterion("has_palm_log", conditionsFromItem(ModBlocks.PALM_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PALM_BEAM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAYOU_BEAM, 2)
                .pattern("PP")
                .input('P', ModBlocks.BAYOU_LOG)
                .criterion("has_bayou_log", conditionsFromItem(ModBlocks.BAYOU_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAYOU_BEAM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_BEAM, 2)
                .pattern("PP")
                .input('P', ModBlocks.WISTERIA_LOG)
                .criterion("has_wisteria_log", conditionsFromItem(ModBlocks.WISTERIA_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_BEAM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAOBAB_BEAM, 2)
                .pattern("PP")
                .input('P', ModBlocks.BAOBAB_LOG)
                .criterion("has_baobab_log", conditionsFromItem(ModBlocks.BAOBAB_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAOBAB_BEAM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_PLANKS, 4)
                .input(ModBlocks.OAK_BEAM)
                .criterion("has_oak_beam", conditionsFromItem(ModBlocks.OAK_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.OAK_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_PLANKS, 4)
                .input(ModBlocks.SPRUCE_BEAM)
                .criterion("has_spruce_beam", conditionsFromItem(ModBlocks.SPRUCE_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.SPRUCE_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_PLANKS, 4)
                .input(ModBlocks.BIRCH_BEAM)
                .criterion("has_birch_beam", conditionsFromItem(ModBlocks.BIRCH_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.BIRCH_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_PLANKS, 4)
                .input(ModBlocks.JUNGLE_BEAM)
                .criterion("has_jungle_beam", conditionsFromItem(ModBlocks.JUNGLE_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.JUNGLE_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_PLANKS, 4)
                .input(ModBlocks.ACACIA_BEAM)
                .criterion("has_acacia_beam", conditionsFromItem(ModBlocks.ACACIA_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.ACACIA_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_PLANKS, 4)
                .input(ModBlocks.DARK_OAK_BEAM)
                .criterion("has_dark_oak_beam", conditionsFromItem(ModBlocks.DARK_OAK_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.DARK_OAK_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_PLANKS, 4)
                .input(ModBlocks.MANGROVE_BEAM)
                .criterion("has_mangrove_beam", conditionsFromItem(ModBlocks.MANGROVE_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.MANGROVE_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_PLANKS, 4)
                .input(ModBlocks.CHERRY_BEAM)
                .criterion("has_cherry_beam", conditionsFromItem(ModBlocks.CHERRY_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.CHERRY_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_PLANKS, 4)
                .input(ModBlocks.WARPED_BEAM)
                .criterion("has_warped_beam", conditionsFromItem(ModBlocks.WARPED_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.WARPED_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_PLANKS, 4)
                .input(ModBlocks.CRIMSON_BEAM)
                .criterion("has_crimson_beam", conditionsFromItem(ModBlocks.CRIMSON_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(Blocks.CRIMSON_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_PLANKS, 4)
                .input(ModBlocks.MAPLE_BEAM)
                .criterion("has_maple_beam", conditionsFromItem(ModBlocks.MAPLE_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAPLE_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLEAK_PLANKS, 4)
                .input(ModBlocks.BLEAK_BEAM)
                .criterion("has_bleak_beam", conditionsFromItem(ModBlocks.BLEAK_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLEAK_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIR_PLANKS, 4)
                .input(ModBlocks.FIR_BEAM)
                .criterion("has_fir_beam", conditionsFromItem(ModBlocks.FIR_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIR_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS, 4)
                .input(ModBlocks.PALM_BEAM)
                .criterion("has_palm_beam", conditionsFromItem(ModBlocks.PALM_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PALM_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAYOU_PLANKS, 4)
                .input(ModBlocks.BAYOU_BEAM)
                .criterion("has_bayou_beam", conditionsFromItem(ModBlocks.BAYOU_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAYOU_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_PLANKS, 4)
                .input(ModBlocks.WISTERIA_BEAM)
                .criterion("has_wisteria_beam", conditionsFromItem(ModBlocks.WISTERIA_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WISTERIA_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAOBAB_PLANKS, 4)
                .input(ModBlocks.BAOBAB_BEAM)
                .criterion("has_baobab_beam", conditionsFromItem(ModBlocks.BAOBAB_BEAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAOBAB_PLANKS)));

    }
}