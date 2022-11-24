-- SanPham
    INSERT INTO SanPham(Ma, Ten) Values('IP1253', 'IPHONE X')
    INSERT INTO SanPham(Ma, Ten) Values('IP5632', 'IPHONE XS')
    INSERT INTO SanPham(Ma, Ten) Values('IP6524', 'IPHONE XR')
    INSERT INTO SanPham(Ma, Ten) Values('IP8546', 'IPHONE 11')
    INSERT INTO SanPham(Ma, Ten) Values('IP6352', 'IPHONE 12')
    INSERT INTO SanPham(Ma, Ten) Values('IP4521', 'IPHONE 13')
    INSERT INTO SanPham(Ma, Ten) Values('IP3652', 'IPHONE 14')
    INSERT INTO SanPham(Ma, Ten) Values('IP8542', 'IPHONE 8')
    INSERT INTO SanPham(Ma, Ten) Values('IP2031', 'IPHONE 7')
    INSERT INTO SanPham(Ma, Ten) Values('IP3650', 'IPHONE 6')

    SELECT * FROM SanPham

-- Camera
    INSERT INTO Camera(Ma, Ten) VALUES('CAM5874', '3 Cam 2 Cam 12MP - 1 Cam 24MP')
    INSERT INTO Camera(Ma, Ten) VALUES('CAM6586', '3 Cam 2 Cam 24MP - 1 Cam 48MP')
    INSERT INTO Camera(Ma, Ten) VALUES('CAM7845', '2 Cam 2 Cam 12MP')
    INSERT INTO Camera(Ma, Ten) VALUES('CAM3021', '2 Cam 2 Cam 24MP')
    INSERT INTO Camera(Ma, Ten) VALUES('CAM3600', '1 Cam 12MP')

    SELECT * FROM Camera

-- Chipse

    INSERT INTO Chipse(Ma, Ten) VALUES('CHIPSE1223', 'A8')
    INSERT INTO Chipse(Ma, Ten) VALUES('CHIPSE8563', 'A9')
    INSERT INTO Chipse(Ma, Ten) VALUES('CHIPSE9565', 'A10')
    INSERT INTO Chipse(Ma, Ten) VALUES('CHIPSE7848', 'A11 Bionic')
    INSERT INTO Chipse(Ma, Ten) VALUES('CHIPSE2236', 'A12 Bionic')
    INSERT INTO Chipse(Ma, Ten) VALUES('CHIPSE6857', 'A15 Bionic')

    SELECT * FROM Chipse
-- Imei
    INSERT INTO Imei(Ma, SoImei) VALUES('IMEI123', '023652415632452')
    INSERT INTO Imei(Ma, SoImei) VALUES('IMEI6532', '032569847125632')
    INSERT INTO Imei(Ma, SoImei) VALUES('IMEI7845', '874523654152364')
    INSERT INTO Imei(Ma, SoImei) VALUES('IMEI8965', '987585641521432')
    INSERT INTO Imei(Ma, SoImei) VALUES('IMEI3652', '568745635215487')
    INSERT INTO Imei(Ma, SoImei) VALUES('IMEI7854', '874563524156210')
    INSERT INTO Imei(Ma, SoImei) VALUES('IMEI7854', '874526410365214')
    INSERT INTO Imei(Ma, SoImei) VALUES('IMEI6985', '325658745965241')
    INSERT INTO Imei(Ma, SoImei) VALUES('IMEI8921', '878585635412524')
    INSERT INTO Imei(Ma, SoImei) VALUES('IMEI2365', '563254125786854')

    SELECT * FROM Imei

-- MauSac
    INSERT INTO MauSac(Ma, Ten) VALUES('MS1', 'Xanh')
    INSERT INTO MauSac(Ma, Ten) VALUES('MS2', 'Do')
    INSERT INTO MauSac(Ma, Ten) VALUES('MS3', 'Tim')
    INSERT INTO MauSac(Ma, Ten) VALUES('MS4', 'Vang')
    INSERT INTO MauSac(Ma, Ten) VALUES('MS5', 'Trang')
    INSERT INTO MauSac(Ma, Ten) VALUES('MS6', 'Den')
    INSERT INTO MauSac(Ma, Ten) VALUES('MS7', 'Xanh Luc')
    INSERT INTO MauSac(Ma, Ten) VALUES('MS8', 'Hong')

    SELECT * FROM MauSac

