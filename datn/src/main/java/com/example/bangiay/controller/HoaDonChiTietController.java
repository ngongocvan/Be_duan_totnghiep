package com.example.bangiay.controller;

import com.example.bangiay.entity.HoaDon;
import com.example.bangiay.entity.HoaDonChiTiet;
import com.example.bangiay.service.HoaDonChiTietService;
import com.example.bangiay.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/hoaDonChiTiet")
public class HoaDonChiTietController {
    @Autowired
    private HoaDonChiTietService hoaDonChiTietService;

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(hoaDonChiTietService.getAll());
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable UUID id , @RequestBody HoaDonChiTiet hoaDonChiTiet){
        return ResponseEntity.ok(hoaDonChiTietService.update(id,hoaDonChiTiet));
    }
}
