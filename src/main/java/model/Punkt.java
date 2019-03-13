package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class Punkt {

    private long id;
    private String city;
    private String name;
    private String weight;
    private boolean wholesale;
    private String wholesale_text;
    private String mainaddress;
    private int gruppa;
    private String address;
    private String phone;
    private ArrayList<String> phones;
    private long date;
    private int bank;
    private Map<String,double[]> data;
    private boolean gray;
    private boolean actual;
    private boolean actualTime;
    private Workmode workmodes;
    private int mainsort;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public boolean isWholesale() {
        return wholesale;
    }

    public void setWholesale(boolean wholesale) {
        this.wholesale = wholesale;
    }

    public String getWholesale_text() {
        return wholesale_text;
    }

    public void setWholesale_text(String wholesale_text) {
        this.wholesale_text = wholesale_text;
    }

    public String getMainaddress() {
        return mainaddress;
    }

    public void setMainaddress(String mainaddress) {
        this.mainaddress = mainaddress;
    }

    public int getGruppa() {
        return gruppa;
    }

    public void setGruppa(int gruppa) {
        this.gruppa = gruppa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    public String getDate() {
        java.util.Date time=new java.util.Date(date*1000);
        String pattern = "MM/dd/yyyy HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);
        String str = df.format(time);
        return str;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public Map<String, double[]> getData() {
        return data;
    }

    public void setData(Map<String, double[]> data) {
        this.data = data;
    }

    public boolean isGray() {
        return gray;
    }

    public void setGray(boolean gray) {
        this.gray = gray;
    }

    public boolean isActual() {
        return actual;
    }

    public void setActual(boolean actual) {
        this.actual = actual;
    }

    public boolean isActualTime() {
        return actualTime;
    }

    public void setActualTime(boolean actualTime) {
        this.actualTime = actualTime;
    }

    public Workmode getWorkmodes() {
        return workmodes;
    }

    public void setWorkmodes(Workmode workmode) {
        this.workmodes = workmode;
    }

    public int getMainsort() {
        return mainsort;
    }

    public void setMainsort(int mainsort) {
        this.mainsort = mainsort;
    }

    public Punkt(long id, String city, String name, String weight, boolean wholesale, String wholesale_text, String mainaddress, int gruppa, String address, String phone, ArrayList<String> phones, long date, int bank, Map<String,double[]> data, boolean gray, boolean actual, boolean actualTime, Workmode workmode, int mainsort) {
        this.id = id;
        this.city = city;
        this.name = name;
        this.weight = weight;
        this.wholesale = wholesale;
        this.wholesale_text = wholesale_text;
        this.mainaddress = mainaddress;
        this.gruppa = gruppa;
        this.address = address;
        this.phone = phone;
        this.phones = phones;
        this.date = date;
        this.bank = bank;
        this.data = data;
        this.gray = gray;
        this.actual = actual;
        this.actualTime = actualTime;
        this.workmodes = workmode;
        this.mainsort = mainsort;
    }

    public Punkt() {

    }
}
