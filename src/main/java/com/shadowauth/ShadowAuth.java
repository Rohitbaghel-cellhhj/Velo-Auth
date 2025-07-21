package com.shadowauth;

import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.PostLoginEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

import org.slf4j.Logger;

import javax.inject.Inject;

@Plugin(
    id = "shadowauth",
    name = "ShadowAuth",
    version = "1.0.0",
    authors = {"YourName"}
)
public class ShadowAuth {

    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public ShadowAuth(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;
        logger.info("ShadowAuth has been enabled!");
    }

    @Subscribe
    public void onLogin(PostLoginEvent event) {
        logger.info("Player connected: " + event.getPlayer().getUsername());
    }
}
