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
@Table(name = "DELAYEDQUEUE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Delayedqueue.findAll", query = "SELECT d FROM Delayedqueue d")
    , @NamedQuery(name = "Delayedqueue.findByEmployeeid", query = "SELECT d FROM Delayedqueue d WHERE d.employeeid = :employeeid")
    , @NamedQuery(name = "Delayedqueue.findByAppoinmentturnid", query = "SELECT d FROM Delayedqueue d WHERE d.appoinmentturnid = :appoinmentturnid")
    , @NamedQuery(name = "Delayedqueue.findByPhonenumber", query = "SELECT d FROM Delayedqueue d WHERE d.phonenumber = :phonenumber")
    , @NamedQuery(name = "Delayedqueue.findByLocationid", query = "SELECT d FROM Delayedqueue d WHERE d.locationid = :locationid")
    , @NamedQuery(name = "Delayedqueue.findByTime", query = "SELECT d FROM Delayedqueue d WHERE d.time = :time")})
public class Delayedqueue implements Serializable {

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

    public Delayedqueue() {
    }

    public Delayedqueue(Integer appoinmentturnid) {
        this.appoinmentturnid = appoinmentturnid;
    }

    public Delayedqueue(Integer appoinmentturnid, int employeeid, int phonenumber, int locationid, Date time) {
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
        if (!(object instanceof Delayedqueue)) {
            return false;
        }
        Delayedqueue other = (Delayedqueue) object;
        if ((this.appoinmentturnid == null && other.appoinmentturnid != null) || (this.appoinmentturnid != null && !this.appoinmentturnid.equals(other.appoinmentturnid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "control.Delayedqueue[ appoinmentturnid=" + appoinmentturnid + " ]";
    }
    
}
