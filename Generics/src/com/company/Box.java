package com.company;

public class Box<T extends Number> {


    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content){
        this.content=content;
    }


}
