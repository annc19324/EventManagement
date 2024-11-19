Lê Thiên An
22810310030

Mô tả chức năng của Modules.

I.	Đăng ký tài khoản
1.	Mô tả tổng quan.
-	Chức năng đăng ký tài khoản cho phép người dùng thêm tài khoản để sử dụng tham gia đăng ký sự kiện.
2.	Các yêu cầu chức năng.
2.1	Tạo tài khoản
-	Người dùng có thể tạo tài khoản với các thông tin sau:
•	Mã người dùng (bắt buộc, tự tăng lên 1 khi tạo tài khoản thành công, dạng số nguyên).
•	Tên người dùng (bắt buộc, duy nhất, dạng chuỗi, chứa các kí tự a-z, A-Z, 0-9 và không có khoảng cách, dùng để làm tài khoản đăng nhập).
•	Họ tên người dùng (bắt buộc, chứa các kí tự a-z, A-Z và khoảng cách).
•	Mật khẩu (bắt buộc, dạng chuỗi, có mã hóa, từ 8 kí tự trở lên, có ít nhất 1 chữ thường, 1 chữ hoa, 1 chữ số và 1 kí tự đặc biệt).
•	Xác nhận mật khẩu (bắt buộc, dạng chuỗi, so sánh với mật khẩu).
•	Ngày sinh (bắt buộc, dạng date, trên 16 tuổi).
•	Mail(bắt buộc, dạng chuỗi, định dạng mail).
•	Phone (bắt buộc, dạng số, định dạng sdt).
•	Role (ràng buộc “admin”, “user”, mặc định khi đăng ký người dùng là user).
2.2	Hệ thống kiểm tra các trường hợp bắt buộc và cảnh báo dữ liệu không hợp lệ.
3.	Yêu cầu phi chức năng.
-	Bảo mật thông tin người dùng: mật khẩu người dùng được mã hóa vì chỉ có người dùng được biết mật khẩu chính xác của mình.
4.	Quy trình hoạt động.
-	Người dùng nhấn nút đăng ký, phần mềm chuyển sang form đăng ký.
-	Người dùng điền thông tin vào biểu mẫu.
-	Nhấn nút đăng ký.
-	Hệ thống kiểm tra dữ liệu đầu vào và kiểm tra xem tên người dùng đã tồn tại chưa, nếu tên người dùng đã tồn tại thì hiện thị thông báo cho người dùng biết rằng tên người dùng này đã được đăng ký.
-	Nếu các đầu vào hợp lệ: hiển thị thông báo đăng ký tài khoản thành công
-	nếu đầu vào không hợp lệ, hiện thông báo phần không hợp lệ và yêu cầu nhập lại.
5.	Thiết kế giao diện.
-	Layout đăng ký:
![image](https://github.com/user-attachments/assets/afdce0fc-0d72-4961-aa41-c0c1c732bdeb)

6.	Kiểm thử.
-	Đăng ký khi nhập đầy đủ thông tin và hợp lệ.
-	Đăng ký khi chưa điền thông tin.
-	Đăng ký khi thiếu từng thông tin một.
-	Nhập thông tin không hợp lệ như: họ tên có số, họ tên có kí tự đặc biệt, tên người dùng có phím cách, tên người dùng dưới 6 kí tự, tên người dùng có kí tự đặc biệt,  mật khẩu không đủ 8 kí tự, xác nhận mật khẩu không khớp với mật khẩu đã nhập, số điện thoại không đúng định dạng, số điện thoại có chữ cái, mail không có @, … sẽ hiện thị thông báo nếu đầu vào không hợp lệ.

II.	Đăng nhập tài khoản
1.	Mô tả tổng quan.
-	Chức năng đăng nhập tài khoản cho phép người dùng tham gia sử dụng các chức năng chính của phần mềm nếu đã đăng ký thành công.
2.	Yêu cầu chức năng.
2.1	đăng nhập tài khoản.
-	Người dùng có thể đăng nhập tài khoản với các thông tin sau:
•	Tên người dùng -  tài khoản đăng nhập (bắt buộc, dạng chuỗi, so sánh với tên người dùng trong database xem có tồn tại chưa).
•	Mật khẩu (dạng chuỗi, được mã hóa và so sánh với mật khẩu đã mã hóa ở trong database).
-	Hệ thống kiểm tra các trường hợp bắt buộc và kiểm tra dữ liệu nếu không hợp lệ.
3.	Yêu cầu các phi chức năng.
-	Bảo mật thông tin người dùng.
4.	Quy trình hoạt động.
4.1	Quy trình đăng nhập.
-	Người dùng nhập thông tin đăng nhập: tài khoản, mật khẩu và nhấn đăng nhập.
-	Hệ thống kiểm tra dữ liệu đầu vào xem tên tài khoản đã tồn tại chưa? Nếu rồi thì mật khẩu sẽ được mã hóa và so sánh với mật khẩu được mã hóa từ khi đăng ký ở trong database.
5.	Thiết kế giao diện.
-	Layout đăng nhập.
 ![image](https://github.com/user-attachments/assets/dec63eb1-3be8-4aa9-b179-d543839d1c21)

6.	Kiểm thử.
-	Đăng nhập để trống tài khoản và mật khẩu.
-	Đăng nhập sai tài khoản hoặc sai mật khẩu.

III.	Đăng ký sự kiện.
1.	Mô tả tổng quan.
Chức năng đăng ký sự kiện cho phép người dùng đăng ký sự kiện và tìm kiếm sự kiện trong danh sách.
2.	Các yêu cầu chức năng.
2.1	đăng ký sự kiện:
-	người dùng có thể đăng ký sự kiện bằng cách nhấn nút đăng ký sự kiện.
-	Hệ thống kiểm tra sự kiện này đã được người dùng này đăng ký chưa.
2.2	tìm kiếm sự kiện:
-	người dùng nhập mã sự kiện hoặc tên sự kiện để tìm kiếm sự kiện muốn đăng ký.
-	Hệ thống kiểm tra sự kiện này có tồn tại không.
3.	Yêu cầu phi chức năng.
-	Thời gian phản hôi không quá 1s.
-	Bảo mật thông tin sự kiện được đăng ký của người dùng.
4.	Quy trình hoạt động.
4.1	quy trình đăng ký sự kiện:
-	người chọn sự kiện muốn tham gia và nhấn nút đăng ký.
-	Nếu chưa từng đăng ký sự kiện này thì hiện thông báo đăng ký thành công.
-	Nếu đã từng đăng ký sự kiện này thì hiện thông báo đăng ký thất bại vì sự kiện này đã được đăng ký.
4.2	quy trình tìm kiếm sự kiện:
-	người dùng nhập mã hoặc tên sự kiện muốn tìm vào textField tìm kiếm.
-	Người dùng click vào nút tìm kiếm.
-	Nếu có sự kiện liên quan thì sẽ hiện.
-	Nếu không có sẽ hiện thông báo không có.
4.3	quy trình mở form chi tiết sự kiện đã đăng ký:
-	sau khi người dùng đăng ký sự kiện thì tên sự kiện hiện ở bảng bên cạnh.
-	Bảng bên cạnh có 1 nút xem chi tiết sự kiện ở phía dưới, khi click vào sẽ chuyển sang form chi tiết sự kiện đã đăng ký.
5.	Thiết kế giao diện.
-	Layout đăng ký sự kiện:
 ![image](https://github.com/user-attachments/assets/9a7f60f5-8a41-4dd1-8cd8-83576502be18)

6.	Kiểm thử.
-	Tìm kiếm sự kiện có trong danh sách.
-	Tìm kiếm để trống và nhấn nút tìm kiếm.
-	Tìm kiếm sự kiện không có trong danh sách.
-	Chọn sự kiện chưa đăng ký để đăng ký.
-	Chọn sự kiện đã đăng ký để đăng ký.
-	Không chọn sự kiện rồi nhấn đăng ký.

IV.	Xem danh sách chi tiết sự kiện đã đăng ký.
1.	Mô tả tổng quan.
-	Chức năng xem sự kiện đã đăng ký cho phép người dùng xem chi tiết về những sự kiện đã đăng ký, người dùng cũng có thể hủy đăng ký ở đây, hoặc là thanh toán trực tuyến ngay tại trang này.
2.	Yêu cầu chức năng.
2.1	tìm kiếm sự kiện.
-	Người dùng có thể tìm kiếm sự kiện bằng mã hoặc tên sự kiện.
2.2	hủy sự kiện.
-	Người dùng có thể hủy sự kiện nếu không muốn tham gia nữa.
2.3	thanh toán sự kiện.
-	Người dùng có thể thanh toán trực tuyến mà không cần ra quầy, đương nhiên điều này không bắt buộc.
3.	Yêu cầu phi chức năng.
-	Thời gian phản hồi tím kiếm không quá 1 giây.
-	Bảo mật thông tin sự kiện được đăng ký.
4.	Quy trình hoạt động.
4.1	quy trình tìm kiếm sự kiện:
-	người dùng nhập mã hoặc tên sự kiện và nhấn nút tìm kiếm, bảng sẽ trả về những sự kiện có liên quan.
4.2	quy trình hủy sự kiện.
-	Người dùng chọn sự kiện không muốn tham gia nữa và click vào nút hủy sự kiện.
4.3	quy trình thanh toán sự kiện.
-	Người dùng có thể chọn sự kiện cần thanh toán và click vào nút thanh toán, xác nhận.
5.	Thiết kế giao diện.
-	Layout xe sự kiện đã đăng ký:
![image](https://github.com/user-attachments/assets/3692bc74-8068-4896-bc54-bd8d675101fa)
