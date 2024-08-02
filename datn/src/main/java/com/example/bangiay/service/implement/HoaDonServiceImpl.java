package com.example.bangiay.service.implement;

import com.example.bangiay.entity.HoaDon;
import com.example.bangiay.entity.KhachHang;
import com.example.bangiay.repository.HoaDonRepository;
import com.example.bangiay.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HoaDonServiceImpl implements HoaDonService {
    @Autowired
    private HoaDonRepository hoaDonRepository;

    @Override
    public List<HoaDon> getAll() {
        return hoaDonRepository.findAll();
    }

    @Override
    public Optional<HoaDon> getOrderById(UUID id) {
        return Optional.empty();
    }

    @Override
    public HoaDon createOrder(UUID nhanVienId, UUID khachHangId, HoaDon order) {
        return null;
    }

    @Override
    public HoaDon updateOrder(UUID id, HoaDon updatedOrder) {
        Optional<HoaDon> optional = hoaDonRepository.findById(id);
        return optional.map(o ->{
            o.setMa(updatedOrder.getMa());
            o.setDiaChi(updatedOrder.getDiaChi());
            o.setTrangThai(updatedOrder.getTrangThai());
            o.setHinhThucMua(updatedOrder.getHinhThucMua());
            o.setHinhThucNhanHang(updatedOrder.getHinhThucNhanHang());
            o.setHinhThucThanhToan(updatedOrder.getHinhThucThanhToan());
            o.setNgayTao(updatedOrder.getNgayTao());
            o.setKhachHang(updatedOrder.getKhachHang());
            o.setMoTa(updatedOrder.getMoTa());
            o.setNgayThanhToan(updatedOrder.getNgayThanhToan());
            o.setNhanVien(updatedOrder.getNhanVien());
            o.setPhiShip(updatedOrder.getPhiShip());
            o.setSdtNguoiNhan(updatedOrder.getSdtNguoiNhan());
            o.setSoDiemSuDung(updatedOrder.getSoDiemSuDung());
            o.setSoTienGiam(updatedOrder.getSoTienGiam());
            o.setSoTienQuyDoi(updatedOrder.getSoTienQuyDoi());
            o.setTenNguoiNhan(updatedOrder.getTenNguoiNhan());
            o.setTongTien(updatedOrder.getTongTien());
            return hoaDonRepository.save(o);
        }).orElse(null);
    }

    @Override
    public boolean deleteOrder(UUID id) {
        return false;
    }

    @Override
    public void calculateTotalPrice(HoaDon order) {

    }

    @Override
    public void adjustStockQuantity(HoaDon order, boolean isReturningStock) {

    }
}
