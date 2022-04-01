package com.star;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NewArrayListTest {

    @Test
    public void add() {
        NewArrayList<Integer> list = new NewArrayList<>();
        list.add(4);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        Assert.assertEquals(4, list.get(0));
    }

    @Test
    public void clear() {
        NewArrayList<Integer> list = new NewArrayList<>();
        list.add(4);
        list.add(3);
        list.clear();
        Assert.assertEquals(true, list.isEmpty());
    }

    @Test
    public void contains() {
        NewArrayList<Integer> list = new NewArrayList<>();
        list.add(4);
        Assert.assertEquals(true, list.contains(3));
        Assert.assertEquals(true, list.contains(4));

    }

    @Test
    public void indexOf() {
        NewArrayList<Integer> list = new NewArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        Assert.assertEquals(1,list.indexOf(5));
    }

    @Test
    public void remove() {
        NewArrayList<String> list = new NewArrayList<>();
        list.add("Sip");
        list.add("Jeq");
        list.add("Das");
        list.remove(1);

        NewArrayList<String> list2 = new NewArrayList<>();
        list2.add("Sip");
        list2.add("Das");
        Assert.assertEquals(list.get(0), list2.get(0));
        Assert.assertEquals(list.get(1), list2.get(1));
    }

    @Test
    public void size() {
        NewArrayList<String> list = new NewArrayList<>();
        list.add("Sip");
        list.add("Jeq");
        list.add("Das");
        Assert.assertEquals(3,list.size());
        Assert.assertEquals(5,list.size());

    }
}