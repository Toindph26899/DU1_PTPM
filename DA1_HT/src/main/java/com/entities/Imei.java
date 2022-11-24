/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author os
 */
@Entity
@Table(name = "Imei")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imei.findAll", query = "SELECT i FROM Imei i"),
    @NamedQuery(name = "Imei.findById", query = "SELECT i FROM Imei i WHERE i.id = :id"),
    @NamedQuery(name = "Imei.findByMa", query = "SELECT i FROM Imei i WHERE i.ma = :ma"),
    @NamedQuery(name = "Imei.findBySoImei", query = "SELECT i FROM Imei i WHERE i.soImei = :soImei")})
public class Imei implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "SoImei")
    private BigInteger soImei;
    @OneToMany(mappedBy = "idImei")
    private List<ChiTietSP> chiTietSPList;

    public Imei() {
    }

    public Imei(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public BigInteger getSoImei() {
        return soImei;
    }

    public void setSoImei(BigInteger soImei) {
        this.soImei = soImei;
    }

    @XmlTransient
    public List<ChiTietSP> getChiTietSPList() {
        return chiTietSPList;
    }

    public void setChiTietSPList(List<ChiTietSP> chiTietSPList) {
        this.chiTietSPList = chiTietSPList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imei)) {
            return false;
        }
        Imei other = (Imei) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Imei{" + "id=" + id + ", ma=" + ma + ", soImei=" + soImei + ", chiTietSPList=" + chiTietSPList + '}';
    }

    
    
}
