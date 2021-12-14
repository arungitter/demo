package com.log4j.demo.Controller;

@RestController
public class TestController {
	private static final Logger LOGGER = LogManager.getLogger(TestController.class);

	@GetMapping("/vuln")
	public String test(@RequestParam("userInput") String userInput) {
		LOGGER.info("User Input:" + userInput);

		return "{}";
	}

}