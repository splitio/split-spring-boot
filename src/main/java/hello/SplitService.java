package hello;

import io.split.client.SplitClient;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SplitService {

    private SplitClient _client;

    public SplitClient getClient() {
        return _client;
    }

    public void setClient(SplitClient client) {
        _client = client;
    }
}
