package com.example.URL_Count.server;
import com.example.URL_Count.model.url;
import org.springframework.stereotype.Service;
import java.util.TreeMap;

@Service
public class urlServer {
    static TreeMap<String , Integer> map = new TreeMap<>();
    public url getcount(String name){
       int count = map.getOrDefault(name,0)+1;
       map.put(name,count);
       url Visit = new url(name,count);
       return Visit;
    }
    public TreeMap<String,Integer> getCountAll(){
        return map;
    }

    public int countAll(){
        int count=0;
        for(String key :map.keySet()){
            int value = map.get(key);
            count+=value;
        }
        return count;
    }
    public int Visitors(){
        int count =0;
        for(String key : map.keySet()){
            count++;
        }
        return count;
    }
}
