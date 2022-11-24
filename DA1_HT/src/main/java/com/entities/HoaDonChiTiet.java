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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "HoaDonChiTiet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HoaDonChiTiet.findAll", query = "SELECT h FROM HoaDonChiTiet h"),
    @NamedQuery(name = "HoaDonChiTiet.findById", query = "SELECT h FROM HoaDonChiTiet h WHERE h.id = :id"),
    @NamedQuery(name = "HoaDonChiTiet.findBySoLuong", query = "SELECT h FROM HoaDonChiTiet h WHERE h.soLuong = :soLuong"),
    @NamedQuery(name = "HoaDonChiTiet.findByDonGia", query = "SELECT h FROM HoaDonChiTiet h WHERE h.donGia = :donGia"),
    @NamedQuery(name = "HoaDonChiTiet.findByTrangThai", query = "SELECT h FROM HoaDonChiTiet h WHERE h.trangThai = :trangThai")})
public class HoaDonChiTiet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "SoLuong")
    private Integer soLuong;
    @Column(name = "DonGia")
    private BigInteger donGia;
    @Column(name = "TrangThai")
    private Integer trangThai;
    @OneToMany(mappedBy = "idHoaDonCT")
    private List<ImeiDaBan> imeiDaBanList;
    @JoinColumn(name = "IdChiTietSP", referencedColumnName = "Id")
    @ManyToOne
    private ChiTietSP idChiTietSP;
    @JoinColumn(name = "IdHoaDon", referencedColumnName = "Id")
    @ManyToOne
    private HoaDon idHoaDon;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigInteger getDonGia() {
        return donGia;
    }

    public void setDonGia(BigInteger donGia) {
        this.donGia = donGia;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @XmlTransient
    public List<ImeiDaBan> getImeiDaBanList() {
        return imeiDaBanList;
    }

    public void setImeiDaBanList(List<ImeiDaBan> imeiDaBanList) {
        this.imeiDaBanList = imeiDaBanList;
    }

    public ChiTietSP getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(ChiTietSP idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public HoaDon getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(HoaDon idHoaDon) {
        this.idHoaDon = idHoaDon;
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
        if (!(object instanceof HoaDonChiTiet)) {
            return false;
        }
        HoaDonChiTiet other = (HoaDonChiTiet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "id=" + id + ", soLuong=" + soLuong + ", donGia=" + donGia + ", trangThai=" + trangThai + ", imeiDaBanList=" + imeiDaBanList + ", idChiTietSP=" + idChiTietSP + ", idHoaDon=" + idHoaDon + '}';
    }

    
    
}
