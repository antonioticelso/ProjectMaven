import com.google.common.annotations.VisibleForTesting;
import conexaoJdbc.SingleConnection;
import org.junit.Test;

public class SingleConnectionTest {

    @Test
    public void initBanco() {
        SingleConnection.getConnection();
    }
}
