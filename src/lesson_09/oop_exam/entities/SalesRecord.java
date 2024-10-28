package lesson_09.oop_exam.entities;

import java.util.ArrayList;

public class SalesRecord  {
    private SalesPerson salesPerson;
    private ArrayList<Product> products = new ArrayList<>();
    String saleDate;

    public SalesRecord(SalesPerson salesPerson, ArrayList<Product> products, String saleDate) {
        this.salesPerson = salesPerson;
        this.products = products;
        this.saleDate = saleDate;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "SalesRecord{" +
                "salesPerson=" + salesPerson +
                ", products=" + products +
                '}';
    }
}
