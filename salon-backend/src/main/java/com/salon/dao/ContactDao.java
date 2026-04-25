package com.salon.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.salon.model.ContactForm;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class ContactDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveContact(ContactForm contact) {
        String sql = "INSERT INTO contacts (name, email, message) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, contact.getName(), contact.getEmail(), contact.getMessage());
    }
}
