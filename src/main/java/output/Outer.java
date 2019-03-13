package output;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import model.Punkt;
import utils.Writer;
import utils.XMLwriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Outer {
    private List<BaseOut> output;
    private double average;
    private String currency;

    public List<BaseOut> getOutput() {
        return output;
    }

    public void setOutput(List<BaseOut> output) {
        this.output = output;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Outer() {
        output = new ArrayList<>();
    }

    private int calculateAverage()
    {
        int avg=0;
        for (BaseOut bo : output)
        {
            avg+=bo.getBuyPrice();
        }
        avg/=output.size();
        return avg;
    }

    private void init(List<Punkt> data, String currency)
    {
        for (Punkt p: data)
        {
            BaseOut bo = new BaseOut(p,currency);
            output.add(bo);
        }
        this.average = calculateAverage();
        this.currency = currency;
    }

    public void buildJson(List<Punkt> data, String currency) throws IOException {
        init(data, currency);
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(this);

        Writer writer = new Writer("JsonOutput","json");
        writer.write(json);
        writer.close();
    }

    public void buildXML(List<Punkt> data, String currency) throws IOException {
        init(data, currency);
        XMLwriter xml = new XMLwriter();
        xml.writePunkts(output,this.average,currency);
        String result = xml.getOutput();
        Writer writer = new Writer("XMLoutput","xml");
        writer.write(result);
        writer.close();
    }
}
