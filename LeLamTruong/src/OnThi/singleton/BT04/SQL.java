/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.singleton.BT04;

/**
 *
 * @author Administrator
 */
public class SQL extends DataAccess{
     @Override
    public void them(SanPham sanPham) {
        if(!sanPhams.contains(sanPham)){
            System.out.println("Đã thêm sản phẩm " + sanPham.tenSP + " vào SQL");
            sanPhams.add(sanPham);
        }
    }

    @Override
    public void xoa(SanPham sanPham) {
        if(sanPhams.contains(sanPham)){
            System.out.println("Đã xóa sản phẩm " + sanPham.tenSP + " ra khỏi SQL");
            sanPhams.remove(sanPham);
        }
        return;
    }

    @Override
    public void capNhat(SanPham sanPhamCu, SanPham sanPhamMoi) {
        if(sanPhams.contains(sanPhamCu)){
            System.out.println("Đã cập nhật sản phẩm mới vào SQL");
            sanPhams.set(sanPhams.indexOf(sanPhamCu), sanPhamMoi);
        }
        return;
    }
}
