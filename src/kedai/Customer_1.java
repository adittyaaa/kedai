/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kedai;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "customer", catalog = "db_java", schema = "")
@NamedQueries({
    @NamedQuery(name = "Customer_1.findAll", query = "SELECT c FROM Customer_1 c")
    , @NamedQuery(name = "Customer_1.findByIdCust", query = "SELECT c FROM Customer_1 c WHERE c.idCust = :idCust")
    , @NamedQuery(name = "Customer_1.findByNama", query = "SELECT c FROM Customer_1 c WHERE c.nama = :nama")
    , @NamedQuery(name = "Customer_1.findByDates", query = "SELECT c FROM Customer_1 c WHERE c.dates = :dates")})
public class Customer_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cust")
    private Integer idCust;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "dates")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dates;

    public Customer_1() {
    }

    public Customer_1(Integer idCust) {
        this.idCust = idCust;
    }

    public Customer_1(Integer idCust, String nama, Date dates) {
        this.idCust = idCust;
        this.nama = nama;
        this.dates = dates;
    }

    public Integer getIdCust() {
        return idCust;
    }

    public void setIdCust(Integer idCust) {
        Integer oldIdCust = this.idCust;
        this.idCust = idCust;
        changeSupport.firePropertyChange("idCust", oldIdCust, idCust);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        Date oldDates = this.dates;
        this.dates = dates;
        changeSupport.firePropertyChange("dates", oldDates, dates);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCust != null ? idCust.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer_1)) {
            return false;
        }
        Customer_1 other = (Customer_1) object;
        if ((this.idCust == null && other.idCust != null) || (this.idCust != null && !this.idCust.equals(other.idCust))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kedai.Customer_1[ idCust=" + idCust + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
