package annotation.custom_catching;

//Computationally expensive class with caching
class ExpensiveComputation {
 @CatchResult
 public int fibonacci(int n) {
     String key = "fibonacci-" + n;
     if (CacheUtil.getCachedResult(key) != null) {
         return (int) CacheUtil.getCachedResult(key);
     }
     int result = (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
     return (int) CacheUtil.cacheResult(key, result);
 }
}
