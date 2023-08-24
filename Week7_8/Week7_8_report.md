### 1. Các vấn đề còn lại từ tuần 7
- Giải thích block report và heart.<br>
Block report và heart beat là tín hiệu gửi tù datanode đến namenode, heart beat để namenode biết được datanode còn sống, block report để báo cáo danh sách các block mà datanode đó đã lưu.
- Giải thích ảnh hưởng của block size đến mapreduce.<br>
Số lượng mapper bằng với số lượng split, theo mặc định block size bằng với split size, nên khi block size quá nhỏ dẫn đến file được chia thành nhiều split và sẽ có nhiều mapper xử lý, chi phí overhead cao.
Ngược lại nếu block size quá lớn cũng làm chậm mapper vì phải xử lý nhiều dữ liệu.
- Rack là gì ?<br>
Rack là tập hợp các máy tính chạy datanode trong cụm hadoop ở cùng 1 địa điểm vật lý, các datanode trong cùng một rack sử dụng chung 1 switch nên truy cập giữa datanode trong rack sẽ nhanh hơn ngoài rack.
- Với block size là 128MB, có cần thiết dữ liệu phải đủ 128MB để được lưu xuống hdfs hay không, và nếu có thì tính chịu lỗi thể hiện ở chỗ nào? <br>
Dữ liệu không cần phải đủ 128MB mới được ghi xuống hdfs, hdfs block chỉ là khái niệm trừu tượng, với một hdfs block 64MB nó được lưu ở local fs với các disk block nhỏ hơn nhiều.
Việc để hdfs block lớn hơn nhiều so với disk block để giảm thời gian tìm kiếm (vì các disk block được lưu trữ liên tục với nhau trong bộ nhớ).
- Quá trình ghi trong hdfs được coi là thành công khi nào? <br>
Quá trình ghi trong hdfs được coi như thành công khi các datanode đã tiền hành replication xong.
- Trong mapreduce, việc shuffle sau khi, dữ liệu sẽ được sẽ được tập hợp lại vào các partition theo key ? <br>
- Cơ chế khởi động lại RM, bảo vệ và không bảo vệ. <br>
- Cơ chế đồng bộ của Active và StandBy Resource Manager là như thế nào ? <br>
- So sánh ưu nhược điểm của Cluster và Client mode của Spark. <br>
- Các phép tính chỉ thực hiện trên Dataset. <br>