package com.example.config;

import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cache.CacheManager;
import org.ehcache.jsr107.EhcacheCachingProvider;

import javax.cache.Caching;
import javax.cache.spi.CachingProvider;
import java.net.URISyntaxException;

/**
 * @author 'Mukhtarov Sarvarbek' on 7/6/2024
 * @project spring-boot-cache
 * @contact @sarvargo
 */
@Configuration
public class CacheConfiguration {

    @Bean
    public CacheManager cacheManager() throws URISyntaxException {
        CachingProvider cachingProvider = Caching.getCachingProvider(EhcacheCachingProvider.class.getName());
        javax.cache.CacheManager jCacheManager = cachingProvider.getCacheManager(
                getClass().getResource("/ehcache.xml").toURI(),
                getClass().getClassLoader()
        );
        return new JCacheCacheManager(jCacheManager);
    }

}
