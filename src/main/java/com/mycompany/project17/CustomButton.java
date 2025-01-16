/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project17;

/**
 *
 * @author ADMIN
 */
import javax.swing.JButton;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class CustomButton extends JButton {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Bật hiệu ứng làm mịn góc (anti-aliasing) để viền và các đường cong mượt mà hơn
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Màu bóng đổ
        Color shadowColor = new Color(0, 0, 0, 50);  // Bóng đổ màu xám nhẹ
        int shadowOffsetX = 10;  // Vị trí bóng theo chiều ngang
        int shadowOffsetY = 10;  // Vị trí bóng theo chiều dọc

        // Vẽ bóng đổ
        RoundRectangle2D.Float shadow = new RoundRectangle2D.Float(
            shadowOffsetX, shadowOffsetY, getWidth() - shadowOffsetX, getHeight() - shadowOffsetY, 20, 20);
        g2d.setColor(shadowColor);
        g2d.fill(shadow);  // Tô màu bóng

        // Vẽ nền nút với viền tròn
        RoundRectangle2D.Float rec = new RoundRectangle2D.Float(
            0, 0, getWidth(), getHeight(), 30, 30);  // Hình chữ nhật với các góc bo tròn
        g2d.setColor(getBackground());  // Lấy màu nền của nút và tô màu
        g2d.fill(rec);

        // Vẽ viền cho nút
        g2d.setColor(Color.BLACK);  // Màu viền
        g2d.setStroke(new BasicStroke(2));  // Đặt độ dày cho viền
        g2d.draw(rec);  // Vẽ viền ngoài cho hình chữ nhật tròn
    }
}

