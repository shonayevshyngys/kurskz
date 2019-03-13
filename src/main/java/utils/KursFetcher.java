package utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KursFetcher {

    private String content;
    private URLConnection connection;


    public String fetch() throws IOException, MalformedURLException, InterruptedException {
        URL url = new URL("https://kurs.kz/");
        HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
        httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
        Scanner scanner = new Scanner(httpcon.getInputStream());
        scanner.useDelimiter("\\Z");
        content = scanner.next();
        scanner.close();
        String punkts = findPunkts(content);
        //punkts = org.apache.commons.lang3.StringEscapeUtils.unescapeJava(punkts);
        httpcon.disconnect();
        return punkts;

    }

    private String findPunkts(String html)
    {
        Pattern pattern = Pattern.compile("=\\s(.*?);\\n");
        Matcher matcher = pattern.matcher(html);
        List<String> matches = new ArrayList<String>();
        while(matcher.find())
        {
            matches.add(matcher.group(1));
        }
        return (matches.get(2));
    }


}
