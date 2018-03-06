package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RestTestApplicationTests {

	@Autowired
	private TestRestTemplate rest;

	@Test
	public void shouldReturnGreeting() throws Exception {
		assertThat(this.rest.getForObject("/hello/Rod", String.class))
				.isEqualTo("Hello Rod!");
	}

	@Test
	public void shouldNotFindGreetingElsewhere() throws Exception {
		assertThat(this.rest.getForEntity("/hey/man", String.class).getStatusCode())
				.isEqualTo(HttpStatus.NOT_FOUND);
	}

}
