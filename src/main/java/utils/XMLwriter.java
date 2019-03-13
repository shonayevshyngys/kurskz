package utils;

import model.Punkt;
import output.BaseOut;

import java.util.List;

public class XMLwriter {

    String output;

    public XMLwriter() {
        this.output = "<xml>\n";
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public void writePunkts(List<BaseOut> bol, double average, String currency)
    {
        String out ="";
        out+="<Punkts>\n";
        for (BaseOut bo : bol) {
            out += "<Punkt>\n";
            out += ("<name>" + bo.getName() + "</name>\n");
            out += ("<name>" + bo.getDate() + "</name>\n");
            out += ("<name>" + bo.getCurrency() + "</name>\n");
            out += ("<name>" + bo.getBuyPrice() + "</name>\n");
            out += ("<name>" + bo.getSellPrice() + "</name>\n");
            out += "</Punkt>\n";
        }
        out+="</Punkts>\n";
        out+="<average="+average+"/>\n";
        out+="<currency="+currency+"/>\n";
        out+="</xml>";
        this.output+=out;
    }


}
