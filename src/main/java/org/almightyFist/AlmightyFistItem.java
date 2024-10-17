package org.almightyFist;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MiningToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class AlmightyFistItem {
    public static final TagKey<Block> ALMIGHTY_FIST_MINEABLE = TagKey.of(RegistryKeys.BLOCK, Identifier.of("almighty-fist", "almighty_fist_mineable"));
    public static final Item ALMIGHTY_FIST = register(new MiningToolItem(AlmightyMaterial.INSTANCE, ALMIGHTY_FIST_MINEABLE,new Item.Settings().rarity(Rarity.RARE)), "almighty_fist");

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.add(AlmightyFistItem.ALMIGHTY_FIST));
    }

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(AlmightyFist.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemID, item);
    }
}
