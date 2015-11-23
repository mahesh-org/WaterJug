package com.puzzle.waterjug.util;

import java.util.ResourceBundle;

public class UserMessages {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("usermessages");

    private UserMessages() {

    }

    public static String get(String key) {
        return resourceBundle.getString(key);
    }
}
