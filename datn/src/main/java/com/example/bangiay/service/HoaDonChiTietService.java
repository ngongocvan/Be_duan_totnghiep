package com.example.bangiay.service;

import com.example.bangiay.entity.HoaDonChiTiet;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HoaDonChiTietService {
    public List<HoaDonChiTiet> getAll();
    public HoaDonChiTiet add(UUID hoaDonId, UUID giayChiTietId, HoaDonChiTiet hoaDonChiTiet);
    public HoaDonChiTiet update(UUID id,HoaDonChiTiet updateOderDetails );
    public boolean delete(UUID id);
    public Optional<HoaDonChiTiet> details(UUID id);
}
