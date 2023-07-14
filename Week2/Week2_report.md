# Week 2 Report

## Collections
Cách sử dụng các colelctions phổ biến <br>
List - ArrayList: cho phép thêm, xóa lặp qua, tìm kiếm, sắp xếp ... <br>
Set - HashSet: lưu trữ như 1 tập hợp, không có thành phần lặp lại (tự định nghĩ với equals và hashcode) <br>
thêm, xóa, sửa, không có sort <br>
Map - HashMap: lưu dữ liệu dưới dạng key - value, mỗi key map đến 1 value <br>
class UsingHashMap.java dùng thêm, xóa, sửa, contains, lặp qua map <br>
HashMap không có sort <br>

### Desing patter
#### Creational pattern - Singleton <br>
Đảm bảo chỉ có 1 đối tượng được khởi tạo và sử dụng<br>
Bằng cách dùng private cho phương thức khởi dựng, và bắt buộc khởi dựng qua 1 phương thức khác cho phép kiếm soát đối tượng đã tồn tại hay chưa <br>
Vdu: sử dụng trong trường hợp tạo 1 đối tượng connection đến 1 database

#### Structural pattern - Adapter <br>
Làm lớp mới không tương thích với thành phần đã tồn tại từ trước có thể kết hợp hoạt động được <br>
Vdu: viết lớp adapter chuyển cho phép lớp mới sử dụng được các phương thức áp dụng với lớp cũ <br>
Intern không nằm trong danh sách trả lương -> lớp adapter (chứa obj intern) kế thứa employee để trả lương cho intern đó <br>
#### Behavioural pattern - Observer <br>
Mỗi đối tượng chứa danh sách đối tượng cần kiểm soát <br>
Tương tự như mô hình publish-subcribe <br>
Vdu: Lớp company chứa các danh sách các nhân viên (staff) <br>
phương thức trả lương sẽ trả 1 lần cho tất cả nhân viên trong danh sách <br>

## Serialize
Chuyển từ Object (có implement serializable) sáng dạng stream (bytes) <br>
Để dễ dành làm việc với bến thứ ba dễ dàng <br>
Deserialize để dựng lại Obj từ stream bytes. <br>
