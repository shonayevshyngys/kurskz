
import model.Punkt;
import output.Outer;
import utils.JsonUtil;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        List<Punkt> data = JsonUtil.getValues();
        Outer jo = new Outer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to kurs.kz");
        System.out.println("Please type in the currency (i.e USD, RUB or EUR)");
        String currency = sc.next();
        System.out.println("Now please enter extension of report (i.e. json or xml)");
        String type = sc.next();
        if (type.equalsIgnoreCase("json"))
        {
            jo.buildJson(data,currency);
        }
        if (type.equalsIgnoreCase("xml")) {
            jo.buildXML(data, currency);
        }

    }
}
