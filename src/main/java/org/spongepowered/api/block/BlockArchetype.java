package org.spongepowered.api.block;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.Archetype;
import org.spongepowered.api.data.persistence.DataBuilder;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

public interface BlockArchetype extends Archetype<BlockSnapshot> {

    /**
     * Creates a {@link Builder} to get {@link BlockArchetype}s.
     *
     * @return The new builder
     */
    static Builder builder() {
        return Sponge.getRegistry().createBuilder(Builder.class);
    }

    BlockState getState();

    public static interface Builder extends DataBuilder<BlockArchetype> {

        Builder state(BlockState state);

        Builder from(Location<World> location);
    }
}
