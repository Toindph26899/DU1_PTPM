/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entities;

import java.io.Serializable;
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
@Table(name = "ManHinh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ManHinh.findAll", query = "SELECT m FROM ManHinh m"),
    @NamedQuery(name = "ManHinh.findById", query = "SELECT m FROM ManHinh m WHERE m.id = :id"),
    @NamedQuery(name = "ManHinh.findByMa", query = "SELECT m FROM ManHinh m WHERE m.ma = :ma"),
    @NamedQuery(name = "ManHinh.findByTen", query = "SELECT m FROM ManHinh m WHERE m.ten = :ten")})
public class ManHinh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")
    private String ten;
    @OneToMany(mappedBy = "idManHinh")
    private List<ChiTietSP> chiTietSPList;

    public ManHinh() {
    }

    public ManHinh(String id) {
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

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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
        if (!(object instanceof ManHinh)) {
            return false;
        }
        ManHinh other = (ManHinh) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ManHinh{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", chiTietSPList=" + chiTietSPList + '}';
    }

    
    
}
