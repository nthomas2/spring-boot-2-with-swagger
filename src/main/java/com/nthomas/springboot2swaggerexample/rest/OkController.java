package com.nthomas.springboot2swaggerexample.rest;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Utility", tags = "Utility")
@RestController
public class OkController {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@ApiOperation(value = "Indicate the server is ok")
	@GetMapping(path = "/ok")
	public void feelingFine() {
		LOG.info("/ok was visited");
	}
}