-- XuaSu
    INSERT INTO XuatXu(Ma, Ten) VALUES('XS1', 'Trung Quoc')
    INSERT INTO XuatXu(Ma, Ten) VALUES('XS2', 'Han Quoc')
    INSERT INTO XuatXu(Ma, Ten) VALUES('XS3', 'Mi')
    INSERT INTO XuatXu(Ma, Ten) VALUES('XS4', 'Singapore')

    SELECT * FROM XuatXu

-- ManHinh
    INSERT INTO ManHinh(Ma, Ten) VALUES('MH1', '4.7 inch / LCD')
    INSERT INTO ManHinh(Ma, Ten) VALUES('MH2', '5.5 inch / LCD')
    INSERT INTO ManHinh(Ma, Ten) VALUES('MH3', '5.8 inch / OLED')
    INSERT INTO ManHinh(Ma, Ten) VALUES('MH4', '6.1 inch / OLED')
    INSERT INTO ManHinh(Ma, Ten) VALUES('MH5', '6.5 inch / OLED')
    INSERT INTO ManHinh(Ma, Ten) VALUES('MH6', '5.4 inch / OLED')
    INSERT INTO ManHinh(Ma, Ten) VALUES('MH7', '6.7 inch / OLED')
    
    SELECT * FROM ManHinh

-- Pin
    INSERT INTO Pin(Ma, Ten) VALUES('PIN1', '1810 mAh')
    INSERT INTO Pin(Ma, Ten) VALUES('PIN2', '2915 mAh')
    INSERT INTO Pin(Ma, Ten) VALUES('PIN3', '2750 mAh')
    INSERT INTO Pin(Ma, Ten) VALUES('PIN4', '1960 mAh')
    INSERT INTO Pin(Ma, Ten) VALUES('PIN5', '2267 mAh')
    INSERT INTO Pin(Ma, Ten) VALUES('PIN6', '2815 mAh')
    INSERT INTO Pin(Ma, Ten) VALUES('PIN7', '3046 mAh')
    INSERT INTO Pin(Ma, Ten) VALUES('PIN8', '3227 mAh')
    INSERT INTO Pin(Ma, Ten) VALUES('PIN9', '3095 mAh')
    INSERT INTO Pin(Ma, Ten) VALUES('PIN10', '4352 mAh')

    SELECT * FROM Pin

-- Ram
    INSERT INTO Ram(Ma, Ten) VALUES('RAM1', '4GB')
    INSERT INTO Ram(Ma, Ten) VALUES('RAM2', '6GB')
    INSERT INTO Ram(Ma, Ten) VALUES('RAM3', '2GB')
    INSERT INTO Ram(Ma, Ten) VALUES('RAM4', '8GB')
    
    SELECT * FROM Ram

-- Rom
    INSERT INTO Rom(Ma, Ten) VALUES('ROM1', '32GB')
    INSERT INTO Rom(Ma, Ten) VALUES('ROM2', '64GB')
    INSERT INTO Rom(Ma, Ten) VALUES('ROM3', '128GB')
    INSERT INTO Rom(Ma, Ten) VALUES('ROM4', '256GB')
    INSERT INTO Rom(Ma, Ten) VALUES('ROM5', '512GB')
    INSERT INTO Rom(Ma, Ten) VALUES('ROM6', '1TB')

    SELECT * FROM Rom

-- DongSP
    INSERT INTO DongSP(Ma, Ten) VALUES('DSP1', 'PLUS')
    INSERT INTO DongSP(Ma, Ten) VALUES('DSP2', 'S')
    INSERT INTO DongSP(Ma, Ten) VALUES('DSP3', 'MINI')
    INSERT INTO DongSP(Ma, Ten) VALUES('DSP4', 'PRO')
    INSERT INTO DongSP(Ma, Ten) VALUES('DSP5', 'PRO MAX')

    SELECT * FROM DongSP

