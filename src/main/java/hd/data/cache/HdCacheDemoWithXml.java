package hd.data.cache;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.Configuration;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.xml.XmlConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HdCacheDemoWithXml {

	private static final Logger logger = LoggerFactory.getLogger(HdCacheDemoWithXml.class);

	public static void main(String[] args) {
		logger.info("Creating cache manager via XML resource");
		Configuration xmlConfig = new XmlConfiguration(HdCacheDemoWithXml.class.getResource("/ehcache.xml"));
		try (CacheManager cacheManager = CacheManagerBuilder.newCacheManager(xmlConfig)) {
			cacheManager.init();

			Cache<Long, String> basicCache = cacheManager.getCache("basicCache", Long.class, String.class);

			logger.info("Putting to cache");
			basicCache.put(1L, "da one!");
			String value = basicCache.get(1L);
			logger.info("Retrieved '{}'", value);

			logger.info("Closing cache manager");
		}

		logger.info("Exiting");
	}
}
