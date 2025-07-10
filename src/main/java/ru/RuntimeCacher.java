package ru;

import java.util.HashMap;

/**
 * @author : faint
 * @date : 18.07.2023
 * @time : 22:29
 */
public class RuntimeCacher<T> implements ICacher<T> {
    private final HashMap<String, T> storage = new HashMap();

    public T get(String key) {
        T result = (T) this.storage.get(key);
        return result;
    }

    public T set(String key, T cachedObject) {
        return (T) this.storage.putIfAbsent(key, cachedObject);
    }
}
