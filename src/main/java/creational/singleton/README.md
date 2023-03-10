# Singleton pattern

## Mục đích: 
- Đảm bảo chỉ tạo ra đối tượng duy nhất trong toàn bộ chương trình

## Thành phần:
- Tạo ra 1 class có:
+ private constructor để chặn các khởi tạo từ bên ngoài
+ instance singleton là private static
+ method public static getInstance(), để lấy instance singleton đó
## Sử dụng khi nào:
- Sử dụng trong các bài toán chỉ tạo ra 1 instance duy nhất
