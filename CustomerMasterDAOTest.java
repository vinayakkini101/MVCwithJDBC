/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author universe
 */
public class CustomerMasterDAOTest extends BaseDAOTest {
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
   
    public void createAccount(CustomerTest c) 
    {
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerMasterDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into mysql.customer values(?,?,?,?,?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,c.getCustomerId());;
            preparedStatement.setString(2,c.getFirstName());
            preparedStatement.setString(3,c.getLastName());
            preparedStatement.setString(4,c.getDepartment());
            preparedStatement.setString(5,c.getEmail());
        
                int count = preparedStatement.executeUpdate();
                
                if(count>0)
                {
                    System.out.println("Successfully Inserted");
                }else{
                    System.out.println("insertion failed");
                }
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerMasterDAOTest.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }
    public List findCustomerByName(String name)
    {    ArrayList<CustomerTest> addlist=new ArrayList<CustomerTest>();
        
        String sql="select * from mysql.customer where firstName like '%"+name+"%'";
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerMasterDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preparedStatement=connection.prepareStatement(sql);
          
            rs=preparedStatement.executeQuery();
            while(rs.next())
            {   CustomerTest c  = new CustomerTest();
                System.out.println("test");
                c.setCustomerId(rs.getInt(1));
                c.setFirstName(rs.getString(2));
                c.setLastName(rs.getString(3));
                c.setDepartment(rs.getString(4));
                c.setEmail(rs.getString(5));
                addlist.add(c);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return addlist;
    }
    public int removeCustomerById(int id)
    {int count = 0;
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerMasterDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql="delete from mysql.customer where ID = ?";
        try {
            preparedStatement= connection.prepareStatement(sql);
          
             preparedStatement.setInt(1,id);
                count = preparedStatement.executeUpdate();
                 if(count>0)
                {
                    System.out.println("Successfully Deleted");
                }else{
                    System.out.println("Deletion failed");
                }
                
             
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
              return count;
    }
      public  boolean checkLogin(CustomerTest c)
    {
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerMasterDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select * from mysql.customer where ID=? AND Email=?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setInt(1,c.getCustomerId());
                
                preparedStatement.setString(2,c.getEmail());
            
                rs=preparedStatement.executeQuery();
                while( rs.next())
              {
              return true;
              }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         return false;
    }
}
