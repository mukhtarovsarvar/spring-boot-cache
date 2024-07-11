package com.example.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.spi.CachingProvider;
import java.net.URISyntaxException;
import java.util.Objects;

/**
 * @author 'Mukhtarov Sarvarbek' on 7/6/2024
 * @project spring-boot-cache
 * @contact @sarvargo
 */
@Configuration
@EnableCaching
public class CacheConfiguration {

    @Bean
    public JCacheCacheManager cacheManager() throws URISyntaxException {
        CachingProvider provider = Caching.getCachingProvider();
        CacheManager cacheManager = provider.getCacheManager(
                Objects
                        .requireNonNull(
                                getClass().getResource("/ehcache.xml")
                        ).toURI(),
                getClass().getClassLoader()
        );
        return new JCacheCacheManager(cacheManager);
    }



}
