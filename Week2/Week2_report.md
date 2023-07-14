# Week 2 Report

## Collections
Cach su dung list va cac phuong thuc pho bien


### Desing patter
 <br>
Media - là lớp abstract chứa các trường thông tin chung của các mặt hàng <br>
Book - kế thừa Media, thêm một vài trường thông tin <br>
Disc - kế thừa Media, thêm một vài trường thông tin <br>
DigitalVideoDisc - kế thừa Disc, thêm một vài trường thông tin <br>
CompactDisc - kế thừa Disc, thêm một vài trường thông tin <br>
Track - nằm trong CompactDisc (kết tập) <br>

Playable - là interface cho các lớp con Media thực thi (không có Book) <br>
Các lớp thực thi Playable in ra thông tin tương ứng của lớp đó <br>
Store - chứa các mặt hàng được thêm vào <br>
Cart - chứa các mặt hàng được thêm vào giỏ hàng <br>

## Serialize
ListAndRead class đọc ra danh sách các file và in ra nội dung file trong package Resource <br>
CopeFiles class đọc và ghi file bằng với từng kí tự <br>
CopyFilesBin class đọc và ghi file binary mode <br>
