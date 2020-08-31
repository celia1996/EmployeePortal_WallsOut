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
@Table(name = "APPOINTMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appointment.findAll", query = "SELECT a FROM Appointment a")
    , @NamedQuery(name = "Appointment.findByAppointmentid", query = "SELECT a FROM Appointment a WHERE a.appointmentid = :appointmentid")
    , @NamedQuery(name = "Appointment.findByAvailability", query = "SELECT a FROM Appointment a WHERE a.availability = :availability")
    , @NamedQuery(name = "Appointment.findByUserid", query = "SELECT a FROM Appointment a WHERE a.userid = :userid")
    , @NamedQuery(name = "Appointment.findByLocationid", query = "SELECT a FROM Appointment a WHERE a.locationid = :locationid")
    , @NamedQuery(name = "Appointment.findByEmployeeid", query = "SELECT a FROM Appointment a WHERE a.employeeid = :employeeid")
    , @NamedQuery(name = "Appointment.findByCategoryid", query = "SELECT a FROM Appointment a WHERE a.categoryid = :categoryid")
    , @NamedQuery(name = "Appointment.findByDate", query = "SELECT a FROM Appointment a WHERE a.date = :date")
    , @NamedQuery(name = "Appointment.findByTime", query = "SELECT a FROM Appointment a WHERE a.time = :time")})
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "APPOINTMENTID")
    private Integer appointmentid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AVAILABILITY")
    private int availability;
    @Column(name = "USERID")
    private Integer userid;
    @Column(name = "LOCATIONID")
    private Integer locationid;
    @Column(name = "EMPLOYEEID")
    private Integer employeeid;
    @Column(name = "CATEGORYID")
    private Integer categoryid;
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "TIME")
    @Temporal(TemporalType.TIME)
    private Date time;

    public Appointment() {
    }

    public Appointment(Integer appointmentid) {
        this.appointmentid = appointmentid;
    }

    public Appointment(Integer appointmentid, int availability) {
        this.appointmentid = appointmentid;
        this.availability = availability;
    }

    public Integer getAppointmentid() {
        return appointmentid;
    }

    public void setAppointmentid(Integer appointmentid) {
        this.appointmentid = appointmentid;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        hash += (appointmentid != null ? appointmentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appointment)) {
            return false;
        }
        Appointment other = (Appointment) object;
        if ((this.appointmentid == null && other.appointmentid != null) || (this.appointmentid != null && !this.appointmentid.equals(other.appointmentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "control.Appointment[ appointmentid=" + appointmentid + " ]";
    }
    
}
