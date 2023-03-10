# Factory Method pattern
## Mục đích
- Khởi tạo đối tượng theo yêu cầu

## Thành phần
- Super class: là 1 interface, abstract class hay class
- Sub class: implement super class
- Factory class: tạo đối tượng sub class theo yêu cầu, dựa vào tham số đầu vào(thường là enum type). Sử dụng cấu trúc switch-case hoặc if else để tạo đối tượng theo type

## Sử dụng khi nào
- Khi Super class có nhiều class con, muốn tạo đối tượng class con dựa trên đầu vào

## Lợi ích
- Dễ dàng mở rộng code, trong trường hợp thêm sub class thì chỉ cần thêm 1 case trong factory method
- Giảm phụ thuộc giữa client và sub class, thay vào đó client sẽ chỉ tương tác với interface superclass
