import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public final class Connection {
    private static Connection con;
    private static HttpURLConnection connection;
    private Connection(){}
    public static double getPrice(String cur) {

        return  -1.0;
    }
}
