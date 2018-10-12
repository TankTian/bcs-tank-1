package com.service.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-10-12T03:59:54.260Z")

@RestSchema(schemaId = "bcstank1")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Bcstank1Impl {

    @Autowired
    private Bcstank1Delegate userBcstank1Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name) throws Exception{

        return userBcstank1Delegate.helloworld(name);
    }

}
