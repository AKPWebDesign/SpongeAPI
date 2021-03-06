/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.asset;

import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;

import java.util.Optional;

/**
 * The AssetManager offers a convenient way to easily retrieve resources from
 * Sponge {@link Plugin}s. A {@link Plugin} may specify it's {@link Asset}
 * directory in it's annotation declaring class as well as in the plugin meta
 * file. If no directory is specified the manager will attempt to find the
 * asset of the specified name at:
 *
 * <p><code>assets/&lt;id&gt;</code> where 'ID' is the plugin's fully
 * qualified ID with all '.'s replaced with '/'s to more fit a directory
 * structure.</p>
 */
public interface AssetManager {

    /**
     * Returns the {@link Asset} of the specified name for the specified
     * {@link Plugin} instance.
     *
     * @param plugin Plugin instance
     * @param name Name of resource to retrieve
     * @return Asset if present, empty otherwise
     */
    Optional<Asset> getAsset(Object plugin, String name);

    /**
     * Returns the {@link Asset} of the specified name within the domain of the
     * implementation. This method will typically call
     * {@link #getAsset(Object, String)} using a dummy
     * {@link PluginContainer} for the SpongeAPI implementation.
     *
     * @param name Name of resource to retrieve
     * @return Asset if present, empty otherwise
     */
    Optional<Asset> getAsset(String name);

}
