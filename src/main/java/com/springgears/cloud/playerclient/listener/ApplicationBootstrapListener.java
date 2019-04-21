package com.springgears.cloud.playerclient.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ApplicationBootstrapListener implements ApplicationListener<ContextRefreshedEvent> {

    @Value("${db.url}")
    private String dbUrl;

    @Value("${player.max-playlists}")
    private String maxPlaylists;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("Database URL: {}", dbUrl);

        log.info("Max playlists: {}", maxPlaylists);
    }
}
