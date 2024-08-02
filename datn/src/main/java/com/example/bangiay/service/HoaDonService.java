package com.example.bangiay.service;

import com.example.bangiay.entity.HoaDon;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HoaDonService {
    public List<HoaDon> getAll();
    public Optional<HoaDon> getOrderById(UUID id);
    public HoaDon createOrder(UUID nhanVienId,UUID khachHangId,HoaDon order);
    public HoaDon updateOrder(UUID id, HoaDon updatedOrder);
    public boolean deleteOrder(UUID id);
    public void calculateTotalPrice(HoaDon order);
    public void adjustStockQuantity(HoaDon order, boolean isReturningStock);

}
