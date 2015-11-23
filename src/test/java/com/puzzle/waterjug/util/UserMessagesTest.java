package com.puzzle.waterjug.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserMessagesTest {

    @Test
    public void testGet() {
        String message = UserMessages.get("enter.message.goal");
        assertNotNull(message);
    }

}
