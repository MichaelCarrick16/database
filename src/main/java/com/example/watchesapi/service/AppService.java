package com.example.watchesapi.service;

import com.example.watchesapi.model.*;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AppService {
    //Account
    private List<Account> listAccount = new ArrayList<>(Arrays.asList(
            new Account("MichaelCarrick","1997","Thai Binh","0966059345"),
            new Account("PhuongLien","2000","Ha Tay","0866846800")
    ));

    public List<Account> getListAccount() {
        return listAccount;
    }

    public void addAccount(Account account) {
        listAccount.add(account);
    }

    public void updateAccount(String username, Account account) {
        for (int i = 0 ; i < listAccount.size() ; i++){
            Account acc = listAccount.get(i);
            if(acc.getUsername().equals(username)){
                listAccount.set(i,account);
                return;
            }
        }
    }

    public Account getAccount(String username) {
        for (int i = 0 ; i < listAccount.size() ; i++){
            Account account = listAccount.get(i);
            if(account.getUsername().equals(username)){
                return account;
            }
        }
        return null;
    }



    //Trademark
    private List<Trademark> listTrademark = new ArrayList<>(Arrays.asList(
            new Trademark(1,"ROLEX"),
            new Trademark(2,"HUBLOT"),
            new Trademark(3,"PIAGET")
    ));
    public List<Trademark> getListTrademark() {
        return listTrademark;
    }


    //Product
    private List<Product> listProduct = new ArrayList<>(Arrays.asList(
            new Product(1,"Rolex Datejust",1234,"https://bossluxurywatch.vn/uploads/san-pham/rolex/datejust/rolex-datejust-41-126334-mat-so-den-nam-kim-cuong-day-deo-oyster.png","Nhắc đến Rolex, với tất cả những người hâm mộ đồng hồ trên toàn thế giới, chắc hẳn đều sẽ nhớ đến hình ảnh của những cỗ máy thời gian mang thiết kế khỏe khoắn từ kim loại cao cấp. Những chiếc đồng hồ ấy mang tên Rolex Oyster Perpetual Datejust, bộ sưu tập đã mang về thành công vang dội cho Rolex. Trải qua quá trình dài hình thành và phát triển, Rolex Datejust vẫn là dòng sản phẩm thu hút đông đảo sự chú ý của khách hàng trên toàn thế giới. Hôm nay, Gia Bảo Luxury xin được giời thiệu tới quý khách chiếc đồng hồ Rolex Datejust 41mm 126300 - Làn gió mới cho tinh hoa Datejust.",1),
            new Product(2,"Rolex Daytona",4763,"https://bossluxurywatch.vn/uploads/san-pham/rolex/daytona/rolex-cosmograph-daytona-116518ln.png","Với sự xuất sắc và độ tin cậy, đồng hồ Rolex được thiết kế để đeo hàng ngày và mỗi mẫu có thể phù hợp với các môn thể thao cũng như các hoạt động khác nhau. Sáng tạo để trường tồn, những chiếc đồng hồ này mang cá tính đặc trưng nhờ vào tính thẩm mỹ đặc biệt và trường tồn với thời gian. Oyster Perpetual Cosmograph Daytona là một công cụ tối ưu, một chiếc đồng hồ mang tính biểu tượng cho những người có niềm đam mê lái xe và tốc độ. Tìm hiểu thêm về các tính năng khác nhau của nó và cách đặt thời gian và sử dụng chức năng bấm giờ bằng cách xem video.",1),
            new Product(6,"Hublot Classic",6426,"https://www.hublot.com/sites/default/files/styles/watch_item_desktop_1x_scale_no_crop_600_6000_/public/2021-04/CLASSIC-FUSION-TITANIUM-BLUE-ON-RUBBER-38-MM.png","Mẫu đồng hồ Hublot Classic Fusion 511.VX.1280.RX.MDM40 là một thiết kế cực kỳ đặc biệt, kỷ niệm dấu mốc quan trọng của thương hiệu Hublot. Với sự kiện kỷ niệm 40 năm ngày thành lập thương hiệu, Hublot đã cho ra mắt một chiếc đồng hồ sở hữu thiết kế giống với những cỗ máy thời gian đầu tiên được họ sản xuất.",2),
            new Product(7,"Hublot Big Bang",5269,"https://product.hstatic.net/200000031878/product/341.sx.7170.lr.1204-sd-hr-w_2_dd47eb697f2847af8b1a78c571aa9341_d7edf2fe279f4256be2e3d2903919321_master.png","Vào năm 1980, thương hiệu Hublot được thành lập và đem đến cho thị trường một thiết kế phá cách, không đi theo lối mòn quen thuộc. Đây là lần đầu tiên người ta thấy được một chiếc đồng hồ bằng vàng khối lại đi kèm với bộ dây cao su. Cùng với đó là một mặt số trống trơn không có cọc số hay mốc giờ gì cả.",2),
            new Product(11,"Piaget Gouverneur",7638,"https://piaget.rokka.io/product-1/61d4342a58e459fa6e92d9ab6ed4a11c4b9f3313.jpg","Đồng Hồ Piaget Gouverneur G0A37113 là chiếc đồng hồ có thiết kế cổ điển, mặt đồng hồ dáng tròn. Thiết kế đồng hồ khá mỏng chỉ 10,4mm mang đến cảm giác nhẹ nhàng ở cổ tay khi mang. Sản phẩm được chế tác từ vàng trắng 18k. Trên vành bezel có đính 128 viên kim cương lấp lánh càng tăng thêm sự hấp dẫn và sự sang trọng đẳng cấp của chiếc đồng hồ. Sản phẩm được sản xuất bởi Piaget, một thương hiệu đồng hồ hàng đầu đến từ Thụy Sỹ.",3),
            new Product(12,"Piaget Emperador",3157,"https://piaget.rokka.io/product-1/d6cbec05791c54d6e0ac60c821b032e396c092ed.jpg","Và để kể đến Piaget, chúng ta không thể quên niềm tự hào suốt bao năm của họ với những mẫu đồng hồ mang trong mình vẻ đẹp tối giản thuần túy - bộ sưu tập Piaget Emperador – đại diện cho sự tinh tế và những giá trị mà Piaget luôn cố gắng gìn giữ.",3),
            new Product(3,"Rolex Submariner",2579,"https://bossluxurywatch.vn/uploads/san-pham/rolex/rolex-submariner-date-116610ln-40mm.png","Mỗi chiếc đồng hồ Rolex Submariner gắn liền với một câu chuyện hấp dẫn về cảm xúc của mỗi con người, và có những người đã lựa chọn dành cả cuộc đời mình để gắn liền với Patek Philippe. Quả thực đúng là như vậy, không chỉ đối với những người thợ chế tác, mà kể cả những vị khách khi đã sở hữu trong tay một chiếc đồng hồ Patek Philippe đều hoàn toàn bị hấp dẫn bởi sức hút mãnh liệt của nó, hòa nhập cùng cảm xúc của họ và đem lại những nét tinh tế nhất từ món phụ kiện đắt giá.",1),
            new Product(4,"Rolex Day-Date",8794,"https://bossluxurywatch.vn/uploads/san-pham/rolex/day-date/rolex-day-date-40-228238-mat-so-vang-champagne-nam-kim-cuong.png","Lần này, bộ vỏ của chiếc Rolex Day-Date không còn sử dụng chất liệu thép truyền thống. Thay vào đó, ta có bộ vỏ bằng vàng khối cực kỳ ấn tượng. Điều này cũng dễ hiểu thôi, Submariner đã không còn là công cụ phục vụ việc lặn nữa, mà đã trở thành một biểu tượng thời trang. Chất liệu vàng vàng được kết hợp cùng xanh dương trên vành bezel và cả mặt số, tạo nên thiết kế cực kỳ hài hòa.",1),
            new Product(5,"Rolex Yacht-Master",3455,"https://bossluxurywatch.vn/uploads/san-pham/rolex/yacht-master/rolex-yacht-master-ii-116681.png","Chiếc đồng hồ Rolex Yacht-Master 42mm 226659 mới được ra mắt có rất nhiều ưu điểm độc đáo. Đầu tiên là size 42mm lần đầu tiên xuất hiện trên dòng Yacht Master. Với kích thước lớn hơn ngày càng đáp ứng được thêm một lượng lớn khách hàng khi mà size 40mm có phần hơi nhỏ với nhiều người. Tiếp theo điểm độc đáo nữa mà hiện tại chỉ có hai bộ sưu tập Daytona và Yacht Master được sở hữu đó là dây cao su Oysterflex, và tất nhiên theo truyền thống thì bộ dây cao su này kết hợp với bộ vỏ vàng khối, trên bản này là vàng trắng 18k.",1),
            new Product(8,"Hublot Spirit",2315,"https://product.hstatic.net/200000031878/product/601.jx.0120.rt_new_big_83e0c83763a44ddab4e2e357d136df4a_e9d437c18b11499fa44b1150defeffce.png","Mang đậm màu sắc nam tính và mạnh mẽ, bộ bỏ của cỗ máy Hublot Spirit Of Big Bang Titanium 42mm 641.NX.0173.LR đã được hoàn thiện theo phương phép chải xác mở. Trên vành bezel là 6 đinh ốc cách điệu mang dáng của chữ H nhà Hublot. Vành bezel được thiết kế với những khoảng chìm xuống tạo hiệu ứng 3D – là một chi tiết nhất nhá cho tổng thể bộ vỏ khung của chiếc đồng hồ.Bên trong là mặt số xuất hiện với tông màu ghi xám chủ đạo cùng với phong cách thiết kế dạng skeleton. Chiếc đồng hồ này đã mang đến những sự trải nghiệm mới mẻ cho người dùng. Sự có mặt của những đòn bảy, những bánh xe phục vụ tính năng chronograph tại hai mặt số phụ với vòng vạch điểm chỉ số màu đen tại góc 3 giờ và 6 giờ trên mặt số.",2),
            new Product(9,"Hublot Ferrari",8739,"https://bossluxurywatch.vn/uploads/san-pham/hublot/big-bang/1/hublot-big-bang-ferrari-chronograph-unico-carbon-45mm-402-qu-0113-wr.png","Hublot sở hữu câu Slogan nổi tiếng “Art of Fusion”, vậy nên những sản phẩm của họ cũng sẽ có một vài yếu tố pha trộn. Đó có thể là chất liệu, là kiểu dáng và cũng có thể là pha trộn giữa tính cách của hai thương hiệu như chiếc Hublot Big Bang Ferrari Unico 401.NJ.0123.VR.",2),
            new Product(10,"Hublot Titanium",3434,"https://www.hublot.com/sites/default/files/styles/watch_item_desktop_1x_scale_no_crop_600_6000_/public/classic-fusion-orlinski-titanium-40-mm-550.NS.1800.RX.ORL19-soldier-shot.png","Hôm nay Gia Bảo Luxury xin giới thiệu tới các bạn mẫu đồng hồ Hublot Classic Fusion Orlinski Titanium mang mã Ref: 550.NS.1800.RX.ORL19 mà chúng tôi đã có cơ hội sở hữu trong mấy tháng đầu tiên mới ra mắt thị trường 2019. Chiếc đồng hồ là sự hợp tác giữa thương hiệu Hublot và nghệ sĩ Richard Orlinski điểm thêm phong cách của chiếc Hublot Classic Fusion Aerofusion Chronograph đã mang đến tác phẩm Orlinski thành công vượt ngoài mong đợi. Vì độ Hot của nó nên để được chiêm ngưỡng tuyệt tác này trên cổ tay của mình là một điều xa xỉ nhưng không sao Gia Bảo Luxury sẽ giúp các đạt được điều đó một cách miễn phí.",2),
            new Product(13,"Piaget Polo",4628,"https://piaget.rokka.io/product-1/74442588a8031800c68c1f8beb393c9abde38861.jpg","Những bàn tay và khối óc tài tình đã cho ra đời kết quả đáng tự hào: một tạo tác giữ được những nét cong khoẻ khoắn của dòng Polo nổi tiếng, kích thước 42mm khoẻ khoắn với độ dày chỉ 6.5mm, truyền động năng bởi bộ máy 1200S1 lên cót tự động được nghiên cứu và chế tạo hoàn toàn bởi Piaget. Khả năng trữ cót lên đến 44 giờ và chống nước 30m bổ sung cho chiếc đồng hồ thể thao này khả năng sử dụng linh hoạt trong cuộc sống thường ngày",3),
            new Product(14,"Piaget Gala",2638,"https://piaget.rokka.io/product-1/9cb3686bc78631e6d97a9370f78269ca8485ebbb.jpg","Nhắc đến sự thành công của Piaget, chúng ta không thể không nhắc đến những đóng góp của bộ sưu tập đồng hồ kim cương nổi tiếng – Piaget Limelight. Sự xuất hiện của Limelight trong những buổi triển lãm, giới thiệu sản phẩm luôn nhận được đánh giá vô cùng tích cực từ phía chuyên gia và giới mộ điệu – điều đủ để chứng minh sức hút của dòng sản phẩm này.",3),
            new Product(15,"Piaget Altiplano",5454,"https://bossluxurywatch.vn/uploads/san-pham/piaget/altiplano/piaget-altiplano-g0a43121-41-mm.png","Mỗi thương hiệu đồng hồ đều có một hướng phát triển riêng, và với Piaget thì đó là mục tiêu sản xuất những mẫu đồng hồ siêu mỏng. Họ đã đạt được rất nhiều thành tựu trong lĩnh vực này, giữ kỷ lục về chiếc đồng hồ cơ học mỏng nhất thế giới (chỉ 2mm). Ngay cả với những thiết kế phức tạp hơn, Piaget vẫn giữ nguyên triết lý sáng tạo đó.",3),
            new Product(16,"Rolex Moonphase",9537,"https://bossluxurywatch.vn/uploads/san-pham/rolex/rolex-cellini-date-50515-39mm.png","Nhắc đến Moonphase, người ta sẽ nhớ ngay đến những chiếc đồng hồ lịch phức tạp. Sự phức tạp ấy không hề gây cảm giác rối mắt khi người ta nhìn vào mặt số của chiếc đồng hồ, mà ngược lại nó còn mang lại vẻ đẹp đầy cuốn hút. Chu kì mặt trăng của Rolex Cellini Moonphase được thiết kế với màu xanh đặc trưng, hình ảnh mặt trăng chế tác hoàn chỉnh từ một mảnh thiên thạch nhỏ ngoài không gian, cùng với những vì sao lấp lánh. Viền bên ngoài là một đường viền bằng vàng, có gắn trên đó một mũi tên nhỏ với nhiệm vụ chỉ báo thời gian của chu kì.",1),
            new Product(17,"Hublot Unico",3322,"https://product.hstatic.net/200000031878/product/441.hx.1170.rx-hero_1_a46887f762fe4dff9e6474572da72673_7e76c5f64aee4c649b6812d06c51ed5b_1024x1024.png","Kết hợp những chất liệu đường phố như nghệ thuật xăm với những chiếc đồng hồ cao cấp? Đây là một nước đi mà ít ai dám nghĩ đến. Nhưng Hublot – một thương hiệu đồng hồ danh tiếng đến từ Thụy Sĩ đã thể hiện khả năng sáng tạo không giới hạn của mình khi kết hợp hai chất liệu kể trên vào bộ sưu tập siêu phẩm của mình mang tên Hublot Big Bang Sang Bleu.",2),
            new Product(18,"Piaget Dancer",7689,"https://piaget.rokka.io/product-1/9f2f125530d081805cdb3b9205e7ec478c412b64.jpg","Vậy đâu là điểm đặc biệt làm nên sự thành công vang dội của bộ sưu tập này? Câu trả lời chính nằm ở sự hòa quyện đồng nhất trong thiết kế, chất liệu chế tác cao cấp cũng như sự tinh vi bậc nhất về mặt chức năng. Chính vì vậy, hôm nay Gia Bảo Luxury xin trân trọng giới thiệu với quý khách hàng một trong những thiết kế đồng hồ điển hình nhất, chứa đựng những giá trị cốt lõi của bộ sưu tập Dancer nhà Piaget - Piaget Dancer G0A38053",3)
    ));

    public List<Product> getListProduct(int idTrademark) {
        ArrayList<Product> listDefault = new ArrayList<>();
        for (int i = 0 ; i < listProduct.size() ; i++){
            Product product = listProduct.get(i);
            if(product.getIdTrademark()==idTrademark){
                listDefault.add(product);
            }
        }
        return listDefault;
    }

    public List<Product> getListProductNews() {
        ArrayList<Product> listDefault = new ArrayList<>();
        for (int i = 0 ; i < 6 ; i++){
            Product product = listProduct.get(i);
                listDefault.add(product);
        }
        return listDefault;
    }

    //Cart
    private List<Cart> listCart = new ArrayList<>();
    public void addCart(Cart cart) {
        listCart.add(cart);
    }
    public List<Cart> getListCart() {
        return listCart;
    }
    public void deleteCart(String id) {
        for (int i = 0 ; i < listCart.size() ; i++){
            Cart cart = listCart.get(i);
            if(cart.getId().equals(id)){
                listCart.remove(i);
                break;
            }
        }
    }


    //CartDetail
    private List<CartDetail> listCartDetail = new ArrayList<>();

    public void addListCartDetail(List<CartDetail> list){
        for (int i = 0 ; i < list.size() ; i++){
            listCartDetail.add(list.get(i));
        }
    }
    public List<CartDetail> getListCartDetail(){
        return listCartDetail;
    }



}
