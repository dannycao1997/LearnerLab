package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    private Person person;

    @Test
    public void testConstructor(){
        Person person = new Person(10, "Danny");
    }

    @Test
    public void testSetName(){
        Person person = new Person(10, "Danny");
        person.setName("Beatriz");
        Assert.assertEquals("Beatriz", person.getName());
    }

}
