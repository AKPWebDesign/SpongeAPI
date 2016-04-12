package org.spongepowered.api.data;

import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * A {@link DataHolder} which has no attachment to any particular world allowing
 * it to be used as a blueprint to create multiple copies of its containing
 * data.
 */
public interface Archetype<S extends LocateableSnapshot<S>> extends DataHolder {

    void apply(Location<World> location, Cause cause);

    S toSnapshot(Location<World> location);

}
