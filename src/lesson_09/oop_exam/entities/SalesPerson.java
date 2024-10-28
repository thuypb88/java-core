package lesson_09.oop_exam.entities;

public class SalesPerson extends Person{
    private static int autoId;
    private String id;
    private String contractDate;

    public SalesPerson(String name, String address, String phone, String contractDate) {
        super(name, address, phone);
        this.id =  String.format("%04d", ++autoId) ;
        this.contractDate = contractDate;
    }

    public boolean getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    @Override
    public String toString() {
        return "Salesperson{" +
                "id=" + id +
                ", contractDate='" + contractDate + '\'' +
                '}';
    }
}
