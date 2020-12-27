package com.dams.sec4.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

// MOVED TO XML CONFIG chuck-config.xml

//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
