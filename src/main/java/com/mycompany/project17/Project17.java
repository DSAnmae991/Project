/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project17;

/**
 *
 * @author ADMIN
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
public class Project17 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        CustomButton button = new CustomButton();
        button.setBackground(new Color(255, 100, 100)); // Đặt màu nền cho nút
        frame.add(button);
        frame.setSize(300, 500);
        frame.setVisible(true);
    }
}
