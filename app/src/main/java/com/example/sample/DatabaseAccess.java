package com.example.sample;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.*;

public class DatabaseAccess {

    private SQLiteOpenHelper OpenHelper;
    private SQLiteDatabase food_db;
    private static DatabaseAccess instance;

    Cursor c = null;

    private DatabaseAccess(Context context)
    {
        this.OpenHelper = new DatabaseOpenHelper(context);
    }

    public static DatabaseAccess getInstance(Context context){
        if(instance==null){
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    public void open(){
        this.food_db = OpenHelper.getWritableDatabase();
    }

    public void close(){
        if(food_db!=null)
        {
            this.food_db.close();
        }
    }

    public String getReplacement(String food)
    {
        c=food_db.query("Food_data", null," Food = ? " ,new String[]{food}, null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
        }

        StringBuilder buffer1 = new StringBuilder();

        do{
            String replacement = c.getString(1);
            buffer1.append("").append(replacement);
        }while(c.moveToNext());

        return buffer1.toString();
    }
    public String getfcalories(String food)
    {
        c=food_db.query("Food_data", null," Food = ? " ,new String[]{food}, null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
        }
        StringBuilder buffer2 = new StringBuilder();

        do{
            int fcalories = c.getInt(2);
            buffer2.append("").append(fcalories);
        }while(c.moveToNext());

        return buffer2.toString();
    }

    public String getfcarbs(String food)
    {
        c=food_db.query("Food_data", null," Food = ? " ,new String[]{food}, null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
        }

        StringBuilder buffer3 = new StringBuilder();

        do{
            int fcarbs = c.getInt(3);
            buffer3.append("").append(fcarbs);
        }while(c.moveToNext());
        return buffer3.toString();
    }

    public String getfproteins(String food)
    {
        c=food_db.query("Food_data", null," Food = ? " ,new String[]{food}, null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
        }

        StringBuilder buffer4 = new StringBuilder();

        do{
            int fproteins = c.getInt(4);
            buffer4.append("").append(fproteins);
        }while(c.moveToNext());

        return buffer4.toString();
    }

    public String getffats(String food)
    {
        c=food_db.query("Food_data", null," Food = ? " ,new String[]{food}, null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
        }

        StringBuilder buffer5 = new StringBuilder();

        do{
            int replacement = c.getInt(5);
            buffer5.append("").append(replacement);
        }while(c.moveToNext());
        return buffer5.toString();
    }

    public String getfmoney(String food)
    {
        c=food_db.query("Food_data", null," Food = ? " ,new String[]{food}, null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
        }

        StringBuilder buffer6 = new StringBuilder();

        do{
            int fmoney = c.getInt(10);
            buffer6.append("").append(fmoney);
        }while(c.moveToNext());

        return buffer6.toString();
    }

    public String getrcalories(String food)
    {
        c=food_db.query("Food_data", null," Food = ? " ,new String[]{food}, null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
        }

        StringBuilder buffer7 = new StringBuilder();

        do{
            int rcalories = c.getInt(6);
            buffer7.append("").append(rcalories);
        }while(c.moveToNext());

        return buffer7.toString();
    }

    public String getrcarbs(String food)
    {
        c=food_db.query("Food_data", null," Food = ? " ,new String[]{food}, null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
        }

        StringBuilder buffer8 = new StringBuilder();

        do{
            int rcarbs = c.getInt(7);
            buffer8.append("").append(rcarbs);
        }while(c.moveToNext());

        return buffer8.toString();
    }

    public String getrproteins(String food)
    {
        c=food_db.query("Food_data", null," Food = ? " ,new String[]{food}, null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
        }

        StringBuilder buffer9 = new StringBuilder();

        do{
            int rproteins = c.getInt(8);
            buffer9.append("").append(rproteins);
        }while(c.moveToNext());

        return buffer9.toString();
    }

    public String getrfats(String food)
    {
        c=food_db.query("Food_data", null, null,null, null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
        }

        StringBuilder buffer10 = new StringBuilder();

        do{
            int rfats = c.getInt(9);
            buffer10.append("").append(rfats);
        }while(c.moveToNext());

        return buffer10.toString();
    }

    public String getrmoney(String food)
    {
        c=food_db.query("Food_data", null," Food = ? " ,new String[]{food}, null,null,null);
        if(c!=null)
        {
            c.moveToFirst();
        }

        StringBuilder buffer11 = new StringBuilder();

        do{
            int rmoney = c.getInt(11);
            buffer11.append("").append(rmoney);
        }while(c.moveToNext());
        return buffer11.toString();
    }


}
