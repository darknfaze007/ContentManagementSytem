/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentManagementSystem;

import java.sql.SQLException;

/**
 *
 * @author Kariyawasam
 */
public class Person {

    private String name;
    private String affiliationName;
    private String affiliationAddress;
    private String email;
    private String userName;
    private String passWord;
    private int typeId;
    private dbConnection con;

    //register to system
    public void register() {

        //Create database connection
        con = new dbConnection();
        String query =
                "Insert into person (PersonName, AffaliationName, AffaliationAddress, TypeId, Email, UserName, Password)VALUES(\'" +name +"\',\'" + affiliationName + "\',\'" + affiliationAddress + "\',\'"  +typeId + "\',\'"  + email + "\',\'" + userName + "\',\'" + passWord +"\')";
        try {
            con.DataManipulation(query);
        } catch (SQLException ex) {
            System.out.println(ex);
        }finally{
            con.close();
        }
        
    }

    //Login to system
    public void loginToSystem() {

    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAffiliationName() {
        return affiliationName;
    }

    public void setAffiliationName(String affiliationName) {
        this.affiliationName = affiliationName;
    }

    public String getAffiliationAddress() {
        return affiliationAddress;
    }

    public void setAffiliationAddress(String affiliationAddress) {
        this.affiliationAddress = affiliationAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

}
