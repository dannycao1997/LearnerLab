package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        // given
        String expectedName = "";
        long expectedId = Integer.MAX_VALUE;
        Person person = new Person(expectedId, expectedName);

        // when
        String actualName = person.getName();
        long actualId = person.getId();

        // then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedId, actualId);

    }

    @Test
    public void testSetName(){
        // given
        String expectedName = "Beatriz";
        long expectedId = Integer.MAX_VALUE;
        Person person = new Person(expectedId, expectedName);

        // when
        String actualName = person.getName();
        long actualId = person.getId();

        // then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
    }
}

/*
Instructions : Part 1.0 - Test Person
Create a TestPerson class.
Create a testConstructor method which ensures that a Person object's id and name field are being set upon construction.
Create a testSetName method which ensures that a Person object's name variable is being set by invoking the .setName method.
 */
