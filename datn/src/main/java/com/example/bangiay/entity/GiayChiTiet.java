package com.example.bangiay.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Table(name = "GIAY_CHI_TIET")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class GiayChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private UUID id;

    @Column(name = "SO_LUONG_TON")
    private int soLuongTon;

    @Column(name = "TRANG_THAI")
    private int trangThai;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_GIAY")
    private Giay giay;


}
