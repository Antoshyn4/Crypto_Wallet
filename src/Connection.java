import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public final class Connection {
    private static Connection instance;
    private static HttpURLConnection connection;
    private Connection(){}
    public static double getPrice(String cur) {
        double price = -1;
        try {
            URL url = new URL("https://api.currencyfreaks.com/latest?apikey=b2b2ddfa822841c091ec0543840ac9dc&symbols=" + cur);
            connection = (HttpURLConnection) url.openConnection();


            BufferedReader reader;
            StringBuffer responsecontent = new StringBuffer();
            String line;


            if (connection.getResponseCode() > 299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null){
                    responsecontent.append(line);
                }
                reader.close();
            }
            else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null){
                    responsecontent.append(line);
                }
                reader.close();
                price = 1.0/Double.parseDouble(responsecontent.toString().substring(responsecontent.indexOf(cur) + 7, responsecontent.indexOf(cur) + 15));
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            connection.disconnect();
        }


        return  price;
    }
}
