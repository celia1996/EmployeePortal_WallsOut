/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entities.Delayedqueue;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Celia Navarro Pérez
 */
@Stateless
public class DelayedqueueFacade extends AbstractFacade<Delayedqueue> {

    @PersistenceContext(unitName = "EmployeePortal-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DelayedqueueFacade() {
        super(Delayedqueue.class);
    }
    
}
