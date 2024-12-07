package org.example;
import java.util.Arrays;
public class Banker {
    private String Fname;
    private String Lname;
    private String id;
    private String address;
    private String Telephone;
    private Saver[] clientsss;
    public Banker(String Fname, String Lname, String id, String address, String Telephone, Saver[] clientsss) {
        this.Fname = Fname;        this.Lname = Lname;
        this.id = id;
        this.address = address;
        this.Telephone = Telephone;

        this.clientsss = clientsss;
    }
    @Override
    public String toString() {
        return "Banker{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", Telephone='" + Telephone + '\'' +
                ", clientsss=" + Arrays.toString(clientsss) +
                '}';
    }
    public void print() {
        System.out.println(this);
    }
    public void printingClients() {
        if (clientsss == null || clientsss.length == 0) {
            System.out.println("You have no clients to display.");
            return;
        }
        System.out.println("Clients of the Banker " + Fname + " " + Lname + ":");
        for (Saver client : clientsss) {
            client.print();
        }
    }
}
