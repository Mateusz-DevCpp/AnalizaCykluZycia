
package acz.model.Repozytoria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Repozytorium<T> implements Serializable
{
    List<T> objects;

    public Repozytorium() 
    {
        objects = new ArrayList<T>();
    }
    
    public T get(int id)
    {
        return objects.get(id);
    }
    
    public boolean add(T newObject)
    {
        return objects.add(newObject);
    }
    
    public boolean remove(T object)
    {
        return objects.remove(object);
    }
    
    public String report()
    {
        String result = "";
        for(int i=0; i<objects.size(); i++)
        {
            result += objects.get(i).toString() + "\n";
        }
        return result;
    }
    
    public int size()
    {
        return objects.size();
    }
};