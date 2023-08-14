# Week 5 - 6
### 1. Big data và Hadoop ecosystem
#### 1.1 Dữ liệu lớn
- Big Data (dữ liệu lớn) là thuật ngữ dùng để mô tả khối lượng lớn và phức tạp của dữ liệu mà các công cụ truyền thống xử lý và quản lý dữ liệu không thể đáp ứng được. Điều đặc biệt về Big Data là nó không chỉ dựa vào kích thước của dữ liệu mà còn bao gồm tính đa dạng, tốc độ sinh ra và sự phức tạp của dữ liệu.
- Big Data có 3 tính chất chính.
- Volume (khối lượng): Dữ liệu được thu thập từ nhiều thiết bị khác nhau như điện thoại, máy tính, thiết bị iot ...
Tạo lên một khối lượng dữ liệu khổng lồ.
- Variety (đa dạng): Nhiều nguồn dữ liệu được thu thập, cùng với đó là nhiều dạng dữ liệu, dữ liệu
có thể ở dạng có cấu trúc (structured data), không có cấu trúc (unstructured data) hoặc một nửa (semi-structured data).
- Velocity (tốc độ): Dữ liệu được sinh ra rất nhanh.
- Ngoài ra còn cái tính chất khác như Veracity (tính chính xác), Value (giá trị), Visualization ...
#### 1.2 Hadoop ecosystem
- Hệ sinh thái Hadoop là nền tảng để hỗ trợ xử lý những vấn đề của dữ liệu lớn.
- Hadoop có 4 thành phần chính.
- HDFS (Hadoop distributed file system): phụ trách cho việc lưu trữ dữ liệu trên nhiều node khác nhau. Thành phần chính của nó là Namenode và Datanode.
Namenode lữu trữ metadata về những data được lưu trữ ở Datanode, Datanode là nơi dữ liệu thực sự được lưu trữ.
- Yarn (Yet another resource negotiator): hỗ trợ quản lý tài nguyên trên các cụm, nó lập lịch trình cho các job được gửi từ client và phần bố tài nguyên cho các node trong cụm để thực hiện job đó. Hai thành phần chính của nó là Resource manager và Node manager.
- MapReduce: là một hadoop framework, bằng cách sử dụng các thuật toán phân tán và song song, MapReduce cho phép thực hiện logic của quá trình xử lý và giúp viết các ứng dụng chuyển đổi các tập dữ liệu lớn thành một tập hợp có thể quản lý được.
### 2. Khái niệm cơ bản về hdfs, yarn, spark
#### 2.1 HDFS
- hdfs là hệ thống tập tin phân tán được thiết kế để sử dụng cho phần cứng thương mại. Nó khác với các hệ thống file thông thường.
Nó có tính chịu lỗi cao và triển khai trên được những phần cứng rẻ tiền. Nó cho phép truy cập dữ liệu với thông lượng lớn. 
- Tính chất của hdfs: xử lý lỗi phần cứng, truy cập dữ liệu dạng streaming, lưu trữ dữ liệu lớn, linh động với nhiều loại phần cứng và các phần mềm.
- Giới hạn: Hdfs cung cấp truy cập theo batch (offline) hơn là truy cập theo streaming (online).
và giới hạn số lượng file lưu tại metadata trên namenode bị giới hạn bới bộ nhớ tại namenode đó.
#### 2.2 Thành phần của HDFS
- Kiến trúc của HDFS là master/slave.
- Một cụm hdfs bao gồm 1 namenode, chứa metadata về các dữ liệu được lưu trữ ở các node trong cụm.
nó quản lý không gian tên file và quy định truy cập của client. 
- Trong một cụm hdfs có nhiều node và thường mỗi node có 1 datanode, datanode phục vụ việc đọc, ghi từ client ...
- Kiến trúc của HDFS
![img.png](img.png)
##### 2.2.1  Namenode
- Namenode duy trì metadata cho các tất cả các file trong cụm, và chúng được lưu trong ổ đĩa local tại namenode đó.
- Thành phần của namenode có: Namespace Image file (FS image), Edit log

### 3. Quá trình đọc-ghi trong hdfs
### 4. Khái niệm namenode, datanode, secondary namenode, hdfs block, block replication
### 5. Thành phần của yarn, khái niệm mapreduce
### 6. Các thành phần của spark, spark API(action, transformation)
