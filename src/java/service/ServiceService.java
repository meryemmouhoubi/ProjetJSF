/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Service;
import java.util.List;
import org.hibernate.Session;
import java.math.BigInteger;
import java.util.List;
import entities.Service;
import util.HibernateUtil;
import org.hibernate.Session;
/**
 *
 * @author Lachgar
 */
public class ServiceService extends AbstractFacade<Service> {

    @Override
    protected Class<Service> getEntityClass() {
        return Service.class;
    }
    
}
