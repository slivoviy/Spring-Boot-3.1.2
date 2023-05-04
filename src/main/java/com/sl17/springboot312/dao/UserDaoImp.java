package com.sl17.springboot312.dao;

import com.sl17.springboot312.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public void addUser(User user) {
        em.merge(user);
    }

    @Override
    public List<User> getUsers() {
        TypedQuery<User> query = em.createQuery("from User", User.class);
        return query.getResultList();
    }

    @Override
    public User getUserById(long id) {
        return em.find(User.class, id);
    }

    @Override
    public void removeUser(long id) {
        User removed = em.find(User.class, id);
        em.remove(removed);
    }

}
