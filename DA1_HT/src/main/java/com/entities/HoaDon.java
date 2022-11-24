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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "HoaDon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HoaDon.findAll", query = "SELECT h FROM HoaDon h"),
    @NamedQuery(name = "HoaDon.findById", query = "SELECT h FROM HoaDon h WHERE h.id = :id"),
    @NamedQuery(name = "HoaDon.findByMa", query = "SELECT h FROM HoaDon h WHERE h.ma = :ma"),
    @NamedQuery(name = "HoaDon.findByNgayTao", query = "SELECT h FROM HoaDon h WHERE h.ngayTao = :ngayTao"),
    @NamedQuery(name = "HoaDon.findByNgayThanhToan", query = "SELECT h FROM HoaDon h WHERE h.ngayThanhToan = :ngayThanhToan"),
    @NamedQuery(name = "HoaDon.findByNgayShip", query = "SELECT h FROM HoaDon h WHERE h.ngayShip = :ngayShip"),
    @NamedQuery(name = "HoaDon.findByTienShip", query = "SELECT h FROM HoaDon h WHERE h.tienShip = :tienShip"),
    @NamedQuery(name = "HoaDon.findByTienCoc", query = "SELECT h FROM HoaDon h WHERE h.tienCoc = :tienCoc"),
    @NamedQuery(name = "HoaDon.findByNgayNhan", query = "SELECT h FROM HoaDon h WHERE h.ngayNhan = :ngayNhan"),
    @NamedQuery(name = "HoaDon.findByTenKh", query = "SELECT h FROM HoaDon h WHERE h.tenKh = :tenKh"),
    @NamedQuery(name = "HoaDon.findBySdtNguoiNhan", query = "SELECT h FROM HoaDon h WHERE h.sdtNguoiNhan = :sdtNguoiNhan"),
    @NamedQuery(name = "HoaDon.findBySdtNguoiShip", query = "SELECT h FROM HoaDon h WHERE h.sdtNguoiShip = :sdtNguoiShip"),
    @NamedQuery(name = "HoaDon.findByTenNguoiShip", query = "SELECT h FROM HoaDon h WHERE h.tenNguoiShip = :tenNguoiShip"),
    @NamedQuery(name = "HoaDon.findByMaVanChuyen", query = "SELECT h FROM HoaDon h WHERE h.maVanChuyen = :maVanChuyen"),
    @NamedQuery(name = "HoaDon.findByTinhTrang", query = "SELECT h FROM HoaDon h WHERE h.tinhTrang = :tinhTrang"),
    @NamedQuery(name = "HoaDon.findBySoTienGiam", query = "SELECT h FROM HoaDon h WHERE h.soTienGiam = :soTienGiam")})
public class HoaDon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "NgayTao")
    @Temporal(TemporalType.DATE)
    private Date ngayTao;
    @Column(name = "NgayThanhToan")
    @Temporal(TemporalType.DATE)
    private Date ngayThanhToan;
    @Column(name = "NgayShip")
    @Temporal(TemporalType.DATE)
    private Date ngayShip;
    @Column(name = "TienShip")
    private BigInteger tienShip;
    @Column(name = "TienCoc")
    private BigInteger tienCoc;
    @Column(name = "NgayNhan")
    private BigInteger ngayNhan;
    @Column(name = "TenKh")
    private String tenKh;
    @Column(name = "SdtNguoiNhan")
    private String sdtNguoiNhan;
    @Column(name = "SdtNguoiShip")
    private String sdtNguoiShip;
    @Column(name = "TenNguoiShip")
    private String tenNguoiShip;
    @Column(name = "MaVanChuyen")
    private String maVanChuyen;
    @Column(name = "TinhTrang")
    private Integer tinhTrang;
    @Column(name = "SoTienGiam")
    private BigInteger soTienGiam;
    @JoinColumn(name = "IdGiamGia", referencedColumnName = "Id")
    @ManyToOne
    private GiamGia idGiamGia;
    @JoinColumn(name = "IdKH", referencedColumnName = "Id")
    @ManyToOne
    private KhachHang idKH;
    @JoinColumn(name = "IdNhanVien", referencedColumnName = "Id")
    @ManyToOne
    private NhanVien idNhanVien;
    @OneToMany(mappedBy = "idHoaDon")
    private List<HoaDonChiTiet> hoaDonChiTietList;

    public HoaDon() {
    }

    public HoaDon(String id) {
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

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Date getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(Date ngayShip) {
        this.ngayShip = ngayShip;
    }

    public BigInteger getTienShip() {
        return tienShip;
    }

    public void setTienShip(BigInteger tienShip) {
        this.tienShip = tienShip;
    }

    public BigInteger getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(BigInteger tienCoc) {
        this.tienCoc = tienCoc;
    }

    public BigInteger getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(BigInteger ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getSdtNguoiNhan() {
        return sdtNguoiNhan;
    }

    public void setSdtNguoiNhan(String sdtNguoiNhan) {
        this.sdtNguoiNhan = sdtNguoiNhan;
    }

    public String getSdtNguoiShip() {
        return sdtNguoiShip;
    }

    public void setSdtNguoiShip(String sdtNguoiShip) {
        this.sdtNguoiShip = sdtNguoiShip;
    }

    public String getTenNguoiShip() {
        return tenNguoiShip;
    }

    public void setTenNguoiShip(String tenNguoiShip) {
        this.tenNguoiShip = tenNguoiShip;
    }

    public String getMaVanChuyen() {
        return maVanChuyen;
    }

    public void setMaVanChuyen(String maVanChuyen) {
        this.maVanChuyen = maVanChuyen;
    }

    public Integer getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Integer tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public BigInteger getSoTienGiam() {
        return soTienGiam;
    }

    public void setSoTienGiam(BigInteger soTienGiam) {
        this.soTienGiam = soTienGiam;
    }

    public GiamGia getIdGiamGia() {
        return idGiamGia;
    }

    public void setIdGiamGia(GiamGia idGiamGia) {
        this.idGiamGia = idGiamGia;
    }

    public KhachHang getIdKH() {
        return idKH;
    }

    public void setIdKH(KhachHang idKH) {
        this.idKH = idKH;
    }

    public NhanVien getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(NhanVien idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    @XmlTransient
    public List<HoaDonChiTiet> getHoaDonChiTietList() {
        return hoaDonChiTietList;
    }

    public void setHoaDonChiTietList(List<HoaDonChiTiet> hoaDonChiTietList) {
        this.hoaDonChiTietList = hoaDonChiTietList;
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
        if (!(object instanceof HoaDon)) {
            return false;
        }
        HoaDon other = (HoaDon) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", ma=" + ma + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", ngayShip=" + ngayShip + ", tienShip=" + tienShip + ", tienCoc=" + tienCoc + ", ngayNhan=" + ngayNhan + ", tenKh=" + tenKh + ", sdtNguoiNhan=" + sdtNguoiNhan + ", sdtNguoiShip=" + sdtNguoiShip + ", tenNguoiShip=" + tenNguoiShip + ", maVanChuyen=" + maVanChuyen + ", tinhTrang=" + tinhTrang + ", soTienGiam=" + soTienGiam + ", idGiamGia=" + idGiamGia + ", idKH=" + idKH + ", idNhanVien=" + idNhanVien + ", hoaDonChiTietList=" + hoaDonChiTietList + '}';
    }

    
    
}
