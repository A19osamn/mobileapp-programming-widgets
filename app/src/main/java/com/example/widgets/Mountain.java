package com.example.widgets;

public class Mountain {  /*Give the class a state*/
    private String name;
    private String location;
    private int height;
    public Mountain(){
        name="Missing name";
        location="Missing location";
        height=-1;
    }
    public Mountain(String n,String l,int h){
        name=n;
        location=l;
        height=h;
    }
    public String info(){   /*Class interface*/
        String tmp=new String();
        tmp+=name+" is located in mountain range "+location+" and reaches " +height+"m above sea level.";
        return tmp;
    }
    public void setName(String n){   /*getter's and setter's */
        name=n;
    }
    public String getName(){
        return name;
    }

@Override
    public String toString(){/*Use the new class together with ArrayAdapter*/
        return name;
}
}
