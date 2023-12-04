package com.example.chat;

public class LoginState {

    private static boolean isLoggedIn = false;
    static public boolean getIsLoggedIn(){
        return isLoggedIn;
    }

    static public void setIsLoggedIn(boolean state){
        isLoggedIn = state;
    }
}
