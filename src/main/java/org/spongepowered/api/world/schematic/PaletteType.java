/*
 * Copyright (c) 2016 VoxelBox // Imagiverse <http://imagiver.se>.
 * All Rights Reserved.
 */
package org.spongepowered.api.world.schematic;

import org.spongepowered.api.CatalogType;

public interface PaletteType extends CatalogType {

    Palette create();

}
