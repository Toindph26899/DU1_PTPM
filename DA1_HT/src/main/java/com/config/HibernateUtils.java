package com.config;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import com.entities.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {
    
    private static final SessionFactory FACTORY;
    
    static{
        Configuration conf = new Configuration();
        
        Properties properties = new Properties();
        
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost;databaseName=DU1;user=sa;password=123456;"
                + "encrypt=false;");
        properties.put(Environment.SHOW_SQL, "true");
        
        conf.setProperties(properties);
        conf.addAnnotatedClass(Camera.class);
        conf.addAnnotatedClass(ChiTietSP.class);
        conf.addAnnotatedClass(Chipse.class);
        conf.addAnnotatedClass(ChucVu.class);
        conf.addAnnotatedClass(DongSP.class);
        conf.addAnnotatedClass(GiamGia.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(HoaDonChiTiet.class);
        conf.addAnnotatedClass(Imei.class);
        conf.addAnnotatedClass(ImeiDaBan.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(ManHinh.class);
        conf.addAnnotatedClass(MauSac.class);
        conf.addAnnotatedClass(MauSac.class);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(PhanLoaiHang.class);
        conf.addAnnotatedClass(Pin.class);
        conf.addAnnotatedClass(Ram.class);
        conf.addAnnotatedClass(Rom.class);
        conf.addAnnotatedClass(SanPham.class);
        conf.addAnnotatedClass(XuatXu.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        
        FACTORY = conf.buildSessionFactory(registry);
        
    }
    
    public SessionFactory getFACTORY() {
        return FACTORY;
    }
}
