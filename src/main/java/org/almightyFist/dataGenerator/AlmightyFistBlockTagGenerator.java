package org.almightyFist.dataGenerator;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static org.almightyFist.AlmightyFist.MOD_ID;


public class AlmightyFistBlockTagGenerator extends FabricTagProvider<Block> {
    public static final TagKey<Block> ALMIGHTY_FIST_MINEABLE = TagKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "almighty_fist_mineable"));

    public AlmightyFistBlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BLOCK, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ALMIGHTY_FIST_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE)
                .forceAddTag(BlockTags.HOE_MINEABLE)
                .forceAddTag(BlockTags.SWORD_EFFICIENT);
    }
}
