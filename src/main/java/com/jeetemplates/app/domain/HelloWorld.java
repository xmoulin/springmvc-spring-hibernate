/**
 * 
 */
package com.jeetemplates.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.jeetemplates.app.common.domain.BusinessEntity;

/**
 * Hello entity.
 * 
 * @author jeetemplates
 */
@Entity
@Table(name = "HELLO_WORLD")
public class HelloWorld extends BusinessEntity {

    /**
     * Serial UID.
     */
    private static final long serialVersionUID = 1874597988200405724L;

    /**
     * Last name.
     */
    private String lastName;

    /**
     * First name.
     */
    private String firstName;

    /**
     * Email.
     */
    private String email;

    /**
     * Default constructor.
     */
    public HelloWorld() {

    }

    /**
     * Constructor with parameters
     * 
     * @param lastName
     *            : last name
     * @param firstName
     *            : first name
     * @param email
     *            : email
     */
    public HelloWorld(String lastName, String firstName, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    /**
     * @return the lastName
     */
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the email
     */
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
