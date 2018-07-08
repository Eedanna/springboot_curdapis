package com.springbootquickstart.courseapi;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * The Class TestCourseAPI.
 */
public class TestCourseAPI extends CourseApiApplicationTests {

	/** The web application context. */
	@Autowired
	private WebApplicationContext webApplicationContext;

	/** The mock mvc. */
	private MockMvc mockMvc;

	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	/**
	 * Test employee.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testEmployee() throws Exception {
		mockMvc.perform(get("/topics/java")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(jsonPath("$.id").value("java")).andExpect(jsonPath("$.name").value("core java"))
				.andExpect(jsonPath("$.description").value("core java topics"));

	}
}
