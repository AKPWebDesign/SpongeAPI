/*
 * Copyright (c) 2016 VoxelBox // Imagiverse <http://imagiver.se>.
 * All Rights Reserved.
 */
package org.spongepowered.api.world.schematic;

import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

public class PaletteTypes {

    public static final PaletteType GLOBAL = DummyObjectProvider.createFor(PaletteType.class, "GLOBAL");
    public static final PaletteType LOCAL = DummyObjectProvider.createFor(PaletteType.class, "LOCAL");
    
    private PaletteTypes() {
    }

}
