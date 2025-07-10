package ru;

/**
 * @author : faint
 * @date : 18.07.2023
 * @time : 22:28
 */
public interface ICacher<T> {
    T get(String var1);

    T set(String var1, T var2);
}
