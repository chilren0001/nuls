package io.nuls.cache.entity;

/**
 * Created by Niels on 2017/10/18.
 * nuls.io
 */
public class CacheElement<T> {
    private String cacheTitle;
    private String key;
    private T value;

    public CacheElement() {
    }

    public CacheElement(String key, T value) {
        this.key = key;
        this.value = value;
    }

    public String getCacheTitle() {
        return cacheTitle;
    }

    public void setCacheTitle(String cacheTitle) {
        this.cacheTitle = cacheTitle;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
