package io.github.tahanima.config;

import org.aeonbits.owner.ConfigCache;


public final class ConfigurationManager {

    private ConfigurationManager() {}

    public static Configuration config() {
        return ConfigCache.getOrCreate(Configuration.class);
    }
}
