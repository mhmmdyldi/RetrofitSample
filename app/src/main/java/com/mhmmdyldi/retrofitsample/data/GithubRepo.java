package com.mhmmdyldi.retrofitsample.data;

public class GithubRepo {
    public String name;
    public String owner;
    public String url;

    @Override
    public String toString() {
        return(name + " " +  url);
    }
}
