package com.eduellery.reportaggregation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class WebLayerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.
                perform(get("/something")).
                andDo(print()).
                andExpect(status().isOk()).
                andExpect(content().string(containsString("{\"name\":\"Apple\",\"value\":1.3,\"description\":\"Just an apple\"},{\"name\":\"iPhone\",\"value\":999.0,\"description\":\"Just a product from Apple\"},{\"name\":\"Apple Inc\",\"value\":3.0E12,\"description\":\"Apple market value\"}")));
    }
}