-- PhanLoaiHang
    INSERT INTO PhanLoaiHang(Ma, Ten) VALUES('PL1', 'MOI')
    INSERT INTO PhanLoaiHang(Ma, Ten) VALUES('PL2', 'CU')
    INSERT INTO PhanLoaiHang(Ma, Ten) VALUES('PL4', 'VN/A')
    INSERT INTO PhanLoaiHang(Ma, Ten) VALUES('PL3', 'LOCK')

    SELECT * FROM PhanLoaiHang

SELECT * FROM XuatXu
SELECT * FROM DongSP

-- ChiTietSP
    INSERT INTO ChiTietSP(IdSP, IdImei, IdMauSac, IdChipse, IdPin, IdPhanLoaiHang, IdRam, IdRom,
                        IdManHinh, IdCamera, IdXuatXu, IdDongSP, GiaNhap, GiaBan, NamBH, MoTa, SoLuongTon, TrangThai)
    VALUES('C788704C-633A-47C6-9097-22089EAD0C50', 'B8251433-7A1C-4A44-99FB-4F1FB6AA7569', '0A8EDF73-603A-4FE9-90D1-0063E8D8197B',
    'FF414D6B-C67E-48BB-B284-55E799CFBEF7', '74E80686-A073-4F74-B0B4-3F93E9AC76D5', 'b62d7248-2925-4ab9-98e6-0dd113dce966',
    '15387c45-3178-4793-b105-31aa44c8ac62', 'ffe96bdc-c74b-4607-a0da-02191a052092', 'cb03d67d-2f75-4ff9-b1df-1a22dac773e0',
    '26a6e535-71f2-4de5-9abf-137439c9090f', '5a2b2a27-febd-4e22-8a9b-3036ef80de2a', '8f7ca968-3d36-4625-9a1c-328cc5c54be1',
    15000000, 25000000, 2023 ,'San pham rat tot va phu hop voi moi nguoi', 1000, 1)

    SELECT * FROM ChiTietSP

-- ChucVu
    INSERT INTO ChucVu(Ma, Ten) VALUES('CV1', 'NHAN VIEN')
    INSERT INTO ChucVu(Ma, Ten) VALUES('CV2', 'QUAN LI')

    SELECT * FROM ChucVu
-- NhanVien
    INSERT INTO NhanVien(Ma, Ten, NgaySinh, DiaChi, Sdt, Email, MatKhau, NgayTao, GhiChu, TrangThai, IdChucVu)
    VALUES('NHANVIEN1', 'Pham Anh Tuan', '1-1-2003', 'Nam Dinh', '03652365458', 'Tuannaph12345@fpt.edu.vn', 
    'tuansegay', '11-14-2022', 'Khong co gi de noi', 0, 'e62c1e56-0810-4cb2-9d56-33d78244b5d9')

    SELECT * FROM NhanVien
-- KhachHang
    INSERT INTO KhachHang(Ma, Ten, Sdt, NgaySinh, DiaChi, GioiTinh, TrangThai, GhiChu, SoLanMua) 
    VALUES('KH1', 'Pham Trung Kien', '03687451254', '1-2-2003', 'Nam Dinh', 1, 1, 'Thang nay ngao lam', 0)

    SELECT * FROM KhachHang

-- GiamGia
    INSERT INTO GiamGia(Ma, TenCT, NgayTao, NgayDienRa, NgayKetThuc, SoTienGiam)
    VALUES('VOUCHER1', 'SIEU SALE', '11-20-2022', '11-20-2022', '11-22-2022', 1000000)
    INSERT INTO GiamGia(Ma, TenCT, NgayTao, NgayDienRa, NgayKetThuc, SoTienGiam)
    VALUES('VOUCHER2', 'SIEU SALE 11/11', '11-11-2022', '11-11-2022', '11-12-2022', 500000)
    
    SELECT * FROM GIAMGIA

-- HoaDon

-- HoaDonChiTiet

