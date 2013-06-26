package form.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.sql.DataSource;


public class CustomerBean {


    private DataSource ds;

    public List<Customer> getApplicationList() throws SQLException {


        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/webeng_project","root", "root");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }


        if (ds == null)
            throw new SQLException("Can't get data source");

        // get database connection
        Connection con = ds.getConnection();

        if (con == null)
            throw new SQLException("Can't get database connection");

        PreparedStatement ps = con
                .prepareStatement("select customer_id, name, address, created_date from customer");

        // get customer data from database
        ResultSet result = ps.executeQuery();

        List<Customer> list = new ArrayList<Customer>();

        while (result.next()) {
            Customer cust = new Customer();

            cust.setCustomerID(result.getLong("customer_id"));
            cust.setName(result.getString("name"));
            cust.setAddress(result.getString("address"));
            cust.setCreated_date(result.getDate("created_date"));

            // store all data into a List
            list.add(cust);
        }

        return list;
    }
}
