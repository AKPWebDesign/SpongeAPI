package org.spongepowered.api.entity;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.Archetype;
import org.spongepowered.api.data.persistence.DataBuilder;

public interface EntityArchetype extends Archetype<EntitySnapshot> {

    /**
     * Creates a {@link Builder} to get {@link EntityArchetype}s.
     *
     * @return The new builder
     */
    static Builder builder() {
        return Sponge.getRegistry().createBuilder(Builder.class);
    }

    EntityType getType();

    public static interface Builder extends DataBuilder<EntityArchetype> {

        Builder type(EntityType type);

        Builder from(Entity entity);
    }

}
