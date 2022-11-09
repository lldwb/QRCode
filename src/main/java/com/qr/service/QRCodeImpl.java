package com.qr.service;

import com.qr.util.QRCodeUtils;

import java.io.OutputStream;

public class QRCodeImpl implements QRCode {
    @Override
    public void createImgUrl(String url, OutputStream outputStream, int size) {
        try {
            QRCodeUtils qrCodeUtils = new QRCodeUtils(size);
            qrCodeUtils.encode(url, outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
