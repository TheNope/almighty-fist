package org.almightyFist.dataGenerator;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.almightyFist.AlmightyFistItem;

import java.util.concurrent.CompletableFuture;

public class AlmightyFistItemTagGenerator extends FabricTagProvider<Item> {
    public AlmightyFistItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE).add(AlmightyFistItem.ALMIGHTY_FIST);
        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE).add(AlmightyFistItem.ALMIGHTY_FIST);
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE).add(AlmightyFistItem.ALMIGHTY_FIST);
    }
}
