package com.thepinkandroid.filterdrawer.models;

/**
 * Created by DAVID-WORK on 22/11/2015.
 */
public class Category
{
    private int mCode;
    private String mName;

    public Category(int code, String name)
    {
        mCode = code;
        mName = name;
    }

    public int getCode()
    {
        return mCode;
    }

    public void setCode(int code)
    {
        mCode = code;
    }

    public String getName()
    {
        return mName;
    }

    public void setName(String name)
    {
        mName = name;
    }
}
