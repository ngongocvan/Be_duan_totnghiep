package com.example.bangiay.service.implement;

import com.example.bangiay.entity.ChuongTrinhGiamGiaSanPham;
import com.example.bangiay.entity.GiayChiTiet;
import com.example.bangiay.repository.ChuongTrinhGiamGiaSanPhamRepository;
import com.example.bangiay.repository.GiayChiTietRepository;
import com.example.bangiay.service.ChuongTrinhGiamGiaSanPhamService;
import com.example.bangiay.service.GiayChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GiayChiTietServiceImpl implements GiayChiTietService {
    @Autowired
    private GiayChiTietRepository reponsitory;
    @Override
    public List<GiayChiTiet> getAll() {
        return reponsitory.findAll();
    }

    @Override
    public GiayChiTiet add(GiayChiTiet giayChiTiet) {
        return reponsitory.save(giayChiTiet);
    }

    @Override
    public GiayChiTiet update(UUID id, GiayChiTiet giayChiTiet) {
        Optional<GiayChiTiet> optional = reponsitory.findById(id);
        return optional.map(o ->{
            o.setGiay(giayChiTiet.getGiay());
            o.setSoLuongTon(giayChiTiet.getSoLuongTon());
            o.setTrangThai(giayChiTiet.getTrangThai());
            return  reponsitory.save(o);
        }).orElse(null);
    }

    @Override
    public GiayChiTiet deleteById(UUID id) {
        Optional<GiayChiTiet> optional = reponsitory.findById(id);
        return optional.map(o ->{
            reponsitory.delete(o);
            return o;
        }).orElse(null);
    }

    @Override
    public GiayChiTiet details(UUID id) {
        Optional<GiayChiTiet> optional = reponsitory.findById(id);
        return optional.orElse(null);
    }
}
