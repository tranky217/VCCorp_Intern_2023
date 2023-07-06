# Week 1 Report

## OOP
Bài tập làm về một cửa hàng online bán các mặt hàng Media, cho phép thêm bớt các mặt hàng trong cửa hàng và thêm vào giỏ hàng.

### Class 
Aims - thực thi code của chương trình <br>
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
