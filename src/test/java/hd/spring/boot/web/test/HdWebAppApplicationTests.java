package hd.spring.boot.web.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import hd.spring.boot.web.app.HdWebAppApplication;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@AutoConfigureMockMvc
@SpringBootTest(classes = HdWebAppApplication.class)
public class HdWebAppApplicationTests {
	private MockMvc					mvc;
	@Autowired
	private WebApplicationContext	context;

	@Before
	public void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hello/index")).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello World"));

		/*
		 * MockHttpServletRequestBuilder mockHttpServletRequestBuilder =
		 * MockMvcRequestBuilders.get("/hello/index");
		 * mvc.perform(mockHttpServletRequestBuilder.accept(MediaType.APPLICATION_JSON))
		 * .andExpect(status().isOk())
		 * .andExpect(content().string(equalTo("Hello World")));
		 */
	}
}
