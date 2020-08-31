/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Celia Navarro Pérez
 */
@Entity
@Table(name = "QUEUE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Queue.findAll", query = "SELECT q FROM Queue q")
    , @NamedQuery(name = "Queue.findByEmployeeid", query = "SELECT q FROM Queue q WHERE q.employeeid = :employeeid")
    , @NamedQuery(name = "Queue.findByAppoinmentturnid", query = "SELECT q FROM Queue q WHERE q.appoinmentturnid = :appoinmentturnid")
    , @NamedQuery(name = "Queue.findByPhonenumber", query = "SELECT q FROM Queue q WHERE q.phonenumber = :phonenumber")
    , @NamedQuery(name = "Queue.findByLocationid", query = "SELECT q FROM Queue q WHERE q.locationid = :locationid")
    , @NamedQuery(name = "Queue.findByTime", query = "SELECT q FROM Queue q WHERE q.time = :time")})
public class Queue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPLOYEEID")
    private int employeeid;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "APPOINMENTTURNID")
    private Integer appoinmentturnid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PHONENUMBER")
    private int phonenumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LOCATIONID")
    private int locationid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIME")
    @Temporal(TemporalType.TIME)
    private Date time;

    public Queue() {
    }

    public Queue(Integer appoinmentturnid) {
        this.appoinmentturnid = appoinmentturnid;
    }

    public Queue(Integer appoinmentturnid, int employeeid, int phonenumber, int locationid, Date time) {
        this.appoinmentturnid = appoinmentturnid;
        this.employeeid = employeeid;
        this.phonenumber = phonenumber;
        this.locationid = locationid;
        this.time = time;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public Integer getAppoinmentturnid() {
        return appoinmentturnid;
    }

    public void setAppoinmentturnid(Integer appoinmentturnid) {
        this.appoinmentturnid = appoinmentturnid;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getLocationid() {
        return locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appoinmentturnid != null ? appoinmentturnid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Queue)) {
            return false;
        }
        Queue other = (Queue) object;
        if ((this.appoinmentturnid == null && other.appoinmentturnid != null) || (this.appoinmentturnid != null && !this.appoinmentturnid.equals(other.appoinmentturnid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "control.Queue[ appoinmentturnid=" + appoinmentturnid + " ]";
    }
    
}
