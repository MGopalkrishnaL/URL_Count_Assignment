package com.example.URL_Count.controller;

import com.example.URL_Count.model.url;
import com.example.URL_Count.server.urlServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.TreeMap;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class urlController{
    @Autowired
    private urlServer urlserver;

    public urlController(urlServer urlserver){
        this.urlserver=urlserver;
    }
//   http://localhost:8080/api/v1/visitor-count-app/AllUsername-count
        @GetMapping("/AllUsername-count")
        public TreeMap<String,Integer> getAll(){
            return urlserver.getCountAll();
        }
        @GetMapping("/username/{name}/count")
//    http://localhost:8080/api/v1/visitor-count-app/username/{name}/count
    public url getcountofUser(@PathVariable String name){
       return urlserver.getcount(name);

    }
//    http://localhost:8080/api/v1/visitor-count-app/count
    @GetMapping("/count")
    public int getCount(){
        return urlserver.countAll();
    }
//    http://localhost:8080/api/v1/visitor-count-app/ActualVisitors
    @GetMapping("/ActualVisitors")
    public String getVisitors(){
        int Visitors = urlserver.Visitors();
        return "Visitors :"+Visitors;
    }
}
