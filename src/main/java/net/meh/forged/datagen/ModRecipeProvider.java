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

    }
}