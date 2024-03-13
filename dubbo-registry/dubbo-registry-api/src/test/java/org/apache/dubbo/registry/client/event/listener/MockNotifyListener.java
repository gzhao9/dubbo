package org.apache.dubbo.registry.client.event.listener;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.registry.NotifyListener;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class MockNotifyListener {
    static NotifyListener getMockNotifyListener(URL consumerURL){
        NotifyListener demoServiceListener = Mockito.mock(NotifyListener.class);
        when(demoServiceListener.getConsumerUrl()).thenReturn(consumerURL);
        return demoServiceListener;
    }
}
