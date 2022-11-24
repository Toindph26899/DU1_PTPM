/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author os
 */
@Entity
@Table(name = "GiamGia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GiamGia.findAll", query = "SELECT g FROM GiamGia g"),
    @NamedQuery(name = "GiamGia.findById", query = "SELECT g FROM GiamGia g WHERE g.id = :id"),
    @NamedQuery(name = "GiamGia.findByMa", query = "SELECT g FROM GiamGia g WHERE g.ma = :ma"),
    @NamedQuery(name = "GiamGia.findByTenCT", query = "SELECT g FROM GiamGia g WHERE g.tenCT = :tenCT"),
    @NamedQuery(name = "GiamGia.findBySoTienGiam", query = "SELECT g FROM GiamGia g WHERE g.soTienGiam = :soTienGiam"),
    @NamedQuery(name = "GiamGia.findByNgayTao", query = "SELECT g FROM GiamGia g WHERE g.ngayTao = :ngayTao"),
    @NamedQuery(name = "GiamGia.findByNgayDienRa", query = "SELECT g FROM GiamGia g WHERE g.ngayDienRa = :ngayDienRa"),
    @NamedQuery(name = "GiamGia.findByNgayKetThuc", query = "SELECT g FROM GiamGia g WHERE g.ngayKetThuc = :ngayKetThuc")})
public class GiamGia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "TenCT")
    private String tenCT;
    @Column(name = "SoTienGiam")
    private BigInteger soTienGiam;
    @Column(name = "NgayTao")
    @Temporal(TemporalType.DATE)
    private Date ngayTao;
    @Column(name = "NgayDienRa")
    @Temporal(TemporalType.DATE)
    private Date ngayDienRa;
    @Column(name = "NgayKetThuc")
    @Temporal(TemporalType.DATE)
    private Date ngayKetThuc;
    @OneToMany(mappedBy = "idGiamGia")
    private List<HoaDon> hoaDonList;

    public GiamGia() {
    }

    public GiamGia(String id) {
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

    public String getTenCT() {
        return tenCT;
    }

    public void setTenCT(String tenCT) {
        this.tenCT = tenCT;
    }

    public BigInteger getSoTienGiam() {
        return soTienGiam;
    }

    public void setSoTienGiam(BigInteger soTienGiam) {
        this.soTienGiam = soTienGiam;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayDienRa() {
        return ngayDienRa;
    }

    public void setNgayDienRa(Date ngayDienRa) {
        this.ngayDienRa = ngayDienRa;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    @XmlTransient
    public List<HoaDon> getHoaDonList() {
        return hoaDonList;
    }

    public void setHoaDonList(List<HoaDon> hoaDonList) {
        this.hoaDonList = hoaDonList;
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
        if (!(object instanceof GiamGia)) {
            return false;
        }
        GiamGia other = (GiamGia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GiamGia{" + "id=" + id + ", ma=" + ma + ", tenCT=" + tenCT + ", soTienGiam=" + soTienGiam + ", ngayTao=" + ngayTao + ", ngayDienRa=" + ngayDienRa + ", ngayKetThuc=" + ngayKetThuc + ", hoaDonList=" + hoaDonList + '}';
    }

    
    
}
