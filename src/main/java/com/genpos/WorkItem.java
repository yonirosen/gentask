package com.genpos;

import java.util.List;

public class WorkItem {

    private final List<String> names;

    public WorkItem (String name1 , String name2 ){
        names = List.of(name1, name2);
    }

    public List<String> getNames () { return names;}

    
}
