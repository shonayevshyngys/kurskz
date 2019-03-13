package output;

import model.Punkt;

import java.util.Date;

public class BaseOut {
    private String name;
    private String date;
    private String currency;
    private double buyPrice;
    private double sellPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public BaseOut(String name, String date, String currency, double buyPrice, double sellPrice) {
        this.name = name;
        this.date = date;
        this.currency = currency;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    public BaseOut(Punkt p, String currency)
    {
        this.name = p.getName();
        this.date = p.getDate();
        this.currency = currency;
        this.buyPrice = p.getData().get(currency)[0];
        this.sellPrice = p.getData().get(currency)[1];
    }
}
