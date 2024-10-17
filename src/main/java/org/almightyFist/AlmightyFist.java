package org.almightyFist;

import net.fabricmc.api.ModInitializer;

public class AlmightyFist implements ModInitializer {
    public static final String MOD_ID = "almighty-fist";

    @Override
    public void onInitialize() {
        AlmightyFistItem.initialize();
    }
}
