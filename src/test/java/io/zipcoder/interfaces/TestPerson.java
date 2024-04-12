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

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedId, actualId);

    }

    @Test
    public void testSetName(){
        Person person = new Person(10, "Danny");
        person.setName("Beatriz");
        Assert.assertEquals("Beatriz", person.getName());
    }

}
