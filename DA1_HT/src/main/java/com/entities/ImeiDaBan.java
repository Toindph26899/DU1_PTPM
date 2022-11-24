/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author os
 */
@Entity
@Table(name = "ImeiDaBan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImeiDaBan.findAll", query = "SELECT i FROM ImeiDaBan i"),
    @NamedQuery(name = "ImeiDaBan.findById", query = "SELECT i FROM ImeiDaBan i WHERE i.id = :id"),
    @NamedQuery(name = "ImeiDaBan.findByMaImei", query = "SELECT i FROM ImeiDaBan i WHERE i.maImei = :maImei"),
    @NamedQuery(name = "ImeiDaBan.findByTrangThai", query = "SELECT i FROM ImeiDaBan i WHERE i.trangThai = :trangThai")})
public class ImeiDaBan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "MaImei")
    private String maImei;
    @Column(name = "TrangThai")
    private Integer trangThai;
    @JoinColumn(name = "idHoaDonCT", referencedColumnName = "Id")
    @ManyToOne
    private HoaDonChiTiet idHoaDonCT;

    public ImeiDaBan() {
    }

    public ImeiDaBan(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaImei() {
        return maImei;
    }

    public void setMaImei(String maImei) {
        this.maImei = maImei;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public HoaDonChiTiet getIdHoaDonCT() {
        return idHoaDonCT;
    }

    public void setIdHoaDonCT(HoaDonChiTiet idHoaDonCT) {
        this.idHoaDonCT = idHoaDonCT;
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
        if (!(object instanceof ImeiDaBan)) {
            return false;
        }
        ImeiDaBan other = (ImeiDaBan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ImeiDaBan{" + "id=" + id + ", maImei=" + maImei + ", trangThai=" + trangThai + ", idHoaDonCT=" + idHoaDonCT + '}';
    }

    
    
}
