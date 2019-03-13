package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Punkt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JsonUtil {

    public static List<Punkt> getValues() throws IOException, InterruptedException {
        Writer writer = new Writer("data","json");
        KursFetcher kf = new KursFetcher();
        writer.write(kf.fetch());
        writer.close();

        byte[] jsonData = Files.readAllBytes(Paths.get(writer.getFilePath()));
        ObjectMapper objectMapper = new ObjectMapper();
        List<Punkt> punkts = Arrays.asList(objectMapper.readValue(jsonData,Punkt[].class));
        normalize(punkts);
        return punkts;
    }

    private static void normalize(List<Punkt> punkts)
    {
        for(Punkt p: punkts)
        {
            p.setName(org.apache.commons.lang3.StringEscapeUtils.unescapeJava(p.getName()));
            p.setCity(org.apache.commons.lang3.StringEscapeUtils.unescapeJava(p.getCity()));
            p.setAddress(org.apache.commons.lang3.StringEscapeUtils.unescapeJava(p.getAddress()));
            p.setPhone(org.apache.commons.lang3.StringEscapeUtils.unescapeJava(p.getPhone()));
        }

    }
}
