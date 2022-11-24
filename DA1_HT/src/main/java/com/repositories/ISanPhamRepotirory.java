package com.repositories;

import com.entities.SanPham;
import java.util.ArrayList;

public interface ISanPhamRepotirory {
    
    ArrayList<SanPham> getSanPham();
    
    Boolean add(SanPham sp);
    
    Boolean update(SanPham sp, String id);
    
    Boolean delete(String id);
}
