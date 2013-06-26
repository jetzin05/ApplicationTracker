package form.model;
import java.util.Date;

public class Customer {

    public long customerID;
    public String name;
    public String address;
    public Date created_date;

    /**
     * @return the customerID
     */
    public long getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID
     *            the customerID to set
     */
    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the created_date
     */
    public Date getCreated_date() {
        return created_date;
    }

    /**
     * @param created_date
     *            the created_date to set
     */
    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

}
