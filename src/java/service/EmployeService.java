/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.math.BigInteger;
import java.util.List;
import entities.Employe;
import util.HibernateUtil;
import org.hibernate.Session;


public class EmployeService extends AbstractFacade<Employe> {

    @Override
    protected Class<Employe>getEntityClass() {
        return Employe.class;
    }}
    
    