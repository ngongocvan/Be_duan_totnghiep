package com.example.bangiay.controller;


import com.example.bangiay.entity.HangKhachHang;
import com.example.bangiay.entity.HoaDon;
import com.example.bangiay.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/hoaDon")
public class HoaDonController {
    @Autowired
    private HoaDonService hoaDonService;

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(hoaDonService.getAll());
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable UUID id , @RequestBody HoaDon hoaDon){
        return ResponseEntity.ok(hoaDonService.updateOrder(id,hoaDon));
    }

}
