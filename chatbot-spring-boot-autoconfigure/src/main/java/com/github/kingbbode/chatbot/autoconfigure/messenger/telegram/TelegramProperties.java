package com.github.kingbbode.chatbot.autoconfigure.messenger.telegram;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by YG-MAC on 2018. 3. 4..
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "telegram")
public class TelegramProperties {
    private String name = "임시봇";
    private String token;
}
