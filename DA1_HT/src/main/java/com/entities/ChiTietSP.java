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
@Table(name = "ChiTietSP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChiTietSP.findAll", query = "SELECT c FROM ChiTietSP c"),
    @NamedQuery(name = "ChiTietSP.findById", query = "SELECT c FROM ChiTietSP c WHERE c.id = :id"),
    @NamedQuery(name = "ChiTietSP.findByGiaNhap", query = "SELECT c FROM ChiTietSP c WHERE c.giaNhap = :giaNhap"),
    @NamedQuery(name = "ChiTietSP.findByGiaBan", query = "SELECT c FROM ChiTietSP c WHERE c.giaBan = :giaBan"),
    @NamedQuery(name = "ChiTietSP.findByNamBH", query = "SELECT c FROM ChiTietSP c WHERE c.namBH = :namBH"),
    @NamedQuery(name = "ChiTietSP.findByMoTa", query = "SELECT c FROM ChiTietSP c WHERE c.moTa = :moTa"),
    @NamedQuery(name = "ChiTietSP.findBySoLuongTon", query = "SELECT c FROM ChiTietSP c WHERE c.soLuongTon = :soLuongTon"),
    @NamedQuery(name = "ChiTietSP.findByTrangThai", query = "SELECT c FROM ChiTietSP c WHERE c.trangThai = :trangThai")})
public class ChiTietSP implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "GiaNhap")
    private BigInteger giaNhap;
    @Column(name = "GiaBan")
    private BigInteger giaBan;
    @Column(name = "NamBH")
    private Integer namBH;
    @Column(name = "MoTa")
    private String moTa;
    @Column(name = "SoLuongTon")
    private Integer soLuongTon;
    @Column(name = "TrangThai")
    private Integer trangThai;
    @JoinColumn(name = "IdImei", referencedColumnName = "Id")
    @ManyToOne
    private Imei idImei;
    @JoinColumn(name = "IdCamera", referencedColumnName = "Id")
    @ManyToOne
    private Camera idCamera;
    @JoinColumn(name = "IdChipse", referencedColumnName = "Id")
    @ManyToOne
    private Chipse idChipse;
    @JoinColumn(name = "IdXuatXu", referencedColumnName = "Id")
    @ManyToOne
    private XuatXu idXuatXu;
    @JoinColumn(name = "IdDongSP", referencedColumnName = "Id")
    @ManyToOne
    private DongSP idDongSP;
    @JoinColumn(name = "IdManHinh", referencedColumnName = "Id")
    @ManyToOne
    private ManHinh idManHinh;
    @JoinColumn(name = "IdMauSac", referencedColumnName = "Id")
    @ManyToOne
    private MauSac idMauSac;
    @JoinColumn(name = "IdPhanLoaiHang", referencedColumnName = "Id")
    @ManyToOne
    private PhanLoaiHang idPhanLoaiHang;
    @JoinColumn(name = "IdPin", referencedColumnName = "Id")
    @ManyToOne
    private Pin idPin;
    @JoinColumn(name = "IdRam", referencedColumnName = "Id")
    @ManyToOne
    private Ram idRam;
    @JoinColumn(name = "IdRom", referencedColumnName = "Id")
    @ManyToOne
    private Rom idRom;
    @JoinColumn(name = "IdSP", referencedColumnName = "Id")
    @ManyToOne
    private SanPham idSP;
    @OneToMany(mappedBy = "idChiTietSP")
    private List<HoaDonChiTiet> hoaDonChiTietList;

    public ChiTietSP() {
    }

    public ChiTietSP(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigInteger getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigInteger giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigInteger getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigInteger giaBan) {
        this.giaBan = giaBan;
    }

    public Integer getNamBH() {
        return namBH;
    }

    public void setNamBH(Integer namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public Imei getIdImei() {
        return idImei;
    }

    public void setIdImei(Imei idImei) {
        this.idImei = idImei;
    }

    public Camera getIdCamera() {
        return idCamera;
    }

    public void setIdCamera(Camera idCamera) {
        this.idCamera = idCamera;
    }

    public Chipse getIdChipse() {
        return idChipse;
    }

    public void setIdChipse(Chipse idChipse) {
        this.idChipse = idChipse;
    }

    public XuatXu getIdXuatXu() {
        return idXuatXu;
    }

    public void setIdXuatXu(XuatXu idXuatXu) {
        this.idXuatXu = idXuatXu;
    }

    public DongSP getIdDongSP() {
        return idDongSP;
    }

    public void setIdDongSP(DongSP idDongSP) {
        this.idDongSP = idDongSP;
    }

    public ManHinh getIdManHinh() {
        return idManHinh;
    }

    public void setIdManHinh(ManHinh idManHinh) {
        this.idManHinh = idManHinh;
    }

    public MauSac getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(MauSac idMauSac) {
        this.idMauSac = idMauSac;
    }

    public PhanLoaiHang getIdPhanLoaiHang() {
        return idPhanLoaiHang;
    }

    public void setIdPhanLoaiHang(PhanLoaiHang idPhanLoaiHang) {
        this.idPhanLoaiHang = idPhanLoaiHang;
    }

    public Pin getIdPin() {
        return idPin;
    }

    public void setIdPin(Pin idPin) {
        this.idPin = idPin;
    }

    public Ram getIdRam() {
        return idRam;
    }

    public void setIdRam(Ram idRam) {
        this.idRam = idRam;
    }

    public Rom getIdRom() {
        return idRom;
    }

    public void setIdRom(Rom idRom) {
        this.idRom = idRom;
    }

    public SanPham getIdSP() {
        return idSP;
    }

    public void setIdSP(SanPham idSP) {
        this.idSP = idSP;
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
        if (!(object instanceof ChiTietSP)) {
            return false;
        }
        ChiTietSP other = (ChiTietSP) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ChiTietSP{" + "id=" + id + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", namBH=" + namBH + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", trangThai=" + trangThai + ", idImei=" + idImei + ", idCamera=" + idCamera + ", idChipse=" + idChipse + ", idXuatXu=" + idXuatXu + ", idDongSP=" + idDongSP + ", idManHinh=" + idManHinh + ", idMauSac=" + idMauSac + ", idPhanLoaiHang=" + idPhanLoaiHang + ", idPin=" + idPin + ", idRam=" + idRam + ", idRom=" + idRom + ", idSP=" + idSP + ", hoaDonChiTietList=" + hoaDonChiTietList + '}';
    }

    
    
}
