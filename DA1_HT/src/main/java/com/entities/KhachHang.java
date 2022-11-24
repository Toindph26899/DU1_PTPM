/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entities;

import java.io.Serializable;
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
@Table(name = "KhachHang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KhachHang.findAll", query = "SELECT k FROM KhachHang k"),
    @NamedQuery(name = "KhachHang.findById", query = "SELECT k FROM KhachHang k WHERE k.id = :id"),
    @NamedQuery(name = "KhachHang.findByMa", query = "SELECT k FROM KhachHang k WHERE k.ma = :ma"),
    @NamedQuery(name = "KhachHang.findByTen", query = "SELECT k FROM KhachHang k WHERE k.ten = :ten"),
    @NamedQuery(name = "KhachHang.findBySdt", query = "SELECT k FROM KhachHang k WHERE k.sdt = :sdt"),
    @NamedQuery(name = "KhachHang.findByNgaySinh", query = "SELECT k FROM KhachHang k WHERE k.ngaySinh = :ngaySinh"),
    @NamedQuery(name = "KhachHang.findByDiaChi", query = "SELECT k FROM KhachHang k WHERE k.diaChi = :diaChi"),
    @NamedQuery(name = "KhachHang.findByGioiTinh", query = "SELECT k FROM KhachHang k WHERE k.gioiTinh = :gioiTinh"),
    @NamedQuery(name = "KhachHang.findByTrangThai", query = "SELECT k FROM KhachHang k WHERE k.trangThai = :trangThai"),
    @NamedQuery(name = "KhachHang.findByGhiChu", query = "SELECT k FROM KhachHang k WHERE k.ghiChu = :ghiChu"),
    @NamedQuery(name = "KhachHang.findBySoLanMua", query = "SELECT k FROM KhachHang k WHERE k.soLanMua = :soLanMua")})
public class KhachHang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "Sdt")
    private String sdt;
    @Column(name = "NgaySinh")
    @Temporal(TemporalType.DATE)
    private Date ngaySinh;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "GioiTinh")
    private Integer gioiTinh;
    @Column(name = "TrangThai")
    private Integer trangThai;
    @Column(name = "GhiChu")
    private String ghiChu;
    @Column(name = "SoLanMua")
    private Integer soLanMua;
    @OneToMany(mappedBy = "idKH")
    private List<HoaDon> hoaDonList;

    public KhachHang() {
    }

    public KhachHang(String id) {
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Integer getSoLanMua() {
        return soLanMua;
    }

    public void setSoLanMua(Integer soLanMua) {
        this.soLanMua = soLanMua;
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
        if (!(object instanceof KhachHang)) {
            return false;
        }
        KhachHang other = (KhachHang) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", sdt=" + sdt + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", trangThai=" + trangThai + ", ghiChu=" + ghiChu + ", soLanMua=" + soLanMua + ", hoaDonList=" + hoaDonList + '}';
    }

    
    
}
