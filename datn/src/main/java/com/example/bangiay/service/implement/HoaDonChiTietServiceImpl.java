package com.example.bangiay.service.implement;

import com.example.bangiay.entity.HoaDon;
import com.example.bangiay.entity.HoaDonChiTiet;
import com.example.bangiay.repository.HoaDonChiTietRepository;
import com.example.bangiay.service.HoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {
    @Autowired
    private HoaDonChiTietRepository hoaDonChiTietRepository;
    @Override
    public List<HoaDonChiTiet> getAll() {
        return hoaDonChiTietRepository.findAll();
    }

    @Override
    public HoaDonChiTiet add(UUID hoaDonId, UUID giayChiTietId, HoaDonChiTiet hoaDonChiTiet) {
        return null;
    }

    @Override
    public HoaDonChiTiet update(UUID id, HoaDonChiTiet updateOderDetails) {
        Optional<HoaDonChiTiet> optional = hoaDonChiTietRepository.findById(id);
        return optional.map(o ->{
            o.setSoLuong(updateOderDetails.getSoLuong());
            o.setHoaDon(updateOderDetails.getHoaDon());
            o.setDonGia(updateOderDetails.getDonGia());
            o.setGiayChiTiet(updateOderDetails.getGiayChiTiet());
            o.setGiaNhap(updateOderDetails.getGiaNhap());
            o.setTrangThai(updateOderDetails.getTrangThai());
            return hoaDonChiTietRepository.save(o);
        }).orElse(null);
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public Optional<HoaDonChiTiet> details(UUID id) {
        return Optional.empty();
    }
}
