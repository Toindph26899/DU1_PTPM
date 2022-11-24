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
@Table(name = "NhanVien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NhanVien.findAll", query = "SELECT n FROM NhanVien n"),
    @NamedQuery(name = "NhanVien.findById", query = "SELECT n FROM NhanVien n WHERE n.id = :id"),
    @NamedQuery(name = "NhanVien.findByMa", query = "SELECT n FROM NhanVien n WHERE n.ma = :ma"),
    @NamedQuery(name = "NhanVien.findByTen", query = "SELECT n FROM NhanVien n WHERE n.ten = :ten"),
    @NamedQuery(name = "NhanVien.findByNgaySinh", query = "SELECT n FROM NhanVien n WHERE n.ngaySinh = :ngaySinh"),
    @NamedQuery(name = "NhanVien.findByDiaChi", query = "SELECT n FROM NhanVien n WHERE n.diaChi = :diaChi"),
    @NamedQuery(name = "NhanVien.findBySdt", query = "SELECT n FROM NhanVien n WHERE n.sdt = :sdt"),
    @NamedQuery(name = "NhanVien.findByEmail", query = "SELECT n FROM NhanVien n WHERE n.email = :email"),
    @NamedQuery(name = "NhanVien.findByMatKhau", query = "SELECT n FROM NhanVien n WHERE n.matKhau = :matKhau"),
    @NamedQuery(name = "NhanVien.findByNgayTao", query = "SELECT n FROM NhanVien n WHERE n.ngayTao = :ngayTao"),
    @NamedQuery(name = "NhanVien.findByGhiChu", query = "SELECT n FROM NhanVien n WHERE n.ghiChu = :ghiChu"),
    @NamedQuery(name = "NhanVien.findByTrangThai", query = "SELECT n FROM NhanVien n WHERE n.trangThai = :trangThai")})
public class NhanVien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "NgaySinh")
    @Temporal(TemporalType.DATE)
    private Date ngaySinh;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "Sdt")
    private String sdt;
    @Column(name = "Email")
    private String email;
    @Column(name = "MatKhau")
    private String matKhau;
    @Column(name = "NgayTao")
    @Temporal(TemporalType.DATE)
    private Date ngayTao;
    @Column(name = "GhiChu")
    private String ghiChu;
    @Column(name = "TrangThai")
    private Integer trangThai;
    @JoinColumn(name = "IdChucVu", referencedColumnName = "Id")
    @ManyToOne
    private ChucVu idChucVu;
    @OneToMany(mappedBy = "idNhanVien")
    private List<HoaDon> hoaDonList;

    public NhanVien() {
    }

    public NhanVien(String id) {
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public ChucVu getIdChucVu() {
        return idChucVu;
    }

    public void setIdChucVu(ChucVu idChucVu) {
        this.idChucVu = idChucVu;
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
        if (!(object instanceof NhanVien)) {
            return false;
        }
        NhanVien other = (NhanVien) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", sdt=" + sdt + ", email=" + email + ", matKhau=" + matKhau + ", ngayTao=" + ngayTao + ", ghiChu=" + ghiChu + ", trangThai=" + trangThai + ", idChucVu=" + idChucVu + ", hoaDonList=" + hoaDonList + '}';
    }

    
    
}
