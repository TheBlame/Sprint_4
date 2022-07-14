package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "String: \"{0}\", should be: {1}")
    public static Object[][] getTestData() {
        return new Object[][] {
                {"TimothyShalame", false},
                {"Timothythy Shalameme", false},
                {" Timothy Shalame", false},
                {"Timothy Shalame ", false},
                {"TS", false},
                {"T S", true},
                {"Timothy Shalame", true}
        };
    }

    @Test
    public void checkNameToEmbossMethodTest() {
        Account account = new Account(name);
        boolean result = account.checkNameToEmboss();
        Assert.assertEquals(expected, result);
    }
}
