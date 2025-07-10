package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    // Exercise 1: Mocking and Stubbing
    @Test
    public void testExternalApi(){
        // Step 1: Creating a mock object for the external API
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Stubbing the methods to return pre-defined values
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Using the mock object created
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    // Exercise 2: Verifying Interactions 
    @Test
    public void testVerifyInteraction() {
        // Step 1: Creating a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        // Step 2: Calling the method with arguments
        service.processAndSend("Hello World");

        // Step 3: Verifying the interaction
        verify(mockApi).sendData("Hello World");
    }
}