package com.example.win_8.voicemail;


/**
 * Created by win-8 on 24-12-2016.
 */
public class Contacts {
    int _id;
    String _name;
    String _phone_number;
    public Contacts(){   }
    public Contacts(int id, String name, String _phone_number){
        this._id = id;
        this._name = name;
        this._phone_number = _phone_number;
        //this._zone=_zone;
        //this._unique=_zone;
    }

    public Contacts(String name, String _phone_number){
        this._name = name;
        this._phone_number = _phone_number;
    }
    public int getID(){
        return this._id;
    }

    public void setID(int id){
        this._id = id;
    }

    public String getName(){
        return this._name;
    }

    public void setName(String name){
        this._name = name;
    }

    public String getPhoneNumber(){
        return this._phone_number;
    }

    public void setPhoneNumber(String phone_number){
        this._phone_number = phone_number;
    }

}