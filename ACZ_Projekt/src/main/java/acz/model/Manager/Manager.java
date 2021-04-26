package acz.model.Manager;

interface Manager<T>
{
    public boolean register(T newObj);
    public boolean unregister(T obj);
    public int find(String id);
    public T get(int id);
    public int count();
}
