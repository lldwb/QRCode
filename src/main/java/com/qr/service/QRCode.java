package com.qr.service;

import java.io.OutputStream;

public interface QRCode {
    //生成二维码返回图片地址
    void createImgUrl(String url, OutputStream outputStream, int size);
}
