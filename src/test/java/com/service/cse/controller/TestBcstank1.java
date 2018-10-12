package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBcstank1 {

        Bcstank1Delegate bcstank1Delegate = new Bcstank1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = bcstank1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}