package annotation.custom_catching;

import java.util.HashMap;
import java.util.Map;

//Caching utility class
class CacheUtil {
 private static final Map<String, Object> cache = new HashMap<>();

 public static Object cacheResult(String key, Object result) {
     cache.put(key, result);
     return result;
 }

 public static Object getCachedResult(String key) {
     return cache.get(key);
 }
}
